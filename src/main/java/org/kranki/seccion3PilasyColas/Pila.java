package org.kranki.seccion3PilasyColas;

import java.util.EmptyStackException;
import java.util.Stack;

public class Pila {


    public static void main(String[] args) {
        //la pila es el stack
        Stack<Number> pila = new Stack<>();
        pila.push(12l);
        System.out.println("se metio 12l");
        imprimirPila(pila);

        pila.push(23);
        System.out.println("se metio 23");
        imprimirPila(pila);

        pila.push(3.5);
        System.out.println("se metio 3.5");
        imprimirPila(pila);

        pila.push(4);
        System.out.println("se metio 4");
        imprimirPila(pila);


        try {
            Number objElminado = pila.pop();
            while (true){
                objElminado = pila.pop();
                System.out.printf("se saco %s %n",objElminado);
                imprimirPila(pila);
            }
        }catch (EmptyStackException e){
            e.printStackTrace();
        }

    }

    private static void imprimirPila(Stack<Number> pila) {

        if (pila.isEmpty()){
            System.out.println("la pila esta vacia");
        }else{
            System.out.printf("el elemento superior es %s%n",pila.peek());
            System.out.printf("la pila contiene: %s cima %n ",pila);
        }
    }
}
