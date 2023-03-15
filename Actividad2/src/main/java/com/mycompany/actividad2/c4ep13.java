
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c4ep13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String c;
        double v,p,d;
        System.out.println("ingrese el color de la bola en minuscula");
        c=sc2.next();
        System.out.println("ingrese el valor de la compra");
        v=sc.nextDouble();
        if("blanco".equals(c)){
            d=0;
        }
        else if ("verde".equals(c)){
            d=0.10;
        }
        else if ("amarillo".equals(c)){
            d=0.25;
        }
        else if ("azul".equals(c)){
            d=0.50;
        }
        else{
            d=0.100;
        }
        p= v-(d*v);
        System.out.println("El cliente debe pagar $"+p);
        
    }
}
