
package actividad3punto2;

import java.util.*;
import java.lang.Math.*;
public class PruebaFiguras {
    public static void main(String args[]) {
        Framep2 ins1= new Framep2();
        ins1.setVisible(true);
    }
    public static String circ(int a){        
    circulo figura1 = new circulo(a);
    String m= "El área del círculo es " + figura1.calcularArea()+" y su perimetro es " + figura1.calcularPerímetro();
    return m;
    }
    public static String recta(int a, int b){
    rectangulo figura2 = new rectangulo(a,b);
    String n="El área del rectángulo es " + figura2.calcularArea()+"y su perímetroes " + figura2.calcularPerímetro();
    return n;
    }
    public static String trian(int a, int b){
    triangulorectangulo figura4 = new triangulorectangulo(a,b);
    String h= "El área del triángulo es " + figura4.calcularArea()+"y su perímetro del triángulo es " + figura4.calcularPerímetro()+ "ademas "+figura4.determinarTipoTriángulo();
    return h;
    }
}
