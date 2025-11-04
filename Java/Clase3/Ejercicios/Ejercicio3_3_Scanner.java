// 3.3 Ejercicio con Ciclos 5 y clase Scanner y JOptionPane
// Ejercico 5: realizar un nuego para adivinar un numero, para ello generar un numero aleatorio entre 
// 0 y 100, y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun sea mayor o menor
// con respecto a N. El proceso termina cuando el usuario acierta y mostramos el numero de
// intentos hechos.

import java.util.Scanner;

public class Ejercicio3_3_Scanner {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int numero, aleatorio, conteo = 0;
      aleatorio = (int) (Math.random() * 100);  //para generar un numero aleatorio
        do{
          System.out.println("Ingrese un Numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if (numero < aleatorio){
                System.out.println("Ingrese un numero mayor");
            }
            else if (numero > aleatorio) {
                System.out.println("Ingrese un numero menor");          
            }
            else{
                System.out.println("¡Felicidades Haz acertado!");
            }
            conteo++;
        }while(numero != aleatorio);
        System.out.println("Numeros de intentos: "+ conteo);
    }
}
