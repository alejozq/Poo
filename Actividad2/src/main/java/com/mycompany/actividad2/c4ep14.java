
package com.mycompany.actividad2;

import java.util.*;
import java.lang.Math.*;
public class c4ep14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1,v2,v3,sal,s1,s2,s3,ven,pven;
        System.out.println("ingrese las ventas de los tres departamentos en orden y el salario base separados por espacio");
        v1=sc.nextDouble();
        v2=sc.nextDouble();
        v3=sc.nextDouble();
        sal=sc.nextDouble();
        ven=v1+v2+v3;
        pven=0.33*ven;
        if (v1>pven){
            s1=sal+0.2*sal;
        }
        else{
            s1=sal;
        }
        if (v2>pven){
            s2=sal+0.2*sal;
        }
        else{
            s2=sal;
        }
        if (v3>pven){
            s3=sal+0.2*sal;
        }
        else{
            s3=sal;
        }
        System.out.println("El salario del vendedor 1 es $"+s1+", el salario del vendedor 2 es $"+s2+" y el salario del vendedor 3 es $"+s3);
    }
}
