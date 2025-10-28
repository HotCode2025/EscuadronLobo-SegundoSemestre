package domain;

import test.TestProyecto;
import java.util.ArrayList;
import java.util.List;

public class Selector {
    static String[] combosHamburguesa = {"Hamburguesa Clasica", "Hamburguesa Doble Queso", "Hamburguesa BBQ"};
    static double[] preciosHamburguesa = {450.0, 650.0, 520.0};

    static String[] combosSandwich = {"Sandwich Pollo", "Sandwich Milanesa", "Sandwich Atun"};
    static double[] preciosSandwich = {420.0, 480.0, 440.0};

    static String[] pizzas = {"Pizza Muzza", "Pizza Napolitana", "Pizza Cuatro Quesos"};
    static double[] preciosPizza = {700.0, 750.0, 900.0};

    static String[] ensaladas = {"Ensalada Mixta", "Ensalada Cesar", "Ensalada Rucula"};
    static double[] preciosEnsalada = {300.0, 350.0, 380.0};

    static String[] aderezos = {"Aceite y Vinagre", "Cesar", "Mostaza", "Mayonesa", "Roquefort", "Balsamico"};
    static String[] acompanamientos = {"Papas fritas", "Aros de cebolla", "Ensalada pequena", "Nuggets"};
    static double[] preciosAcompanamiento = {150.0, 180.0, 120.0, 200.0};

    static String[] bebidas = {"Gaseosa 500ml", "Agua 500ml", "Jugo 300ml", "Cerveza 500ml"};
    static double[] preciosBebida = {200.0, 120.0, 170.0, 300.0};

    // temporales
    static String ultimoTipo = "";
    static String ultimoDetalle = "";
    static double ultimoPrecio = 0.0;

    public static void SeleccionarCombo() {
        Util.limpiarPantalla();
        System.out.println("------ Seleccionar Combo ------");
        System.out.println("1. Hamburguesa");
        System.out.println("2. Sandwich");
        System.out.println("3. Pizza");
        System.out.println("4. Ensalada/Acompanamiento");
        System.out.println("5. Volver");
        System.out.print("Opcion: ");
        int opcion = Util.leerEntero();
        switch (opcion) {
            case 1:
                seleccionarHamburguesaCombo();
                break;
            case 2:
                seleccionarSandwichCombo();
                break;
            case 3:
                seleccionarPizzaCombo();
                break;
            case 4:
                SeleccionarEnsaladasYAderezos();
                break;
            default:
                System.out.println("Volviendo al menu principal...");
                Util.esperar(800);
        }
    }

