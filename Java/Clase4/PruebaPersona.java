
/**
 * Clase principal (ejecutable) para probar la creación y el uso
 * de objetos de la clase 'Persona'.
 */
package Clases;

public class PruebaPersona {
    
    /**
     * El punto de entrada principal del programa.
     * Aquí se crean las instancias de la clase Persona.
     */
    public static void main(String[] args) {
        
        // --- CREACIÓN DEL OBJETO PERSONA 1 ---
        
        // Llamado al constructor de la clase Persona. 
        // Esto crea un nuevo objeto en la memoria (heap).
        Persona persona1 = new Persona(); 

        // Accediendo y asignando valores a los atributos del objeto persona1.
        persona1.nombre = "Cecilia"; 
        
        // Nota: La referencia a valores hexadecimales (0x...) se aplica a la 
        // dirección de memoria del objeto, no al valor de la variable String.
        persona1.apellido = "Farias";
        
        // Llamando al método (acción) del objeto para que imprima su información.
        persona1.obtenerInformacion();

        // --- CREACIÓN DEL OBJETO PERSONA 2 ---
        
        // Se crea un segundo objeto Persona, también usando el constructor.
        Persona persona2 = new Persona();
        
        // Al imprimir el objeto directamente, Java muestra la dirección de memoria
        // (referencia) donde se encuentra almacenado el objeto en el 'heap'.
        // Suele tener un formato como 'Clases.Persona@hashcode_hexadecimal'.
        System.out.println("persona2 ="+persona2);
        
        // Ambas referencias son diferentes porque apuntan a dos objetos distintos.
        System.out.println("persona1 ="+persona1);
        
        // Antes de la asignación, los atributos String tienen el valor por defecto: 'null'.
        // Esto se imprimirá en la consola.
        System.out.println("--- Información de persona2 antes de asignar valores ---");
        persona2.obtenerInformacion();
        
        // Asignando valores a los atributos del segundo objeto.
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giodanini";
        
        // El objeto persona2 ahora tiene sus propios valores.
        System.out.println("--- Información de persona2 después de asignar valores ---");
        persona2.obtenerInformacion();
    }
}