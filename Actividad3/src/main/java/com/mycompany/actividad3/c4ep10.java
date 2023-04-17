
package com.mycompany.actividad3;
import java.util.*;
import java.lang.Math.*;
public class c4ep10 {
    public static void main(String[] args) {
        Frame10 ins1= new Frame10();
        ins1.setVisible(true);
    }
    public static String mat(String nom, double ni, double pat, double est){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double pagmat=50000;
        if ((pat>2000000) && (est>3)){
            pagmat=pagmat+0.03*pat;
        }
        String f ="El estudiante con numero de ingreso "+ni+" y nombre "+nom+" debe pagar: $"+pagmat;
        return f;
    }
}
