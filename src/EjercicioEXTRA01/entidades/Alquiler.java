package EjercicioEXTRA01.entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Alquiler {
    
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
    private String nombre;
    protected long dni;
    protected Date fechaInicio;
    protected Date fechaFinal;
    protected String posicionAmarre;
    protected Barco barco;
    
    public Alquiler() {
    }
    
    public Alquiler(String nombre, long dni, Date fechaInicio, Date fechaFinal, String posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public long getDni() {
        return dni;
    }
    
    public void setDni(long dni) {
        this.dni = dni;
    }
    
    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public Date getFechaFinal() {
        return fechaFinal;
    }
    
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    public String getPosicionAmarre() {
        return posicionAmarre;
    }
    
    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }
    
    public Barco getBarco() {
        return barco;
    }
    
    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    public void crearAlquiler(Alquiler a) {

//        Alquiler a = new Alquiler();
        System.out.println("Ingrese el nombre del cliente.");
        a.setNombre(Leer.next());
        
        System.out.println("Ingrese el DNI del cliente.");
        a.setDni(Leer.nextInt());
        
        Date fi = new Date(121, 8, 4);
        a.setFechaInicio(fi);
        
        Date ff = new Date();
        a.setFechaFinal(ff);
        
        System.out.println("Ingrese la posición de amarre.");
        a.setPosicionAmarre(Leer.next());
        
        elegir(a);

//        Barco b = new Barco();
//        a.setBarco(b.crearBarco());
//
//        a.getBarco().costoAlquiler(a);
//        Motor m = new Motor();
//        a.setBarco(m.crearBarcoMotor());
//        
//        System.out.println(a.getBarco().costoAlquiler(a));
//        Velero v = new Velero();
//        a.setBarco(v.crearVelero());
//        
//        System.out.println(a.getBarco().costoAlquiler(a));
//        Yate y = new Yate();
//        a.setBarco(y.crearYate());
//
//        System.out.println(a.getBarco().costoAlquiler(a));
    }
    
    public void menu() {
        
        System.out.println("Bienvenido a alquileres de barcos.");
        System.out.println("Ingrese la opción deseada.");
        System.out.println("----------------------------------");
        System.out.println("1: Barco."
                + "2: Velero."
                + "3: Barco a motor."
                + "4: Yate."
                + "5: Salir.");
        
    }
    
    public int respuesta() {
        
        int resp;
        
        resp = Leer.nextInt();
        
        return resp;
        
    }
    
    public void elegir(Alquiler a) {
        
        int resp;
        String r;
        
        do {
            
            menu();
            
            resp = respuesta();
            
            switch (resp) {
                
                case 1:
                    
                    System.out.println("***Barco***");
                    Barco b = new Barco();
                    a.setBarco(b.crearBarco());
                    System.out.println(a.getBarco().costoAlquiler(a));
                    break;
                
                case 2:
                    
                    System.out.println("***Velero***");
                    Velero v = new Velero();
                    a.setBarco(v.crearVelero());
                    System.out.println(a.getBarco().costoAlquiler(a));
                    break;
                
                case 3:
                    
                    System.out.println("***Barco a motor***");
                    Motor m = new Motor();
                    a.setBarco(m.crearBarcoMotor());
                    System.out.println(a.getBarco().costoAlquiler(a));
                    break;
                
                case 4:
                    
                    System.out.println("***Yate***");
                    Yate y = new Yate();
                    a.setBarco(y.crearYate());
                    System.out.println(a.getBarco().costoAlquiler(a));
                    break;
                
                case 5:
                    
                    System.out.println("Gracias.");
                    break;
                
            }
            
            System.out.println("Desea consultar otro presupuesto?");
            System.out.println(" S (SI) - N (NO).");
            r = Leer.next().toUpperCase();
            
        } while (r.equalsIgnoreCase("S"));
        
    }
    
}
