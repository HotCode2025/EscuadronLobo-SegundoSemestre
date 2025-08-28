
import java.util.Scanner;

public class EjercicioCiclos03Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número (0 para salir): ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if(numero % 2 == 0){
                System.out.println("El numero " + numero + " es par");
            }
            else{
                System.out.println("El número " + numero + " es impar");
            }
            System.out.println("Ingrese otro número (0 para terminar): ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Finalizaste el programa con " + numero);
    }
    
}
