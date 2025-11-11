package domain.menus;
import domain.modulo.GestionUsuario;
import domain.modulo.GestionMenu;
import domain.modulo.GestionInventario;
import domain.modulo.GestionVentas;
import domain.modulo.GestionMesa;
import domain.usuarios.Usuario;
import java.util.Scanner;

public class MenuAdministrador {

    private final Scanner scanner = new Scanner(System.in);
    private final GestionUsuario gestion;  // <- aquí guardamos la referencia
    // Constructor que recibe la gestión de usuarios
    public MenuAdministrador(GestionUsuario gestion) {
        this.gestion = gestion;
    }

    public void mostrarOpciones() {
        int opcion = -1;

        do {
            System.out.println("\n👑 MENÚ ADMINISTRADOR");
            System.out.println("1. Gestión de Usuarios");
            System.out.println("2. Gestión del Menú");
            System.out.println("3. Inventario");
            System.out.println("4. Gestión de Ventas");
            System.out.println("5. Gestión de Mesas");
            System.out.println("6. Configuración del Sistema");
            System.out.println("0. Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> gestionUsuarios();
                case 2 -> gestionMenu();
                case 3 -> inventario();
                case 4 -> gestionVentas();
                case 5 -> gestionMesa();
                case 6 -> configuracionSistema();
                case 0 -> System.out.println("👋 Cerrando sesión...");
                default -> System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 0);
    }

    // =====================================================
    // =============== SUBMENÚS INTERACTIVOS ===============
    // =====================================================

    private void gestionUsuarios() {
        int opcion = -1;
        do {
            System.out.println("\n👥 GESTIÓN DE USUARIOS");
            System.out.println("1. Listar usuarios");
            System.out.println("2. Agregar usuario");
            System.out.println("3. Modificar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("5. Buscar usuario");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionUsuario.listarUsuarios();
                case 2 -> GestionUsuario.agregarUsuario();
                case 3 -> GestionUsuario.modificarUsuario();
                case 4 -> GestionUsuario.eliminarUsuario();
                case 5 -> GestionUsuario.buscarUsuarioPorConsola();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void gestionMenu() {
        int opcion = -1;
        do {
            System.out.println("\n🍽️ GESTIÓN DEL MENÚ");
            System.out.println("1. Listar ítems del menú");
            System.out.println("2. Agregar plato o bebida");
            System.out.println("3. Modificar ítem");
            System.out.println("4. Eliminar ítem");
            System.out.println("5. Buscar ítem");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionMenu.listarMenu();
                case 2 -> GestionMenu.agregarPlato();
                case 3 -> GestionMenu.modificarPlato();
                case 4 -> GestionMenu.eliminarPlato();
                case 5 -> GestionMenu.buscarPlato();
                case 0 -> System.out.println("↩ Volviendo al menú principal....");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void inventario() {
        int opcion = -1;
        do {
            System.out.println("\n📦 GESTIÓN DE INVENTARIO");
            System.out.println("1. Listar productos");
            System.out.println("2. Registrar entrada de insumos");
            System.out.println("3. Registrar salida o consumo");
            System.out.println("4. Ver alertas de stock bajo");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionInventario.listarInsumos();
                case 2 -> GestionInventario.registrarEntrada();
                case 3 -> GestionInventario.registrarSalida();
                case 4 -> GestionInventario.verIngredientesBajos();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void gestionVentas() {
        int opcion = -1;
        do {
            System.out.println("\n💰 GESTIÓN DE VENTAS");
            System.out.println("1. Consultar ventas del día");
            System.out.println("2. Consultar ventas por fecha");
            System.out.println("3. Ver ventas por empleado o cliente");
            System.out.println("4. Generar reportes");
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
                case 2 -> GestionVentas.ventasPorFecha();
                case 3 -> GestionVentas.ventasPorCliente();
                case 4 -> GestionVentas.generarReporte();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void gestionMesa() {
        int opcion = -1;
        do {
            System.out.println("\n🪑 GESTIÓN DE MESAS");
            System.out.println("1. Ver estado de mesas");
            System.out.println("2. Asignar mesa");
            System.out.println("3. Liberar mesa");
            System.out.println("4. Consultar reservas");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionMesa.listarMesas();
                case 2 -> GestionMesa.asignarMesa();
                case 3 -> GestionMesa.liberarMesa();
                case 4 -> GestionMesa.consultarReservas();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void configuracionSistema() {
        int opcion = -1;
        do {
            System.out.println("\n⚙️ CONFIGURACIÓN DEL SISTEMA");
            System.out.println("1. Cambiar contraseña del administrador");
            System.out.println("2. Gestionar sucursales");
            System.out.println("3. Configurar parámetros del sistema");
            System.out.println("4. Respaldo y restauración de datos");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> GestionUsuario.cambiarContrasenaAdministrador();
                case 2 -> GestionUsuario.gestionarSucursales();
                case 3 -> GestionUsuario.configurarParametrosSistema();
                case 4 -> GestionUsuario.respaldoYRestauracion();
                case 0 -> System.out.println("↩ Volviendo al menú principal...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);
    }
}
