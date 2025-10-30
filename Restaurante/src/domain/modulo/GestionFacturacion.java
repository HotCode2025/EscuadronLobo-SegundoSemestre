package domain.modulo;

import java.text.SimpleDateFormat;
import java.util.*;

public class GestionFacturacion {
    private static final List<Factura> facturas = new ArrayList<>();
    private static int contadorFacturas = 1;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // Generar facturas para todos los pedidos listos
    public static void generarFacturasPedidosListos() {
        // Filtrar los pedidos que estan listos para facturar
        List<Pedido> pedidosListos = PrecargaDatos.pedidos.stream()
                .filter(p -> "listo".equalsIgnoreCase(p.getEstado()))
                .toList();

        if (pedidosListos.isEmpty()) {
            System.out.println("No hay pedidos listos para facturar.");
            return;
        }

        System.out.println("\nGENERANDO FACTURAS PARA PEDIDOS LISTOS\n");
        for (Pedido pedido : pedidosListos) {
            // Calcular total de la factura
            double total = pedido.getPlatos().stream()
                    .mapToDouble(Plato::getPrecio)
                    .sum();

            // Crear factura
            Factura factura = new Factura(contadorFacturas++, pedido.getCliente(), pedido.getPlatos(), total, new Date());
            facturas.add(factura);

            // Marcar pedido como entregado
            pedido.setEstado("entregado");

            // Mostrar factura
            System.out.printf("Factura generada para pedido ID %d (Cliente: %s)%n", pedido.getId(), pedido.getCliente());
            System.out.println(factura);
            System.out.println("--------------------------------------------------");
        }

        System.out.printf("Total de facturas generadas: %d%n", pedidosListos.size());
    }

    // Consultar todas las facturas
    public static void consultarFacturas() {
        if (facturas.isEmpty()) {
            System.out.println("No hay facturas generadas.");
            return;
        }

        System.out.println("\nLISTADO DE FACTURAS:");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-6s %-15s %-30s %-10s %-12s%n", "ID", "Cliente", "Platos", "Total", "Fecha");
        System.out.println("--------------------------------------------------------------------------------");

        for (Factura f : facturas) {
            String platos = f.getPlatos().stream()
                    .map(Plato::getNombre)
                    .reduce((a, b) -> a + ", " + b)
                    .orElse("-");
            System.out.printf("%-6d %-15s %-30s $%-9.2f %-12s%n",
                    f.getId(), f.getCliente(), platos, f.getTotal(), new SimpleDateFormat("dd/MM/yyyy").format(f.getFecha()));
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("Total de facturas: %d%n", facturas.size());
    }

    // Anular todas las facturas
    public static void anularTodasFacturas() {
        if (facturas.isEmpty()) {
            System.out.println("No hay facturas para anular.");
            return;
        }

        facturas.forEach(f -> f.setAnulada(true));

        System.out.println("Todas las facturas han sido anuladas correctamente.");
    }

    // Obtener facturas (getter)
    public static List<Factura> getFacturas() {
        return facturas;
    }
}