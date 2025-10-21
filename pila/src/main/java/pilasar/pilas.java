/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pilasar;

/**
 *
 * @author Taylor
 */
public interface pilas <T>{
    
     void push(T elemento);   

    T pop();             
    

    T top();                 

    boolean estaVacia();
    
}
