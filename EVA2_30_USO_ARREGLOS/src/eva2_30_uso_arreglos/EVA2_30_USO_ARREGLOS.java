
package eva2_30_uso_arreglos;

import java.util.Scanner;


public class EVA2_30_USO_ARREGLOS {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int opc, cant;
        String[] listaFood = new String[10];
        listaFood[0] = "Tacos";
        listaFood[1] = "Tortas";
        listaFood[2] = "Tamales";
        listaFood[3] = "Tlacoyos";
        listaFood[4] = "Tlayudas";
        listaFood[5] = "Tampiqueñas";
        listaFood[6] = "Tortas ahogadas";
        listaFood[7] = "Tchilaquiles";
        listaFood[8] = "T-Bone";
        listaFood[9] = "Tripas";


        double[] listPrecios = {10,40,45,70,100,90,80,85,400,80};

        System.out.println("---------Menú-----------");
        for (int i = 0; i < listaFood.length; i++) {
            System.out.println(i + "- " + listaFood[i] + ": $" + listPrecios[i]);
        }

        System.out.println("¿Que deseas ordenar?");
        opc = input.nextInt();

        System.out.println("¿Cuantas ordenes?");
        cant = input.nextInt();
        System.out.println("Tu total es de: $" + (cant * listPrecios[opc]));
        
        
    }
    
}
