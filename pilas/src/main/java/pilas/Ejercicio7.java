/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package pilas;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> acciones = new Stack<>();

        while (true) {
            System.out.print("Acción (UNDO/FIN): ");
            String act = sc.nextLine();

            if (act.equalsIgnoreCase("FIN")) break;

            if (act.equalsIgnoreCase("UNDO")) {
                if (!acciones.isEmpty()) acciones.pop();
            } else {
                acciones.push(act);
            }

            System.out.println("Actual: " + acciones);
        }
    }
}
