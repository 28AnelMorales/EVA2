/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author anelm
 */
public class EVA2_1_IF {

    public static void main(String[] args) {
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("introduce la calificación");
        califa = input.nextInt();

        if ( >= 70) {
            ( //if (expresión a evaluar)
                    //este blloque siempre es verdad
                    //LAS LLAVES SE USAN CUANDO SON MAS DE UNA INSTRUCCIÓN
                    // DENTRO DEL IF, SI ES UNA SOLA, NO SE USAN
                    System.out.println("aprobado: viaje a cancun");//pertenece
            System.out.println("felicidades");// NO PERTENECE
            )else //else---si no, ES OPCIONAL
        //ESTE BLOQUE ES SIEMPRE PARA EL FALSO
        
        System.out.println("no acreditado: a picar piedra");

            System.out.println("fin del programa");

        }
    }
