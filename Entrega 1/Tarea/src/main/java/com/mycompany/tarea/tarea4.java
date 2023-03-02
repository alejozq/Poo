
package com.mycompany.tarea;
import java.util.*;
import java.lang.Math.*;

public class tarea4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,a,p;
        System.out.println("Ingrese el radio de la circunferencia: ");
        r=sc.nextFloat();
        a=Math.PI*r*r;
        p=2*Math.PI*r;
        System.out.println("El area de la circunferencia es "+a+" y su perimetro es "+p);
        
    }
}