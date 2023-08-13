
package tallermecanica;


public class TallerMecanica {

   
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 2022, "123456789", 25000.0);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Mustang", 2023, "987654321", 45000.0);
        Vehiculo vehiculo3 = new Vehiculo("Honda", "Civic", 2020, "567890123", 22000.0);
        Vehiculo vehiculo4 = new Vehiculo("Chevrolet", "Cruze", 2021, "456789012", 28000.0);
        Vehiculo vehiculo5 = new Vehiculo("Nissan", "Altima", 2023, "789012345", 30000.0);

        System.out.println("Informacion de los vehiculos:");
        
        System.out.println(vehiculo1.getMarca() + " " + vehiculo1.getModelo() + " " + vehiculo1.getAnio()+ " " +vehiculo1.getChasis()+ " $" + vehiculo1.getPrecio());
        System.out.println(vehiculo2.getMarca() + " " + vehiculo2.getModelo() + " " + vehiculo2.getAnio());
        System.out.println(vehiculo3.getMarca() + " " + vehiculo3.getModelo() + " " + vehiculo3.getAnio());
        System.out.println(vehiculo4.getMarca() + " " + vehiculo4.getModelo() + " " + vehiculo4.getAnio());
        System.out.println(vehiculo5.getMarca() + " " + vehiculo5.getModelo() + " " + vehiculo5.getAnio());
       
    }
    
    
}
