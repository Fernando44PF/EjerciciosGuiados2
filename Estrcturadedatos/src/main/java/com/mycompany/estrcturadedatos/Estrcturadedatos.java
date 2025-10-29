/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrcturadedatos;

/**
 *
 * @author Taylor
 */


import java.util.Scanner;

// Clase genérica Nodo que almacena un dato de cualquier tipo T
class Nodo<T> {
    private T dato;              // Dato del nodo
    private Nodo<T> siguiente;   // Referencia al siguiente nodo

    // Constructor
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // Getter y Setter para dato
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    // Getter y Setter para siguiente
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}

// Clase Cola 
class Cola<T> {
    private Nodo<T> frente;  // Primer elemento
    private Nodo<T> fin;     // Último elemento
    private int tamano;      // Número de elementos en la cola

    // Constructor
    public Cola() {
        frente = null;
        fin = null;
        tamano = 0;
    }

    // Método para agregar 
    public void encolar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            frente = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        tamano++;
    }
    
    //metodo para eliminar
    
    public T desencolar (){
    
        if (estaVacia()){
        
            System.out.println("la cola esta vacia");
            return null;
        
        }
        
        T dato = frente.getDato();
        frente = frente.getSiguiente();
        tamano--;
        
        if (frente ==null){
        
        fin=null;
        
        
        }
        
        return dato;
    
    }
    
    
    
    public T verfrente(){
        
        if(estaVacia()){
        
            System.out.println("La cola etsa vacia");
            return null;
        
        }
        
        return frente.getDato();
   
    }

    //verificar si esta vacia
    public boolean estaVacia(){
    
    return frente == null;
    }
    
    //obtener tamaño
    
    public int getTamano(){
    
    return tamano;
    }
    
    
      public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola esta vacía.");
            return;
        }
        Nodo<T> actual = frente;
        System.out.println("Contenido de la cola:");
        while (actual != null) {
            System.out.println("- " + actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
    







public class Estrcturadedatos {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cola<String> cola = new Cola<>();
    int opcion;

    do {
        System.out.println("\n--- MENU DE COLA ---");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver tamano");
        System.out.println("3. Ver frente");
        System.out.println("4. Quitar tarea");
        System.out.println("5. Mostrar cola");
        System.out.println("6. Salir");
        System.out.print("Opcion: ");
        opcion = sc.nextInt();
        sc.nextLine(); // limpia el Enter

        switch (opcion) {
            case 1:
                System.out.print("Escribe la tarea: ");
                String tarea = sc.nextLine();
                cola.encolar(tarea);
                System.out.println("Tarea agregada.");
                break;

            case 2:
                System.out.println("Tamano actual: " + cola.getTamano());
                break;

            case 3:
                System.out.println("Frente: " + cola.verfrente());
                break;

            case 4:
                String quitada = cola.desencolar();
                if (quitada != null) {
                    System.out.println("Se quito: " + quitada);
                }
                break;

            case 5:
                cola.mostrarCola();
                break;

            case 6:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción no valida.");
        }

    } while (opcion != 6);

    sc.close();
}

}
