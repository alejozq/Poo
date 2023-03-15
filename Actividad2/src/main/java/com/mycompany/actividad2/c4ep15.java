
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c4ep15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese los pesos de las cuatro esferas separados por espacios");
        int a,b,c,d;
        String diff,eq;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if ((a==b)&&(a==c)){
            diff="d";
            if (d>a){
                eq="mayor";
            }
            else{
                eq="menor";
                
            }
        }
        else if ((a==b)&&(a==d)){
            diff="c";
            if (c>a){
                eq="mayor";
            }
            else{
                eq="menor";
                
            }
        }
        else if ((a==c)&&(a==d)){
            diff="b";
            if (b>a){
                eq="mayor";
            }
            else{
                eq="menor";
                
            }
        }
        else{
            diff="a";
            if (a>b){
                eq="mayor";
            }
            else{
                eq="menor";
                
            }
        }
        System.out.println("La esfera "+diff+" es la diferente, y ademas es "+eq+" que las demas");
    }
}
