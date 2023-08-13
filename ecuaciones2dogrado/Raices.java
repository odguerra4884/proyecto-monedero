
package ecuaciones2dogrado;

public class Raices {
    
    protected double a;
    protected double b;
    protected double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obtenerRaices() {
        double discriminante = getDiscriminante();

        if (discriminante >= 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else {
            System.out.println("No existen soluciones reales.");
        }
    }

    public void obtenerRaiz() {
        double discriminante = getDiscriminante();

        if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Raiz unica: " + raiz);
        } else {
            System.out.println("No existe una unica solucion.");
        }
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void calcular() {
    if (tieneRaiz()) {
        obtenerRaiz();
    } else if (tieneRaices()) {
        obtenerRaices();
    } else {
        System.out.println("No existen soluciones reales.");
    }
    }
}
