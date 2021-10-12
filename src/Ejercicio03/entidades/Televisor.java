package Ejercicio03.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, String color, Character consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public double precioFinal(char consumo, double peso) {

        super.precioFinal(consumo, peso);

        if (resolucion >= 40) {

            this.precio = (precio + (precio * 0.3));

        }

        if (sintonizador == true) {

            this.precio = (precio + 500);

        }

        return this.precio;

    }

}
