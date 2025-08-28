/*
 *Ejercicio 5: Realizar un juego para adivinar un numero,
 *para ello generar un numero alatorio entre 0-100, y
 *luego ir pidiendo numeros indicando "es mayor" o
 *"es menor" segun sea mayor o menor con respecto a N
 *El proceso termina cuando el usaurio aciera y mostramos 
 *el numero de intentos hechos
 */
import javax.swing.JOptionPane;

public class EjercicioCiclos05JOptionPane {
    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random() * 100);
        JOptionPane.showMessageDialog(null, "Adivina el número entre 0 y 100.");
        do {
            numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite un numero: ")
            );

            if (numero < aleatorio) {
            JOptionPane.showMessageDialog(null, "El numero es mayor");
            }
            else if (numero > aleatorio) {
            JOptionPane.showMessageDialog(null, "El numero es menor");
            }
            else {
            JOptionPane.showMessageDialog(null, "Felicidades adivinaste el numero");
            }
            conteo++;
        } while (numero != aleatorio);
        JOptionPane.showMessageDialog(null, "Adivinaste el número en: " + conteo + " intentos");
    }
    
}
