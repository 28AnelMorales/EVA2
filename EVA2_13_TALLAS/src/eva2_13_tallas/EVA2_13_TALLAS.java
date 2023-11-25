/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_tallas;

import java.util.Scanner;


public class EVA2_13_TALLAS {

 
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int talla;
        System.out.println("Ingresa tu talla: ");
        talla = cap.nextInt();

        switch (talla) {
            case 29:
                System.out.println("Tu talla es SMALL");
                break;
            case 42:
                System.out.println("Tu talla es MEDIUM");
                break;
            case 44:
                System.out.println("Tu talla es LARGE");
                break;
            case 48:
                System.out.println("Tu talla es XLARGE");
                break;
            default:
                System.out.println("La talla  " + talla + " es DESCONOCIDA");
        
        
        
        
                }
    }
}
    

