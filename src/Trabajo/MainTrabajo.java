package Trabajo;

import java.util.Date;


public class MainTrabajo {
    public static void main(String[] args) {
        // Crear un hotel con 10 habitaciones
        Hotel miHotel = new Hotel("Hotel Sol", 10);
        miHotel.mostrarDetalles();

        // Crear habitaciones
        Habitacion hab1 = new Habitacion(101, "Individual");
        Habitacion hab2 = new Habitacion(102, "Doble");

        // Mostrar disponibilidad de las habitaciones
        System.out.println("¿Habitación 101 disponible? " + (hab1.isDisponible() ? "Sí" : "No"));
        System.out.println("¿Habitación 102 disponible? " + (hab2.isDisponible() ? "Sí" : "No"));

        // Crear una reserva para la habitación 101
        if (hab1.isDisponible()) {
            hab1.reservar();
            Reserva reserva1 = new Reserva(hab1, "Carlos", new Date());
            reserva1.mostrarReserva();
        }

        // Consultar nuevamente la disponibilidad de la habitación 101
        System.out.println("¿Habitación 101 disponible? " + (hab1.isDisponible() ? "Sí" : "No"));
    }
}
