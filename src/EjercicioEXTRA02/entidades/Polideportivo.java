package EjercicioEXTRA02.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Polideportivo extends Edificio {

    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, int ancho, int largo, int alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public void calcularSuperficie() {

        int superficie;

        int base = (ancho * largo) * 2;
        int cara1 = (ancho * alto) * 2;
        int cara2 = (alto * largo) * 2;

        superficie = (base + cara1 + cara2);

        System.out.println(superficie + " Mts.");

    }

    @Override
    public void calcularVolumen() {

        int volumen = (ancho * largo) * alto;

        System.out.println(volumen + " Mts.");

    }

}
