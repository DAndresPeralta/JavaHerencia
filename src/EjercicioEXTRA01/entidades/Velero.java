package EjercicioEXTRA01.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Velero extends Barco {

    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, int matricula, double eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + '}';
    }

    public Velero crearVelero() {

        Velero v = new Velero();

        System.out.println("Ingrese la matricula del barco.");
        v.setMatricula(Leer.nextInt());

        System.out.println("Ingrese el tamaño de la eslora (Mts.).");
        v.setEslora(Leer.nextDouble());

        System.out.println("Ingrese el año de fabricación.");
        v.setAñoFabricacion(Leer.nextInt());

        System.out.println("Ingrese la cantidad de mástiles.");
        v.setMastiles(Leer.nextInt());

        return v;

    }

    @Override
    public double costoAlquiler(Alquiler c) {

        return (super.costoAlquiler(c) * mastiles);

    }

}
