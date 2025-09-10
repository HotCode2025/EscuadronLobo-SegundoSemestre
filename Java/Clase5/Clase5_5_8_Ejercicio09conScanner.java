/*
 * Ejercicio 9: Pedir el dia, mes y año de una fecha e
 * indicar si la fecha es correcta. Suponiendo que
 * todos los meses son de 30 dias
 */

import java.util.Scanner;

public class Clase5_5_8_Ejercicio09conScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, anio;

        System.out.println("Ingrese día: ");
        dia = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese mes: ");
        mes = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese año: ");
        anio = Integer.parseInt(entrada.nextLine());
        if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (anio >= 1900 && anio <= 2025)) {
            System.out.println("Ha ingresado una fecha VALIDA!");
        } else {
            System.out.println("Ha ingresado una fecha NO VALIDA!");
        }
    }
}