/*
 * Ejercicio 1: Leer un número y mostrar su cuadrado, repetir
 * el proceso hasta que se introduzca un número negativo
 */

import javax.swing.JOptionPane;

public class C2Ejercicio1CiclosSinScanner {    
    public static void main(String[] args) {
        int resultado, num;
        do { // Usamos el do-while para que al menos se ejecute una vez el ciclo
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: ")); // pedimos al usuario un número usando la clase JOptionPane
            if (num >= 0) { // Comparamos si el numero es mayor o igual a cero
                resultado = (int)Math.pow(num, 2); // sacamos el cuadrado del numero
                System.out.println("El número " + num + " elevado al cuadrado es: " + resultado); //mostramos el resultado
            } else { // Si es menor a cero, termina el programa
                System.out.println("Programa finalizado por que ingresó un número negativo");
                break;
            }            
        } while (num >= 0); // el ciclo se va a repetir mientras el numero ingresado es mayor o igual a cero
    }
    
}
