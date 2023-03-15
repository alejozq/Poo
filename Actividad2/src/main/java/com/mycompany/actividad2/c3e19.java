
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c3e19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor del lado del triangulo");
        double a=sc.nextDouble();
        double h=a*Math.sqrt(3)/2; //altura
        double p=3*a; //perimetro
        double ar=(a*h)/2;  //area
        System.out.println("El area del triangulo es: "+ar+", su perimetro es: "+p+" y el valor de su altura es: "+h);
    }
    
}
