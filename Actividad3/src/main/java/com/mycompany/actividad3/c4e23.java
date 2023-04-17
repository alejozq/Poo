
package com.mycompany.actividad3;
import java.util.*;
import java.lang.Math.*;
public class c4e23 {
    public static void main(String[] args) {
        Frame23 ins1= new Frame23();
        ins1.setVisible(true);
    }
    public static String coef(double a, double b, double c){
        Scanner sc = new Scanner(System.in);
        double  r1,r2;
        String sol;
        if (b*b-4*a*c<0){
            sol="la ecuacion no tiene solucion en los reales";
        }
        else{
            r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
            r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
            sol="las soluciones de la ecuacion son "+r1+" y "+r2;
        }
        return sol;
        
    }
    
}
