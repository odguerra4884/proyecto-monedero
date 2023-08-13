package monedero;

import java.util.Scanner;

public class Monedero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Mimonedero monedero = new Mimonedero(100.0);
        MonederoInterfaz interfaz = new MonederoInterfaz();
        
        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Consultar monedero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Meter dinero");
            System.out.println("4. Salir");
            System.out.println("5. Interfaz");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Dinero disponible en el monedero: " + monedero.consultarDisponible());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = scanner.nextDouble();
                    monedero.sacarDinero(cantidadRetirar);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a meter: ");
                    double cantidadMeter = scanner.nextDouble();
                    monedero.meterDinero(cantidadMeter);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
                case 5:
                    interfaz.setVisible(true);
                    interfaz.setLocationRelativeTo(null);
                    
            }
        } while (opcion != 4);
        
        scanner.close();
    }
}
