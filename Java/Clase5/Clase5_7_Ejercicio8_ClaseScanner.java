// Clase5: 5.7 Ejercicio Ciclos 08 con Scanner
// Ejercicio 8: Pedir numeros N, y mostrar todos los numeros del 1 al N.

import java.util.Scanner;

public class Clase5_7_Ejercicio8_ClaseScanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero positivo: ");
        numero = entrada.nextInt();
        while (numero <= 0) {
            System.out.print("Error. Ingrese un numero entero positivo: ");
            numero = entrada.nextInt();
        }
        System.out.println("Los numeros del 1 al " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
