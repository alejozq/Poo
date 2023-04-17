
package com.mycompany.actividad3;

import java.util.*;
public class c5e41 {
    public static void main(String[] args) {
        Frame41 ins1= new Frame41();
        ins1.setVisible(true);
    }
    public static String comp(int a, int b, int c){
        int ma;
        if (a>b && a>c){
            ma=a;
        }
        else if (b>a && b>c) {
            ma=b;
        }
        else{
            ma=c;
        }
        String f="el mayor es: "+ma;
        return f;
    }
}
