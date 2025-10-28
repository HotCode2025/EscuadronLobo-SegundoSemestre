package domain;

import test.TestProyecto;

public class Ticket {
    public static void TicketCombos(String tipo, String detalle, double precio) {
        Util.limpiarPantalla();
        System.out.println("*********** TICKET COMBO ***********");
        System.out.println("Tipo: " + tipo);
        System.out.println("Detalle: " + detalle);
        System.out.printf("Precio: $%.2f%n", precio);
        System.out.println("************************************");
        System.out.println("Presione Enter para continuar...");
        TestProyecto.sc.nextLine();
    }

    public static void TicketPizza(String detalle, double precio) {
        Util.limpiarPantalla();
        System.out.println("*********** TICKET PIZZA ***********");
        System.out.println("Pizza: " + detalle);
        System.out.printf("Precio: $%.2f%n", precio);
        System.out.println("************************************");
        System.out.println("Presione Enter para continuar...");
        TestProyecto.sc.nextLine();
    }

    public static void TicketHamburguesaYSandwich(String tipo, String detalle, double precio) {
        Util.limpiarPantalla();
        System.out.println("***** TICKET HAMBURGUESA/SANDWICH *****");
        System.out.println("Tipo: " + tipo);
        System.out.println("Detalle: " + detalle);
        System.out.printf("Precio: $%.2f%n", precio);
        System.out.println("***************************************");
        System.out.println("Presione Enter para continuar...");
        TestProyecto.sc.nextLine();
    }

    public static void TicketEjemplo() {
        Util.limpiarPantalla();
        System.out.println("MOSTRAR TICKET DE EJEMPLO");
        System.out.println("Este es un ticket de ejemplo. El programa no almacena pedidos.");
        System.out.println("Use las opciones para generar tickets reales.");
        System.out.println("Presione Enter para continuar...");
        TestProyecto.sc.nextLine();
    }
}

