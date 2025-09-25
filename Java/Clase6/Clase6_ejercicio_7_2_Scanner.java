/*
Ejercicio 11: Diseñe un programa que muestre el procucto
de los 10 primeros números impares
Hacerlo con Scanner
*/

import java.util.Scanner;

public class Clase6_ejercicio_7_2_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long producto = 1;
        for (int i = 1; i <= 19; i += 2) {
            producto *= i;
        }

        System.out.println("El producto de los 10 primeros numeros impares es: " + producto);
    }
}
