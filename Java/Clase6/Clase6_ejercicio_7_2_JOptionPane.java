/*
Ejercicio 11: Dise�e un programa que muestre el procucto
de los 10 primeros n�meros impares
Hacerlo con JOptionPane
*/

import javax.swing.JOptionPane;

public class Clase6_ejercicio_7_2_JOptionPane {
    public static void main(String[] args) {
        
        long producto = 1;
        for (int i = 1; i<=19; i+=2) { 
            producto *= i;
        }
        
        JOptionPane.showMessageDialog(null, "El producto de los 10 primeros numeros impares es: " + producto);
    }
}
