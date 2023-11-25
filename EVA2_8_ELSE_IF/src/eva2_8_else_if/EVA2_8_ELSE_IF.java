
package eva2_8_else_if;

import java.util.Scanner;


public class EVA2_8_ELSE_IF {

    
    public static void main(String[] args) {
         Scanner cap=new Scanner (System.in);
        int mes;
        System.out.println("Ingresa el número de mes: ");
        mes=cap.nextInt();
        
        //if ((mes>=1)&&(mes<=12)){
        //System.out.println("El número "+ mes+" es VÁLIDO");
         if(mes==1)
                System.out.println("ENERO");
        else if(mes==2)
                System.out.println("FEBRERO");
        else if(mes==3)
                System.out.println("MARZO");
        else if(mes==4)
                System.out.println("ABRIL");
        else if(mes==5)
                System.out.println("MAYO");
        else if(mes==6)
                System.out.println("JUNIO");
        else if(mes==7)
                System.out.println("JULIO");
        else if(mes==8)
                System.out.println("AGOSTO");
        else if(mes==9)
                System.out.println("SEPTIEMBRE");
        else if(mes==10)
                System.out.println("OCTUBRE");
        else if(mes==11)
                System.out.println("NOVIEMBRE");
        else if(mes==12)
                System.out.println("DICIEMBRE");
         
        else 
            System.out.println("El número "+mes+" es INVÁLIDO");
            
            
        //}else
            //System.out.println("El número "+mes+" es INVÁLIDO");
        
               
    }
    
}
