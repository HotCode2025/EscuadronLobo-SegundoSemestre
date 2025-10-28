/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo de donde se aplique:
    variables:  Evita cambiar el valor que almacena o el comportamiento
    métodos:    Evita que se modifiquen la definición o el comportamiento de un método desde una subclase (hija)
    clases:     Evita que se creen clases hijas
Otra característica es que normalmente, cuando trabajamos con variables se combina con el modificador de acceso estático
para convertir una variable en una constante, es decir que no se puede modificar su valor, el ejemplo de esto es la clase
Math en la cual todos sus atributos son de tipo static y final, es por esto que la variable pi* se conoce como constante.
*/
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        //ejemplo con variables
        final int miDni = 29534446;
        System.out.println("miDni = " + miDni);
        //miDni = 52294218; //No se puede modificar una variable final
        
        //ersona.CONSTANTE_AQUI = 9; //No se modifica una constante
        System.out.println("Mi atributo constante es = " + miDni);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); // No se puede asignar una nueva referencia
        persona1.setNombre("Ariel Betancud");
        System.out.println("persona1 nombre= " + persona1.getNombre());
        persona1.setNombre("Liliana");
        System.out.println("persona1 nombre= " + persona1.getNombre());
    }
}
