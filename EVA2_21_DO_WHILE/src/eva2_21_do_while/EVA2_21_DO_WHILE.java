/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_do_while;

import java.util.Scanner;

/**
 *
 * @author anelm
 */
public class EVA2_21_DO_WHILE {

  
    public static void main(String[] args) {
        
        Scanner input=new Scanner (System.in);
        int valor;
        do{
            System.out.print("Introduce un valor:");
            valor=input.nextInt();
        }while(valor!=100);
    
        
        
    }
    
}
