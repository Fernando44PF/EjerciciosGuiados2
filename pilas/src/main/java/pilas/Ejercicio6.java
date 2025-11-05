/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package pilas;

import java.util.Stack;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        int num = sc.nextInt();

        Stack<Integer> pila = new Stack<>();

        // Dividir entre 2 y apilar restos
        while (num > 0) {
            pila.push(num % 2);
            num /= 2;
        }

        // Mostrar en binario
        System.out.print("Binario: ");
        while (!pila.isEmpty()) System.out.print(pila.pop());
    }
}

