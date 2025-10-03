
package test;
import dominio.Persona;
        
       
       
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Fernando", 57000, false);
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        //Modificar a traves de los metodos
        persona1.setNombre ("Nacho Fernandez");
        //persona1.nombre = "Nacho Fernandez";Ya no se puede utilizar
        //System.out.println("Nombre es:"+persona1.nombre);//Error                      
        System.out.println("persona1 con su nombre moficado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        
    

       //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
       //y imprimir, luego modificar sus valores y volver a imprimir
       

        Persona persona2 = new Persona("Juan", 5000000, true);
        System.out.println("persona2 su nombre es: "+persona2.getNombre());
        //Modificar a traves de los metodos
        persona2.setNombre ("Erasmo");
        //persona1.nombre = "Nacho Fernandez";Ya no se puede utilizar
        //System.out.println("Nombre es:"+persona1.nombre);//Error                      
        System.out.println("persona2 con su nombre moficado: "+persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: "+persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: "+persona2.isEliminado());
      //Tarea Completada
          
        System.out.println("persona1 = " + persona1);
    }
}
