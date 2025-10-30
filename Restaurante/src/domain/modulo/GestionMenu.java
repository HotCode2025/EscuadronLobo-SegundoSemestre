package domain.modulo;

import java.util.*;
import java.util.stream.Collectors;

public class GestionMenu {

    private static Scanner scanner = new Scanner(System.in);

    public static void listarMenu() {
        System.out.println("\n-----------------------------------------");
        System.out.println("              MENU DE PLATOS              ");
        System.out.println("-----------------------------------------");

        if (PrecargaDatos.menu.isEmpty()) {
            System.out.println("Error. No hay platos registrados en el sistema.");
            return;
        }

        System.out.printf("%-4s %-30s %-15s %-10s%n", "N", "Nombre", "Categoria", "Precio");
        System.out.println("------------------------------------------------------------");

        int i = 1;
        for (Plato p : PrecargaDatos.menu) {
            System.out.printf("%-4d %-30s %-15s $%-10.2f%n", i++, p.getNombre(), p.getTipo(), p.getPrecio());
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Total de platos: " + PrecargaDatos.menu.size());
    }

    public static void agregarPlato() {
        System.out.println("\n+ --- AGREGAR PLATO ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Tipo (entrada, principal, postre, bebida): ");
        String tipo = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());

        Plato nuevo = new Plato(nombre, tipo, precio);
        PrecargaDatos.menu.add(nuevo);
        System.out.println("Plato agregado correctamente.");
    }

    public static void modificarPlato() {
        listarMenu();
        System.out.print("\nIngrese el numero del plato a modificar: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index < 0 || index >= PrecargaDatos.menu.size()) {
            System.out.println("Numero invalido.");
            return;
        }

        Plato p = PrecargaDatos.menu.get(index);

        System.out.print("Nuevo nombre (" + p.getNombre() + "): ");
        String nombre = scanner.nextLine();
        if (!nombre.isEmpty()) p.setNombre(nombre);

        System.out.print("Nuevo tipo (" + p.getTipo() + "): ");
        String tipo = scanner.nextLine();
        if (!tipo.isEmpty()) p.setTipo(tipo);

        System.out.print("Nuevo precio (" + p.getPrecio() + "): ");
        String precioStr = scanner.nextLine();
        if (!precioStr.isEmpty()) p.setPrecio(Double.parseDouble(precioStr));

        System.out.println("Plato modificado correctamente.");
    }

    public static void eliminarPlato() {
        listarMenu();
        System.out.print("\nIngrese el numero del plato a eliminar: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index < 0 || index >= PrecargaDatos.menu.size()) {
            System.out.println("Error. Numero invalido.");
            return;
        }

        PrecargaDatos.menu.remove(index);
        System.out.println("Plato eliminado correctamente.");
    }

    public static void buscarPlato() {
        System.out.print("\nIngrese nombre o tipo del plato: ");
        String termino = scanner.nextLine().toLowerCase();

        boolean encontrado = false;
        for (Plato p : PrecargaDatos.menu) {
            if (p.getNombre().toLowerCase().contains(termino) ||
                    p.getTipo().toLowerCase().contains(termino)) {
                System.out.println(p);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro ningun plato con ese criterio.");
        }
    }

    // Mostrar todos los platos
    public static void mostrarMenuCompleto() {
        System.out.println("\nMENU COMPLETO DEL RESTAURANTE");
        System.out.printf("%-25s %-15s %-10s%n", "Plato", "Tipo", "Precio");
        System.out.println("----------------------------------------------------------");

        for (var p : PrecargaDatos.menu) {
            System.out.printf("%-25s %-15s $%.2f%n", p.getNombre(), p.getTipo(), p.getPrecio());
        }
    }

    public static void filtrarPorTipo() {
        System.out.println("\nFILTRO DE PLATOS POR TIPO");
        System.out.println("Tipos disponibles: entrada, principal, postre, bebida");
        System.out.print("Ingrese el tipo de plato que desea ver: ");
        String tipo = scanner.nextLine().trim().toLowerCase();

        List<Plato> filtrados = PrecargaDatos.menu.stream()
                .filter(p -> p.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());

        if (filtrados.isEmpty()) {
            System.out.println("No hay platos del tipo '" + tipo + "'.");
            return;
        }

        System.out.printf("%-25s %-15s %-10s%n", "Plato", "Tipo", "Precio");
        System.out.println("----------------------------------------------------------");
        for (Plato p : filtrados) {
            System.out.printf("%-25s %-15s $%.2f%n", p.getNombre(), p.getTipo(), p.getPrecio());
        }
    }

}

