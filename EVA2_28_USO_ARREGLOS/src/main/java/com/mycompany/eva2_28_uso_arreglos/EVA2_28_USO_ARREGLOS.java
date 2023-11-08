/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author anelm
 */
public class EVA2_28_USO_ARREGLOS {

    public static void main(String[] args) {
        int cant;
        int [] califas;// aqui el arreglo no existe
        Scanner input= new Scanner (System.in);
        System.out.println("cuantas calificaciones quieres capturar?");
        cant= input.nextInt ();
        //ya que sabemos cuantas califas necesiamos, creamos el arreglo
        califas = new int [cant]; //creamos el arreglo
        for (int i = 0; i < cant; i++) {
            System.out.println("introduce la calificación:");
            califas [i] = input.nextInt();
            
        }
        for (int i = 0; i < cant; i++) {
            System.out.print("[ " + califas[i] + " ]");
            
    }
}
