
package eva_2_10_carreras;

import java.util.Scanner;


public class EVA_2_10_CARRERAS {

   
    public static void main(String[] args) {
       
        
          Scanner cap=new Scanner (System.in);
        String carrera;
        System.out.println("Ingresa las siglas (en MAYÚSCULAS) de tu Carrera: ");
        carrera=cap.next();
        
    switch (carrera) {
        case "ISC":
            System.out.println("Ingeniería en Sistemas Computacionales");
            break;
            case "IINFO":
            System.out.println("Ingeniería en Informática");
            break;
            case "LA":
            System.out.println("Licenciatura en Administración");
            break;
            case "ARQ":
            System.out.println("Arquitectura");
            break;
            case "II":
            System.out.println("Ingeniería Industrial");
            break;
            case "IDI":
            System.out.println("Ingeniería en Diseño Industrial");
            break;
            case "IGE":
            System.out.println("Ingeniería en Gestión Empresarial");
            break;
                    
    }
    }
    
}
