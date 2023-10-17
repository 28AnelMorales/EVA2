/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_5_operaciones;

/**
 *
 * @author anelm
 */
public class EVA2_5_OPERACIONES {

    public static void main(String[] args) {
        //OPERADORES---- SIMBOLO QUE EJECUTA ALGUNA ACCIÓN
        //SUMA--- +
        int suma, val1,val2;
        val1= 100;
        val2= 200;
        suma= val1 + val2;// suma aritmetica
        System.out.println("SUMA------------");
        System.out.println("la suma es = "+ suma);//concatenación
        //RESTA--- -
        int resta; 
        resta=val1 - val2;
        System.out.println("RESTA---------");
        System.out.println("la resta es="+ resta);
        //MULTIPLICACIÓN ---- *
        int multi= val1 * val2;
        System.out.println("MULTIPLICACIÓN------");
        System.out.println("la multiplicación es ="+ multi);
        //DIVISIÓN ---- /
        int divi;
        divi = val2 / val1;
        System.out.println("DIVISIÓN-------");
        System.out.println("la división es ="+ divi);
        val1= 11;
        val2= 2;
        divi= val1 /val2;
        System.out.println("la división 11/2="+ divi);
        int residuo = val1 % val2;
        System.out.println(residuo+ "el residuo de 11/2 es ="+ residuo );
        //------
        double resu= val1 / val2;
        System.out.println("la división de 11/2 es ="+ resu);
        double val2Double=2;
        resu = val1 / val2Double;
        System.out.println("la división 11/2.0="+ resu);
        resu = 11/2.0;
        // int resu2 -----perdida de información
        System.out.println("la división 11/2.0 ="+ resu);
        //POTENCIA ---- no hay operador de potencia
        double potencia = Math.pow(3,3);
        System.out.println("POTENCIA---------");
        System.out.println("3 elevado a la 3="+ potencia);
        //RAIZ -----NO HAY OPERADOR 
        double raiz = Math.pow(100, 0.5);
        System.out.println("RAIZ-------------");
        System.out.println("la raiz cuadrada de 100= " + raiz);
        // precedencia de operadores:
        int resuOp, x=3, y =2, z= 5;
        resuOp = (x*z)+(x*y)/ 2 - (y - z);
        // (15) + (6) /2- (-3)
        // 15 + 3- (-3)
        //15+ 3+ 3= 21
        System.out.println("el residuo es="+ resuOp);
        //FORMULA GENERAL:
        double resuForm = 0, a = 3, b= 9, c=3 ;
        resuForm = ((-b)-Math.pow((b*b-4*a*c), 0.5))/(2*a); 
        System.out.println("el resultado es="+ resuForm);
}
}
