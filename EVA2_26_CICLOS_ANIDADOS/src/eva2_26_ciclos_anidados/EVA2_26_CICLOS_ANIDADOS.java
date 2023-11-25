
package eva2_26_ciclos_anidados;

import java.util.Scanner;



public class EVA2_26_CICLOS_ANIDADOS {

    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("INTRODUCE UN NÚMERO:");
        int nume=input.nextInt();
        
        for (int i = 1; i <= nume; i++) {
          for (int j = 1; j < i ; j++) {
                    System.out.print("*");
                }
            System.out.println("");
        }
         System.out.println("----------");
         
          for (int i = nume; i >= 1; i--) {
          for (int j = 1; j < i ; j++) {
                    System.out.print("*");
                }
            System.out.println("");
        }
    }
    
}
