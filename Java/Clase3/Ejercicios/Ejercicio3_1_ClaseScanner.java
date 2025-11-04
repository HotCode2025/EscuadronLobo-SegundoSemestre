// 3.1 Ejercicio con Ciclos 3 y clase Scanner y JOptionPane

// Ejercico3: Leer numeros hasta que se introduzca un cero. Para cada uno indicar si es 
// par o impar. Primero lo haremos con la clase Scanner

import java.util.Scanner;

public class Ejercicio3_1_ClaseScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0){
            if (numero % 2 == 0) {
                System.out.println("El numero ingresado "+numero+" es PAR");
            }
            else {
                System.out.println("El numero ingresdo "+numero+" es IMPAR");
            }
            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Ah ingresado un >"+numero+"< finaliza el programa");
    }
}


