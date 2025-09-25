/*Ejercicio 10:  Pedir 10 numeros y escribir la suma total
Clase JOptionPane
*/
import javax.swing.JOptionPane;

public class Clase_6_8_Ejercicio10_ClaseJOptionPane {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el número " + i + ":");
            int numero = Integer.parseInt(input); // convertir a entero
            suma += numero;
        }

        JOptionPane.showMessageDialog(null, "La suma total es: " + suma);
    }
}

