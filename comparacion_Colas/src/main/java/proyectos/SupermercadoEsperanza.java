/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectos;

/**
 * Simula el flujo de atención al cliente en el supermercado "Esperanza" durante 7 horas.
 * - Hay una fila única de clientes.
 * - 3 cajas activas inicialmente, con posibilidad de abrir una cuarta si hay más de 20 clientes.
 * - Calcula estadísticas: total de clientes atendidos, tamaño máximo y medio de la fila,
 *   tiempo máximo de espera y momento de apertura de la cuarta caja.
 *
 * Objetivo:
 * - Aplicar estructuras de cola y simulación temporal.
 * - Generar estadísticas de rendimiento.
 *
 * @author Taylor
 * @version 1.0
 * @date 2025-11-04
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class SupermercadoEsperanza {

    private static final int HORAS_SIMULACION = 7;
    private static final int MINUTOS = HORAS_SIMULACION * 60;
    private static final int NUM_CAJAS_INICIALES = 3;
    private static final int UMBRAL_CAJA_EXTRA = 20;
    private static final Random random = new Random();

    public static void main(String[] args) {
        Queue<Integer> filaClientes = new LinkedList<>();
        int totalAtendidos = 0;
        int tamañoMaxFila = 0;
        int tiempoMaxEspera = 0;
        int tiempoAperturaCajaExtra = -1;
        boolean cajaExtraAbierta = false;

        int numCajas = NUM_CAJAS_INICIALES;
        int[] tiempoRestanteCajas = new int[4]; // Incluye posible 4ta caja

        for (int minuto = 1; minuto <= MINUTOS; minuto++) {
            // Llega un cliente cada minuto en promedio
            if (random.nextInt(100) < 80) { // 80% probabilidad de llegada
                filaClientes.add(minuto);
            }

            // Abrir cuarta caja si la fila es muy grande
            if (!cajaExtraAbierta && filaClientes.size() > UMBRAL_CAJA_EXTRA) {
                cajaExtraAbierta = true;
                numCajas = 4;
                tiempoAperturaCajaExtra = minuto;
                System.out.println("⚡ Cuarta caja abierta en el minuto " + minuto);
            }

            // Procesar atención en cada caja
            for (int i = 0; i < numCajas; i++) {
                if (tiempoRestanteCajas[i] == 0 && !filaClientes.isEmpty()) {
                    int clienteLlegada = filaClientes.poll();
                    int espera = minuto - clienteLlegada;
                    tiempoMaxEspera = Math.max(tiempoMaxEspera, espera);
                    totalAtendidos++;

                    // Tiempo aleatorio de atención entre 2 y 5 minutos
                    tiempoRestanteCajas[i] = 2 + random.nextInt(4);
                } else if (tiempoRestanteCajas[i] > 0) {
                    tiempoRestanteCajas[i]--;
                }
            }

            tamañoMaxFila = Math.max(tamañoMaxFila, filaClientes.size());
        }

        double tamañoMedioFila = (double) tamañoMaxFila / 2;

        System.out.println("\n📊 Resultados de la simulación:");
        System.out.println("Clientes atendidos: " + totalAtendidos);
        System.out.println("Tamaño máximo de la fila: " + tamañoMaxFila);
        System.out.println("Tamaño medio de la fila (aprox): " + tamañoMedioFila);
        System.out.println("Tiempo máximo de espera: " + tiempoMaxEspera + " minutos");
        if (cajaExtraAbierta) {
            System.out.println("La cuarta caja se abrió en el minuto: " + tiempoAperturaCajaExtra);
        } else {
            System.out.println("La cuarta caja nunca se abrió.");
        }
    }
}
