/*
 * Ejercicio 4: Pedir números hasta que se teclee uno negativo,
 * y mostrar cuantos números se han introducido.
 * Lo hacemos primero con la clase Scanner
 * Luego lo hacemos con la clase JOptionPane
 */
import java.util.Scanner;

public class EjercicioCiclos02Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, contador;
        contador = 0;
        System.out.println("Ingrese números, para terminar digite un número negativo");
        System.out.println("----------------------------------------------------------");
        do { // Usamos el do-while para que al menos se ejecute una vez el ciclo            
            System.out.println("Ingrese un número: "); // pedimos al usuario un número
            num = Integer.parseInt(entrada.nextLine()); // capturamos el numero con la clase scanner
            if (num >= 0) { // Comparamos si el numero es mayor o igual a cero
                contador += 1;
            } else { // Si es Negativo, termina el programa
                System.out.println("Programa finalizado por que ingresó un número negativo");
                break;
            }            
        } while (num >= 0); // el ciclo se va a repetir mientras el numero ingresado es mayor o igual a cero
        System.out.println("Ingresó " + contador + " números");
    }    
}