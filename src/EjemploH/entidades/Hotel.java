package EjemploH.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Hotel {

    protected Integer cantidadHabitaciones;

    public Hotel(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

}
