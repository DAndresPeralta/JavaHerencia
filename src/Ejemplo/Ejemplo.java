package Ejemplo;

/**
 *
 * @author d.andresperalta
 */
public class Ejemplo {

    public static void main(String[] args) {

        Persona p1 = new Persona("Andres", "Peralta", 28);
        Alumno a1 = new Alumno("Programación", "Andres", "Peralta", 28);

        p1.toString();
        p1.mensaje();
        a1.toString();
        a1.mensaje();

    }

}
