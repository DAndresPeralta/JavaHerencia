package Ejercicio03;

import Ejercicio03.entidades.Lavadora;

public class Ejercicio03 {

    public static void main(String[] args) {

        Lavadora l1 = new Lavadora();

        l1.setCarga(35);
        l1.setColor("ROJO");
        l1.setConsumoEnergetico('A');
        l1.setPeso(100);
        l1.setPrecio(1000d);

        System.out.println(l1.getPrecio());

        Lavadora l2 = new Lavadora(35, 1000d, "BLANCO", 'A', 100);

        System.out.println(l2.getPrecio());

    }

}
