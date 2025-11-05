/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package pilas;

import java.util.Stack;

public class Ejercicio8 {
    public static int evaluar(String expr) {
        Stack<Integer> pila = new Stack<>();

        for (String token : expr.split(" ")) {
            if (token.matches("\\d+")) {
                pila.push(Integer.parseInt(token));
            } else {
                int b = pila.pop(), a = pila.pop();
                switch (token) {
                    case "+": pila.push(a + b); break;
                    case "-": pila.push(a - b); break;
                    case "*": pila.push(a * b); break;
                    case "/": pila.push(a / b); break;
                }
            }
        }
        return pila.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluar("5 3 + 8 2 - *")); // 48
    }
}

