//3.2 Ejercicio con Ciclos 4 y clase Scanner y JOptionPane
//Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros
//se han introducido. Clase JOpcionPane

import javax.swing.JOptionPane;

public class Ejercicio4JOptionPane {
    public static void main(String[] args) {

        int numero;
        int contador = 0;

        do {
            String input = JOptionPane.showInputDialog(
                "Ingrese un número (negativo para salir):"
            );

            numero = Integer.parseInt(input);

            if (numero >= 0) {
                contador++;
            }

        } while (numero >= 0);

        JOptionPane.showMessageDialog(
            null, 
            "Cantidad de números ingresados: " + contador
        );
    }
}
