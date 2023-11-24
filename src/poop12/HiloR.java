/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author Santiago Ruiz
 */


/**
 *Declaración de la clase HiloR
 * La interfaz Runnable se utiliza para definir un hilo en Java sin 
 * extender la clase Thread
 * 
 */
public class HiloR implements Runnable{

    /**
    * Se define el códgo para ejecutarse cuando inicia el hilo
    * El hilo imprimirá "iteracion x de [""] diez veces
    * 
    */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+i+" de "+Thread.currentThread().getName());
        }
        System.out.println("Termina el  "+Thread.currentThread().getName());

    }
    
}