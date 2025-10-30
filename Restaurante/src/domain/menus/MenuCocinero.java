// domain/menus/MenuCocinero.java
package domain.menus;

import domain.modulo.GestionInventario;
import domain.modulo.GestionPedidos;

import java.util.Scanner;

public class MenuCocinero {
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarOpciones() {
        int opcion = -1;

        do {
            System.out.println("\nMENU COCINERO");
            System.out.println("1. Pedidos pendientes");
            System.out.println("2. Notificaciones");
            System.out.println("3. Control de stock (opcional)");
            System.out.println("0. Cerrar sesion");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> pedidosPendientes();
                case 2 -> notificaciones();
                case 3 -> controlStock();
                case 0 -> System.out.println("Cerrando sesion...");
                default -> System.out.println("Error. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    // =========================================
    // =============== SUBMENU ================
    // =========================================

    private void pedidosPendientes() {
        int opcion = -1;
        do {
            System.out.println("\nPEDIDOS PENDIENTES");
            System.out.println("1. Ver pedidos recibidos desde el salon o app");
            System.out.println("2. Marcar pedido como 'en preparacion'");
            System.out.println("3. Marcar pedido como 'listo'");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionPedidos.verPedidosRecibidos();
                case 2 -> GestionPedidos.marcarEnPreparacion();
                case 3 -> GestionPedidos.marcarListo();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("Error. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private void notificaciones() {
        int opcion = -1;
        do {
            System.out.println("\nNOTIFICACIONES");
            System.out.println("1. Enviar mensaje al mozo ('sin ingredientes', 'listo para servir')");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionInventario.enviarMensaje();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("Error. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private void controlStock() {
        int opcion = -1;
        do {
            System.out.println("\nCONTROL DE STOCK (OPCIONAL)");
            System.out.println("1. Ver ingredientes proximos a agotarse");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionInventario.verIngredientesBajos();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("Error. Opcion no valida.");
            }
        } while (opcion != 0);
    }
}

