/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package pilas;

import java.util.Stack;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4};
        Stack<Integer> pila = new Stack<>();

        for (int n : lista) pila.push(n);

        System.out.print("Lista invertida: ");
        while (!pila.isEmpty()) System.out.print(pila.pop() + " ");
    }
}

