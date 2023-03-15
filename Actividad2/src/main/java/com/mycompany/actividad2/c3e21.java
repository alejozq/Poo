
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c3e21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor del lado 1 del triangulo");
        double a=sc.nextDouble();
        System.out.println("ingrese el valor del lado 2 del triangulo");
        double b=sc.nextDouble();
        System.out.println("ingrese el valor del lado 3 del triangulo");
        double c=sc.nextDouble();
        double h=a*Math.sqrt(3)/2; //altura
        double p=a+b+c; //perimetro
        double s= (a+b+c)/2; //semiperimetro
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));  //area por ecuacion de Heron

        System.out.println("El area del triangulo es: "+ar+", su perimetro es: "+p+" y el semiperimetro es: "+s);
    }   
}
