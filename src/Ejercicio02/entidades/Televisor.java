package Ejercicio02.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, String color, char consumoElectrico, double peso) {
        super(precio, color, consumoElectrico, peso);
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

    public void crearTelevision() {

        String tda;

        crearElectrodomestico();

        System.out.println("Ingrese la resolución del dispositivo.");
        resolucion = Leer.nextInt();

        do {

            System.out.println("Tiene sintonizador?.");
            System.out.println("S (SI) - N (NO).");
            tda = Leer.next().toUpperCase();

        } while (!"S".equals(tda) && !"N".equals(tda));

        sintonizador = "S".equals(tda);

        precioFinal(consumoElectrico, peso);

    }

    @Override

    public void precioFinal(char consumo, double peso) {

        super.precioFinal(consumo, peso);

        if (resolucion >= 40) {

            this.precio = (precio + (precio * 0.3));

        }

        if (sintonizador == true) {

            this.precio = (precio + 500);

        }

    }
}
