/*Ejercicio 10:  Pedir 10 numeros y escribir la suma total
Clase Scanner
*/
package EscuadronLobo-SegundoSemestre ;

import java.util.Scanner;

public class Clase_6_8_Ejercicio10_ClaseJOptionPane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        System.out.println("Ingrese 10 numeros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Numero " + i + ": ");
            int numero = sc.nextInt();
            suma += numero;
        }

        System.out.println("La suma total es: " + suma);
        sc.close();
    }
}
