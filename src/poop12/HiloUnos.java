/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu40
 */

/**
 *Declaración de la clase HiloUno
 * La interfaz Runnable se utiliza para definir un hilo en Java sin 
 * extender la clase Thread
 * 
 */
public class HiloUnos implements Runnable{
    /**
     *  se define el código que se ejecutará cuando se inicie el hilo.
     * el hilo imprimirá "1-" mil veces en la consola.
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("1-");
        }
    }
    
}