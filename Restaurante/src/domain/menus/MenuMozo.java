// domain/menus/MenuMozo.java
package domain.menus;

import domain.modulo.GestionInventario;
import domain.modulo.GestionMesa;
import domain.modulo.GestionPedidos;
import domain.modulo.GestionVentas;

import java.util.Scanner;

public class MenuMozo {
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarOpciones() {
        int opcion = -1;

        do {
            System.out.println("\nMENU MOZO");
            System.out.println("1. Gestion de Mesas");
            System.out.println("2. Pedidos");
            System.out.println("3. Cuentas / Cobro");
            System.out.println("4. Comunicacion");
            System.out.println("0. Cerrar sesion");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> gestionMesas();
                case 2 -> pedidos();
                case 3 -> cuentasCobro();
                case 4 -> comunicacion();
                case 0 -> System.out.println("Cerrando sesion...");
                default -> System.out.println("ERROR. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    // =========================================
    // =============== SUBMENU ================
    // =========================================

    private void gestionMesas() {
        int opcion = -1;
        do {
            System.out.println("\nGESTION DE MESAS");
            System.out.println("1. Ver lista de mesas asignadas");
            System.out.println("2. Cambiar estado de mesa (ocupada, atendida, esperando pedido)");
            System.out.println("3. Asignar mesa a mozo");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionMesa.listarMesas();
                case 2 -> GestionMesa.cambiarEstadoMesa();
                case 3 -> GestionMesa.asignarMozo();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("ERROR. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private void pedidos() {
        int opcion = -1;
        do {
            System.out.println("\nPEDIDOS");
            System.out.println("1. Tomar pedido desde una mesa");
            System.out.println("2. Agregar o eliminar platos del pedido");
            System.out.println("3. Enviar pedido a cocina");
            System.out.println("4. Ver pedidos pendientes o listos");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionPedidos.tomarPedido();
                case 2 -> GestionPedidos.modificarPedido();
                case 3 -> GestionPedidos.enviarPedidoCocina();
                case 4 -> GestionPedidos.verPedidos();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("ERROR. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private void cuentasCobro() {
        int opcion = -1;
        do {
            System.out.println("\nCUENTAS / COBRO");
            System.out.println("1. Consultar cuenta total de la mesa");
            System.out.println("2. Solicitar cobro al cajero");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionVentas.consultarCuentaMesa();
                case 2 -> GestionVentas.solicitarCobro();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("ERROR. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private void comunicacion() {
        int opcion = -1;
        do {
            System.out.println("\nCOMUNICACION");
            System.out.println("1. Ver mensajes de cocina (sin stock, listo para servir)");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionInventario.verNotificaciones();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("ERROR. Opcion no valida.");
            }
        } while (opcion != 0);
    }
}


