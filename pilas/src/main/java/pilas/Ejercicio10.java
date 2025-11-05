/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package pilas;

import java.util.Stack;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese palabra: ");
        String palabra = sc.nextLine();

        Stack<Character> pila = new Stack<>();

        for (char c : palabra.toCharArray()) pila.push(c);

        String invertida = "";
        while (!pila.isEmpty()) invertida += pila.pop();

        if (palabra.equalsIgnoreCase(invertida))
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");
    }
}

