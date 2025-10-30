package domain.usuarios;

public class Empleado extends Usuario {
    private String sucursal;
    private String puesto; // Mozo, Cajero, Cocinero, Repartidor

    public Empleado(String nombre, String dni, String usuario, String contrasena, String sucursal, String puesto) {
        super(nombre, dni, usuario, contrasena, 2); // Nivel 2 = Empleado
        this.sucursal = sucursal;
        this.puesto = puesto;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", puesto='" + puesto + '\'' +
                ", sucursal='" + sucursal + '\'' +
                '}';
    }
}

