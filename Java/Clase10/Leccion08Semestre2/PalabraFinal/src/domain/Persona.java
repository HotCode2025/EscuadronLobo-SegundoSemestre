package domain;

//public final class Persona { //Clase Constante
public class Persona {
    public final static int CONSTANTE_AQUI = 15;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
       
    public void imprimir(){
    //public static void imprimir(){ //Si esta con final no se puede sobreescribir en la clase hija
        System.out.println("Método para imprimir");
    }
}