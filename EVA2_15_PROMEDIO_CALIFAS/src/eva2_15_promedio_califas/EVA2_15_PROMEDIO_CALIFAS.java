/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_promedio_califas;

import java.util.Scanner;


public class EVA2_15_PROMEDIO_CALIFAS {

   
    public static void main(String[] args) {
        
        
                Scanner cap=new Scanner(System.in);
        System.out.println("¿Cuántas calificaciones va a capturar?: ");
        int cali=cap.nextInt();
        int sumacali=0;
        //Acumulador
        for (int i = 1; i <= cali; i++) {
            System.out.println("Ingrese la calificación:");
            int cali1=cap.nextInt();
            sumacali= sumacali + cali1;
        }
       
        System.out.println("LA SUMATORIA = "+ sumacali);
        //SI el divisor es entero, el resultado será entero
        double prom= sumacali/(cali*1.0);
        
    
        System.out.println("El promedio de sus califiaciones es de: "+ prom);
    
    }
    
}
