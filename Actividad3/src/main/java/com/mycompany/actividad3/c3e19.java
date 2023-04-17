
package com.mycompany.actividad3;
import java.util.*;
import java.lang.Math.*;
public class c3e19 {
    public static void main(String[] args) {
        Frame19 ins1= new Frame19();
        ins1.setVisible(true);
    }
    public static String trian(double a){
        Scanner sc = new Scanner(System.in);
        double h=a*Math.sqrt(3)/2; //altura
        double p=3*a; //perimetro
        double ar=(a*h)/2;  //area
        String y= "El area del triangulo es: "+ar+", su perimetro es: "+p+" y el valor de su altura es: "+h;
        return y;
    }
    
}
