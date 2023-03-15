
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c3e18 {


    public static void main(String[] args) {
        float a;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        empleado muestra = new empleado();
        System.out.println("ingrese codigo de trabajador");
        muestra.codigo=sc.nextInt();
        System.out.println("ingrese nombre de trabajador");
        muestra.nombre=sc2.next();
        System.out.println("ingrese horas laboradas de trabajador");
        muestra.horas=sc.nextFloat();
        System.out.println("ingrese valor de horas trabajadas");
        muestra.valor=sc.nextFloat();
        System.out.println("ingrese porcentaje de retencion de fuente en procentaje");
        muestra.retencion=sc.nextFloat();
        float b= salariob(muestra.valor,muestra.horas);
        float n=salarion(b,muestra.retencion);
        System.out.println("empleado: "+muestra.nombre+", identificado por: "+muestra.codigo+" gana un salario base de "+b+" y un salario neto de: "+n);
    }
    public static float salariob(float valor, float horas){
        return valor*horas;

    }
    public static float salarion(float sal, float ret){
        return sal*(1-(ret/100));
    }

    
}
