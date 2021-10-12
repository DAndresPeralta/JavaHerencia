package EjercicioEXTRA03.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Hotel5 extends Hotel4 {

    private int salonesConf;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(int salonesConf, int cantSuites, int cantLimosinas, boolean gimnasio, String restaurante, int capacidadRestaurante) {
        super(gimnasio, restaurante, capacidadRestaurante);
        this.salonesConf = salonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getSalonesConf() {
        return salonesConf;
    }

    public void setSalonesConf(int salonesConf) {
        this.salonesConf = salonesConf;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "salonesConf=" + salonesConf + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

    @Override
    public double precioHabitacion() {

        double precio = super.precioHabitacion();

        return (precio + (15 * getCantLimosinas()));

    }

}
