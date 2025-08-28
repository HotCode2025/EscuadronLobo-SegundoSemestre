/*
 * Ejercicio 3: Leer números hasta que se introduzca un cero.
 * Para cada número, indicar si es par o impar.
 * Primero con la clase Scanner, luego con la clase JOptionPane. 
 */
import javax.swing.JOptionPane;

public class EjercicioCiclos03JOptionPane {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (0 para salir): "));
        while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es par");
            }
            else{
                JOptionPane.showMessageDialog(null, "El número " + numero + " es impar");             
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número (0 para terminar): "));
        }
        JOptionPane.showMessageDialog(null,"Finalizaste el programa con " + numero);
    }
}
