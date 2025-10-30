package domain.modulo;

import java.util.*;

public class GestionInventario {
    private static final Scanner scanner = new Scanner(System.in);

    // Listar insumos con formato, orden y resumen
    public static void listarInsumos() {
        System.out.println("\nLISTA DE INSUMOS EN INVENTARIO\n");

        if (PrecargaDatos.inventario.isEmpty()) {
            System.out.println("No hay insumos cargados.");
            return;
        }

        // Ordenar alfabeticamente por nombre
        List<Insumo> ordenados = new ArrayList<>(PrecargaDatos.inventario);
        ordenados.sort(Comparator.comparing(Insumo::getNombre, String.CASE_INSENSITIVE_ORDER));

        // Mostrar encabezado de tabla
        System.out.printf("%-25s %-10s %-10s %-10s%n", "Nombre", "Cantidad", "Unidad", "Estado");
        System.out.println("-------------------------------------------------------------");

        double total = 0;
        for (Insumo insumo : ordenados) {
            String estado;
            if (insumo.getCantidad() < 5) {
                estado = "Bajo";
            } else if (insumo.getCantidad() < 15) {
                estado = "Medio";
            } else {
                estado = "OK";
            }

            System.out.printf("%-25s %-10.2f %-10s %-10s%n",
                    insumo.getNombre(), insumo.getCantidad(), insumo.getUnidad(), estado);
            total += insumo.getCantidad();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("Total de insumos registrados: " + ordenados.size());
        System.out.printf("Cantidad total acumulada: %.2f%n", total);
    }

    // Registrar entrada (aumentar cantidad)
    public static void registrarEntrada() {
        System.out.print("Ingrese el nombre del insumo: ");
        String nombre = scanner.nextLine();

        Insumo encontrado = buscarInsumo(nombre);
        if (encontrado == null) {
            System.out.println("Insumo no encontrado.");
            return;
        }

        System.out.print("Cantidad a agregar: ");
        double cantidad = Double.parseDouble(scanner.nextLine());
        encontrado.setCantidad(encontrado.getCantidad() + cantidad);
        System.out.println("Entrada registrada. Nuevo stock: " + encontrado.getCantidad() + " " + encontrado.getUnidad());
    }

    // Registrar salida (reducir cantidad)
    public static void registrarSalida() {
        System.out.print("Ingrese el nombre del insumo: ");
        String nombre = scanner.nextLine();

        Insumo encontrado = buscarInsumo(nombre);
        if (encontrado == null) {
            System.out.println("Insumo no encontrado.");
            return;
        }

        System.out.print("Cantidad utilizada: ");
        double cantidad = Double.parseDouble(scanner.nextLine());

        if (cantidad > encontrado.getCantidad()) {
            System.out.println("No hay suficiente stock disponible.");
        } else {
            encontrado.setCantidad(encontrado.getCantidad() - cantidad);
            System.out.println("Salida registrada. Nuevo stock: " + encontrado.getCantidad() + " " + encontrado.getUnidad());
        }
    }

    // Buscar insumo por nombre
    private static Insumo buscarInsumo(String nombre) {
        for (Insumo insumo : PrecargaDatos.inventario) {
            if (insumo.getNombre().equalsIgnoreCase(nombre)) {
                return insumo;
            }
        }
        return null;
    }

    private static final List<String> notificaciones = new ArrayList<>();

    // Enviar notificacion al mozo
    public static void enviarMensaje() {
        List<Pedido> pendientesOListos = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getEstado().equalsIgnoreCase("pendiente")
                        || p.getEstado().equalsIgnoreCase("en preparacion")
                        || p.getEstado().equalsIgnoreCase("listo"))
                .toList();

        if (pendientesOListos.isEmpty()) {
            System.out.println("No hay pedidos para notificar.");
            return;
        }

        System.out.println("\nPedidos disponibles para notificacion:");
        for (Pedido p : pendientesOListos) {
            System.out.println(p.getId() + ". Mesa " + p.getMesa() + " - Cliente: " + p.getCliente() + " - Estado: " + p.getEstado());
        }

        System.out.print("Seleccione el ID del pedido: ");
        int idPedido;
        try {
            idPedido = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un numero valido.");
            return;
        }

        Optional<Pedido> pedidoOpt = pendientesOListos.stream().filter(p -> p.getId() == idPedido).findFirst();
        if (pedidoOpt.isEmpty()) {
            System.out.println("Pedido no encontrado.");
            return;
        }

        Pedido pedido = pedidoOpt.get();

        System.out.println("\nTipo de mensaje:");
        System.out.println("1. Sin ingredientes");
        System.out.println("2. Listo para servir");
        System.out.print("Seleccione una opcion: ");

        int opcion;
        try {
            opcion = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un numero valido.");
            return;
        }

        String mensaje;
        switch (opcion) {
            case 1 -> mensaje = "Pedido " + pedido.getId() + " (Mesa " + pedido.getMesa() + ") sin ingredientes.";
            case 2 -> mensaje = "Pedido " + pedido.getId() + " (Mesa " + pedido.getMesa() + ") listo para servir.";
            default -> {
                System.out.println("Opcion no valida.");
                return;
            }
        }

        notificaciones.add(mensaje);
        System.out.println("Mensaje enviado al mozo: " + mensaje);
    }

    // Consultar todas las notificaciones enviadas
    public static void verNotificaciones() {
        System.out.println("\nNOTIFICACIONES ENVIADAS:");
        if (notificaciones.isEmpty()) {
            System.out.println("No hay notificaciones enviadas.");
            return;
        }

        for (int i = 0; i < notificaciones.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, notificaciones.get(i));
        }
    }

    // Obtener lista de notificaciones
    public static List<String> getNotificaciones() {
        return notificaciones;
    }

    public static void verIngredientesBajos() {
        List<Insumo> bajos = PrecargaDatos.inventario.stream()
                .filter(i -> i.getCantidad() < 5)
                .toList();

        System.out.println("\nINGREDIENTES BAJOS EN STOCK:");
        if (bajos.isEmpty()) {
            System.out.println("No hay insumos bajos en stock.");
            return;
        }

        System.out.printf("%-25s %-10s %-10s%n", "Nombre", "Cantidad", "Unidad");
        System.out.println("-------------------------------------------");
        for (Insumo i : bajos) {
            System.out.printf("%-25s %-10.2f %-10s%n", i.getNombre(), i.getCantidad(), i.getUnidad());
        }
    }
}
