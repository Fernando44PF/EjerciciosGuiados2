/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectos;

/**
 * Simula el funcionamiento de un supermercado con:
 * - 25 carritos de compra.
 * - 3 cajas de pago.
 * - Clientes que esperan por carritos, se forman en la caja con menos clientes,
 *   y liberan el carrito al pagar.
 *
 * Objetivo:
 * - Modelar colas para carritos y cajas.
 * - Aplicar lógica de asignación y liberación de recursos.
 * - Simular comportamiento de clientes en tiempo discreto.
 *
 * @author Taylor
 * @version 1.0
 * @date 2025-11-04
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class SupermercadoSimulacion {

    private static final int NUM_CARRITOS = 25;
    private static final int NUM_CAJAS = 3;
    private static final int NUM_CLIENTES = 40; // Puedes cambiarlo para probar
    private static final Random random = new Random();

    public static void main(String[] args) {
        Queue<Integer> carritos = new LinkedList<>();
        for (int i = 1; i <= NUM_CARRITOS; i++) {
            carritos.add(i);
        }

        Queue<Integer>[] cajas = new LinkedList[NUM_CAJAS];
        for (int i = 0; i < NUM_CAJAS; i++) {
            cajas[i] = new LinkedList<>();
        }

        System.out.println("🛒 Simulación de supermercado iniciada...\n");

        for (int cliente = 1; cliente <= NUM_CLIENTES; cliente++) {
            // Espera si no hay carritos
            while (carritos.isEmpty()) {
                System.out.println("Cliente " + cliente + " espera un carrito...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Toma un carrito
            int carrito = carritos.poll();

            // Se coloca en la caja con menos clientes
            int cajaElegida = 0;
            int tamañoMin = cajas[0].size();
            for (int i = 1; i < NUM_CAJAS; i++) {
                if (cajas[i].size() < tamañoMin) {
                    tamañoMin = cajas[i].size();
                    cajaElegida = i;
                }
            }

            cajas[cajaElegida].add(cliente);
            System.out.println("Cliente " + cliente + " usa carrito " + carrito + " y va a la caja " + (cajaElegida + 1));

            // Simulamos el pago y liberación del carrito
            if (random.nextInt(100) < 50) { // 50% chance de que ya pague
                cajas[cajaElegida].poll();
                carritos.add(carrito);
                System.out.println("Cliente " + cliente + " ha pagado y liberó el carrito " + carrito + ".");
            }

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n✅ Simulación finalizada. Todos los clientes fueron atendidos.");
    }
}
