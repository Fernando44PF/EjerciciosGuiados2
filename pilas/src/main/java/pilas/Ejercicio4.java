/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pilas;

import java.util.Stack;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        Stack<Character> pila = new Stack<>();

        // Apilar cada letra
        for (char c : palabra.toCharArray()) pila.push(c);

        // Desapilar e imprimir
        System.out.print("Invertida: ");
        while (!pila.isEmpty()) System.out.print(pila.pop());
    }
}

