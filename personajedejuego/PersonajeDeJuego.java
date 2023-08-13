package personajedejuego;

import java.util.Scanner;

public class PersonajeDeJuego {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Caracteristicas duende = new Caracteristicas("Duende", 1.2, 30, "Verde", 80, "Vivo");
        Caracteristicas magoElectrico = new Caracteristicas("Mago Electrico", 1.8, 70, "Azul", 90, "Vivo");
        Caracteristicas esqueleto = new Caracteristicas("Esqueleto", 1.5, 10, "Blanco", 60, "Vivo");
        Caracteristicas chispita = new Caracteristicas("Chispita", 1.6, 50, "Rojo con Amarillo", 75, "Vivo");
        Caracteristicas torreInfernal = new Caracteristicas("Torre Infernal", 5.0, 800, "Negro", 95, "Viva");
        
        int opcion;
        do {
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Ver caracteristicas de un personaje");
            System.out.println("2. Seleccionar un personaje para realizar acciones");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    verCaracteristicas(duende);
                    verCaracteristicas(magoElectrico);
                    verCaracteristicas(esqueleto);
                    verCaracteristicas(chispita);
                    verCaracteristicas(torreInfernal);
                    break;
                case 2:
                    seleccionarPersonaje(scanner, duende, magoElectrico, esqueleto, chispita, torreInfernal);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion != 3);
        
        scanner.close();
    }
    
    private static void verCaracteristicas(Caracteristicas personaje) {
        System.out.println("\nCaracteristicas de " + personaje.getNombre() + ":");
        System.out.println("Altura: " + personaje.getAltura());
        System.out.println("Peso: " + personaje.getPeso());
        System.out.println("Color de piel: " + personaje.getColorPiel());
        System.out.println("Porcentaje de poder: " + personaje.getPorcentajePoder());
        System.out.println("Estado: " + personaje.getEstado());
    }
    
    private static void seleccionarPersonaje(Scanner scanner, Caracteristicas... personajes) {
        System.out.println("Selecciona un personaje:");
        for (int i = 0; i < personajes.length; i++) {
            System.out.println((i + 1) + ". " + personajes[i].getNombre());
        }
        int opcion = scanner.nextInt();
        
        if (opcion >= 1 && opcion <= personajes.length) {
            realizarAcciones(personajes[opcion - 1]);
        } else {
            System.out.println("Opcion invalida.");
        }
    }
    
    private static void realizarAcciones(Caracteristicas personaje) {
        System.out.println("\nRealizando acciones con " + personaje.getNombre() + ":");
        personaje.mostrarEstado();
        personaje.atacar();
        personaje.correr();
        personaje.saltar();
        personaje.esquivar();
        personaje.morir();
        personaje.mostrarEstado();
        System.out.println("");
    }
}
