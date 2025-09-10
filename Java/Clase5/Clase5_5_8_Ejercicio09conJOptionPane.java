/*
 * Ejercicio 9: Pedir el dia, mes y año de una fecha e
 * indicar si la fecha es correcta. Suponiendo que
 * todos los meses son de 30 dias
 */

import javax.swing.JOptionPane;

public class Clase5_5_8_Ejercicio09conJOptionPane {
    public static void main(String[] args) {
        int dia, mes, anio;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año: "));
        if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (anio >= 1900 && anio <= 2025)) {
            JOptionPane.showMessageDialog(null, "Ha ingresado una fecha VALIDA!");
        } else {
            JOptionPane.showMessageDialog(null, "Ha ingresado una fecha NO VALIDA!");
        }
    }
}
