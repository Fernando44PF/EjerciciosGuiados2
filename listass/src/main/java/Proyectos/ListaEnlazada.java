/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyectos;

/**
 *
 * @author Taylor
 */

import java.util.Random;

public class ListaEnlazada {
    Nodo cabeza; // Primer nodo de la lista

    // Insertar un número al final de la lista
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Generar números aleatorios y agregarlos a la lista
    public void generarLista(int cantidad) {
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            int numero = rand.nextInt(100) + 1; // Números positivos del 1 al 100
            insertarFinal(numero);
        }
    }

    // Mostrar todos los elementos de la lista
    public void mostrarLista() {
        Nodo actual = cabeza;
        if (actual == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        System.out.print("Elementos de la lista: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Eliminar nodos mayores a un valor dado
    public void eliminarMayoresQue(int valorLimite) {
        // Eliminar nodos del inicio que cumplan la condición
        while (cabeza != null && cabeza.dato > valorLimite) {
            cabeza = cabeza.siguiente;
        }

        // Si la lista se vació
        if (cabeza == null) return;

        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato > valorLimite) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                actual = actual.siguiente;
            }
        }
    }
}

