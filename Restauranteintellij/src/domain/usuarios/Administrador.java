package domain.usuarios;

import java.util.List;

public class Administrador extends Usuario {
    private List<String> permisos;
    private String sucursal;

    public Administrador(String nombre, String dni, String usuario, String contrasena, List<String> permisos, String sucursal) {
        super(nombre, dni, usuario, contrasena, 1); // Nivel 1 = Administrador
        this.permisos = permisos;
        this.sucursal = sucursal;
    }

    public List<String> getPermisos() { return permisos; }
    public void setPermisos(List<String> permisos) { this.permisos = permisos; }

    public String getSucursal() { return sucursal; }
    public void setSucursal(String sucursal) { this.sucursal = sucursal; }

    public void generarReporte(String tipo) {
        System.out.println("🧾 Generando reporte: " + tipo + " para la sucursal " + sucursal);
    }

    public void agregarEmpleado(Empleado e) {
        System.out.println("👤 Empleado agregado: " + e.getNombre());
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nombre='" + getNombre() + '\'' +
                ", sucursal='" + sucursal + '\'' +
                ", permisos=" + permisos +
                '}';
    }
}

