package Ejercicio03.entidades;

/**
 *
 * @author d.andresperalta
 */
public abstract class Electrodomestico {

    protected double precio;
    protected String color;
    protected Character consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, Character consumoEnergetico, int peso) {
        this.precio = precio + (precioFinal(consumoEnergetico, peso));
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio + (precioFinal(consumoEnergetico, peso));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Character comprobarConsumoEnergetico(Character letra) {

        Character consumoElectrico;

        if (letra > 'F') {
            consumoElectrico = 'F';

        } else {
            consumoElectrico = letra;
        }

        return consumoElectrico;

    }

    public String comprobarColor(String c) {

        String c1 = c.toUpperCase();

        if (!"BLANCO".equals(c1) && !"NEGRO".equals(c1) && !"ROJO".equals(c1) && !"AZUL".equals(c1) && !"GRIS".equals(c1)) {
            color = "BLANCO";

        } else {
            color = c1;
        }

        return color;

    }

    public double precioFinal(char consumo, double peso) {

        switch (consumo) {
            case 'A':
                this.precio = (precio + 1000);
                break;
            case 'B':
                this.precio = (precio + 800);
                break;
            case 'C':
                this.precio = (precio + 600);
                break;
            case 'D':
                this.precio = (precio + 500);
                break;
            case 'E':
                this.precio = (precio + 300);
                break;
            case 'F':
                this.precio = (precio + 100);
                break;
            default:
                this.precio = (precio + 100);
                break;
        }

        if (peso >= 1 && peso <= 19) {
            this.precio = (precio + 100);
        } else if (peso >= 20 && peso <= 49) {
            this.precio = (precio + 500);
        } else if (peso >= 50 && peso <= 79) {
            this.precio = (precio + 800);
        } else if (peso >= 80) {
            this.precio = (precio + 1000);
        }

        return this.precio;

    }
}
