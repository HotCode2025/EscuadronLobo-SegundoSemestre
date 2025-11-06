
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        //CICLO WHILE
        var conteo = 0; //Inferencia de tipos
        while(conteo < 3) {
            System.out.println("conteo = " + conteo);
            conteo++; //Vamos aumentando en uno la variable
        }
        
        //CICLO DO WHILE
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 7);
        
        //CICLO FOR
        
        for (var contando = 0; contando < 7; contando++){
            if(contando % 2 == 0 ){
                System.out.println("contando = " + contando);
                break;  //romper un ciclo
            }
        }
        
        for (var contando = 0; contando < 7; contando++){
            if(contando % 2 != 0 ){
                continue; // Vamos a la siguiente interación
            }
            System.out.println("contando = " + contando);
        }
        
       /* //Uso de etiqueta Labels
        //uso dela palabras break y continie junto a las etiquetas (labels)
        inicio: //tiene que estar antes del ciclo
        for (var contando = 0; contando < 7; contando++){
            if(contando % 2 == 0 ){
                System.out.println("contando = " + contando);
            }
        }*/
    }
}
