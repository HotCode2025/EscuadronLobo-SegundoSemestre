//4.7 Ejercicio con Ciclos 7 Con la Clase JOptionPane
//Ejercicio 7: pedir numeros hasta que se introduzca uno negativo y
//calcuclar la media

import javax.swing.JOptionPane;

public class Ejercicio4_7ClaseJOptionPane {
    public static void main(String[] args) {
        int numero, suma = 0, contador = 0;
        double media;

        // Pedir numeros hasta que se introduzca uno negativo
        do {
            String input = JOptionPane.showInputDialog("Introduce un numero (negativo para terminar):");
            numero = Integer.parseInt(input);

            if (numero >= 0) {
                suma += numero; // Sumar el numero a la suma total
                contador++; // Incrementar el contador de numeros validos
            }
        } while (numero >= 0);

        // Calcular la media si se han introducido numeros validos
        if (contador > 0) {
            media = (double) suma / contador;
            JOptionPane.showMessageDialog(null, "La media de los numeros introducidos es: \n" + media);
        } else {
            JOptionPane.showMessageDialog(null, ">>No se introdujeron numeros validos.<<");
        }
    }
}
