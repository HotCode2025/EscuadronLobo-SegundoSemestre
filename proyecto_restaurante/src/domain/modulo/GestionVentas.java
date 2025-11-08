package domain.modulo;

import domain.usuarios.Cliente;
import domain.usuarios.Usuario;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class GestionVentas {

    private static final Scanner scanner = new Scanner(System.in);
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // 🔹 Consultar ventas del día actual
    public static void ventasDelDia() {
        Date hoy = new Date();
        System.out.println("\n🗓️ VENTAS DEL DÍA (" + sdf.format(hoy) + ")\n");

        List<Venta> ventasHoy = new ArrayList<>();
        for (Venta v : PrecargaDatos.ventas) {
            if (mismoDia(v.getFecha(), hoy)) {
                ventasHoy.add(v);
            }
        }

        mostrarVentas(ventasHoy);

        if (!ventasHoy.isEmpty()) {
            double totalDia = ventasHoy.stream().mapToDouble(Venta::getTotal).sum();
            System.out.printf("\n💰 Total vendido hoy: $%.2f%n", totalDia);
        }
    }

    // 🔹 Consultar ventas por fecha ingresada
    public static void ventasPorFecha() {
        try {
            System.out.print("Ingrese la fecha (dd/MM/yyyy): ");
            Date fechaBuscada = sdf.parse(scanner.nextLine());

            List<Venta> ventasFecha = new ArrayList<>();
            for (Venta v : PrecargaDatos.ventas) {
                if (mismoDia(v.getFecha(), fechaBuscada)) {
                    ventasFecha.add(v);
                }
            }

            System.out.println("\n🗓️ VENTAS DEL " + sdf.format(fechaBuscada));
            mostrarVentas(ventasFecha);

            if (!ventasFecha.isEmpty()) {
                double total = ventasFecha.stream().mapToDouble(Venta::getTotal).sum();
                System.out.printf("\n💰 Total vendido en esa fecha: $%.2f%n", total);
            }

        } catch (Exception e) {
            System.out.println("⚠️ Fecha inválida. Use el formato dd/MM/yyyy.");
        }
    }

    // 🔹 Consultar ventas por cliente
    public static void ventasPorCliente() {
        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = scanner.nextLine();

        List<Venta> ventasCliente = new ArrayList<>();
        for (Venta v : PrecargaDatos.ventas) {
            if (v.getCliente().equalsIgnoreCase(cliente)) {
                ventasCliente.add(v);
            }
        }

        System.out.println("\n👤 VENTAS DEL CLIENTE: " + cliente);
        mostrarVentas(ventasCliente);

        if (!ventasCliente.isEmpty()) {
            double totalCliente = ventasCliente.stream().mapToDouble(Venta::getTotal).sum();
            System.out.printf("\n💰 Total vendido al cliente '%s': $%.2f%n", cliente, totalCliente);
        } else {
            System.out.println("❌ No se encontraron ventas para este cliente.");
        }
    }


    // 🔸 Método auxiliar para mostrar ventas
    private static void mostrarVentas(List<Venta> lista) {
        if (lista.isEmpty()) {
            System.out.println("❌ No hay ventas registradas para esta consulta.");
            return;
        }

        System.out.printf("%-6s %-15s %-10s %-15s %-20s%n", "ID", "Cliente", "Total", "Fecha", "Platos");
        System.out.println("---------------------------------------------------------------");
        for (Venta v : lista) {
            String platos = v.getPlatos().stream().map(Plato::getNombre).reduce((a, b) -> a + ", " + b).orElse("-");
            System.out.printf("%-6d %-15s $%-9.2f %-15s %-20s%n",
                    v.getId(), v.getCliente(), v.getTotal(), sdf.format(v.getFecha()), platos);
        }
    }

    // 🔸 Verifica si dos fechas son del mismo día
    private static boolean mismoDia(Date fecha1, Date fecha2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(fecha1);
        c2.setTime(fecha2);
        return c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR)
                && c1.get(Calendar.DAY_OF_YEAR) == c2.get(Calendar.DAY_OF_YEAR);
    }

    // 🔹 Contar efectivo (simulación)
    public static void contarEfectivo() {
        double totalEfectivo = PrecargaDatos.ventas.stream()
                .mapToDouble(Venta::getTotal)
                .sum();

        System.out.println("\n💵 CONTANDO EFECTIVO:");
        System.out.printf("📌 Total en caja: $%.2f%n", totalEfectivo);
        System.out.println("Nota: Este valor simula el efectivo acumulado por todas las ventas.");
    }

    // 🔹 Generar reporte de cierre
    public static void generarReporte() {
        Date hoy = new Date();
        List<Venta> ventasHoy = PrecargaDatos.ventas.stream()
                .filter(v -> mismoDia(v.getFecha(), hoy))
                .collect(Collectors.toList());

        System.out.println("\n📊 REPORTE DE CIERRE DE CAJA (" + sdf.format(hoy) + ")");
        System.out.println("---------------------------------------------------------------");

        if (ventasHoy.isEmpty()) {
            System.out.println("❌ No hay ventas registradas para hoy.");
            return;
        }

        double totalDia = ventasHoy.stream().mapToDouble(Venta::getTotal).sum();
        double promedio = totalDia / ventasHoy.size();
        double max = ventasHoy.stream().mapToDouble(Venta::getTotal).max().orElse(0);
        double min = ventasHoy.stream().mapToDouble(Venta::getTotal).min().orElse(0);

        System.out.printf("💰 Total del día: $%.2f%n", totalDia);
        System.out.printf("📈 Venta promedio: $%.2f%n", promedio);
        System.out.printf("🏆 Venta más alta: $%.2f%n", max);
        System.out.printf("💸 Venta más baja: $%.2f%n", min);
        System.out.println("Total de ventas: " + ventasHoy.size());
        System.out.println("---------------------------------------------------------------");
    }


    // Consultar el total de la cuenta de una mesa
    public static void consultarCuentaMesa() {
        System.out.print("Ingrese número de mesa: ");
        int numMesa = Integer.parseInt(scanner.nextLine());

        Mesa mesa = PrecargaDatos.mesas.stream()
                .filter(m -> m.getNumero() == numMesa)
                .findFirst()
                .orElse(null);

        if (mesa == null) {
            System.out.println("❌ Mesa no encontrada.");
            return;
        }

        double total = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getMesa().equalsIgnoreCase("mesa " + numMesa))
                .mapToDouble(p -> p.getPlatos().stream().mapToDouble(plato -> plato.getPrecio()).sum())
                .sum();

        System.out.println("💰 Total a pagar de la mesa " + numMesa + ": $" + total);
    }

    // Simular solicitud de cobro al cajero
    public static void solicitarCobro() {
        System.out.print("Ingrese número de mesa para solicitar cobro: ");
        int numMesa = Integer.parseInt(scanner.nextLine());

        Mesa mesa = PrecargaDatos.mesas.stream()
                .filter(m -> m.getNumero() == numMesa)
                .findFirst()
                .orElse(null);

        if (mesa == null) {
            System.out.println("❌ Mesa no encontrada.");
            return;
        }

        System.out.println("✅ Se ha solicitado el cobro al cajero para la mesa " + numMesa);
        // Aquí podrías agregar lógica para marcar como "cobro solicitado" si tu sistema lo requiere
    }

    // Realizar un pago
    public static void realizarPago() {
        System.out.println("\n=== 💸 Realizar Pago ===");
        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = scanner.nextLine().trim();

        Cliente cliente = (Cliente) PrecargaDatos.usuarios.stream()
                .filter(u -> u instanceof Cliente && u.getUsuario().equalsIgnoreCase(usuario))
                .findFirst()
                .orElse(null);

        if (cliente == null) {
            System.out.println("❌ Usuario no encontrado o no es cliente.");
            return;
        }

        Pedido pedidoCliente = PrecargaDatos.pedidos.stream()
                .filter(p -> p.getCliente().equalsIgnoreCase(usuario)
                        && (p.getEstado().equalsIgnoreCase("listo") || p.getEstado().equalsIgnoreCase("pendiente")))
                .findFirst()
                .orElse(null);

        if (pedidoCliente == null) {
            System.out.println("⚠️ No tiene pedidos pendientes o listos para pagar.");
            return;
        }

        double total = pedidoCliente.getPlatos().stream()
                .mapToDouble(Plato::getPrecio)
                .sum();

        System.out.println("Monto total a pagar: $" + total);
        System.out.println("Saldo disponible: $" + cliente.getSaldo());

        if (cliente.getSaldo() < total) {
            System.out.println("❌ No tiene saldo suficiente para realizar el pago.");
            return;
        }

        System.out.println("Métodos de pago disponibles:");
        System.out.println("1. Tarjeta");
        System.out.println("2. QR");
        System.out.println("3. Efectivo");
        System.out.print("Seleccione método de pago: ");

        int metodo;
        try {
            metodo = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Método de pago inválido.");
            return;
        }

        String metodoPago = switch (metodo) {
            case 1 -> "Tarjeta";
            case 2 -> "QR";
            case 3 -> "Efectivo";
            default -> "Desconocido";
        };

        // Descontamos del saldo del cliente
        cliente.setSaldo(cliente.getSaldo() - total);

        Venta venta = new Venta(
                PrecargaDatos.ventas.size() + 1,
                cliente.getUsuario(),
                total,
                new Date(),
                pedidoCliente.getPlatos()
        );
        PrecargaDatos.ventas.add(venta);
        pedidoCliente.setEstado("pagado");

        System.out.println("✅ Pago realizado con éxito mediante " + metodoPago);
        System.out.println("💰 Nuevo saldo: $" + cliente.getSaldo());
    }


    // Mostrar historial de pagos
    public static void mostrarHistorialPagos() {
        System.out.println("\n=== 📋 Historial de Pagos ===");

        if (PrecargaDatos.ventas.isEmpty()) {
            System.out.println("No hay pagos registrados.");
            return;
        }

        System.out.printf("%-6s %-15s %-10s %-20s%n", "ID", "Cliente", "Total", "Fecha");
        System.out.println("-------------------------------------------------");

        for (Venta v : PrecargaDatos.ventas) {
            System.out.printf("%-6d %-15s $%-10.2f %-20s%n",
                    v.getId(), v.getCliente(), v.getTotal(), v.getFecha());
        }
    }
}