    private static void seleccionarHamburguesaCombo() {
        Util.limpiarPantalla();
        System.out.println("---- Combos de Hamburguesa ----");
        for (int i = 0; i < combosHamburguesa.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i+1, combosHamburguesa[i], preciosHamburguesa[i]);
        }
        System.out.print("Seleccione (0 para cancelar): ");
        int sel = Util.leerEntero();
        if (sel <= 0 || sel > combosHamburguesa.length) {
            System.out.println("Cancelado.");
            return;
        }
        ultimoTipo = "Hamburguesa";
        ultimoDetalle = combosHamburguesa[sel-1];
        ultimoPrecio = preciosHamburguesa[sel-1];
        Ticket.TicketHamburguesaYSandwich(ultimoTipo, ultimoDetalle, ultimoPrecio);
    }

    private static void seleccionarSandwichCombo() {
        Util.limpiarPantalla();
        System.out.println("---- Combos de Sandwich ----");
        for (int i = 0; i < combosSandwich.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i+1, combosSandwich[i], preciosSandwich[i]);
        }
        System.out.print("Seleccione (0 para cancelar): ");
        int sel = Util.leerEntero();
        if (sel <= 0 || sel > combosSandwich.length) {
            System.out.println("Cancelado.");
            return;
        }
        ultimoTipo = "Sandwich";
        ultimoDetalle = combosSandwich[sel-1];
        ultimoPrecio = preciosSandwich[sel-1];
        Ticket.TicketHamburguesaYSandwich(ultimoTipo, ultimoDetalle, ultimoPrecio);
    }

    private static void seleccionarPizzaCombo() {
        Util.limpiarPantalla();
        System.out.println("---- Combos de Pizza ----");
        for (int i = 0; i < pizzas.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i+1, pizzas[i], preciosPizza[i]);
        }
        System.out.print("Seleccione (0 para cancelar): ");
        int sel = Util.leerEntero();
        if (sel <= 0 || sel > pizzas.length) {
            System.out.println("Cancelado.");
            return;
        }
        ultimoTipo = "Pizza";
        ultimoDetalle = pizzas[sel-1];
        ultimoPrecio = preciosPizza[sel-1];
        Ticket.TicketPizza(ultimoDetalle, ultimoPrecio);
    }

    public static void SeleccionarPersonalizarPedido() {
        Util.limpiarPantalla();
        System.out.println("---- Personalizar Pedido ----");
        System.out.println("1. Personalizar Hamburguesa");
        System.out.println("2. Personalizar Sandwich");
        System.out.println("3. Personalizar Pizza");
        System.out.println("4. Volver");
        System.out.print("Opcion: ");
        int op = Util.leerEntero();
        switch (op) {
            case 1:
                PersonalizarHamburguesa();
                break;
            case 2:
                PersonalizarSandwich();
                break;
            case 3:
                PersonalizarPizza();
                break;
            default:
                System.out.println("Volviendo...");
                Util.esperar(600);
        }
    }

    public static void PersonalizarHamburguesa() {
        Util.limpiarPantalla();
        System.out.println("---- Personalizar Hamburguesa ----");
        System.out.print("Ingrese nombre del pan: ");
        String pan = TestProyecto.sc.nextLine();
        System.out.print("Ingrese tipo de carne: ");
        String carne = TestProyecto.sc.nextLine();
        System.out.print("Ingrese cantidad de ingredientes (0 a 5): ");
        int cant = Util.leerEnteroRango(0,5);
        String[] ingredientes = new String[5];
        String lista = "";
        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrediente " + (i+1) + ": ");
            ingredientes[i] = TestProyecto.sc.nextLine();
            if (i > 0) lista += ", ";
            lista += ingredientes[i];
        }
        double precioBase = 400.0;
        double precioIngredientes = cant * 30.0;
        double total = precioBase + precioIngredientes;
        ultimoTipo = "Hamburguesa personalizada";
        ultimoDetalle = "Pan:" + pan + " Carne:" + carne + " Ing:[" + lista + "]";
        ultimoPrecio = total;
        Ticket.TicketHamburguesaYSandwich(ultimoTipo, ultimoDetalle, ultimoPrecio);
    }

    public static void PersonalizarSandwich() {
        Util.limpiarPantalla();
        System.out.println("---- Personalizar Sandwich ----");
        System.out.print("Ingrese tipo de pan: ");
        String pan = TestProyecto.sc.nextLine();
        System.out.print("Ingrese ingrediente principal: ");
        String principal = TestProyecto.sc.nextLine();
        System.out.print("Ingrese si desea aderezos (S/N): ");
        String r = TestProyecto.sc.nextLine().trim().toUpperCase();
        List<String> selAd = new ArrayList<>();
        if (r.equals("S")) {
            System.out.println("Seleccione aderezos (ingrese 0 para terminar):");
            for (int i = 0; i < aderezos.length; i++) System.out.printf("%d. %s%n", i+1, aderezos[i]);
            while(true) {
                System.out.print("Aderezo (0 para terminar): ");
                int a = Util.leerEntero();
                if (a == 0) break;
                if (a < 1 || a > aderezos.length) {
                    System.out.println("Aderezo invalido.");
                    continue;
                }
                selAd.add(aderezos[a-1]);
            }
        }
        double precio = 380.0 + (selAd.size()*20.0);
        ultimoTipo = "Sandwich personalizado";
        ultimoDetalle = "Pan:" + pan + " Principal:" + principal + " Aderezos:" + String.join(",", selAd);
        ultimoPrecio = precio;
        Ticket.TicketHamburguesaYSandwich(ultimoTipo, ultimoDetalle, ultimoPrecio);
    }

    public static void PersonalizarPizza() {
        Util.limpiarPantalla();
        System.out.println("---- Personalizar Pizza ----");
        System.out.print("Ingrese tamano (chico/mediano/grande): ");
        String tam = TestProyecto.sc.nextLine();
        System.out.print("Ingrese tipo de masa: ");
        String masa = TestProyecto.sc.nextLine();
        System.out.print("Cantidad de ingredientes (0 a 8): ");
        int n = Util.leerEnteroRango(0,8);
        String[] ingredientes = new String[8];
        String lista = "";
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrediente " + (i+1) + ": ");
            ingredientes[i] = TestProyecto.sc.nextLine();
            if (i > 0) lista += ", ";
            lista += ingredientes[i];
        }
        double base = 600.0;
        if (tam.equalsIgnoreCase("mediano")) base += 150.0;
        if (tam.equalsIgnoreCase("grande")) base += 300.0;
        double precio = base + (n * 50.0);
        ultimoTipo = "Pizza personalizada";
        ultimoDetalle = "Tam:" + tam + " Masa:" + masa + " Ing:[" + lista + "]";
        ultimoPrecio = precio;
        Ticket.TicketPizza(ultimoDetalle, ultimoPrecio);
    }

    public static void SeleccionarEnsaladasYAderezos() {
        Util.limpiarPantalla();
        System.out.println("---- Seleccionar Ensaladas y Aderezos ----");
        for (int i = 0; i < ensaladas.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i+1, ensaladas[i], preciosEnsalada[i]);
        }
        System.out.print("Seleccione ensalada (0 para cancelar): ");
        int sel = Util.leerEntero();
        if (sel <= 0 || sel > ensaladas.length) {
            System.out.println("Cancelado.");
            return;
        }
        String ens = ensaladas[sel-1];
        List<String> seleccionados = new ArrayList<>();
        System.out.println("Seleccione hasta 3 aderezos (ingrese 0 para terminar):");
        for (int i = 0; i < aderezos.length; i++) System.out.printf("%d. %s%n", i+1, aderezos[i]);
        for (int i = 0; i < 3; i++) {
            System.out.print("Aderezo " + (i+1) + ": ");
            int a = Util.leerEntero();
            if (a == 0) break;
            if (a < 1 || a > aderezos.length) {
                System.out.println("Aderezo invalido.");
                i--;
                continue;
            }
            seleccionados.add(aderezos[a-1]);
        }
        double precio = preciosEnsalada[sel-1];
        ultimoTipo = "Ensalada";
        ultimoDetalle = ens + " Aderezos:" + String.join(",", seleccionados);
        ultimoPrecio = precio;
        Ticket.TicketCombos(ultimoTipo, ultimoDetalle, ultimoPrecio);
    }

    public static void SeleccionarAcompanamiento() {
        Util.limpiarPantalla();
        System.out.println("---- Seleccionar Acompanamiento ----");
        for (int i = 0; i < acompanamientos.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i+1, acompanamientos[i], preciosAcompanamiento[i]);
        }
        System.out.print("Seleccione (0 para cancelar): ");
        int s = Util.leerEntero();
        if (s <= 0 || s > acompanamientos.length) {
            System.out.println("Cancelado.");
            return;
        }
        ultimoTipo = "Acompanamiento";
        ultimoDetalle = acompanamientos[s-1];
        ultimoPrecio = preciosAcompanamiento[s-1];
        Ticket.TicketCombos(ultimoTipo, ultimoDetalle, ultimoPrecio);
    }

    public static void SeleccionarBebida() {
        Util.limpiarPantalla();
        System.out.println("---- Seleccionar Bebida ----");
        for (int i = 0; i < bebidas.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i+1, bebidas[i], preciosBebida[i]);
        }
        System.out.print("Seleccione (0 para cancelar): ");
        int s = Util.leerEntero();
        if (s <= 0 || s > bebidas.length) {
            System.out.println("Cancelado.");
            return;
        }
        ultimoTipo = "Bebida";
        ultimoDetalle = bebidas[s-1];
        ultimoPrecio = preciosBebida[s-1];
        Ticket.TicketCombos(ultimoTipo, ultimoDetalle, ultimoPrecio);
    }
}

