
package com.mycompany.actividad3;
import java.util.*;
public class c5e40 {
    public static void main(String[] args) {
        Frame40 ins1= new Frame40();
        ins1.setVisible(true);
    }
    public static String ord(int a, int b, int c){
        int ma,me,mi;
        if ((a>b) && (a>c)){
            ma=a;
            if(b>c){
                me=b;
                mi=c;
            }
            else{
                me=c;
                mi=b;
            }
        }
        else if ((b>a) && (b>c)){
            ma=b;
            if(a>c){
                me=a;
                mi=c;
            }
            else{
                me=c;
                mi=a;
            }
        }
        else{
            ma=c;
            if (a>b){
                me=a;
                mi=b;
            }
            else{
                me=b;
                mi=a;
            }
        }
        String f= "valor menor: "+mi+", valor intermedio: "+me+" valor mayor: "+ma;
        return f;
    }
}
