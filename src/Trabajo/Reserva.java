package Trabajo;

import java.util.Date;

public class Reserva {
    private Habitacion habitacion;
    private Date fechaReserva;
    private String cliente;

    // Constructor
    public Reserva(Habitacion habitacion, String cliente, Date fechaReserva) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaReserva = fechaReserva;
    }

    // Método para mostrar los detalles de la reserva
    public void mostrarReserva() {
        System.out.println("Reserva de " + cliente + ":");
        System.out.println("Habitación número: " + habitacion.getNumero());
        System.out.println("Fecha de la reserva: " + fechaReserva);
    }

    // Getters y setters
    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getCliente() {
        return cliente;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }
}

