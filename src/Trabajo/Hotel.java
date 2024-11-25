package Trabajo;

public class Hotel {
    private String nombre;
    private int numHabitaciones;

    // Constructor
    public Hotel(String nombre, int numHabitaciones) {
        this.nombre = nombre;
        this.numHabitaciones = numHabitaciones;
    }

    // Método para mostrar detalles del hotel
    public void mostrarDetalles() {
        System.out.println("Nombre del Hotel: " + nombre);
        System.out.println("Número de Habitaciones: " + numHabitaciones);
    }

    // Método para consultar la disponibilidad de habitaciones
    public boolean tieneHabitacionDisponible() {
        // Para simplicidad, asumimos que si hay más de 0 habitaciones, está disponible
        return numHabitaciones > 0;
    }

    // Método para reducir la cantidad de habitaciones disponibles
    public void reservarHabitacion() {
        if (numHabitaciones > 0) {
            numHabitaciones--;
            System.out.println("Habitación reservada. Habitaciones restantes: " + numHabitaciones);
        } else {
            System.out.println("Lo siento, no hay habitaciones disponibles.");
        }
    }

    // Getters y setters (si se necesitan)
    public String getNombre() {
        return nombre;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }
}
