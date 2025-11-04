
package test;


public class TestArreglos {
    public static void main(String[] args) { //lado derecho instanciamos un objeto de tipo object
        int edades [] = new int [3];  //el lado izq declaramos la variable
        System.out.println("edades =" + edades);
        //11.2 Arreglos Parte 2
        edades[0] = 17;
        System.out.println("edades = "+edades[0]);
        edades[1] = 25;
        System.out.println("edades = "+edades[1]);
        edades[2] = 31;
        System.out.println("edades = "+edades[2]);
        //11.3 Arreglos Parte 3
        //edades[3] = 22; //Fuera de rango, error en tiempo de ejecucion

        for (int i = 0; i < edades.length; i++){
            System.out.println("edades y sus elementos "+ i +": " + edades[i]);
        }
    }
    
}
