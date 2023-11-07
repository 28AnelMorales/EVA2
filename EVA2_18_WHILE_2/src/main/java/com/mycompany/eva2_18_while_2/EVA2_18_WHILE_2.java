/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_18_while_2;

import java.util.Scanner;

/**
 *
 * @author anelm
 */
public class EVA2_18_WHILE_2 {

    public static void main(String[] args) {
        int nume= 100;
        int captu = 0;
        Scanner input= new Scanner (System.in);
        
        while (captu != nume){
            System.out.println("introduce el número");
            captu= input.nextInt();
            if (captu==nume)
                System.out.println("adivinaste");
        }
    }
}
