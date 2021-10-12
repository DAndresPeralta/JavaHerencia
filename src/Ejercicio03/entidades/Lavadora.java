package Ejercicio03.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, Character consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double precioFinal(char consumo, double peso) {

        double p = 0;

        System.out.println(carga);

        if (30 <= carga) {

            p = super.precioFinal(consumo, peso) + 500;

        } else {
            p = super.precioFinal(consumo, peso);
        }

        return p;

    }

}
