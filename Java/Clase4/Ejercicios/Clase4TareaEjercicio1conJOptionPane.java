/*
 * Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar
 * la suma de todos los números introducidos.
 */

import javax.swing.JOptionPane;

public class Clase4TareaEjercicio1conJOptionPane {
    public static void main(String[] args) {
        int num, suma;
        suma = 0;
        System.out.println("Ingrese números, para terminar digite 0 (cero)");
        System.out.println("----------------------------------------------------------");
        do { // Usamos el do-while para que al menos se ejecute una vez el ciclo            
            System.out.println("Ingrese un número: "); // pedimos al usuario un número
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: ")); // Pedimos al usuario que ingrese un número usando la clase JOptionPane
            if (num != 0) { // Comparamos si el numero es mayor a cero
                suma += num;
            } else {
                System.out.println("Programa finalizado por que ingresó un cero");
                break;
            }   
        } while (num != 0); // el ciclo se va a repetir mientras el numero ingresado no sea cero
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}