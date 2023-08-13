
package ecuaciones2dogrado;
import java.util.Scanner;

public class Ecuaciones2doGrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;
               
        do {
            System.out.println("Ingrese los coeficientes de la ecuacion de segundo grado:");
            System.out.print("Coeficiente a: ");
            double a = scanner.nextDouble();
            System.out.print("Coeficiente b: ");
            double b = scanner.nextDouble();
            System.out.print("Coeficiente c: ");
            double c = scanner.nextDouble();

            Raices ecuacion = new Raices(a, b, c);
            System.out.println("Ecuacion ingresada:");
            System.out.println(a + "x^2 + " + b + "x + " + c);
            
            ecuacion.calcular();
            
            System.out.print("Desea ingresar otra ecuacion? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        scanner.close();
    }
    
}
