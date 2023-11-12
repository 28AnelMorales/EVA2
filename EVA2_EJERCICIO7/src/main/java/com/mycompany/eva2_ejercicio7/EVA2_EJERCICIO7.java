/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_ejercicio7;

/**
 *
 * @author anelm
 */
public class EVA2_EJERCICIO7 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa números positivos (o cero). Introduce un número negativo para terminar.");

        int numero;
        int numeroMaximo = Integer.MIN_VALUE;
        int numeroMinimo = Integer.MAX_VALUE;

        do {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                if (numero > numeroMaximo) {
                    numeroMaximo = numero;
                }

                if (numero < numeroMinimo) {
                    numeroMinimo = numero;
                }
            }

        } while (numero >= 0);

        if (numeroMinimo != Integer.MAX_VALUE) {
            System.out.println("El número más pequeño es: " + numeroMinimo);
            System.out.println("El número más grande es: " + numeroMaximo);
        } else {
            System.out.println("No se introdujeron números positivos.");
    }
}
