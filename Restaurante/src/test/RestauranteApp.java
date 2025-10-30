package test;

import domain.menus.*;
import domain.modulo.GestionUsuario;
import domain.modulo.PrecargaDatos;
import domain.usuarios.*;

import java.util.List;
import java.util.Scanner;

import java.util.List;
import java.util.Scanner;

public class RestauranteApp {
    public static void main(String[] args) {
        // Cargar datos de prueba
        PrecargaDatos.cargarDatos();

        List<Usuario> usuarios = PrecargaDatos.usuarios;
        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA DE GESTION DE RESTAURANTE");

        while (true) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Registrarse (solo clientes)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            String opcion = sc.nextLine();

            if (opcion.equals("0")) {
                System.out.println("\nGracias por usar el sistema. Hasta luego!");
                break;
            }

            Usuario seleccionado = null;

            // --- OPCION DE REGISTRO ---
            if (opcion.equals("2")) {
                System.out.println("\nREGISTRO DE NUEVO CLIENTE");
                System.out.print("Nombre completo: ");
                String nombre = sc.nextLine();

                System.out.print("DNI: ");
                String dni = sc.nextLine();

                System.out.print("Nombre de usuario: ");
                String usuario = sc.nextLine();

                boolean existe = usuarios.stream().anyMatch(u -> u.getUsuario().equalsIgnoreCase(usuario));
                if (existe) {
                    System.out.println("ERROR, ese nombre de usuario ya esta en uso. Intente con otro.");
                    continue;
                }

                System.out.print("Contrasena: ");
                String contrasena = sc.nextLine();

                System.out.print("Telefono: ");
                String telefono = sc.nextLine();

                System.out.print("Direccion: ");
                String direccion = sc.nextLine();

                System.out.print("Saldo inicial: ");
                double saldo = 0;
                try {
                    saldo = Double.parseDouble(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error, valor invalido. Se asignara saldo 0 por defecto.");
                }

                Cliente nuevoCliente = new Cliente(nombre, dni, usuario, contrasena, saldo, telefono, direccion);
                usuarios.add(nuevoCliente);

                System.out.println("\nRegistro exitoso. Bienvenido, " + nombre + "!");
                seleccionado = nuevoCliente;
            }

            // --- OPCION DE INICIO DE SESION ---
            else if (opcion.equals("1")) {
                while (true) {
                    System.out.print("\nIngrese el nombre de usuario (o 'volver' para regresar): ");
                    String nombreUsuario = sc.nextLine();
                    if (nombreUsuario.equalsIgnoreCase("volver")) break;

                    seleccionado = usuarios.stream()
                            .filter(u -> u.getUsuario().equalsIgnoreCase(nombreUsuario))
                            .findFirst()
                            .orElse(null);

                    if (seleccionado == null) {
                        System.out.println("Usuario no encontrado. Intente nuevamente.");
                        continue;
                    }

                    System.out.print("Ingrese la contrasena: ");
                    String clave = sc.nextLine();

                    if (seleccionado.getContrasena().equals(clave)) {
                        System.out.println("Inicio de sesion exitoso.");
                        break;
                    } else {
                        System.out.println("Contrasena incorrecta.");
                        seleccionado = null;
                    }
                }
            } else {
                System.out.println("Opcion invalida. Intente de nuevo.");
                continue;
            }

            if (seleccionado == null) continue;

            // --- MENU SEGUN EL TIPO DE USUARIO ---
            if (seleccionado instanceof Administrador) {
                System.out.println("\nBienvenido Administrador " + seleccionado.getNombre() + "!");
                GestionUsuario.setAdminActual((Administrador) seleccionado);
                new MenuAdministrador(new GestionUsuario()).mostrarOpciones();

            } else if (seleccionado instanceof Mozo) {
                System.out.println("\nBienvenido Mozo " + seleccionado.getNombre() + "!");
                new MenuMozo().mostrarOpciones();

            } else if (seleccionado instanceof Cocinero) {
                System.out.println("\nBienvenido Cocinero " + seleccionado.getNombre() + "!");
                new MenuCocinero().mostrarOpciones();

            } else if (seleccionado instanceof Cajero) {
                System.out.println("\nBienvenido Cajero " + seleccionado.getNombre() + "!");
                new MenuCajero().mostrarOpciones();

            } else if (seleccionado instanceof Repartidor) {
                System.out.println("\nBienvenido Repartidor " + seleccionado.getNombre() + "!");
                new MenuRepartidor().mostrarOpciones();

            } else if (seleccionado instanceof Cliente) {
                Cliente cliente = (Cliente) seleccionado;
                System.out.println("\nBienvenido Cliente " + cliente.getNombre() + "!");
                new MenuCliente(cliente).mostrarOpciones();
            }

            System.out.println("\nSesion finalizada. Volviendo al menu principal...");
        }

        sc.close();
    }
}


