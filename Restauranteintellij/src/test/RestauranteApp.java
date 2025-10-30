package test;

import domain.menus.*;
import domain.modulo.GestionUsuario;
import domain.modulo.PrecargaDatos;
import domain.usuarios.*;

import java.util.List;
import java.util.Scanner;

public class RestauranteApp {
    public static void main(String[] args) {
        // Cargar datos de prueba
        PrecargaDatos.cargarDatos();

        List<Usuario> usuarios = PrecargaDatos.usuarios;
        Scanner sc = new Scanner(System.in);

        System.out.println("🍽 ️ SISTEMA DE GESTIÓN DE RESTAURANTE");

        while (true) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1️⃣  Iniciar sesión");
            System.out.println("2️⃣  Registrarse (solo clientes)");
            System.out.println("0️⃣  Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine();

            if (opcion.equals("0")) {
                System.out.println("\n👋 Gracias por usar el sistema. ¡Hasta luego!");
                break;
            }

            Usuario seleccionado = null;

            // --- OPCIÓN DE REGISTRO ---
            if (opcion.equals("2")) {
                System.out.println("\n📝 REGISTRO DE NUEVO CLIENTE");
                System.out.print("Nombre completo: ");
                String nombre = sc.nextLine();

                System.out.print("DNI: ");
                String dni = sc.nextLine();

                System.out.print("Nombre de usuario: ");
                String usuario = sc.nextLine();

                // Verificar si ya existe
                boolean existe = usuarios.stream().anyMatch(u -> u.getUsuario().equalsIgnoreCase(usuario));
                if (existe) {
                    System.out.println("⚠️ Ese nombre de usuario ya está en uso. Intente con otro.");
                    continue;
                }

                System.out.print("Contraseña: ");
                String contrasena = sc.nextLine();

                System.out.print("Teléfono: ");
                String telefono = sc.nextLine();

                System.out.print("Dirección: ");
                String direccion = sc.nextLine();

                System.out.print("Saldo inicial: ");
                double saldo = 0;
                try {
                    saldo = Double.parseDouble(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Valor inválido. Se asignará saldo 0 por defecto.");
                }

                Cliente nuevoCliente = new Cliente(nombre, dni, usuario, contrasena, saldo, telefono, direccion);
                usuarios.add(nuevoCliente);

                System.out.println("\n✅ Registro exitoso. ¡Bienvenido, " + nombre + "!");
                seleccionado = nuevoCliente; // entra directo a su menú
            }

            // --- OPCIÓN DE INICIO DE SESIÓN ---
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
                        System.out.println("❌ Usuario no encontrado. Intente nuevamente.");
                        continue;
                    }

                    System.out.print("Ingrese la contraseña: ");
                    String clave = sc.nextLine();

                    if (seleccionado.getContrasena().equals(clave)) {
                        System.out.println("✅ Inicio de sesión exitoso.");
                        break;
                    } else {
                        System.out.println("❌ Contraseña incorrecta.");
                        seleccionado = null;
                    }
                }
            } else {
                System.out.println("⚠️ Opción inválida. Intente de nuevo.");
                continue;
            }

            // Si no se logró iniciar sesión, vuelve al menú principal
            if (seleccionado == null) continue;

            // --- MENÚ SEGÚN EL TIPO DE USUARIO ---
            if (seleccionado instanceof Administrador) {
                System.out.println("\n👑 ¡Bienvenido Administrador " + seleccionado.getNombre() + "!");
                GestionUsuario.setAdminActual((Administrador) seleccionado);
                new MenuAdministrador(new GestionUsuario()).mostrarOpciones();

            } else if (seleccionado instanceof Mozo) {
                System.out.println("\n🧍‍♂️ ¡Bienvenido Mozo " + seleccionado.getNombre() + "!");
                new MenuMozo().mostrarOpciones();

            } else if (seleccionado instanceof Cocinero) {
                System.out.println("\n👨‍🍳 ¡Bienvenido Cocinero " + seleccionado.getNombre() + "!");
                new MenuCocinero().mostrarOpciones();

            } else if (seleccionado instanceof Cajero) {
                System.out.println("\n💵 ¡Bienvenido Cajero " + seleccionado.getNombre() + "!");
                new MenuCajero().mostrarOpciones();

            } else if (seleccionado instanceof Repartidor) {
                System.out.println("\n🚴‍♂️ ¡Bienvenido Repartidor " + seleccionado.getNombre() + "!");
                new MenuRepartidor().mostrarOpciones();

            } else if (seleccionado instanceof Cliente) {
                Cliente cliente = (Cliente) seleccionado;
                System.out.println("\n📱 ¡Bienvenido Cliente " + cliente.getNombre() + "!");
                new MenuCliente(cliente).mostrarOpciones();
            }

            System.out.println("\n🔒 Sesión finalizada. Volviendo al menú principal...");
        }

        sc.close();
    }
}

