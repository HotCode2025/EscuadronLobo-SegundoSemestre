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
            System.out.println("\nMENU CAJERO");
            System.out.println("1. Cobro de pedidos");
            System.out.println("2. Facturacion");
            System.out.println("3. Cierre de caja");
            System.out.println("0. Cerrar sesion");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> cobroPedidos();
                case 2 -> facturacion();
                case 3 -> cierreCaja();
                case 0 -> System.out.println("Cerrando sesion...");
                default -> System.out.println("ERROR. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    // =====================================================
    // =============== SUBMENU INTERACTIVOS ===============
    // =====================================================

    private void cobroPedidos() {
        int opcion = -1;
        do {
            System.out.println("\nCOBRO DE PEDIDOS");
            System.out.println("1. Buscar pedidos listos");
            System.out.println("2. Registrar pago");
            System.out.println("3. Emitir comprobante");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionPedidos.listarPedidosListos();
                case 2 -> GestionPedidos.registrarPago();
                case 3 -> GestionPedidos.emitirComprobante();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("ERROR. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private void facturacion() {
        int opcion = -1;
        do {
            System.out.println("\nFACTURACION");
            System.out.println("1. Generar nueva factura");
            System.out.println("2. Consultar factura");
            System.out.println("3. Anular factura");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionFacturacion.generarFacturasPedidosListos();
                case 2 -> GestionFacturacion.consultarFacturas();
                case 3 -> GestionFacturacion.anularTodasFacturas();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("ERROR. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private void cierreCaja() {
        int opcion = -1;
        do {
            System.out.println("\nCIERRE DE CAJA");
            System.out.println("1. Consultar ventas del dia");
            System.out.println("2. Contar efectivo");
            System.out.println("3. Generar reporte de cierre");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionVentas.ventasDelDia();
                case 2 -> GestionVentas.contarEfectivo();
                case 3 -> GestionVentas.generarReporte();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("ERROR. Opcion no valida.");
            }
        } while (opcion != 0);
    }
}
