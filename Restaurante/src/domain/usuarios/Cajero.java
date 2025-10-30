package domain.usuarios;

public class Cajero extends Empleado {

    public Cajero(String nombre, String dni, String usuario, String contrasena, String sucursal) {
        super(nombre, dni, usuario, contrasena, sucursal, "Cajero");
    }

    public void cobrarPedido(double monto) {
        System.out.println(getNombre() + " cobro $" + monto + " del cliente.");
    }

    public void generarTicket(String pedido) {
        System.out.println("El cajero " + getNombre() + " genero el ticket para el pedido: " + pedido);
    }

    @Override
    public String toString() {
        return "Cajero{" +
                "nombre='" + getNombre() + '\'' +
                ", sucursal='" + getSucursal() + '\'' +
                '}';
    }
}
