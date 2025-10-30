package domain.modulo;

import domain.usuarios.*;
import java.util.*;

public class GestionUsuario {
    private static final Scanner scanner = new Scanner(System.in);

    // Lista única de usuarios compartida (precargada desde PrecargaDatos)
    public static List<Usuario> usuarios = new ArrayList<>(PrecargaDatos.usuarios);

    public GestionUsuario() {
        usuarios = new ArrayList<>();
        // Podrías cargar usuarios de PrecargaDatos
        usuarios.addAll(PrecargaDatos.usuarios);
    }

    // Métodos para el menú Administrador

    public static void listarUsuarios() {
    System.out.println("\n📋 LISTA DE USUARIOS DEL SISTEMA:");
    System.out.println("---------------------------------------");

    for (Usuario u : usuarios) {
        if (u instanceof Administrador) {
            Administrador admin = (Administrador) u;
            System.out.println("👑 ADMINISTRADOR");
            System.out.println("   Nombre: " + admin.getNombre());
            System.out.println("   DNI: " + admin.getDni());
            System.out.println("   Usuario: " + admin.getUsuario());
            System.out.println("   Sucursal: " + admin.getSucursal());
            System.out.println("   Permisos: " + String.join(", ", admin.getPermisos()));
            System.out.println("--------------------------------------------");
        } 
        else if (u instanceof Mozo) {
            Mozo mozo = (Mozo) u;
            System.out.println("🍽️ MOZO");
            System.out.println("   Nombre: " + mozo.getNombre());
            System.out.println("   DNI: " + mozo.getDni());
            System.out.println("   Usuario: " + mozo.getUsuario());
            System.out.println("   Sucursal: " + mozo.getSucursal());
            System.out.println("──────────────────────────────────────────");
        }
        else if (u instanceof Cocinero) {
            Cocinero cocinero = (Cocinero) u;
            System.out.println("👨‍🍳 COCINERO");
            System.out.println("   Nombre: " + cocinero.getNombre());
            System.out.println("   DNI: " + cocinero.getDni());
            System.out.println("   Usuario: " + cocinero.getUsuario());
            System.out.println("   Sucursal: " + cocinero.getSucursal());
            System.out.println("──────────────────────────────────────────");
        }
        else if (u instanceof Cajero) {
            Cajero cajero = (Cajero) u;
            System.out.println("💰 CAJERO");
            System.out.println("   Nombre: " + cajero.getNombre());
            System.out.println("   DNI: " + cajero.getDni());
            System.out.println("   Usuario: " + cajero.getUsuario());
            System.out.println("   Sucursal: " + cajero.getSucursal());
            System.out.println("──────────────────────────────────────────");
        }
        else if (u instanceof Repartidor) {
            Repartidor rep = (Repartidor) u;
            System.out.println("🏍️ REPARTIDOR");
            System.out.println("   Nombre: " + rep.getNombre());
            System.out.println("   DNI: " + rep.getDni());
            System.out.println("   Usuario: " + rep.getUsuario());
            System.out.println("   Vehículo: " + rep.getVehiculo());
            System.out.println("   Sucursal: " + rep.getSucursal());
            System.out.println("──────────────────────────────────────────");
        }
        else if (u instanceof Cliente) {
            Cliente cliente = (Cliente) u;
            System.out.println("🧍 CLIENTE");
            System.out.println("   Nombre: " + cliente.getNombre());
            System.out.println("   DNI: " + cliente.getDni());
            System.out.println("   Usuario: " + cliente.getUsuario());
            System.out.println("   Saldo: $" + cliente.getSaldo());
            System.out.println("   Teléfono: " + cliente.getTelefono());
            System.out.println("   Dirección: " + cliente.getDireccion());
            System.out.println("──────────────────────────────────────────");
        }
    }
}


