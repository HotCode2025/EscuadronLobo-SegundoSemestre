package domain.usuarios;

public class Usuario {
    // 🔹 Atributos comunes a todos los tipos de usuario
    private String nombre;
    private String dni;
    private String usuario;
    private String contrasena;
    private int nivel; // 1=Admin, 2=Cajero, 3=Cliente

    // 🔹 Constructor
    public Usuario(String nombre, String dni, String usuario, String contrasena, int nivel) {
        this.nombre = nombre;
        this.dni = dni;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nivel = nivel;
    }

    // 🔹 Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // 🔹 Método toString()
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", usuario='" + usuario + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
