
package actividad3punto2;
import java.util.*;
import java.lang.Math.*;
public class cuadrado {
    int lado; 

    public cuadrado(int lado) {
    this.lado = lado;
    }

    double calcularArea() {
    return lado*lado;
    }

    double calcularPerímetro() {
    return (4*lado);
    }
}
