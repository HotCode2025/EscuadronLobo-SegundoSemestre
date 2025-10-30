// domain/menus/MenuCliente.java
package domain.menus;

import domain.modulo.GestionMenu;
import domain.modulo.GestionPedidos;
import domain.modulo.GestionUsuario;
import domain.modulo.GestionVentas;
import domain.usuarios.Cliente;

import java.util.Scanner;

public class MenuCliente {
    private final Scanner scanner = new Scanner(System.in);
    private final Cliente cliente;

    // Constructor que recibe el cliente logueado
    public MenuCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void mostrarOpciones() {
        int opcion = -1;

        do {
            System.out.println("\nMENU CLIENTE");
            System.out.println("1. Menu del restaurante");
            System.out.println("2. Pedidos");
            System.out.println("3. Pagos");
            System.out.println("4. Historial");
            System.out.println("5. Cuenta");
            System.out.println("0. Cerrar sesion");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> menuRestaurante();
                case 2 -> pedidos();
                case 3 -> pagos();
                case 4 -> historial();
                case 5 -> cuenta();
                case 0 -> System.out.println("Cerrando sesion...");
                default -> System.out.println("Error. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    // =========================================
    // =============== SUBMENU ================
    // =========================================

    private void menuRestaurante() {
        int opcion = -1;
        do {
            System.out.println("\nMENU DEL RESTAURANTE");
            System.out.println("1. Ver categorias y precios");
            System.out.println("2. Filtrar por tipo (entrada, principal, postre, bebida)");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionMenu.mostrarMenuCompleto();
                case 2 -> GestionMenu.filtrarPorTipo();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("Error. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private void pedidos() {
        int opcion = -1;
        do {
            System.out.println("\nPEDIDOS");
            System.out.println("1. Hacer pedido (local o delivery)");
            System.out.println("2. Consultar estado del pedido");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionPedidos.hacerPedido();
                case 2 -> GestionPedidos.consultarEstadoPedido();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("Error. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private void pagos() {
        int opcion = -1;
        do {
            System.out.println("\nPAGOS");
            System.out.println("1. Pagar online (tarjeta, QR, efectivo)");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionVentas.realizarPago();
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("Error. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private void historial() {
        int opcion = -1;
        do {
            System.out.println("\nHISTORIAL DE PEDIDOS");
            System.out.println("1. Ver pedidos anteriores");
            System.out.println("2. Repetir pedido anterior");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionPedidos.mostrarHistorial(cliente);
                case 2 -> GestionPedidos.repetirUltimoPedido(cliente);
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("Error. Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private void cuenta() {
        int opcion = -1;
        do {
            System.out.println("\nCUENTA DEL CLIENTE");
            System.out.println("1. Editar datos personales");
            System.out.println("2. Cambiar contrasena");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionUsuario.editarDatos(cliente);
                case 2 -> GestionUsuario.cambiarContrasena(cliente);
                case 0 -> System.out.println("Volviendo al menu principal...");
                default -> System.out.println("Error. Opcion no valida.");
            }
        } while (opcion != 0);
    }
}


