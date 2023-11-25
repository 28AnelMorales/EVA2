
package eva2_23_validar_do_while;

import java.util.Scanner;

public class EVA2_23_VALIDAR_DO_WHILE {

    
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        int valor;
        
        
        
        do{
            System.out.print("Introduce un valor entero:");
            if (input.hasNextInt()){
            valor=input.nextInt();
            
            System.out.println("SI es un valor entero");
            break;
            }else {
                System.out.println("NO es un valor entero");
                break;
            }    
        }while(true);
    }
    
}
