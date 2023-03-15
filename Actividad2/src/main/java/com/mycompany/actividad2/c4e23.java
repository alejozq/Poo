
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c4e23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c, r1,r2;
        System.out.println("ingrese los coeficientes de la ecuacion a,b y c separados por un espacio");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        if (b*b-4*a*c<0){
            System.out.println("la ecuacion no tiene solucion en los reales");
        }
        else{
            r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
            r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("las soluciones de la ecuacion son "+r1+" y "+r2);
        }
        
    }
    
}
