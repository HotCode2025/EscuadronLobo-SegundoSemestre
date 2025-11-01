package ciclos;

import javax.swing.*;

public class ciclos11 {
    public static void main(String[] args) {
        //ejercicio: diseñar un programam que muestre el producto de los 10 primeros
        //numeros impares. Hacerlo con JOptionPane
        long producto = 1;
        for (int i=0; i<=20; i+=2){
            producto *= i;
        }
        JOptionPane.showMessageDialog(null, "El producto es: " + producto);
    }
}
