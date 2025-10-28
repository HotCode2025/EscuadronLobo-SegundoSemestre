package domain;

import test.TestProyecto;

public class Presentacion {
    public static void presentacion() throws InterruptedException {
        Util.limpiarPantalla();
        bienvenida();
        Util.esperar(500);
        lobo();
        Util.esperar(500);
        cartelHamburguesa();
        Util.esperar(500);
        pizza();
        Util.esperar(500);
        integrantes();
        System.out.println("Presiona Enter para terminar la presentacion");
        TestProyecto.sc.nextLine();
    }

    public static void bienvenida() {
        System.out.println("=========================================================");
        System.out.println("BIENVENIDOS!!!");
        System.out.println("=========================================================");
        System.out.println();
    }

    public static void lobo() {
        System.out.println("  ,     ,");
        System.out.println(" /|_____|"); 
        System.out.println("(  '---'  )");
    }

    public static void cartelHamburguesa() {
        System.out.println("    _=====_                               _=====_");
        System.out.println("   / _____                              / _____ ");
        System.out.println("  |.| .-. |.|                           |.| .-. |.|");
    }

    public static void pizza() {
        System.out.println("      ____");
        System.out.println("    .-" + "-.");
        System.out.println("   /  .-.  ");
        System.out.println("  |  /     |");
    }

    public static void integrantes() {
        System.out.println("***********************************************");
        System.out.println("* Participante: AGUILAR LUCAS                 *");
        System.out.println("* Participante: ALTAMIRANDA MATIAS            *");
        System.out.println("* Participante: BERTOLONE VALENTIN            *");
        System.out.println("* Participante: FARIAS CECILIA                *");
        System.out.println("* Participante: MORENO JUAN                   *");
        System.out.println("* Participante: PINAYA VALERIA                *");
        System.out.println("* Participante: SCILIPOTI DARIO               *");
        System.out.println("* Participante: ZELADA ORLANDO                *");
        System.out.println("* Proyecto: MENU DE COMIDAS                   *");
        System.out.println("* Fecha: 20 de junio de 2025                  *");
        System.out.println("***********************************************");
    }
}

