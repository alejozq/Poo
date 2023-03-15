
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c4e22 {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int hora,v, sal;
        String nom;
        System.out.println("ingrese el nombre del trabajador");
        nom=sc2.next();
        System.out.println("ingrese el numero de horas trabajadas durante el mes y el valor por hora separados por espacio");
        hora=sc.nextInt();
        v=sc.nextInt();
        sal=hora*v;
        if(sal>450000){
            System.out.println("El trabajador "+nom+" tendra un sueldo de $"+sal);
        }
        else{
            System.out.println("El trabajador "+nom+" no trabajo lo suficiente este mes y morira de hambre :c ");
        }
    }
    
}
