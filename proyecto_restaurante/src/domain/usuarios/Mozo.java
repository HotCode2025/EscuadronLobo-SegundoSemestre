package domain.usuarios;

public class Mozo extends Empleado {

    public Mozo(String nombre, String dni, String usuario, String contrasena, String sucursal) {
        super(nombre, dni, usuario, contrasena, sucursal, "Mozo");
    }

    public void tomarPedido(String mesa) {
        System.out.println(getNombre() + " tomó el pedido de la mesa " + mesa);
    }

    public void entregarPedidoMesa(String mesa) {
        System.out.println(getNombre() + " entregó el pedido en la mesa " + mesa);
    }

    @Override
    public String toString() {
        return "Mozo{" +
                "nombre='" + getNombre() + '\'' +
                ", sucursal='" + getSucursal() + '\'' +
                '}';
    }
}
