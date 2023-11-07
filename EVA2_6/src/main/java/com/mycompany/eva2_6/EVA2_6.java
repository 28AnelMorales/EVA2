/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_6;

/**
 *
 * @author anelm
 */
public class EVA2_6 {

    public static void main(String[] args) {
        //CAPTURAR CALIFICACIÓN
        int califa;
        Scanner input = new Scanner (System.in)
        System.out.println("introduce la calificación: ");
        califa = input.nextIn();
        
        // vamos a evaluar:
        if((califa >= 0) && (califa <= 100)) { 
            System.out.println("la calificación"+ califa+ "es valida");
            if (califa >=70)
                System.out.println("acreditas");
            else
                System.out.println("no acreditas");
          }else
            System.out.println("la calificación " + califa + "no es valida");
        }
    }

