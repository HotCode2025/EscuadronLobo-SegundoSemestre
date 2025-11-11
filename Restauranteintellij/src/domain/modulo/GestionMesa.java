package domain.modulo;

import domain.usuarios.Mozo;

import java.util.List;
import java.util.Scanner;

public class GestionMesa {

    private static final Scanner scanner = new Scanner(System.in);

    // 🔹 Ver lista de mesas con nombre completo del mozo
    public static void listarMesas() {
        List<Mesa> mesas = PrecargaDatos.mesas;

        if (mesas.isEmpty()) {
            System.out.println("❌ No hay mesas registradas.");
            return;
        }

        System.out.println("\n📋 LISTA DE MESAS:");
        System.out.printf("%-6s %-15s %-20s%n", "N°", "Estado", "Mozo Asignado");
        System.out.println("--------------------------------------------------");

        for (Mesa m : mesas) {
            String nombreMozo = "-"; // Default si no hay mozo asignado

            if (m.getMozoAsignado() != null) {
                // Buscar el mozo por su usuario
                nombreMozo = PrecargaDatos.usuarios.stream()
                        .filter(u -> u instanceof Mozo && u.getUsuario().equals(m.getMozoAsignado()))
                        .map(u -> u.getNombre())  // Tomamos el nombre completo
                        .findFirst()
                        .orElse("Desconocido");
            }

            System.out.printf("%-6d %-15s %-20s%n", m.getNumero(), m.getEstado(), nombreMozo);
        }
    }

    // 🔹 Asignar mesa (a un mozo)
    public static void asignarMesa() {
        listarMesas();
        System.out.print("\nIngrese el número de la mesa que desea asignar: ");
        int numero = Integer.parseInt(scanner.nextLine());

        Mesa mesa = buscarMesa(numero);
        if (mesa == null) {
            System.out.println("❌ Mesa no encontrada.");
            return;
        }

        if (!mesa.getEstado().equalsIgnoreCase("libre")) {
            System.out.println("⚠️ La mesa no está libre (actualmente " + mesa.getEstado() + ").");
            return;
        }

        System.out.print("Ingrese el nombre del mozo que la atenderá: ");
        String mozo = scanner.nextLine();

        mesa.setEstado("ocupada");
        mesa.setMozoAsignado(mozo);
        System.out.println("✅ Mesa " + numero + " asignada a " + mozo + ".");
    }

    // 🔹 Liberar mesa
    public static void liberarMesa() {
        listarMesas();
        System.out.print("\nIngrese el número de la mesa a liberar: ");
        int numero = Integer.parseInt(scanner.nextLine());

        Mesa mesa = buscarMesa(numero);
        if (mesa == null) {
            System.out.println("❌ Mesa no encontrada.");
            return;
        }

        if (mesa.getEstado().equalsIgnoreCase("libre")) {
            System.out.println("⚠️ La mesa ya está libre.");
            return;
        }

        mesa.setEstado("libre");
        mesa.setMozoAsignado("Ninguno");
        System.out.println("✅ Mesa " + numero + " liberada correctamente.");
    }

    // 🔹 Consultar mesas ocupadas o reservadas
    public static void consultarReservas() {
        System.out.println("\n📅 MESAS RESERVADAS / OCUPADAS:");
        boolean hayOcupadas = false;
        for (Mesa mesa : PrecargaDatos.mesas) {
            if (!mesa.getEstado().equalsIgnoreCase("libre")) {
                System.out.println("- " + mesa);
                hayOcupadas = true;
            }
        }
        if (!hayOcupadas) System.out.println("No hay mesas ocupadas ni reservadas.");
    }

    // 🔍 Buscar mesa por número
    private static Mesa buscarMesa(int numero) {
        for (Mesa mesa : PrecargaDatos.mesas) {
            if (mesa.getNumero() == numero) {
                return mesa;
            }
        }
        return null;
    }

    // 🔹 Cambiar estado de una mesa
    public static void cambiarEstadoMesa() {
        listarMesas();
        System.out.print("\nIngrese el número de mesa a modificar: ");
        int numero;
        try {
            numero = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Número inválido.");
            return;
        }

        Mesa mesa = PrecargaDatos.mesas.stream()
                .filter(m -> m.getNumero() == numero)
                .findFirst()
                .orElse(null);

        if (mesa == null) {
            System.out.println("❌ Mesa no encontrada.");
            return;
        }

        // Mostrar los estados posibles
        String[] estados = {"libre", "ocupada", "atendida", "esperando pedido"};
        System.out.println("Estados disponibles:");
        for (int i = 0; i < estados.length; i++) {
            System.out.printf("%d. %s%n", i + 1, estados[i]);
        }
        System.out.print("Seleccione el nuevo estado: ");

        int opcion;
        try {
            opcion = Integer.parseInt(scanner.nextLine());
            if (opcion < 1 || opcion > estados.length) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("❌ Opción inválida.");
            return;
        }

        mesa.setEstado(estados[opcion - 1]);
        System.out.println("✅ Estado de la mesa " + numero + " actualizado a '" + estados[opcion - 1] + "'.");
    }

    // 🔹 Asignar mesa a un mozo
    public static void asignarMozo() {
        listarMesas();

        System.out.print("\nIngrese el número de mesa a asignar: ");
        int numero;
        try {
            numero = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Número inválido.");
            return;
        }

        Mesa mesa = PrecargaDatos.mesas.stream()
                .filter(m -> m.getNumero() == numero)
                .findFirst()
                .orElse(null);

        if (mesa == null) {
            System.out.println("❌ Mesa no encontrada.");
            return;
        }

        // Listar mozos disponibles
        List<Mozo> mozos = PrecargaDatos.usuarios.stream()
                .filter(u -> u instanceof Mozo)
                .map(u -> (Mozo) u)
                .toList();

        System.out.println("Mozos disponibles:");
        for (int i = 0; i < mozos.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, mozos.get(i).getNombre());
        }
        System.out.print("Seleccione el mozo a asignar: ");

        int opcion;
        try {
            opcion = Integer.parseInt(scanner.nextLine());
            if (opcion < 1 || opcion > mozos.size()) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("❌ Opción inválida.");
            return;
        }

        Mozo mozoSeleccionado = mozos.get(opcion - 1);
        mesa.setMozoAsignado(mozoSeleccionado.getUsuario());
        System.out.println("✅ Mesa " + numero + " asignada al mozo '" + mozoSeleccionado.getNombre() + "'.");
    }

    // 🔹 Obtener lista de mesas (por si querés usarlo en otros módulos)
    public static List<Mesa> getMesas() {
        return PrecargaDatos.mesas;
    }
}
