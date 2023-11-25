/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_factorial;

import java.util.Scanner;

/**
 *
 * @author anelm
 */
public class EVA2_16_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner cap=new Scanner(System.in);
        
        System.out.print("Ingrese un número de veces: ");
        int num=cap.nextInt();
        
        int factorial=1;
        
                
        for (int i = 1; i <= num; i++) {
            System.out.print(i +" x ");
            factorial= factorial*i;
        }
        System.out.println("");
        System.out.println("Factorial de "+num+" es: "+factorial);
        System.out.println("");
        
        int factorial1=1;
         for(int i=num; i >=1; i--){
            System.out.print(i+" x ");
            factorial1= factorial1*i;
    }
         System.out.println("");
         System.out.println("Factorial de "+num+" es: "+factorial1);
    
        
    }
    
}
