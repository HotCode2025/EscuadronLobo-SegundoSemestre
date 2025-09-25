import java.util.Scanner;
import javax.swing.JOptionPane;

public class Clase7_3_Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long factorial = 1;

        // Usando Scanner
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Calcular factorial con Scanner
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        // Usando JOptionPane
        String input = JOptionPane.showInputDialog("Ingrese un número para calcular su factorial: ");
        int numeroJOption = Integer.parseInt(input);
        long factorialJOption = 1;
        for (int i = 1; i <= numeroJOption; i++) {
            factorialJOption *= i;
        }

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " (Scanner) es: " + factorial +
                                      "\nEl factorial de " + numeroJOption + " (JOptionPane) es: " + factorialJOption);

        scanner.close();
    }
}