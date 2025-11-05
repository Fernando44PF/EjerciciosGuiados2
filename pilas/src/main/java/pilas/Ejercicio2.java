/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pila = new Stack<>();
        String nombre;

        // Leer nombres hasta que el usuario escriba FIN
        while (true) {
            System.out.print("Ingrese un nombre (FIN para salir): ");
            nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("FIN")) break;
            pila.push(nombre);
        }

        // Mostrar nombres en orden inverso
        System.out.println("Nombres en orden inverso:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}
