
package com.mycompany.actividad3;
import java.util.*;
import java.lang.Math.*;
public class c4ep7 {
    public static void main(String[] args) {
        Frame7 ins1= new Frame7();
        ins1.setVisible(true);
    }
    public static String may(int a,int b){
        String f;
        if (a>b) {
            f="A es mayor que B";            
        }
        else {
            if (a==b){
                f="A es igual a B";
            }
            else{
                f="A es menor que B";
            }
        }
        return f;
    }
    
}
