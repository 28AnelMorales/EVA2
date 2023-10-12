/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author anelm
 */
public class EVA2_3_NUMEROS_PARES {

    public static void main(String[] args) {
        //TODO code application logic here
        int valor, residuo;
        Scanner input = new Scanner (System.in);
        
        System.out.println("introduce el valor a evaluar:");
        valor = input.nextInt();
        
        residuo = valor%2;// módulo, calcula el residuo.
        
        if(residuo = 0)//verdad---- el número es par.
            System.out.println("el número es par");
        else
            System.out.println("el número es impar");
    }
}
