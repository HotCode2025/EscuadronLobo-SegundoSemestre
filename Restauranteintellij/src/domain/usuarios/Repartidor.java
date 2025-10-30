package domain.usuarios;

public class Repartidor extends Empleado {
    private String vehiculo; // moto, bicicleta, etc.

    public Repartidor(String nombre, String dni, String usuario, String contrasena, String sucursal, String vehiculo) {
        super(nombre, dni, usuario, contrasena, sucursal, "Repartidor");
        this.vehiculo = vehiculo;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void entregarPedido(String direccion) {
        System.out.println(getNombre() + " está entregando un pedido a " + direccion);
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "nombre='" + getNombre() + '\'' +
                ", sucursal='" + getSucursal() + '\'' +
                ", vehiculo='" + vehiculo + '\'' +
                '}';
    }
}
