package EjercicioEXTRA03.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Camping extends Alojamiento {

    protected boolean privado;
    protected double mm;
    protected int capMaxCarpas;
    protected int cantBanos;
    protected boolean resto;

    public Camping() {
    }

    public Camping(boolean privado, double mm, int capMaxCarpas, int cantBanos, boolean resto, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.mm = mm;
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanos = cantBanos;
        this.resto = resto;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMm() {
        return mm;
    }

    public void setMm(double mm) {
        this.mm = mm;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBanos() {
        return cantBanos;
    }

    public void setCantBanos(int cantBanos) {
        this.cantBanos = cantBanos;
    }

    public boolean isResto() {
        return resto;
    }

    public void setResto(boolean resto) {
        this.resto = resto;
    }

    @Override
    public String toString() {
        return "Camping{" + "privado=" + privado + ", mm=" + mm + ", capMaxCarpas=" + capMaxCarpas + ", cantBanos=" + cantBanos + ", resto=" + resto + '}';
    }
    
    

}
