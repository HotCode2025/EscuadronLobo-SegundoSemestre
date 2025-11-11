// domain/menus/MenuRepartidor.java
package domain.menus;

import domain.modulo.GestionPedidos;

import java.util.Scanner;

public class MenuRepartidor {
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarOpciones() {
        int opcion = -1;

        do {
            System.out.println("\n🚴‍♂️ MENÚ REPARTIDOR");
            System.out.println("1. Pedidos asignados");
            System.out.println("2. Estado de entrega");
            System.out.println("3. Direcciones");
            System.out.println("4. Historial de entregas");
            System.out.println("0. Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> pedidosAsignados();
                case 2 -> estadoEntrega();
                case 3 -> direcciones();
                case 4 -> historialEntregas();
                case 0 -> System.out.println("👋 Cerrando sesión...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    // =========================================
    // =============== SUBMENÚS ================
    // =========================================

    private void pedidosAsignados() {
        int opcion = -1;
        do {
            System.out.println("\n📋 PEDIDOS ASIGNADOS");
            System.out.println("1. Ver lista de pedidos listos para entrega");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionPedidos.mostrarPedidosParaDelivery();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void estadoEntrega() {
        int opcion = -1;
        do {
            System.out.println("\n🚚 ESTADO DE ENTREGA");
            System.out.println("1. Marcar como 'en camino'");
            System.out.println("2. Marcar como 'entregado'");
            System.out.println("3. Marcar como 'no entregado'");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionPedidos.marcarPedidoEnCamino();
                case 2 -> GestionPedidos.marcarPedidoEntregado();
                case 3 -> GestionPedidos.marcarPedidoNoEntregado();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void direcciones() {
        int opcion = -1;
        do {
            System.out.println("\n🗺️ DIRECCIONES");
            System.out.println("1. Ver mapa o detalle de entrega");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionPedidos.mostrarDireccionesEntrega();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void historialEntregas() {
        int opcion = -1;
        do {
            System.out.println("\n📜 HISTORIAL DE ENTREGAS");
            System.out.println("1. Consultar pedidos completados");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionPedidos.mostrarHistorialEntregas();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }
}

