package EjercicioEXTRA01.entidades;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Motor extends Barco {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private int potencia;

    public Motor() {
    }

    public Motor(int potencia, int matricula, double eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + '}';
    }

    public Motor crearBarcoMotor() {

        Motor m = new Motor();

        System.out.println("Ingrese la matricula del barco.");
        m.setMatricula(Leer.nextInt());

        System.out.println("Ingrese el tamaño de la eslora (Mts.).");
        m.setEslora(Leer.nextDouble());

        System.out.println("Ingrese el año de fabricación.");
        m.setAñoFabricacion(Leer.nextInt());

        System.out.println("Ingrese la potencia del barco (CV).");
        m.setPotencia(Leer.nextInt());

        return m;

    }

    @Override
    public double costoAlquiler(Alquiler b) {

        double total = (super.costoAlquiler(b) * potencia);

        return total;

    }

}
