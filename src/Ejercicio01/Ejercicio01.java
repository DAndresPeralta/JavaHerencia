package Ejercicio01;

import Ejercicio01.entidades.Animal;
import Ejercicio01.entidades.Caballo;
import Ejercicio01.entidades.Gato;
import Ejercicio01.entidades.Perro;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Frida", "pollito", 13, "Callejera");
        perro1.alimento();

        Animal perro2 = new Perro("Charly", "carnita", 14, "Callejero");
        perro2.alimento();

        Animal gato = new Gato("Michi", "Whyskas", 3, "Naranjoso");
        gato.alimento();

        Animal caballo = new Caballo("Duncan", "pasto", 5, "Cimarron");
        caballo.alimento();

    }

}
