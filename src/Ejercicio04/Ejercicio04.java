package Ejercicio04;

import Ejercicio04.entidades.Circulo;
import Ejercicio04.entidades.Rectangulo;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        Circulo c1 = new Circulo(5, 5);

        System.out.println(c1.Area());

        System.out.println(c1.Perimetro());

        Rectangulo r1 = new Rectangulo(5, 5);

        System.out.println(r1.Area());

        System.out.println(r1.Perimetro());

    }

}
