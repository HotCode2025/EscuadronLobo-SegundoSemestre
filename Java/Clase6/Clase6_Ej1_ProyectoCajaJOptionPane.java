/*
 * CLASE 6 JAVA
 * 6.4 Ejercicio: Proyecto Caja con JOptionPane
 * Ejercicio 1: Crear un proyecto segun las especificaciones mostradas a continuacion.
 * La formula es: volumen = ancho * alto * profundidad
 */

import javax.swing.JOptionPane;

public class Clase6_Ej1_ProyectoCajaJOptionPane {

    public static void main(String[] args) {
        // Solicitar datos al usuario
        float ancho = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el ancho de la caja: "));
        float alto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el alto de la caja: "));
        float profundidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la profundidad de la caja: "));

        // Calcular el volumen
        float volumen = ancho * alto * profundidad;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El volumen de la caja es: " + volumen);
    }
}
