package domain.modulo;


import domain.usuarios.*;
import java.util.*;

public class PrecargaDatos {

    // Listas de prueba
    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<Mesa> mesas = new ArrayList<>();
    public static List<Plato> menu = new ArrayList<>();
    public static List<Pedido> pedidos = new ArrayList<>();
    public static List<Insumo> inventario = new ArrayList<>();
    public static List<Venta> ventas = new ArrayList<>();

    // Método para precargar todo
    public static void cargarDatos() {
        precargarUsuarios();
        precargarMesas();
        precargarMenu();
        precargarPedidos();
        precargarInventario();
        precargarVentas();
    }

    private static void precargarUsuarios() {
        // Administrador
        usuarios.add(new Administrador("Ana Admin", "11111111", "admin", "1234",
                Arrays.asList("Usuarios", "Menú", "Ventas", "Mesas", "Inventario", "Configuración"), "Sucursal Centro"));

        // Empleados
        usuarios.add(new Mozo("Mario Mozo", "22222222", "mozo1", "mozo123", "Sucursal Centro"));
        usuarios.add(new Mozo("Federico Mozo", "22222222", "mozo2", "mozo1234", "Sucursal Centro"));
        usuarios.add(new Cocinero("Cecilia Cocinera", "33333333", "cocina1", "cocina123", "Sucursal Centro"));
        usuarios.add(new Cajero("Carlos Cajero", "44444444", "cajero1", "cajero123", "Sucursal Centro"));
        usuarios.add(new Repartidor("Raul Repartidor", "55555555", "reparto1", "reparto123", "Sucursal Centro", "Moto"));

        // Clientes
        usuarios.add(new Cliente("Clara Cliente", "66666666", "cliente1", "cliente123", 1000.0, "123456789", "Calle Falsa 123"));
        usuarios.add(new Cliente("Pedro Cliente", "77777777", "cliente2", "cliente123", 500.0, "987654321", "Avenida Siempre Viva 742"));
        usuarios.add(new Cliente("Rambo", "12345678", "rambo55", "rambo123", 3000, "987654321", "Calle Matanza"));
    }

    private static void precargarMesas() {
        mesas.add(new Mesa(1, "libre", "mozo1"));
        mesas.add(new Mesa(2, "ocupada", "mozo1"));
        mesas.add(new Mesa(3, "libre", "mozo1"));
    }

    private static void precargarMenu() {
        menu.add(new Plato("Ensalada César", "entrada", 120.0));
        menu.add(new Plato("Milanesa con papas", "principal", 450.0));
        menu.add(new Plato("Flan con dulce de leche", "postre", 200.0));
        menu.add(new Plato("Coca-Cola 500ml", "bebida", 150.0));
        menu.add(new Plato("pepsi 500ml", "bebida", 120.0));
    }

    private static void precargarPedidos() {
        pedidos.add(new Pedido(1, "mesa 2", "cliente1", Arrays.asList(menu.get(0), menu.get(1)), "pendiente"));
        pedidos.add(new Pedido(2, "mesa 2", "cliente2", Arrays.asList(menu.get(2), menu.get(3)), "en preparación"));
        pedidos.add(new Pedido(3, "mesa 1", "Rambo55", Arrays.asList(menu.get(0), menu.get(3)), "listo"));
    }

    private static void precargarInventario() {
        inventario.add(new Insumo("Lechuga", 3, "kg"));
        inventario.add(new Insumo("Carne vacuna", 20, "kg"));
        inventario.add(new Insumo("Huevos", 30, "unidades"));
        inventario.add(new Insumo("Coca-Cola", 50, "botellas"));
    }

    private static void precargarVentas() {
        ventas.add(new Venta(1, "cliente1", 570.0, new Date(), Arrays.asList(menu.get(0), menu.get(1))));
        ventas.add(new Venta(2, "cliente2", 350.0, new Date(), Arrays.asList(menu.get(2), menu.get(3))));
    }

}
