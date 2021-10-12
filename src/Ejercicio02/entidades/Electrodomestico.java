package Ejercicio02.entidades;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Electrodomestico {

    protected Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    protected double precio;
    protected String color;
    protected char consumoElectrico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoElectrico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {

        if (letra > 'F') {
            consumoElectrico = 'F';

        } else {
            consumoElectrico = letra;
        }

    }

    public void comprobarColor(String c) {

        String c1 = c.toUpperCase();

        if (!"BLANCO".equals(c1) && !"NEGRO".equals(c1) && !"ROJO".equals(c1) && !"AZUL".equals(c1) && !"GRIS".equals(c1)) {
            color = "BLANCO";

        } else {
            color = c1;
        }

    }

    public void crearElectrodomestico() {

        precio = 1000d;

        System.out.println("Ingrese el color.");
        color = Leer.next();

        comprobarColor(color);

        System.out.println("Ingrese el consumo eléctrico.");
        consumoElectrico = Leer.next().toUpperCase().charAt(0);

        comprobarConsumoEnergetico(consumoElectrico);

        System.out.println("Ingrese el peso.");
        peso = Leer.nextDouble();

    }

    public void precioFinal(char consumo, double peso) {

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

    }

}
