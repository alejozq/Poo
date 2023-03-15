
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c4ep10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double ni, pat, est, pagmat;
        String nom;
        System.out.println("ingrese el nombre del estudiante");
        nom=sc2.next();
        System.out.println("ingrese el numero de ingreso");
        ni=sc.nextDouble();
        System.out.println("ingrese el patrimonio");
        pat=sc.nextDouble();
        System.out.println("ingrese el estrato");
        est=sc.nextDouble();
        pagmat=50000;
        if ((pat>2000000) && (est>3)){
            pagmat=pagmat+0.03*pat;
        }
        System.out.println("El estudiante con numero de ingreso "+ni+" y nombre "+nom+" debe pagar: $"+pagmat);
    }
}
