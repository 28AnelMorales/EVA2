
package eva2_24_recorrer_cadena;

import java.util.Scanner;


public class EVA2_24_RECORRER_CADENA {

   
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String cade;
        
        System.out.println("Introduce un texto: ");
        cade=input.nextLine();
        
        for (int i = 0; i <cade.length(); i++) {
            System.out.println(cade.charAt(i));
        }
    }
    
}
