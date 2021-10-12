package Ejercicio02.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Lavadora extends Electrodomestico {
    
    protected int carga;
    
    public Lavadora() {
    }
    
    public Lavadora(int carga, double precio, String color, char consumoElectrico, double peso) {
        super(precio, color, consumoElectrico, peso);
        this.carga = carga;
    }
    
    public int getCarga() {
        return carga;
    }
    
    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora() {
        
        crearElectrodomestico();
        
        System.out.println("Ingrese la capacidad de carga de la lavadora.");
        carga = Leer.nextInt();
        
        precioFinal(consumoElectrico, peso);
        
    }
    
    @Override
    public void precioFinal(char consumo, double peso) {
        
        super.precioFinal(consumo, peso);
        
        if (carga >= 30) {
            this.precio = (precio + 500);
        }
        
    }
    
}
