/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author Santiago Ruiz
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*HiloT hilo1 = new HiloT("PrimerHilo");
        hilo1.start();
        
        new Thread(new HiloR(), "Tercer Hilo").start();
        new HiloT("Segundo Hilo").start();
        for(int i =0 ;i<10;i++){
            System.out.println("Iteracion "+i+" del main");
        }
        System.out.println("Termina el main");
        
        new Thread(new HiloCeros(), "Hilos Ceros").start();
        new Thread(new HiloUnos(), "Hilos Unos").start();
        new Thread(new HiloSaltoDeLiea(), "Hilos salto de linea").start();
        
        
        new Cuenta("Acceso 1").start();
        new Cuenta("Acceso 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        System.out.println("Termina el hilo principal");
        */
        
        
        
        //Extra imprimir num pares del 0 al 500 en un hilo
        //Otro hilo los impares
        new Thread(new HiloPar(), "Hilo Par").start();
        new Thread(new HiloImpar(), "Hilo Impar").start();

    }
    
}