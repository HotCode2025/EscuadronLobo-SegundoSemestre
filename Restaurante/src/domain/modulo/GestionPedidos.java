package domain.modulo;

import domain.usuarios.Cliente;
import domain.usuarios.Mozo;
import domain.usuarios.Usuario;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class GestionPedidos {

    private static final Scanner scanner = new Scanner(System.in);
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // 🔹 Listar todos los pedidos listos para cobrar
    public static void listarPedidosListos() {
        System.out.println("\n PEDIDOS LISTOS PARA COBRAR:");

        List<Pedido> listos = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getEstado().equalsIgnoreCase("listo"))
                .toList();

        if (listos.isEmpty()) {
            System.out.println(" No hay pedidos listos para cobrar.");
            return;
        }

        System.out.printf("%-6s %-10s %-15s %-30s %-12s%n", "ID", "Mesa", "Cliente", "Platos", "Estado");
        System.out.println("------------------------------------------------------------------------------------");

        for (Pedido p : listos) {
            String platos = p.getPlatos().stream()
                    .map(Plato::getNombre)
                    .reduce((a, b) -> a + ", " + b)
                    .orElse("-");
            System.out.printf("%-6d %-10s %-15s %-30s %-12s%n",
                    p.getId(), p.getMesa(), p.getCliente(), platos, p.getEstado());
        }
    }


    // 🔹 Registrar pago de un pedido listo
    public static void registrarPago() {
        System.out.print("Ingrese el ID del pedido a cobrar: ");
        int id = Integer.parseInt(scanner.nextLine());

        Pedido pedido = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getId() == id && p.getEstado().equalsIgnoreCase("listo"))
                .findFirst()
                .orElse(null);

        if (pedido == null) {
            System.out.println("X Pedido no encontrado o no está listo para cobrar.");
            return;
        }

        // Cambiar estado a "entregado"
        pedido.setEstado("entregado");
        System.out.println("Pago registrado para el pedido ID " + pedido.getId() + " del cliente " + pedido.getCliente());
    }

    // 🔹 Emitir comprobante de un pedido listo o cobrado
    public static void emitirComprobante() {
        System.out.print("Ingrese el ID del pedido para emitir comprobante: ");
        int id = Integer.parseInt(scanner.nextLine());

        Pedido pedido = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getId() == id &&
                        (p.getEstado().equalsIgnoreCase("listo") || p.getEstado().equalsIgnoreCase("entregado")))
                .findFirst()
                .orElse(null);

        if (pedido == null) {
            System.out.println("X Pedido no encontrado o no está listo/cobrado.");
            return;
        }

        double total = pedido.getPlatos().stream().mapToDouble(Plato::getPrecio).sum();
        System.out.println("\nCOMPROBANTE PEDIDO ID " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Mesa: " + pedido.getMesa());
        System.out.println("Platos:");
        pedido.getPlatos().forEach(plato ->
                System.out.println(" - " + plato.getNombre() + " ($" + plato.getPrecio() + ")")
        );
        System.out.printf("Total a pagar: $%.2f%n", total);
        System.out.println("Estado actual del pedido: " + pedido.getEstado());
    }


    // 🔹 Mostrar todos los pedidos pendientes o en preparación
    public static void verPedidosRecibidos() {
        List<Pedido> pedidosActivos = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getEstado().equalsIgnoreCase("pendiente") || p.getEstado().equalsIgnoreCase("en preparación"))
                .collect(Collectors.toList());

        System.out.println("\nPEDIDOS RECIBIDOS:");
        if (pedidosActivos.isEmpty()) {
            System.out.println("No hay pedidos pendientes ni en preparación.");
            return;
        }

        System.out.printf("%-6s %-10s %-15s %-30s %-15s%n", "ID", "Mesa", "Cliente", "Platos", "Estado");
        System.out.println("----------------------------------------------------------------------------");
        for (Pedido p : pedidosActivos) {
            String platos = p.getPlatos().stream()
                    .map(Plato::getNombre)
                    .reduce((a, b) -> a + ", " + b)
                    .orElse("-");
            System.out.printf("%-6d %-10s %-15s %-30s %-15s%n",
                    p.getId(), p.getMesa(), p.getCliente(), platos, p.getEstado());
        }
    }

    // 🔹 Marcar un pedido como "en preparación"
    public static void marcarEnPreparacion() {
        System.out.print("Ingrese ID del pedido a preparar: ");
        int id = Integer.parseInt(scanner.nextLine());

        Pedido pedido = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        if (pedido == null) {
            System.out.println("X Pedido no encontrado.");
            return;
        }

        if (!pedido.getEstado().equalsIgnoreCase("pendiente")) {
            System.out.println("️Solo se pueden marcar como 'en preparación' los pedidos pendientes.");
            return;
        }

        pedido.setEstado("en preparacion");
        System.out.println("Pedido " + pedido.getId() + " marcado como 'en preparacion'.");
    }

    // 🔹 Marcar un pedido como "listo"
    public static void marcarListo() {
        System.out.print("Ingrese ID del pedido a marcar como listo: ");
        int id = Integer.parseInt(scanner.nextLine());

        Pedido pedido = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        if (pedido == null) {
            System.out.println("X Pedido no encontrado.");
            return;
        }

        if (!pedido.getEstado().equalsIgnoreCase("en preparación")) {
            System.out.println("️Solo se pueden marcar como 'listo' los pedidos en preparacion.");
            return;
        }

        pedido.setEstado("listo");
        System.out.println("Pedido " + pedido.getId() + " marcado como 'listo'.");
    }


    // Tomar pedido desde una mesa
    public static void tomarPedido() {
        System.out.println("\nMesas disponibles:");
        PrecargaDatos.mesas.forEach(m -> System.out.printf("%d - Estado: %s - Mozo: %s%n",
                m.getNumero(), m.getEstado(), getNombreMozo(m.getMozoAsignado())));

        System.out.print("Ingrese número de mesa: ");
        int numMesa = Integer.parseInt(scanner.nextLine());

        Mesa mesa = PrecargaDatos.mesas.stream()
                .filter(m -> m.getNumero() == numMesa)
                .findFirst()
                .orElse(null);

        if (mesa == null) {
            System.out.println("X Mesa no encontrada.");
            return;
        }

        System.out.print("Ingrese nombre del cliente: ");
        String cliente = scanner.nextLine();

        List<Plato> platos = seleccionarPlatos();
        if (platos.isEmpty()) {
            System.out.println("X No se seleccionó ningun plato.");
            return;
        }

        int idPedido = PrecargaDatos.pedidos.size() + 1;
        Pedido pedido = new Pedido(idPedido, "mesa " + numMesa, cliente, platos, "pendiente");
        PrecargaDatos.pedidos.add(pedido);
        mesa.setEstado("ocupada");

        System.out.println("Pedido registrado correctamente: " + pedido);
    }

    public static void modificarPedido() {
        verPedidos();

        System.out.print("Ingrese ID del pedido a modificar: ");
        int id = Integer.parseInt(scanner.nextLine());

        Pedido pedido = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        if (pedido == null) {
            System.out.println("X Pedido no encontrado.");
            return;
        }

        System.out.println("1. Agregar platos");
        System.out.println("2. Eliminar platos");
        System.out.print("Seleccione opción: ");
        int opcion = Integer.parseInt(scanner.nextLine());

        if (opcion == 1) {
            List<Plato> nuevos = seleccionarPlatos();
            pedido.getPlatos().addAll(nuevos);
            System.out.println(" Platos agregados correctamente.");
        } else if (opcion == 2) {
            eliminarPlatosPedido(pedido);
        } else {
            System.out.println("X Opcion no valida.");
        }
    }

    public static void enviarPedidoCocina() {
        List<Pedido> pendientes = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getEstado().equalsIgnoreCase("pendiente"))
                .toList();

        if (pendientes.isEmpty()) {
            System.out.println("X No hay pedidos pendientes.");
            return;
        }

        pendientes.forEach(p -> System.out.printf("%d - Mesa: %s - Cliente: %s%n",
                p.getId(), p.getMesa(), p.getCliente()));

        System.out.print("Ingrese ID del pedido a enviar a cocina: ");
        int id = Integer.parseInt(scanner.nextLine());

        Pedido pedido = pendientes.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        if (pedido == null) {
            System.out.println("X Pedido no encontrado.");
            return;
        }

        pedido.setEstado("en preparacion");
        System.out.println("Pedido enviado a cocina: " + pedido);
    }

    public static void verPedidos() {
        if (PrecargaDatos.pedidos.isEmpty()) {
            System.out.println("X No hay pedidos registrados.");
            return;
        }

        System.out.printf("%-6s %-10s %-15s %-30s %-12s%n", "ID", "Mesa", "Cliente", "Platos", "Estado");
        System.out.println("----------------------------------------------------------------------------");

        for (Pedido p : PrecargaDatos.pedidos) {
            String platos = p.getPlatos().stream()
                    .map(Plato::getNombre)
                    .reduce((a, b) -> a + ", " + b)
                    .orElse("-");
            System.out.printf("%-6d %-10s %-15s %-30s %-12s%n",
                    p.getId(), p.getMesa(), p.getCliente(), platos, p.getEstado());
        }
    }

    // --------------------- MÉTODOS AUXILIARES ---------------------

    public static List<Plato> seleccionarPlatos() {
        List<Plato> seleccion = new ArrayList<>();
        System.out.println("\nMENU DISPONIBLE:");
        for (int i = 0; i < PrecargaDatos.menu.size(); i++) {
            Plato p = PrecargaDatos.menu.get(i);
            System.out.printf("%d - %s ($%.2f)%n", i + 1, p.getNombre(), p.getPrecio());
        }

        while (true) {
            System.out.print("Ingrese número de plato a agregar (0 para terminar): ");
            int op;
            try {
                op = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Ingrese un numero valido.");
                continue;
            }

            if (op == 0) break;
            if (op < 1 || op > PrecargaDatos.menu.size()) {
                System.out.println(" Opcion invalida.");
                continue;
            }

            Plato seleccionado = PrecargaDatos.menu.get(op - 1);
            seleccion.add(seleccionado);
            System.out.println("Agregado: " + seleccionado.getNombre());
        }

        return seleccion;
    }

    public static void eliminarPlatosPedido(Pedido pedido) {
        List<Plato> platos = pedido.getPlatos();
        if (platos.isEmpty()) {
            System.out.println("X No hay platos para eliminar.");
            return;
        }

        for (int i = 0; i < platos.size(); i++) {
            System.out.printf("%d - %s%n", i + 1, platos.get(i).getNombre());
        }

        System.out.print("Ingrese número de plato a eliminar: ");
        int op = Integer.parseInt(scanner.nextLine());
        if (op < 1 || op > platos.size()) {
            System.out.println("⚠️ Opción invalida.");
            return;
        }

        platos.remove(op - 1);
        System.out.println("Plato eliminado correctamente.");
    }

    public static String getNombreMozo(String usuario) {
        return PrecargaDatos.usuarios.stream()
                .filter(u -> u.getUsuario().equalsIgnoreCase(usuario) && u instanceof Mozo)
                .map(Usuario::getNombre)
                .findFirst()
                .orElse("Desconocido");
    }

    // Mostrar los pedidos listos para entrega con info de cliente y platos
    public static void mostrarPedidosParaDelivery() {
        List<Pedido> listos = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getEstado().equalsIgnoreCase("listo"))
                .collect(Collectors.toList());

        if (listos.isEmpty()) {
            System.out.println("X No hay pedidos listos para entregar.");
            return;
        }

        System.out.printf("%-6s %-15s %-30s %-15s%n", "ID", "Cliente", "Platos", "Dirección");
        System.out.println("---------------------------------------------------------------");

        for (Pedido p : listos) {
            String platos = p.getPlatos().stream()
                    .map(Plato::getNombre)
                    .collect(Collectors.joining(", "));

            // 🔧 Buscar por usuario en lugar de nombre
            String direccion = PrecargaDatos.usuarios.stream()
                    .filter(u -> u instanceof Cliente && u.getUsuario().equalsIgnoreCase(p.getCliente()))
                    .map(u -> ((Cliente) u).getDireccion())
                    .findFirst()
                    .orElse("Desconocida");

            System.out.printf("%-6d %-15s %-30s %-15s%n",
                    p.getId(), p.getCliente(), platos, direccion);
        }
    }


    // Marca un pedido como "en camino"
    public static void marcarPedidoEnCamino() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese ID del pedido a marcar como 'en camino': ");
        int id = Integer.parseInt(scanner.nextLine());

        Pedido pedido = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        if (pedido == null) {
            System.out.println("X Pedido no encontrado.");
            return;
        }

        pedido.setEstado("en camino");
        System.out.println("Pedido #" + id + " marcado como 'en camino'.");
    }

    // Marca un pedido como "entregado"
    public static void marcarPedidoEntregado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese ID del pedido a marcar como 'entregado': ");
        int id = Integer.parseInt(scanner.nextLine());

        Pedido pedido = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        if (pedido == null) {
            System.out.println("X Pedido no encontrado.");
            return;
        }

        pedido.setEstado("entregado");
        System.out.println("Pedido #" + id + " marcado como 'entregado'.");
    }

    // Marca un pedido como "no entregado"
    public static void marcarPedidoNoEntregado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese ID del pedido a marcar como 'no entregado': ");
        int id = Integer.parseInt(scanner.nextLine());

        Pedido pedido = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        if (pedido == null) {
            System.out.println("X Pedido no encontrado.");
            return;
        }

        pedido.setEstado("no entregado");
        System.out.println("Pedido #" + id + " marcado como 'no entregado'.");
    }

    // Mostrar direcciones de entrega de pedidos pendientes de entrega
    public static void mostrarDireccionesEntrega() {
        System.out.println("\n LISTA DE DIRECCIONES DE ENTREGA\n");

        // Filtramos los pedidos que estén listos o en camino
        List<Pedido> pendientes = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getEstado().equalsIgnoreCase("listo") ||
                        p.getEstado().equalsIgnoreCase("en camino"))
                .toList();

        if (pendientes.isEmpty()) {
            System.out.println("️ No hay pedidos pendientes de entrega.");
            return;
        }

        // Mostramos el detalle de entrega por pedido
        for (Pedido pedido : pendientes) {
            Cliente cliente = (Cliente) PrecargaDatos.usuarios.stream()
                    .filter(u -> u instanceof Cliente && u.getUsuario().equalsIgnoreCase(pedido.getCliente()))
                    .findFirst()
                    .orElse(null);

            if (cliente != null) {
                System.out.println("Pedido #" + pedido.getId());
                System.out.println("Cliente: " + cliente.getNombre());
                System.out.println("Dirección: " + cliente.getDireccion());
                System.out.println("Teléfono: " + cliente.getTelefono());
                System.out.println("Platos: ");
                pedido.getPlatos().forEach(p -> System.out.println("   - " + p.getNombre()));
                System.out.println("Estado: " + pedido.getEstado());
                System.out.println("----------------------------------");
            } else {
                System.out.println("Cliente no encontrado para el pedido #" + pedido.getId());
            }
        }
    }

    // Mostrar historial de entregas completadas
    public static void mostrarHistorialEntregas() {
        System.out.println("\nHISTORIAL DE ENTREGAS COMPLETADAS");

        // Filtramos los pedidos que ya fueron entregados
        var entregas = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getEstado().equalsIgnoreCase("entregado") || p.getEstado().equalsIgnoreCase("listo"))
                .collect(Collectors.toList());

        if (entregas.isEmpty()) {
            System.out.println("️No hay entregas registradas aun.");
            return;
        }

        entregas.forEach(pedido -> {
            System.out.println("\n Pedido #" + pedido.getId());
            System.out.println(" Cliente: " + pedido.getCliente());
            System.out.println("️ Platos:");
            pedido.getPlatos().forEach(plato ->
                    System.out.println("   - " + plato.getNombre() + " ($" + plato.getPrecio() + ")"));
            System.out.println(" Estado: " + pedido.getEstado());
        });
    }

    // Hacer pedido (local o delivery)
    public static void hacerPedido() {
        System.out.println("\n HACER PEDIDO");
        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = scanner.nextLine().trim();

        // Verificamos que el cliente exista
        Cliente cliente = (Cliente) PrecargaDatos.usuarios.stream()
                .filter(u -> u instanceof Cliente && u.getUsuario().equalsIgnoreCase(usuario))
                .findFirst()
                .orElse(null);

        if (cliente == null) {
            System.out.println("X Usuario no encontrado.");
            return;
        }

        System.out.println("Tipos de pedido: 1. Local  2. Delivery");
        System.out.print("Seleccione tipo de pedido: ");
        int tipoPedido = Integer.parseInt(scanner.nextLine());
        String tipo = (tipoPedido == 1) ? "Local" : "Delivery";

        // Mostramos menú
        System.out.println("\n MENU");
        for (int i = 0; i < PrecargaDatos.menu.size(); i++) {
            Plato p = PrecargaDatos.menu.get(i);
            System.out.printf("%d. %s (%s) - $%.2f%n", i + 1, p.getNombre(), p.getTipo(), p.getPrecio());
        }

        System.out.print("Ingrese los números de los platos separados por coma: ");
        String[] indices = scanner.nextLine().split(",");
        List<Plato> seleccion = List.of(indices).stream()
                .map(String::trim)
                .map(Integer::parseInt)
                .map(i -> PrecargaDatos.menu.get(i - 1))
                .collect(Collectors.toList());

        // Creamos el pedido y lo agregamos a la precarga
        int idNuevo = PrecargaDatos.pedidos.size() + 1;
        Pedido nuevoPedido = new Pedido(idNuevo, tipo, usuario, seleccion, "pendiente");
        PrecargaDatos.pedidos.add(nuevoPedido);

        System.out.println("Pedido registrado con exito. ID del pedido: " + idNuevo);
    }

    // Consultar estado de pedidos del cliente
    public static void consultarEstadoPedido() {
        System.out.print("\nIngrese su nombre de usuario: ");
        String usuario = scanner.nextLine().trim();

        List<Pedido> pedidosCliente = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getCliente().equalsIgnoreCase(usuario))
                .collect(Collectors.toList());

        if (pedidosCliente.isEmpty()) {
            System.out.println("X No se encontraron pedidos para el usuario '" + usuario + "'.");
            return;
        }

        System.out.printf("%-6s %-10s %-30s %-12s%n", "ID", "Tipo", "Platos", "Estado");
        System.out.println("---------------------------------------------------------------");

        for (Pedido p : pedidosCliente) {
            String platos = p.getPlatos().stream()
                    .map(Plato::getNombre)
                    .collect(Collectors.joining(", "));
            System.out.printf("%-6d %-10s %-30s %-12s%n",
                    p.getId(), p.getMesa(), platos, p.getEstado());
        }
    }


    public static void mostrarHistorial(Cliente cliente) {
        List<Pedido> historial = obtenerPedidosPorCliente(cliente.getUsuario());

        System.out.println("\n Historial de pedidos de: " + cliente.getNombre());
        if (historial.isEmpty()) {
            System.out.println("️ No hay pedidos anteriores.");
        } else {
            for (Pedido pedido : historial) {
                System.out.println("\n➡ Pedido #" + pedido.getId() +
                        " | Mesa: " + pedido.getMesa() +
                        " | Estado: " + pedido.getEstado());
                System.out.println("   Platos:");
                for (Plato p : pedido.getPlatos()) {
                    System.out.println("     " + p.getNombre() + " - $" + p.getPrecio());
                }
            }
        }
    }

    public static void repetirUltimoPedido(Cliente cliente) {
        List<Pedido> historial = obtenerPedidosPorCliente(cliente.getUsuario());
        if (historial.isEmpty()) {
            System.out.println("️ No hay pedidos anteriores para repetir.");
            return;
        }

        Pedido ultimo = historial.get(historial.size() - 1);
        Pedido nuevo = new Pedido(
                PrecargaDatos.pedidos.size() + 1,
                ultimo.getMesa(),
                cliente.getUsuario(),
                ultimo.getPlatos(),
                "pendiente"
        );

        PrecargaDatos.pedidos.add(nuevo);
        System.out.println(" Pedido #" + nuevo.getId() + " repetido con exito.");
    }

    private static List<Pedido> obtenerPedidosPorCliente(String usuarioCliente) {
        List<Pedido> lista = new ArrayList<>();
        for (Pedido pedido : PrecargaDatos.pedidos) {
            if (pedido.getCliente().equalsIgnoreCase(usuarioCliente)) {
                lista.add(pedido);
            }
        }
        return lista;
    }
}


