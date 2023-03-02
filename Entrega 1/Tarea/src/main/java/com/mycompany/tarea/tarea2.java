
package com.mycompany.tarea;
import java.util.*;

public class tarea2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juan, alberto, ana, mama;
        System.out.println("ingrese la edad de Juan");
        juan=sc.nextInt();
        alberto=(2*juan)/3;
        ana=(4*juan)/3;
        mama= juan+alberto+ana;
        System.out.println("la edad de la madre es: "+mama+", la edad de Juan es: "+juan+", la edad de Alberto es: "+alberto+" y la edad de Ana es: "+ana);
    }
}
