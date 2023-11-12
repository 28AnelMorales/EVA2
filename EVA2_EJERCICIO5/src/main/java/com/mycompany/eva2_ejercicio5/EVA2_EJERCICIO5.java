/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_ejercicio5;

/**
 *
 * @author anelm
 */
public class EVA2_EJERCICIO5 {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base (número entero positivo): ");
        int base = scanner.nextInt();

        System.out.print("Ingresa el exponente (número entero positivo): ");
        int exponente = scanner.nextInt();

        int resultado = calcularPotencia(base, exponente);
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
    }

    private static int calcularPotencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
