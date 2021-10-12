package EjercicioEXTRA02;

import EjercicioEXTRA02.entidades.Edificio;
import EjercicioEXTRA02.entidades.Oficinas;
import EjercicioEXTRA02.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author d.andresperalta
 */
public class EjercicioEXTRA02 {

    public static void main(String[] args) {

        List<Edificio> edificios = new ArrayList<>();

        int contTecho = 0;
        int contSinTecho = 0;

        Polideportivo e1 = new Polideportivo();
        e1.setAlto(50);
        e1.setAncho(15);
        e1.setLargo(20);
        e1.setNombre("Gimnasio N°3");
        e1.setTechado(true);
        edificios.add(e1);

        Polideportivo e2 = new Polideportivo();
        e2.setAlto(50);
        e2.setAncho(20);
        e2.setLargo(25);
        e2.setTechado(false);
        e2.setNombre("Gimanasio N°2");
        edificios.add(e2);

        Oficinas e3 = new Oficinas();
        e3.setAlto(50);
        e3.setAncho(14);
        e3.setLargo(30);
        e3.setNumOficinas(10);
        e3.setPersonasXOficinas(3);
        e3.setPisos(5);
        e3.setNombre("Oficinas Ciudad");
        edificios.add(e3);

        Oficinas e4 = new Oficinas();
        e4.setAlto(56);
        e4.setAncho(21);
        e4.setLargo(35);
        e4.setNumOficinas(20);
        e4.setPersonasXOficinas(5);
        e4.setPisos(10);
        e4.setNombre("Oficinas Montes");
        edificios.add(e4);

        Polideportivo e5 = new Polideportivo("Gimnasio N° 1", true, 10, 15, 20);
        edificios.add(e5);

        for (Edificio aux : edificios) {
            if (aux instanceof Polideportivo) {

                if (((Polideportivo) aux).isTechado()) {
                    contTecho++;
                } else {
                    contSinTecho++;
                }

                System.out.println("La superficie del edificio " + ((Polideportivo) aux).getNombre() + " es: ");
                aux.calcularSuperficie();
                System.out.println();
                System.out.println("El volumen del edificio " + ((Polideportivo) aux).getNombre() + " es: ");
                aux.calcularVolumen();
                System.out.println();

            } else if (aux instanceof Oficinas) {

                System.out.println("La superficie del edificio " + ((Oficinas) aux).getNombre() + " es: ");
                aux.calcularSuperficie();
                System.out.println();
                System.out.println("El volumen del edificio " + ((Oficinas) aux).getNombre() + " es: ");
                aux.calcularVolumen();
                System.out.println();
                System.out.println("El edificio " + ((Oficinas) aux).getNombre() + " contiene: ");
                ((Oficinas) aux).personaTotal();
                System.out.println();

            }

        }

        System.out.println();
        System.out.println("Polideportivos techados: " + contTecho);
        System.out.println("Polideportivos sin techo: " + contSinTecho);

    }

}