    // Agregar un usuario
    public static void agregarUsuario() {
        System.out.println("→ Agregar nuevo usuario");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        System.out.println("Tipo de usuario: 1-Administrador 2-Mozo 3-Cocinero 4-Cajero 5-Repartidor 6-Cliente");
        int tipo = Integer.parseInt(scanner.nextLine());
        Usuario nuevo = null;

        switch (tipo) {
            case 1 -> {
                System.out.print("Sucursal: ");
                String sucursal = scanner.nextLine();
                System.out.print("Permisos (separados por coma): ");
                String permisos = scanner.nextLine();
                nuevo = new Administrador(nombre, dni, usuario, contrasena,
                        Arrays.asList(permisos.split(",")), sucursal);
            }
            case 2 -> {
                System.out.print("Sucursal: ");
                String sucursal = scanner.nextLine();
                nuevo = new Mozo(nombre, dni, usuario, contrasena, sucursal);
            }
            case 3 -> {
                System.out.print("Sucursal: ");
                String sucursal = scanner.nextLine();
                nuevo = new Cocinero(nombre, dni, usuario, contrasena, sucursal);
            }
            case 4 -> {
                System.out.print("Sucursal: ");
                String sucursal = scanner.nextLine();
                nuevo = new Cajero(nombre, dni, usuario, contrasena, sucursal);
            }
            case 5 -> {
                System.out.print("Sucursal: ");
                String sucursal = scanner.nextLine();
                System.out.print("Vehículo: ");
                String vehiculo = scanner.nextLine();
                nuevo = new Repartidor(nombre, dni, usuario, contrasena, sucursal, vehiculo);
            }
            case 6 -> {
                System.out.print("Saldo inicial: ");
                double saldo = Double.parseDouble(scanner.nextLine());
                System.out.print("Teléfono: ");
                String telefono = scanner.nextLine();
                System.out.print("Dirección: ");
                String direccion = scanner.nextLine();
                nuevo = new Cliente(nombre, dni, usuario, contrasena, saldo, telefono, direccion);
            }
            default -> System.out.println("❌ Tipo de usuario no válido.");
        }

        if (nuevo != null) {
            // Validar que no exista mismo usuario o DNI
            for (Usuario existente : usuarios) {
                if (existente.getUsuario().equalsIgnoreCase(nuevo.getUsuario())) {
                    System.out.println("❌ Ya existe un usuario con ese nombre de usuario");
                    return;
                }
                if (existente.getDni().equals(nuevo.getDni())) {
                    System.out.println("❌ Ya existe un usuario con ese DNI");
                    return;
                }
            }
            usuarios.add(nuevo);
            System.out.println("✅ Usuario agregado correctamente: " + nuevo.getNombre());
        }
    }

