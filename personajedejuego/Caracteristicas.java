
package personajedejuego;

public class Caracteristicas {
    private String nombre;
    private double altura;
    private double peso;
    private String colorPiel;
    private int porcentajePoder;
    private String estado;

    public Caracteristicas(String nombre, double altura, double peso, String colorPiel, int porcentajePoder, String estado) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorPiel = colorPiel;
        this.porcentajePoder = porcentajePoder;
        this.estado = estado;
    }

    public void atacar() {
        System.out.println(nombre + " esta atacando.");
    }

    public void correr() {
        System.out.println(nombre + " esta corriendo.");
    }

    public void saltar() {
        System.out.println(nombre + " esta saltando.");
    }

    public void esquivar() {
        System.out.println(nombre + " esta esquivando.");
    }

    public void morir() {
        System.out.println(nombre + " ha muerto.");
        estado = "Muerto";
    }

    public void mostrarEstado() {
        System.out.println(nombre + " esta " + estado + ".");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public int getPorcentajePoder() {
        return porcentajePoder;
    }

    public void setPorcentajePoder(int porcentajePoder) {
        this.porcentajePoder = porcentajePoder;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}