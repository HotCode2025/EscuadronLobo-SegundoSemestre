// Clase5: 5.7 Ejercicio Ciclos 08 con JOptionPane
// Ejercicio 8: Pedir numeros N, y mostrar todos los numeros del 1 al N.

import javax.swing.JOptionPane;

public class Clase5_7_Ejercicio8_ClaseJOptionPane {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo: "));

        while (numero <= 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Error. Ingrese un numero entero positivo: "));
        }

        StringBuilder resultado = new StringBuilder("Los numeros del 1 al " + numero + " son:\n");   // Usar StringBuilder para construir la cadena de salida

        for (int i = 1; i <= numero; i++) {
            resultado.append(i).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
