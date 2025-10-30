// domain/menus/MenuCajero.java
package domain.menus;
import domain.modulo.GestionPedidos;
import domain.modulo.GestionFacturacion;
import domain.modulo.GestionVentas;

import java.util.Scanner;

public class MenuCajero {
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarOpciones() {
        int opcion = -1;

        do {
            System.out.println("\n💵 MENÚ CAJERO");
            System.out.println("1. Cobro de pedidos");
            System.out.println("2. Facturación");
            System.out.println("3. Cierre de caja");
            System.out.println("0. Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> cobroPedidos();
                case 2 -> facturacion();
                case 3 -> cierreCaja();
                case 0 -> System.out.println("👋 Cerrando sesión...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    // =====================================================
    // =============== SUBMENÚS INTERACTIVOS ===============
    // =====================================================

    private void cobroPedidos() {
        int opcion = -1;
        do {
            System.out.println("\n💰 COBRO DE PEDIDOS");
            System.out.println("1. Buscar pedido listos");
            System.out.println("2. Registrar pago");
            System.out.println("3. Emitir comprobante");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionPedidos.listarPedidosListos();
                case 2 -> GestionPedidos.registrarPago();
                case 3 -> GestionPedidos.emitirComprobante();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void facturacion() {
        int opcion = -1;
        do {
            System.out.println("\n🧾 FACTURACIÓN");
            System.out.println("1. Generar nueva factura");
            System.out.println("2. Consultar factura");
            System.out.println("3. Anular factura");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionFacturacion.generarFacturasPedidosListos();
                case 2 -> GestionFacturacion.consultarFacturas();
                case 3 -> GestionFacturacion.anularTodasFacturas();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void cierreCaja() {
        int opcion = -1;
        do {
            System.out.println("\n📊 CIERRE DE CAJA");
            System.out.println("1. Consultar ventas del día");
            System.out.println("2. Contar efectivo");
            System.out.println("3. Generar reporte de cierre");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionVentas.ventasDelDia();
                case 2 -> GestionVentas.contarEfectivo();
                case 3 -> GestionVentas.generarReporte();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }
}
