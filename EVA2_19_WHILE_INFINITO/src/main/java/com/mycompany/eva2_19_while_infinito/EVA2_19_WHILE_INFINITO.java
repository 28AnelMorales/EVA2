/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author anelm
 */
public class EVA2_19_WHILE_INFINITO {

    public static void main(String[] args) {
         int nume= 100;
        int captu = 0;
        Scanner input= new Scanner (System.in);
        
        while (true){ //CICLO INFINITO, POR SI SOLO, NUNCA SE VA A DETENER
            System.out.println("introduce un número:");
            
            captu= input.nextInt();
            if (captu==nume)
                System.out.println("adivinaste");
            break; //ROMPER ---- DETIENE LA EJECUCIÓN DEL CICLO
        }
    }
}
