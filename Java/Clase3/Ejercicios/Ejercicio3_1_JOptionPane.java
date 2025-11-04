// 3.1 Ejercicio con Ciclos 3 - JOptionPane

// Ejercico3: Leer numeros hasta que se introduzca un cero. Para cada uno indicar si es 
// par o impar

import javax.swing.JOptionPane;

public class Ejercicio3_1_JOptionPane {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while (numero != 0){
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null,"El numero ingresado "+numero+" \n >> es PAR");
            }
            else {
                JOptionPane.showMessageDialog(null,"El numero ingresdo "+numero+" \n >> es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        JOptionPane.showMessageDialog(null,"Ah ingresado un "+numero+" , finaliza el programa"); 
    }
}
   

