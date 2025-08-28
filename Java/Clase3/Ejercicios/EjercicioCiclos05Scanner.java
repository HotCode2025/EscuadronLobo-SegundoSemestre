/*
 *Ejercicio 5: Realizar un juego para adivinar un numero,
 *para ello generar un numero alatorio entre 0-100, y
 *luego ir pidiendo numeros indicando "es mayor" o
 *"es menor" segun sea mayor o menor con respecto a N
 *El proceso termina cuando el usaurio aciera y mostramos 
 *el numero de intentos hechos
 */
import java.util.Scanner;

public class EjercicioCiclos05Scanner {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100);
        System.out.println("Adivina el número entre 0 y 100.");
        do{
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero < aleatorio){
                System.out.println("El numero es mayor");
            }
            else if (numero > aleatorio){
                System.out.println("El numero es menor");
            }
            else{
                System.out.println("Felicidades adivinaste el numero");
            }
            conteo++;
        }while(numero != aleatorio);
        System.out.println("Adivinaste el numero en: "+conteo+" intentos");
    }
    
}
