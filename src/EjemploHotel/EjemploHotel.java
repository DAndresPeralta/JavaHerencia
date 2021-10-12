package EjemploHotel;

import EjemploH.entidades.Hotel;
import EjemploH.entidades.Hotel1;
import EjemploH.entidades.Hotel2;
import EjemploH.entidades.Hotel3;
import EjemploH.entidades.Hotel4;
import EjemploH.entidades.Hotel5;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author d.andresperalta
 */
public class EjemploHotel {

    public static void main(String[] args) {

        List<Hotel> hoteles = new ArrayList<>();

        Hotel h1 = new Hotel1(1500d, 150d, 5);
        Hotel h2 = new Hotel2(2500d, 175d, 10);
        Hotel h3 = new Hotel3(3250d, 210d, 15);
        Hotel h4 = new Hotel4(4500d, 250d, 20);
        Hotel h5 = new Hotel5(5500d, 275d, 25);

        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        hoteles.add(h5);

        for (Hotel aux : hoteles) {

            if (aux instanceof Hotel5) { //Instance of permite discriminar a que instancia pertenece una determinada clase-objeto.
                Hotel5 object = (Hotel5) aux;

                System.out.println("Es un hotel 5 estrellas.");
                continue;

            }
            if (aux instanceof Hotel4) {
                Hotel4 object = (Hotel4) aux;

                System.out.println("Es un hotel 4 estrellas.");
                continue;

            }
            if (aux instanceof Hotel3) {
                Hotel3 object = (Hotel3) aux;

                System.out.println("Es un hotel 3 estrellas.");
                continue;

            }
            if (aux instanceof Hotel2) {
                Hotel2 object = (Hotel2) aux;

                System.out.println("Es un hotel 2 estrellas.");
                continue;

            }
            if (aux instanceof Hotel1) {
                Hotel1 object = (Hotel1) aux;

                System.out.println("Es un hotel 1 estrellas.");

            }

        }

    }

}
