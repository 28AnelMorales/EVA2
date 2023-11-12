/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_ejercicio3;

/**
 *
 * @author anelm
 */
public class EVA2_EJERCICIO3 {

    public static void main(String[] args) {
         Scanner = new Scanner(System.in);
        System.out.print("ingresa el primer numero positivo entero");
        int numero1 = Scanner.nextInt();
        
        System.out.print("ingresa el segundo numero positivo entero ");
        int numero2 = Scanner.nextInt();
        
        
        int numeroinicial = Math.min(numero1,numero2);
        int numerofinal = Math.max(numero1,numero2);
        
        System.out.println("los numeros pares entre" + numeroinicial );
        for(int i =numeroinicial; i <= numerofinal; i++){
            if(i% 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
