package Ejemplo;

/**
 *
 * @author d.andresperalta
 */
public class Alumno extends Persona {

    private String materia;

    public Alumno() {
    }

    public Alumno(String materia, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.materia = materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getMateria() {
        return materia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Alumno{" + "materia=" + materia + '}';
    }

    @Override
    protected void mensaje() {
        System.out.println("Hola Mundo y Luna.");
    }
    
    

}
