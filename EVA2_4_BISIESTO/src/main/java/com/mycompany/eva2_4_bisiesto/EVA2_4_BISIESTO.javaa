/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author anelm
 */
public class EVA2_4_BISIESTO {

    public static void main(String[] args) {
        int year, residuo;
        
        Scanner input= new Scanner (System.in);
        System.out.println("introduce el año a evaluar");
        year= input.nextInt ();
        
        residuo= year % 4;
        if (residuo==0){ //verdad: el año es divisible entre 4
            residuo= year % 100;
            if (residuo==0){ //verdad: el año es divisible entre 100
                residuo= year % 400;
                if (residuo==0){//verdad: el año es divisible entre 40
                    System.out.println("es año bisiesto");
                
            }else 
                System.out.println("es año bisiesto");
           }else
            System.out.println("es año bisiesto");
        
        }else System.out.println("no es año bisiesto");

    }
}
