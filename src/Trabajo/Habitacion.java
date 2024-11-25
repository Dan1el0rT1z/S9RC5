package Trabajo;

public class Habitacion {
    private int numero;
    private String tipo;  // Por ejemplo: "Individual", "Doble", "Suite"
    private boolean disponible;

    // Constructor
    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = true;  // Inicialmente la habitación está disponible
    }

    // Método para reservar la habitación
    public void reservar() {
        if (disponible) {
            disponible = false;
            System.out.println("Habitación " + numero + " de tipo " + tipo + " ha sido reservada.");
        } else {
            System.out.println("La habitación " + numero + " ya está reservada.");
        }
    }

    // Método para liberar la habitación (por ejemplo, cuando el cliente hace check-out)
    public void liberar() {
        if (!disponible) {
            disponible = true;
            System.out.println("Habitación " + numero + " ha sido liberada.");
        }
    }

    // Getters y setters (si es necesario)
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }
}

