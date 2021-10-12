package Ejercicio02;

import Ejercicio02.entidades.Electrodomestico;
import Ejercicio02.entidades.Lavadora;
import Ejercicio02.entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio02 {
    
    ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

    public static void main(String[] args) {

        Lavadora l1 = new Lavadora();

        l1.crearLavadora();

        System.out.println(l1.getPrecio());

        Televisor t1 = new Televisor();

        t1.crearTelevision();

        System.out.println(t1.getPrecio());

    }

}
