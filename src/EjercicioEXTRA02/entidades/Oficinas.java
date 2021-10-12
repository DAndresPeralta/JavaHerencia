package EjercicioEXTRA02.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Oficinas extends Edificio {

    private int numOficinas;
    private int personasXOficinas;
    private int pisos;
    private String nombre;

    public Oficinas() {
    }

    public Oficinas(int numOficinas, int personasXOficinas, int pisos, int ancho, int largo, int alto, String nombre) {
        super(ancho, largo, alto);
        this.numOficinas = numOficinas;
        this.personasXOficinas = personasXOficinas;
        this.pisos = pisos;
        this.nombre = nombre;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getPersonasXOficinas() {
        return personasXOficinas;
    }

    public void setPersonasXOficinas(int personasXOficinas) {
        this.personasXOficinas = personasXOficinas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void personaPiso() {

        int personas = (numOficinas * personasXOficinas);

    }

    public void personaTotal() {

        int personas = (numOficinas * personasXOficinas) * pisos;

        System.out.println(personas + " personas en total.");

    }

}
