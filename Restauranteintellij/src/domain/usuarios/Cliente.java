package domain.usuarios;

public class Cliente extends Usuario {
    private double saldo;
    private String telefono;
    private String direccion;

    public Cliente(String nombre, String dni, String usuario, String contrasena, double saldo, String telefono, String direccion) {
        super(nombre, dni, usuario, contrasena, 3); // Nivel 3 = Cliente
        this.saldo = saldo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public void recargarSaldo(double monto) { this.saldo += monto; }

    public boolean descontarSaldo(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", saldo=" + saldo +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
