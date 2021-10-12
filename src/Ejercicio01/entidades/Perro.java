package Ejercicio01.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimento() {
        System.out.println(nombre + " se alimenta de: " + alimento);
    }

}
