
package com.mycompany.tarea;
import java.util.*;

public class tarea3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r ,b,n;
        r=(float) 0.125;
        b=5000*48*4;
        n=b-(b*r);
        System.out.println("El salario bruto mensual es $"+b+" y el salario neto mensual es $"+n);
    }
}