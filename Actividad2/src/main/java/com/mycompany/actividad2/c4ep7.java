
package com.mycompany.actividad2;
import java.util.*;
import java.lang.Math.*;
public class c4ep7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese los numero A y B");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b) {
            System.out.println("A es mayor que B");            
        }
        else {
            if (a==b){
                System.out.println("A es igual a B");
            }
            else{
                System.out.println("A es menor que B");
            }
        }
    }
    
}
