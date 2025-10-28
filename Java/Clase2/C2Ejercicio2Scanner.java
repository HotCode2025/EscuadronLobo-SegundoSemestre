/*
 * Ejercicio 2: Leer un número e indicar si es positivo o
 * negativo. El proceso se repetirá hasta que se introduzca un cero
 */

import java.util.Scanner;

public class C2Ejercicio2Scanner {
      public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Ingrese un número: "); // pedimos al usuario un número
            num = Integer.parseInt(entrada.nextLine()); // capturamos el numero con la clase scanner
            if (num < 0) { // Comparamos si el numero es menor a cero
                System.out.println("El número " + num + " es NEGATIVO"); // Si es menor el número es Negativo
            } else if (num > 0) { // Comparamos si el número es mayor a cero
                System.out.println("El número " + num + " es POSITIVO"); // Si es mayor el número es Positivo
            } else if (num == 0) { // Si es igual a cero termina el programa
                System.out.println("Programa finalizado por que ingresó cero");
                break;
            }
        } while (num != 0);
    }
}
