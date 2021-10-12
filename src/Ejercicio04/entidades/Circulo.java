package Ejercicio04.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Circulo implements calculosFormas {

    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double Area() {

        double area;

        area = (PI * Math.pow(radio, 2));

        return area;

    }

    @Override
    public double Perimetro() {

        double perimetro;

        perimetro = (PI * diametro);

        return perimetro;

    }

}
