package EjercicioEXTRA01.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Yate extends Motor {

    private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes, int potencia, int matricula, double eslora, int añoFabricacion) {
        super(potencia, matricula, eslora, añoFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "camarotes=" + camarotes + '}';
    }

    public Yate crearYate() {

        Yate y = new Yate();

        System.out.println("Ingrese la matricula del barco.");
        y.setMatricula(Leer.nextInt());

        System.out.println("Ingrese el tamaño de la eslora (Mts.).");
        y.setEslora(Leer.nextDouble());

        System.out.println("Ingrese el año de fabricación.");
        y.setAñoFabricacion(Leer.nextInt());

        System.out.println("Ingrese la potencia del barco (CV).");
        y.setPotencia(Leer.nextInt());

        System.out.println("Ingrese la cantidad de camarotes.");
        y.setCamarotes(Leer.nextInt());

        return y;

    }

    @Override
    public double costoAlquiler(Alquiler y) {

        return (super.costoAlquiler(y) * super.getPotencia() * camarotes);

    }

}
