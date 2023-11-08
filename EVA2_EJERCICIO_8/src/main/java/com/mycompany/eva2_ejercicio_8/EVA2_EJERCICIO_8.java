/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author anelm
 */
public class EVA2_EJERCICIO_8 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        char letra;
        
        System.out.println("digite una letra: ");
        letra = sc.next().charAt(0);
        
        
        switch (letra) {
            case 'a':
            case'e':
            case'i':
            case'o':
            case'u':
                System.out.println("es vocal");
               break;
                
            case'b':
                case'c':
                case'd':
                case'f':
                case'g':
                case'h':
                case'j':
                case'k':
                case'l':
                case'm':
                case'n':
                case'ñ':
                case'q':
                case'r':
                case's':
                case't':
                case'v':
                case'w':
                case'y':
                case'z':
                    System.out.println("es consonante");
                    break;
             
                
                
            
        }
    }
}
