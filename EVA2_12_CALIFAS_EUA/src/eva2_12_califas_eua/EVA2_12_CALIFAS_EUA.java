
package eva2_12_califas_eua;

import java.util.Scanner;


public class EVA2_12_CALIFAS_EUA {

    
    public static void main(String[] args) {
      
         Scanner cap=new Scanner(System.in);
            int califa;
        System.out.println("Ingresa tu calificación obtenida: ");
        califa=cap.nextInt();
        if((califa>=90)&& (califa<=100))
                System.out.println("Tu calificación es de: "+califa+" A");
        else if((califa>=80)&& (califa<=89))
                System.out.println("Tu calificación es de: "+califa+" B");
        else if((califa>=70)&& (califa<=79))
                System.out.println("Tu calificación es de: "+califa+" C");
        else if((califa>=60)&& (califa<=69))
                System.out.println("Tu calificación es de: "+califa+" D");
        else if((califa>=0)&& (califa<=59))
                System.out.println("Tu calificación es de: "+califa+" F");
    else
         
            System.out.println("La calificación "+califa+" es INVÁLIDA");
        
        
        
    }
    
}
