/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasar;

/**
  *@author Fernando Miguel Olvera Juárez
 * @version 1.0
 * @since 2025-10-20
 */


public class PilasArray<E> implements pilas<E> {

    private E[] elementos;  // Arreglo interno para guardar los datos
    private int cima;       // Indica cuántos elementos hay en la pila

    @SuppressWarnings("unchecked")
    public PilasArray(int capacidad) {
        elementos = (E[]) new Object[capacidad];
        cima = 0;
    }

    @Override
    public boolean estaVacia() {
        return cima == 0;
    }

    @Override
    public void push(E elemento) {
        if (cima < elementos.length) {
            elementos[cima] = elemento;
            cima++;
        } else {
            System.out.println("⚠️ La pila está llena, no se puede agregar más elementos.");
        }
    }

    @Override
    public E pop() {
        if (estaVacia()) {
            System.out.println("La pila esta vacia, no se puede eliminar.");
            return null;
        }
        cima--;
        E elemento = elementos[cima];
        elementos[cima] = null; // Limpia el valor
        return elemento;
    }

    @Override
    public E top() {
        if (estaVacia()) {
            System.out.println("La pila esta vacia, no hay elemento en la cima.");
            return null;
        }
        return elementos[cima - 1];
    }

    // Método opcional para mostrar el contenido de la pila
    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println(" La pila está vacia.");
        } else {
            System.out.println("Contenido de la pila:");
            for (int i = cima - 1; i >= 0; i--) {
                System.out.println(elementos[i]);
            }
        }
    }
}
