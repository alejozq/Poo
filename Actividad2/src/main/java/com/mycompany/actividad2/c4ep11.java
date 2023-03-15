
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c4ep11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c, mayor;
        System.out.println("ingrese los tres numeros separados por espacios");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        mayor=0;
        if (a>b){
            mayor=a;
        }
        else if (b>a){
            mayor=b;
        }
        else{
            mayor=a;
        }
        if (mayor<c){
            mayor=c;
        }
        System.out.println("El mayor valor entre "+a+", "+b+" y "+c+" es "+mayor);
    }
}
