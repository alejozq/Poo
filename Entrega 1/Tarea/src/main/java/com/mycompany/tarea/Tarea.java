
package com.mycompany.tarea;
import java.util.*;

public class Tarea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("ingrese un numero");
        a=sc.nextInt();
        b=a*a;
        c=a*a*a;
        System.out.println("el cuadrado es "+ b);
        System.out.println("el cubo es "+ c);
    }
}
