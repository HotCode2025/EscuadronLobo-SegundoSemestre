
/**
 * Clase que representa a una persona con atributos básicos de
 * nombre y apellido.
 * Esta clase se utiliza para demostrar la creación de objetos
 * y la llamada a métodos en Java.
 */
package Clases;

public class Persona {
    
    /*
     * ----------------- ATRIBUTOS -----------------
     * Estos campos almacenan el estado de cada objeto Persona.
     */
    
    /**
     * Almacena el nombre de la persona.
     */
    String nombre;
    
    /**
     * Almacena el apellido de la persona.
     */
    String apellido;
    
    /*
     * ----------------- MÉTODOS -----------------
     * Estos métodos definen las acciones que puede realizar el objeto.
     */

    /**
     * Muestra la información completa de la persona (nombre y apellido)
     * en la consola.
     * Es un método público que no retorna ningún valor (`void`).
     */
    public void obtenerInformacion(){
        // Imprime el nombre concatenando la etiqueta
        System.out.println("Nombre: "+nombre);
        
        // Imprime el apellido de la persona
        System.out.println("Apellido: "+apellido);
    }
}
