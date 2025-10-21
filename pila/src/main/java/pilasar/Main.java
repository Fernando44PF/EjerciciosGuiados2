/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasar;

/**
 *
 * @author Taylor
 */
public class Main {
    
    public static void main(String[] args) {

        PilasArray<Integer> pila = new PilasArray<>(5); // Pila de enteros con capacidad 5

        pila.push(10);
        pila.push(20);
        pila.push(30);

        pila.mostrarPila();

        System.out.println("Elemento en la cima: " + pila.top());

        System.out.println("Sacando elemento: " + pila.pop());
        pila.mostrarPila();

        pila.pop();
        pila.pop();
        pila.pop(); // Intento de sacar cuando está vacía
    }
}
