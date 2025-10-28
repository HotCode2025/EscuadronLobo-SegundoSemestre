package test;

//import ar.com.codesystem.*;
import ar.com.codesystem.Utileria;
//import static ar.com.codesystem.Utileria.imprimir; // Solo aplica para métodos estáticos

public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("Saludos a todos los alumnos de la tecnicatura");
        //imprimir("Terminamos en unos minutos"); //funciona con el import static. Trae directamente el metodo
        //ar.com.codesystem.Utileria.imprimir("Ahora si estamos terminando"); //llamamos directamente un metedo desde otra clase
    }
}
