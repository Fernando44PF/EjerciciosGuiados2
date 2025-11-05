/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyectos;

/**
 *
 * @author Taylor
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("=== Actividad 01: Manipulación de Lista Enlazada ===");

        // 1. Crear lista con números aleatorios
        System.out.print("¿Cuántos números aleatorios desea generar?: ");
        int n = sc.nextInt();
        lista.generarLista(n);
        lista.mostrarLista();

        // 2. Eliminar nodos mayores a un valor
        System.out.print("\nIngrese el valor límite: ");
        int limite = sc.nextInt();
        lista.eliminarMayoresQue(limite);

        System.out.println("\nLista después de eliminar nodos mayores a " + limite + ":");
        lista.mostrarLista();

        sc.close();
    }
}
