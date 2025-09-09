//4.7 Ejercicio con Ciclos 7 Con la Clase Scanner y JOptionPane
//Ejercicio 7: pedir numeros hasta que se introduzca uno negativo y
//calcuclar la media

//Clase Scanner

import java.util.Scanner;

public class Ejercicio4_7_ClaseScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0, contador = 0;
        double media;

        // Pedir numeros hasta que se introduzca uno negativo
        do {
            System.out.print("Introduce un numero (negativo- para terminar): ");
            numero = entrada.nextInt();

            if (numero >= 0) {
                suma += numero; // Sumar el numero a la suma total
                contador++; // Incrementar el contador de numeros validos
            }
        } while (numero >= 0);

        // Calcular la media si se han introducido numeros validos
        if (contador > 0) {
            media = (double) suma / contador;

            System.out.println("\nLa media de los numeros introducidos es: " + media + "\n");
        } else {
            System.out.println("No se introdujeron numeros validos.");
        }
    }
}
