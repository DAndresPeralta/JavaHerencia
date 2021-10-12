package EjercicioEXTRA01;

import EjercicioEXTRA01.entidades.Alquiler;

/**
 *
 * @author d.andresperalta
 */
public class EjercicioEXTRA01 {

    public static void main(String[] args) {

        Alquiler a = new Alquiler();
        a.crearAlquiler(a);

        System.out.println(a.toString());

    }

}
