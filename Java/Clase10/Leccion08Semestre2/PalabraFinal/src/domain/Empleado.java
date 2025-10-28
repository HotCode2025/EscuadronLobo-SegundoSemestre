package domain;

public class Empleado extends Persona {
    //extends Persona{ //no deja crear clase hija si la clase padre está como final
    @Override
    public void imprimir(){ // Si en la clase padre (Persona) esta el metodo como final no deja sobreescribir
        System.out.println("Método imprimir desde la clase hija");
    }    
}
