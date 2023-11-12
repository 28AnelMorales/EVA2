/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_ejercicio6;

/**
 *
 * @author anelm
 */
public class EVA2_EJERCICIO6 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numeroDecimal = scanner.nextInt();

        String binario = convertirABinario(numeroDecimal);

        System.out.println("El equivalente en binario es: " + binario);
    }

    private static String convertirABinario(int numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();

        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % 2;
            binario.insert(0, residuo);
            numeroDecimal /= 2;
        }

        return binario.toString();
    }
}
