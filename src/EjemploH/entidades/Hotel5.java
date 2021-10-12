package EjemploH.entidades;

/**
 *
 * @author d.andresperalta
 */
public final class Hotel5 extends Hotel4 { //Final le otorga la capacidad de no permitir heredar sus atributos/métodos.

    protected boolean cacino = true;
    protected boolean restaurant = true;

    public Hotel5(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }

}
