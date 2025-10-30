package domain.usuarios;

public class Cocinero extends Empleado {

    public Cocinero(String nombre, String dni, String usuario, String contrasena, String sucursal) {
        super(nombre, dni, usuario, contrasena, sucursal, "Cocinero");
    }

    public void prepararPedido(String pedido) {
        System.out.println(getNombre() + " está preparando el pedido: " + pedido);
    }

    public void marcarPedidoListo(String pedido) {
        System.out.println("El cocinero " + getNombre() + " marcó el pedido '" + pedido + "' como listo.");
    }

    @Override
    public String toString() {
        return "Cocinero{" +
                "nombre='" + getNombre() + '\'' +
                ", sucursal='" + getSucursal() + '\'' +
                '}';
    }
}
