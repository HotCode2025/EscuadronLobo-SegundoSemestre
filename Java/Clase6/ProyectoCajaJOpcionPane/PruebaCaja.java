package ProyectoCajaJOpcionPane;

import javax.swing.JOptionPane;

public class PruebaCaja {

    public static void main(String[] args) {
        // Crear objeto con constructor vacío
        Caja caja1 = new Caja();

        // Asignar valores manualmente
        caja1.ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho de la primera caja:"));
        caja1.alto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el alto de la primera caja:"));
        caja1.profundidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la profundidad de la primera caja:"));

        // Calcular volumen de caja1
        double volumen1 = caja1.calcularVolumen();
        JOptionPane.showMessageDialog(null, "El volumen de la primera caja es: " + volumen1);

        // Crear objeto con constructor con argumentos
        double ancho2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho de la segunda caja:"));
        double alto2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el alto de la segunda caja:"));
        double profundidad2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la profundidad de la segunda caja:"));

        Caja caja2 = new Caja(ancho2, alto2, profundidad2);

        // Calcular volumen de caja2
        double volumen2 = caja2.calcularVolumen();
        JOptionPane.showMessageDialog(null, "El volumen de la segunda caja es: " + volumen2);
    }
}
