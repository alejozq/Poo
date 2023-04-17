
package com.mycompany.actividad3;
import java.util.*;
import java.lang.Math.*;
public class c4e22 {public static void main(String[] args) {
    Frame22 ins1= new Frame22();
        ins1.setVisible(true);
    }
    public static String suel(String nom, double hora, double v){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double sal;
        String w;
        sal=hora*v;
        if(sal>450000){
            w="El trabajador "+nom+" tendra un sueldo de $"+sal;
        }
        else{
            w="El trabajador "+nom+" no trabajo lo suficiente este mes y morira de hambre :c ";
        }
        return w;
    }
    
}
