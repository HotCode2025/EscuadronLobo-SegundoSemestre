package domain;

public class Menu {
    public static void procesoMenuDeComida() throws InterruptedException {
        int opcionMenu = 0;
        while (opcionMenu != 5) {
            Util.limpiarPantalla();
            System.out.println("***********************************************");
            System.out.println("*              MENU DE COMIDAS                *");
            System.out.println("***********************************************");
            System.out.println("1. Seleccionar combo");
            System.out.println("2. Personalizar pedido");
            System.out.println("3. Mostrar ticket de ejemplo");
            System.out.println("4. Presentacion");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion (1-5): ");
            opcionMenu = Util.leerEntero();

            if (opcionMenu < 1 || opcionMenu > 5) {
                System.out.println("Opcion invalida. Ingrese un numero entre 1 y 5.");
                opcionMenu = 0;
                Util.esperar(1500);
                continue;
            }

            Util.limpiarPantalla();
            switch (opcionMenu) {
                case 1:
                    Selector.SeleccionarCombo();
                    break;
                case 2:
                    Selector.SeleccionarPersonalizarPedido();
                    break;
                case 3:
                    Ticket.TicketEjemplo();
                    break;
                case 4:
                    Presentacion.presentacion();
                    break;
                case 5:
                    System.out.println("Saliendo... Gracias por usar el sistema.");
                    Util.esperar(800);
                    break;
            }
        }
    }
}
