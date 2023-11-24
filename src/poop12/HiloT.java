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
 * Se declara como pública y se extiende la clase
 * 'Thread' y puede ejecutarse como un hilo independiente
 * 
 */
public class HiloT extends Thread{
    
    /**
     * Constructor que toma parámetro 'name' y llama al contructor
     * de la clase base 'Thread' que establecerá el nombre del hilo
     * @param name 
     */
    public HiloT(String name) {
        super(name);
    }
    /**
     * Se define el código que se ejecutará cuando se incie el hilo
     *  imprimirá "Iteracion x de [nombre del hilo]" diez veces, donde x es el valor de i. 
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tteracion "+i+" de "+getName());
        }
        System.out.println("Termina el "+getName());
    }
    
}