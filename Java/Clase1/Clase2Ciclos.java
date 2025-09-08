public class Clase2Ciclos {
    public static void main(String[] args) {
        //CICLO WHILE
        var conteo = 0; //inferencia de tipos
        while (conteo < 3) {
            System.out.println("conteo = " + conteo);
            conteo++; //vamos aumentando en uno la variable
        }
        System.out.println("------------");

        //CICLO DO-WHILE
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++; //vamos aumentando en uno la variable
        } while (contador <= 7);
        System.out.println("------------");

        // Uso de las palabras break y continue junto con Labels (Etiquetas)
        //inicio:
        // CICLO FOR - Tambien la palabra Brake
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 == 0) {
                System.out.println("contando = " + contando);
                break; //sale del ciclo
                //break inicio;
            }
        }
        System.out.println("------------");

        // CICLO FOR - Tambien la palabra Continue
        //inicio:
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 != 0) {
                continue;  //vamos a la siguiente iteracion
                //continue inicio;
            }
            System.out.println("contando = " + contando);
        }
    }

}
