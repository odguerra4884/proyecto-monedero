
package monedero;


public class Mimonedero {
    
    private double cantidadDinero;

    public Mimonedero(double cantidadInicial) {
        this.cantidadDinero = cantidadInicial;
    }

    public void meterDinero(double cantidad) {
        if (cantidad > 0) {
            cantidadDinero += cantidad;
            System.out.println("Se han anadido " + cantidad + " unidades al monedero.");
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
        }
    }

    public void sacarDinero(double cantidad) {
        if (cantidad <= cantidadDinero) {
            cantidadDinero -= cantidad;
            System.out.println("Se han retirado " + cantidad + " unidades del monedero.");
        } else {
            System.out.println("No hay suficiente dinero en el monedero.");
        }
    }

    public double consultarDisponible() {
        return cantidadDinero;
    }

}
