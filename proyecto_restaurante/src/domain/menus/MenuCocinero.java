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
            System.out.println("\n👨‍🍳 MENÚ COCINERO");
            System.out.println("1. Pedidos pendientes");
            System.out.println("2. Notificaciones");
            System.out.println("3. Control de stock (opcional)");
            System.out.println("0. Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> pedidosPendientes();
                case 2 -> notificaciones();
                case 3 -> controlStock();
                case 0 -> System.out.println("👋 Cerrando sesión...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    // =========================================
    // =============== SUBMENÚS ================
    // =========================================

    private void pedidosPendientes() {
        int opcion = -1;
        do {
            System.out.println("\n📝 PEDIDOS PENDIENTES");
            System.out.println("1. Ver pedidos recibidos desde el salón o app");
            System.out.println("2. Marcar pedido como 'en preparación'");
            System.out.println("3. Marcar pedido como 'listo'");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionPedidos.verPedidosRecibidos();
                case 2 -> GestionPedidos.marcarEnPreparacion();
                case 3 -> GestionPedidos.marcarListo();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void notificaciones() {
        int opcion = -1;
        do {
            System.out.println("\n💬 NOTIFICACIONES");
            System.out.println("1. Enviar mensaje al mozo ('sin ingredientes', 'listo para servir')");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionInventario.enviarMensaje();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void controlStock() {
        int opcion = -1;
        do {
            System.out.println("\n📦 CONTROL DE STOCK (OPCIONAL)");
            System.out.println("1. Ver ingredientes próximos a agotarse");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionInventario.verIngredientesBajos();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }
}

