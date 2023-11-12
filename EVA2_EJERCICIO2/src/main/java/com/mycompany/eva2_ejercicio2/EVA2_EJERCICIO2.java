/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_ejercicio2;

/**
 *
 * @author anelm
 */
public class EVA2_EJERCICIO2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero positivo: ");
        int numero1 = input.nextInt();
        System.out.println("Ingrese el segundo número entero positivo: ");
        int numero2 = input.nextInt();
        System.out.println("Números pares entre " + numero1 + " y " + numero2 + ":");

        if (numero1 <= numero2) {
            for (int i = numero1; i <= numero2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("El primer número debe ser menor o igual al segundo número.");
        }
    }
}
