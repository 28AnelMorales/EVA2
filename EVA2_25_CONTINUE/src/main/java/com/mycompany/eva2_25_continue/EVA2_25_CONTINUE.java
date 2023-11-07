/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_25_continue;

/**
 *
 * @author anelm
 */
public class EVA2_25_CONTINUE {

    public static void main(String[] args) {
       //continue-- interrumpe la iteración actual
        for (int i = 1; i <= 15; i++) {
            if (i== 7)
                continue;
            
            System.out.println(i+"-");
            
            System.out.println("");
            //break ----- detiene por completo la ejecución del ciclo
            for(int i = 1; i <= 15; i++) {
            if (i== 7)
                break;
            
            System.out.println(i+"-");
            
        }
            System.out.println("");
            for(int i = 1; i <=20; i++) {
                if((i%2)!= 0)
                    continue;
                System.out.println(i+"-");
            }
                
            }
    }
}
