package EjercicioEXTRA03.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Hotel4 extends Hotel {

    private boolean gimnasio;
    private String restaurante;
    private int capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(boolean gimnasio, String restaurante, int capacidadRestaurante) {
        this.gimnasio = gimnasio;
        this.restaurante = restaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "gimnasio=" + gimnasio + ", restaurante=" + restaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }


    @Override
    public double precioHabitacion() {

        int resto;
        int gym;

        if (getCapacidadRestaurante() > 50) {
            resto = 50;
        } else if (getCapacidadRestaurante() < 30) {
            resto = 10;
        } else {
            resto = 30;
        }

        if (isGimnasio() == true) {
            gym = 50;
        } else {
            gym = 0;
        }

        double precio = (super.precioHabitacion() + resto + gym);

        return precio;

    }

}
