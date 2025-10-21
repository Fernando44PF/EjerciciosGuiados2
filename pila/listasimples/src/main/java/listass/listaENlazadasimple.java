/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listass;

/**
  *@author Fernando Miguel Olvera Juárez
 * @version 1.0
 * @since 2025-10-20
 */
public class listaENlazadasimple {
    
    
   static class Nodo{
    int dato;
    Nodo siguiente;
    
    
    
    public Nodo(int dato){
        
        this.dato=dato;
        this.siguiente=null;
    
    
    }
    
    }
    
    
    public static class ListaSimple{
    
    Nodo cabeza;
    
    
    
    //metodo para agregar un nodo al final
    public void agregar(int valor){
    
        Nodo nuevo = new Nodo(valor);
        
        if(cabeza==null){
            
            cabeza=nuevo;  // si la lista esta vacia
    
        }else{
        
            Nodo actual = cabeza;
            
            while (actual.siguiente != null){//recorre hasta el ultimo nodo
            
                actual = actual.siguiente;
            }
            
            actual.siguiente=nuevo;
       
        }
    }
    
    
    
    
    
    //Metodo para mostrar los elementos de la lista
    
    public void mostrar(){
    
    Nodo actual = cabeza;
        System.out.println("Lista=");
        
        while(actual != null){
            
            System.out.println(actual.dato+"->");
            actual = actual.siguiente;
        }
        
        System.out.println("null");
  
    }
    
   
    
    }
     public static void main(String[] args){
        
        
       ListaSimple lista = new ListaSimple();
        
        
        lista.agregar(10);
         lista.agregar(20);
          lista.agregar(30);
    
        lista.mostrar();
    
    
    
    
  
    }
}
