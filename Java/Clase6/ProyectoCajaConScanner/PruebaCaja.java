package caja;

import java.util.Scanner;

public class PruebaCaja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Caja caja = new Caja();
        caja.ancho = 1;
        caja.alto = 3;
        caja.profundidad = 23;
    
        System.out.println("Ingrese ancho: ");
        caja.ancho = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese alto: ");
        caja.alto = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese año: ");
        caja.profundidad = Integer.parseInt(entrada.nextLine());
    
        //caja.calcularVolumenConScanner();
        
        float resultado = caja.calcularVolumenConScanner();
        System.out.println("Resultado = " + resultado);
        
        //int resultadoArgs = aritmetica1.sumarConArgumentos(12, 26);
        //System.out.println("Resultado usando argumentos = " + resultadoArgs);
    }
}
