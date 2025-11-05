/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectos;

/**
 * Programa que compara dos colas del mismo tipo para determinar
 * si son idénticas (tienen el mismo tamaño y los mismos elementos
 * en el mismo orden).
 *
 * Objetivo:
 * - Aplicar estructuras de datos tipo cola.
 * - Implementar comparación de elementos preservando las colas originales.
 *
 * @author Fernando Miguel Olvera Juárez
 * @version 1.0
 * @date 2025-11-04
 */


import java.util.LinkedList;
import java.util.Queue;

public class CompararColas {

    // Método que compara dos colas y devuelve true si son idénticas
    public static <T> boolean sonIdenticas(Queue<T> cola1, Queue<T> cola2) {
        // Si los tamaños son diferentes, no son iguales
        if (cola1.size() != cola2.size()) {
            return false;
        }

        Queue<T> copia1 = new LinkedList<>(cola1);
        Queue<T> copia2 = new LinkedList<>(cola2);

        while (!copia1.isEmpty()) {
            T elem1 = copia1.poll();
            T elem2 = copia2.poll();
            if (!elem1.equals(elem2)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> colaA = new LinkedList<>();
        Queue<Integer> colaB = new LinkedList<>();

        // Agregamos elementos
        colaA.add(10);
        colaA.add(20);
        colaA.add(30);

        colaB.add(10);
        colaB.add(20);
        colaB.add(30);

        System.out.println("¿Las colas son idénticas? " + sonIdenticas(colaA, colaB));
    }
}

