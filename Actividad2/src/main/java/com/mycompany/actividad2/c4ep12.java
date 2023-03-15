
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c4ep12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("ingrese el nombre del trabajador");
        String nom;
        double nht, vhn, het, hee, sal;
        nom=sc2.next();
        System.out.println("ingrese las horas trabajadas y el valor de las horas separadas por espacios");
        nht=sc.nextDouble();
        vhn=sc.nextDouble();
        if (nht>40){
            het=nht-40;
            if(het>8){
                hee=het-8;
                sal=40*vhn+16*vhn+hee*3*vhn;
            }
            else{
                sal=40*vhn+het*2*vhn;
            }
        }
        else{
            sal=nht*vhn;
        }
        System.out.println("El trabajador "+nom+" devengo: $"+sal);
        
        
    }
}
