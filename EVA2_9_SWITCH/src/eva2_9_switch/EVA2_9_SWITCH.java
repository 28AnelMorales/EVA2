
package eva2_9_switch;

import java.util.Scanner;


public class EVA2_9_SWITCH {

    
    public static void main(String[] args) {
       
        Scanner cap=new Scanner (System.in);
        int mes;
        System.out.println("Ingresa el número de mes: ");
        mes=cap.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("ENERO");
                break;
            case 2:
                System.out.println("FEBRERO");
            case 3:
                System.out.println("MARZO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAYO");
                break;
            case 6:
                System.out.println("JUNIO");
                break;
            case 7:
                System.out.println("JULIO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPTIEMBRE");
                break;
            case 10:
                System.out.println("OCTUBRE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            case 12:
                System.out.println("DICIEMBRE");
                break;
            default://SIEMPRE va al FINAL y es opcional, NO tiene BREAK
                System.out.println("El número "+mes+" es INVÁLIDO");
        }
        
        
    }
    
}
