/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu40
 * Declaración de la clase cuenta
 */
public class Cuenta extends Thread{
    /**
     * Declaración de la variable 'saldo'
     */
    private static long saldo = 0;
    /**
     * Constructor de la clase name, que llama a 
     * al constructor de la clase base 'Thread'
     * @param name 
     */
    public Cuenta(String name) {
        super(name);
    }
    public void run(){
    /**
     * El método run se ejecuta cuando se inicia el hilo.
     * Dependiendo del nombre del hilo se realiza un depósito
     * de 100 pesos  una extracción de 50 pesos para imprimir un mensaje de terminado
     */
        if (getName().equals("Deposito 1") || getName().equals("Deposito 2")){
       
            this.depositarDinero(100);
        }else{
            this.extraerDinero(50);
        }
        System.out.println("Termina el "+getName()); 
    }
    
    /**
     * Método que realiza la operacoón de depósito, auemnta el 
     * saldo por la cantidad proporcionada, luego imprime el saldo
     * actual y la cantidad depositada
     * @param cantidad 
     */
    public synchronized void depositarDinero(int cantidad){
            saldo += cantidad;
            System.out.println("El saldo actual es:"+saldo);
            System.out.println("Se depositaron "+cantidad+ " pesos");
            notifyAll();
    }
    /**
     * Este método realiza una operación de extracción
     * Si el saldo es mejor o igual a cero. espera  5 seg para hacer dicha acción
     * Luego imprime un mensaje indicando que se realizó la extracción 
     * junto con el saldo restante
     * @param cantidad 
     */
    public synchronized void extraerDinero(int cantidad){
        try {
            if (saldo <= 0){
                System.out.println(getName() +" espera deposito " + " \nSaldo = "+saldo);
                sleep(5000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        saldo -= cantidad;
        System.out.println(getName()+" extrajo " +cantidad+ " pesos.\nSaldo restante = "+saldo);
        notifyAll();
    }
    
    
}