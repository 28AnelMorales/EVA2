/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_2_while_retiros;

/**
 *
 * @author anelm
 */
public class EVA2_2_WHILE_RETIROS {

    public static void main(String[] args) {
        int canti = 1000; 
        
        while (canti >0 ){ //mientras haya salido, se puede retirar
            System.out.println("¿cuanto deseas retirar?");
            int retiro = input.nextInt();
            //acumulador
            //canti= canti - retiro;
            canti -=retiro;
            System.out.println("te quedan $ "+ canti+ "de saldo" );
        }
    }
}
