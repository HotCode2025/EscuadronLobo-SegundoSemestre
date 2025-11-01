package ciclos;

import javax.swing.*;

public class ciclos12 {
    public static void main(String[] args) {
        // Ejercicio 12: Pedir un número y calcular su factorial
        // Usando JOptionPane
        long factorial = 1;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}

