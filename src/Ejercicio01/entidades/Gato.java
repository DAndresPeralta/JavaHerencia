package Ejercicio01.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimento() {
        System.out.println(Gato.this.toString() + " se alimenta de: " + alimento);

    }

}
