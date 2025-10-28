/*
 * Ejercicio 2: Leer un número e indicar si es positivo o
 * negativo. El proceso se repetirá hasta que se introduzca un cero
 */

import javax.swing.JOptionPane;

public class C2Ejercicio2JOptionPane {
    public static void main(String[] args) {
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: ")); // Pedimos al usuario que ingrese un número usando la clase JOptionPane
            if (num < 0) { // Comparamos si el numero es menor a cero
                // Si es menor el número es Negativo
                // System.out.println("El número " + num + " es NEGATIVO"); //ANTES
                JOptionPane.showMessageDialog(null, "El número " + num + " es NEGATIVO"); // AHORA CON JOptionPane
            } else if (num > 0) { // Comparamos si el número es mayor a cero
                // Si es mayor el número es Positivo
                // System.out.println("El número " + num + " es POSITIVO"); ANTES
                JOptionPane.showMessageDialog(null, "El número " + num + " es POSITIVO"); // AHORA CON JOptionPane
            } else if (num == 0) { // Si es igual a cero termina el programa
                // System.out.println("Programa finalizado por que ingresó cero"); ANTES
                JOptionPane.showMessageDialog(null, "Programa finalizado por que ingresó cero"); // AHORA CON JOptionPane
                break;
            }
        } while (num != 0);
    }
    
}
