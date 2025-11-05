/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;





import java.util.Stack;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear pila de enteros
        Stack<Integer> pila = new Stack<>();

        // Insertar elementos
        pila.push(5);
        pila.push(10);
        pila.push(15);
        pila.push(20);

        // Eliminar dos elementos
        pila.pop();
        pila.pop();

        // Mostrar contenido actual
        System.out.println("Contenido actual: " + pila);
    }
}

