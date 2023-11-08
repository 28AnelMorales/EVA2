/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_29_arreglos;

/**
 *
 * @author anelm
 */
public class EVA2_29_ARREGLOS {

    public static void main(String[] args) {
        int [] arreglo = new int [100];
        //vamos a lenar el arreglo de valores entre 0 y 99
        for (int i = 0; i < arreglo.length; i++) {
            //casting: convierto un double a un entero
            arreglo[i]= (int)(Math.random ()*100);
            
        }
         for (int i = 0; i < arreglo.length; i++) {
             System.out.println("[" + arreglo [i] + "[");
            
        }
    }
}
