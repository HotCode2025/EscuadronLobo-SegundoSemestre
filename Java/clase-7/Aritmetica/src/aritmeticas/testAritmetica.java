package aritmeticas;

public class testAritmetica {
    public static void main(String[] args) {
        int a = 10;//variables locales
        int b = 5;
        Aritmeticas operacion = new Aritmeticas();
        //agregando valores
        operacion.a = 3;
        operacion.b = 5;
        operacion.suma();

        //asi se mustra el metodo con retorno
        int resultado = operacion.sumarConRetirno();
        System.out.println(resultado);

        //asi se muestra un metodo con argumentos
        resultado = operacion.sumaConArgumento(7, 8);
        System.out.println("resultado usando argumentos: " + resultado);

        System.out.println("aritmetica a: "+operacion.a);
        System.out.println("aritmetica b: "+operacion.b);

        //nuevo objeto
        Aritmeticas operacion2 = new Aritmeticas(8,2);
        System.out.println("aritmetica a: "+operacion2.a);
        System.out.println("aritmetica b: "+operacion2.b);

        //nuevo objeto con la clase persona
        Persona persona = new Persona("zelada", "orlando");
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);


    }

}
//solo puede acver una clase pblica //creamos una nueva clase
class Persona{
    String nombre;
    String apellido;

    Persona(String nombre, String apellido){
        super();//llama al constructor de la clase padre
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando el this" + this);
    }
}
class Imprimir{
    public Imprimir(){
        super();//el constructor de la clase padre, para reserva memoria

    }
    public void imprimir(Persona persona){
        System.out.println("prueba desde la clase imprimir: " + persona);
        System.out.println("impricion del objeto this" + this);
    }
}

