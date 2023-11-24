/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu40
 */

//Declaración de la clase 'Hiloceros'
//Implementa la interfaz 'Runnable para definir un hilo sin 
//Extender la clase Thread
public class HiloCeros implements Runnable{
    
    /**
     * El método run es donde se define el código para su
     * ejecución. Imprimirá "0-" mil veces
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("0-");
        }
    }
    
    
}