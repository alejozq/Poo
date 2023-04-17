
package com.mycompany.actividad3;
import java.util.*;
import java.lang.Math.*;
public class c3e18 {


    public static void main(String[] args) {
        Frame18 ins1= new Frame18();
        ins1.setVisible(true);
    }
    public static String trabajo(double codigo, double horas, double valor, double ret, String nombre){
        double b,n;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        b= salariob(valor,horas);
        n=salarion(b,ret);
        String w="El empleado "+nombre+ ", identificado por: "+codigo+" gana un salario base de "+b+" y un salario neto de: "+n;
        return w;
    }
    public static double salariob(double valor, double horas){
        return valor*horas;

    }
    public static double salarion(double sal, double ret){
        return sal*(1-(ret/100));
    }

    
}
