
package com.mycompany.actividad2.punto2;

import java.util.*;
import java.lang.Math.*;
public class circulo {
    int radio; 

    circulo(int radio) {
        this.radio = radio;
    }

    double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    double calcularPerímetro() {
        return 2*Math.PI*radio;
    }
    
}
