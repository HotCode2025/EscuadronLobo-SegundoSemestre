package ProyectoCajaJOpcionPane;

public class Caja {

    // Atributos
    double ancho;
    double alto;
    double profundidad;

    // Constructor vacío
    public Caja() {
    }

    // Constructor con argumentos
    public Caja(double ancho, double alto, double profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    // Método para calcular volumen
    public double calcularVolumen() {
        return ancho * alto * profundidad;
    }
}