    public static void modificarUsuario() {
        System.out.println("→ Modificar usuario");
        System.out.print("Ingrese el nombre del usuario a modificar: ");
        String nombreViejo = scanner.nextLine();

        Usuario existente = buscarUsuario(nombreViejo);
        if (existente == null) {
            System.out.println("❌ Usuario no encontrado: " + nombreViejo);
            return;
        }

        System.out.println("Datos actuales del usuario:");
        System.out.println("Nombre: " + existente.getNombre());
        System.out.println("DNI: " + existente.getDni());
        System.out.println("Usuario: " + existente.getUsuario());

        System.out.println("\nIngrese los nuevos datos (dejar vacío para mantener el valor actual):");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        if (nombre.isEmpty()) nombre = existente.getNombre();

        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        if (dni.isEmpty()) dni = existente.getDni();

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        if (usuario.isEmpty()) usuario = existente.getUsuario();

        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();
        if (contrasena.isEmpty()) contrasena = existente.getContrasena();

        System.out.println("Tipo de usuario: 1-Administrador 2-Mozo 3-Cocinero 4-Cajero 5-Repartidor 6-Cliente");
        int tipo;
        try {
            tipo = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("❌ Tipo inválido. Se mantiene el tipo anterior.");
            tipo = -1;
        }

        Usuario nuevo = null;

        switch (tipo) {
            case 1 -> {
                System.out.print("Sucursal: ");
                String sucursal = scanner.nextLine();
                System.out.print("Permisos (separados por coma): ");
                String permisos = scanner.nextLine();
                nuevo = new Administrador(nombre, dni, usuario, contrasena,
                        Arrays.asList(permisos.split(",")), sucursal);
            }
            case 2 -> {
                System.out.print("Sucursal: ");
                String sucursal = scanner.nextLine();
                nuevo = new Mozo(nombre, dni, usuario, contrasena, sucursal);
            }
            case 3 -> {
                System.out.print("Sucursal: ");
                String sucursal = scanner.nextLine();
                nuevo = new Cocinero(nombre, dni, usuario, contrasena, sucursal);
            }
            case 4 -> {
                System.out.print("Sucursal: ");
                String sucursal = scanner.nextLine();
                nuevo = new Cajero(nombre, dni, usuario, contrasena, sucursal);
            }
            case 5 -> {
                System.out.print("Sucursal: ");
                String sucursal = scanner.nextLine();
                System.out.print("Vehículo: ");
                String vehiculo = scanner.nextLine();
                nuevo = new Repartidor(nombre, dni, usuario, contrasena, sucursal, vehiculo);
            }
            case 6 -> {
                System.out.print("Saldo inicial: ");
                double saldo = Double.parseDouble(scanner.nextLine());
                System.out.print("Teléfono: ");
                String telefono = scanner.nextLine();
                System.out.print("Dirección: ");
                String direccion = scanner.nextLine();
                nuevo = new Cliente(nombre, dni, usuario, contrasena, saldo, telefono, direccion);
            }
            default -> {
                System.out.println("❌ Manteniendo el tipo de usuario anterior.");
                nuevo = existente; // mantiene el tipo original si no se elige un tipo válido
            }
        }

        // Reemplaza el usuario antiguo por el nuevo en la lista
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNombre().equalsIgnoreCase(nombreViejo)) {
                usuarios.set(i, nuevo);
                System.out.println("✅ Usuario modificado correctamente: " + nombreViejo);
                return;
            }
        }
    }

    public static void eliminarUsuario() {
        System.out.println("→ Eliminar usuario");
        System.out.print("Ingrese el nombre del usuario a eliminar: ");
        String nombre = scanner.nextLine();

        Usuario existente = buscarUsuario(nombre);
        if (existente == null) {
            System.out.println("❌ Usuario no encontrado: " + nombre);
            return;
        }

        usuarios.removeIf(u -> u.getNombre().equalsIgnoreCase(nombre));
        System.out.println("✅ Usuario eliminado correctamente: " + nombre);
    }

   public static void buscarUsuarioPorConsola() {
    System.out.println("→ Buscar usuario");
    System.out.print("Ingrese el nombre del usuario a buscar: ");
    String nombre = scanner.nextLine();

    Usuario u = buscarUsuario(nombre);
    if (u == null) {
        System.out.println("❌ Usuario no encontrado: " + nombre);
        return;
    }

    // Mostrar datos según tipo
    if (u instanceof Administrador) {
        Administrador admin = (Administrador) u;
        System.out.println("👑 ADMINISTRADOR");
        System.out.println("   Nombre: " + admin.getNombre());
        System.out.println("   DNI: " + admin.getDni());
        System.out.println("   Usuario: " + admin.getUsuario());
        System.out.println("   Sucursal: " + admin.getSucursal());
        System.out.println("   Permisos: " + String.join(", ", admin.getPermisos()));
    } 
    else if (u instanceof Mozo) {
        Mozo mozo = (Mozo) u;
        System.out.println("🍽️ MOZO");
        System.out.println("   Nombre: " + mozo.getNombre());
        System.out.println("   DNI: " + mozo.getDni());
        System.out.println("   Usuario: " + mozo.getUsuario());
        System.out.println("   Sucursal: " + mozo.getSucursal());
    } 
    else if (u instanceof Cocinero) {
        Cocinero cocinero = (Cocinero) u;
        System.out.println("👨‍🍳 COCINERO");
        System.out.println("   Nombre: " + cocinero.getNombre());
        System.out.println("   DNI: " + cocinero.getDni());
        System.out.println("   Usuario: " + cocinero.getUsuario());
        System.out.println("   Sucursal: " + cocinero.getSucursal());
    } 
    else if (u instanceof Cajero) {
        Cajero cajero = (Cajero) u;
        System.out.println("💰 CAJERO");
        System.out.println("   Nombre: " + cajero.getNombre());
        System.out.println("   DNI: " + cajero.getDni());
        System.out.println("   Usuario: " + cajero.getUsuario());
        System.out.println("   Sucursal: " + cajero.getSucursal());
    } 
    else if (u instanceof Repartidor) {
        Repartidor rep = (Repartidor) u;
        System.out.println("🏍️ REPARTIDOR");
        System.out.println("   Nombre: " + rep.getNombre());
        System.out.println("   DNI: " + rep.getDni());
        System.out.println("   Usuario: " + rep.getUsuario());
        System.out.println("   Vehículo: " + rep.getVehiculo());
        System.out.println("   Sucursal: " + rep.getSucursal());
    } 
    else if (u instanceof Cliente) {
        Cliente cliente = (Cliente) u;
        System.out.println("🧍 CLIENTE");
        System.out.println("   Nombre: " + cliente.getNombre());
        System.out.println("   DNI: " + cliente.getDni());
        System.out.println("   Usuario: " + cliente.getUsuario());
        System.out.println("   Saldo: $" + cliente.getSaldo());
        System.out.println("   Teléfono: " + cliente.getTelefono());
        System.out.println("   Dirección: " + cliente.getDireccion());
    }
}



    public static Usuario buscarUsuario(String nombre) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) {
                return u;
            }
        }
        return null;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    // Variable estática para el admin "actual"
    public static Administrador adminActual;

    // Asignar el administrador logueado
    public static void setAdminActual(Administrador admin) {
        adminActual = admin;
    }

    public static void cambiarContrasenaAdministrador() {
        if (adminActual == null) {
            System.out.println("⚠️ No hay administrador logueado.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nueva contraseña: ");
        String nueva = scanner.nextLine();
        adminActual.setContrasena(nueva);
        System.out.println("✅ Contraseña actualizada para " + adminActual.getNombre());
    }

    public static void gestionarSucursales() {
        if (adminActual == null) {
            System.out.println("⚠️ No hay administrador logueado.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre de la sucursal a actualizar: ");
        String sucursal = scanner.nextLine();
        adminActual.setSucursal(sucursal);
        System.out.println("✅ Sucursal actualizada: " + adminActual.getSucursal());
    }

    public static void configurarParametrosSistema() {
        if (adminActual == null) {
            System.out.println("⚠️ No hay administrador logueado.");
            return;
        }
        System.out.println("→ Configurando parámetros del sistema...");
        System.out.println("✅ Parámetros configurados para la sucursal " + adminActual.getSucursal());
    }

    public static void respaldoYRestauracion() {
        if (adminActual == null) {
            System.out.println("⚠️ No hay administrador logueado.");
            return;
        }
        System.out.println("→ Respaldando/restaurando datos de la sucursal " + adminActual.getSucursal() + "...");
        System.out.println("✅ Operación completada.");
    }

    // 🔹 Editar datos personales del cliente
    public static void editarDatos(Cliente cliente) {
        System.out.print("Ingrese nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        System.out.print("Ingrese nuevo DNI: ");
        String nuevoDni = scanner.nextLine();
        System.out.print("Ingrese nueva dirección: ");
        String nuevaDireccion = scanner.nextLine();
        System.out.print("Ingrese nuevo teléfono: ");
        String nuevoTelefono = scanner.nextLine();

        cliente.setNombre(nuevoNombre);
        cliente.setDni(nuevoDni);
        cliente.setDireccion(nuevaDireccion);
        cliente.setTelefono(nuevoTelefono);

        System.out.println("✅ Datos personales actualizados.");
    }

    // 🔹 Cambiar contraseña del cliente
    public static void cambiarContrasena(Cliente cliente) {
        System.out.print("Ingrese nueva contraseña: ");
        String nueva = scanner.nextLine();
        cliente.setContrasena(nueva);
        System.out.println("✅ Contraseña actualizada.");
    }
}

