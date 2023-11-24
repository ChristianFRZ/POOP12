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
 *Declaración de la clase HiloPar
 * La interfaz Runnable se utiliza para definir un hilo en Java sin 
 * extender la clase Thread
 * 
 */
public class HiloPar implements Runnable{
    /**
     * Se define el código que se ejecutará cuando se inicie el hilo
     * el hilo imprimirá los números pares entre 0 y 500 junto con el nombre del hilo actual.
     */
    @Override
    public void run() {
        
        
        for (int i = 0; i < 501; i++) {
            
            if (i%2==0){
                System.out.println("Numero "+i+" de "+Thread.currentThread().getName());
            }
        }
        System.out.println("Termina el  "+Thread.currentThread().getName());

    }
}
