/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas.y.colas.umg;

import java.util.Random;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author augus
 */
public class PILASYCOLASUMG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        int opcion;
        
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Usar Pila");
            System.out.println("2. Usar Cola");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    procesarConPila();
                    break;
                case 2:
                    procesarConCola();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            
        } while (opcion != 3);
        
        scanner.close();
    }

    public static void procesarConPila() {
        Stack<Integer> pila = new Stack<>();
        generarNumeros(pila);
        
        System.out.println("Procesando con Pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }

    public static void procesarConCola() {
        Queue<Integer> cola = new LinkedList<>();
        generarNumeros(cola);
        
        System.out.println("Procesando con Cola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }

    public static void generarNumeros(Stack<Integer> pila) {
        Random rand = new Random();
        
        for (int i = 0; i < 1000000; i++) {
            int numero = rand.nextInt(20000001) - 10000000; // Números entre -10,000,000 y 10,000,000
            pila.push(numero);
        }
    }

    public static void generarNumeros(Queue<Integer> cola) {
        Random rand = new Random();
        
        for (int i = 0; i < 1000000; i++) {
            int numero = rand.nextInt(20000001) - 10000000; // Números entre -10,000,000 y 10,000,000
            cola.offer(numero);
        }
    }
}
