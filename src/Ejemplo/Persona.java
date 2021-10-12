package Ejemplo;

/**
 *
 * @author d.andresperalta
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected int dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    protected void mensaje(){
        
        System.out.println("Hola Mundo.");
        
    }

}
