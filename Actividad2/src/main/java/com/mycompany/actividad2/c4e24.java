
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c4e24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c, mayor;
        System.out.println("ingrese los pesos de las esferas separados por un espacio");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a>b){
            if(a>c){
                System.out.println("la esfera A es la mayor");
            }
            else{
                System.out.println("la esfera C es la mayor");
            }
        }
        else{
            if(b>c){
                System.out.println("la esfera B es la mayor");
            }
            else{
                System.out.println("la esfera C es la mayor");
            }
        }
    }
}
