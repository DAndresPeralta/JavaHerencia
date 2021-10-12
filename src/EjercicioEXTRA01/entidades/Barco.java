package EjercicioEXTRA01.entidades;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Barco {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    protected int matricula;
    protected double eslora;
    protected int añoFabricacion;

    public Barco() {
    }

    public Barco(int matricula, double eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion + '}';
    }

    public Barco crearBarco() {

        Barco b = new Barco();

        System.out.println("Ingrese la matricula del barco.");
        b.setMatricula(Leer.nextInt());

        System.out.println("Ingrese el tamaño de la eslora (Mts.).");
        b.setEslora(Leer.nextDouble());

        System.out.println("Ingrese el año de fabricación.");
        b.setAñoFabricacion(Leer.nextInt());

        return b;

    }

    public double costoAlquiler(Alquiler a) {

        int dias;
        dias = (a.getFechaInicio().getDay() - a.getFechaFinal().getDay());

        double modulo;
        modulo = (a.getBarco().getEslora() * 10);

        double costo;
        costo = (dias * modulo);

        System.out.println(costo);
        
        return costo;

    }

}
