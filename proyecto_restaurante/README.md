<img width="1536" height="856" alt="20251104_2318_Logo Restaurante Lobo_simple_compose_01k98wts0qe739y6yv6spn9zv51" src="https://github.com/user-attachments/assets/43c863c0-e8ca-499a-9775-b87aa38acb98" />


# Sistema de Gestión de Restaurante

Sistema integral de gestión de restaurante desarrollado en Java puro, que permite administrar usuarios, pedidos, menú, inventario, ventas y mesas a través de una interfaz de consola interactiva.

## Descripción

Este proyecto es un sistema completo de gestión para restaurantes que implementa un modelo de negocio basado en roles, donde diferentes tipos de usuarios (administradores, empleados y clientes) tienen acceso a funcionalidades específicas según sus permisos.

## Características Principales

### Gestión de Usuarios
- Sistema de autenticación con login seguro
- Registro de nuevos clientes
- Múltiples roles de usuario:
  - **Administrador**: Control total del sistema
  - **Mozo**: Gestión de pedidos y mesas
  - **Cocinero**: Recepción y preparación de pedidos
  - **Cajero**: Gestión de pagos y facturación
  - **Repartidor**: Seguimiento de entregas a domicilio
  - **Cliente**: Realización de pedidos y consultas

### Gestión de Pedidos
- Creación de pedidos (locales y delivery)
- Seguimiento del estado del pedido en tiempo real
- Estados: Pendiente → Preparando → Listo → Entregado
- Modificación de pedidos activos
- Historial de pedidos por cliente
- Función de repetir pedidos anteriores

### Gestión de Menú
- Catálogo completo de platos
- Categorías: Entradas, Platos Principales, Postres, Bebidas
- CRUD completo de platos (Crear, Leer, Actualizar, Eliminar)
- Filtrado por categorías
- Búsqueda de platos

### Gestión de Inventario
- Control de stock de insumos
- Registro de entradas (compras)
- Registro de salidas (uso en cocina)
- Alertas de stock bajo
- Visualización de estado del inventario

### Gestión de Ventas y Facturación
- Registro automático de ventas
- Generación de facturas
- Reportes de ventas por día
- Reportes de ventas por cliente
- Cálculo automático de totales
- Impresión de recibos

### Gestión de Mesas
- Control de disponibilidad de mesas
- Estados: Libre, Ocupada
- Asignación de mozos a mesas
- Vinculación de mesas con pedidos

## Tecnologías Utilizadas

- **Lenguaje**: Java (JDK 8+)
- **Paradigma**: Programación Orientada a Objetos
- **Interfaz**: Consola/Terminal (CLI)
- **Almacenamiento**: En memoria (ArrayList)
- **IDE**: IntelliJ IDEA

## Estructura del Proyecto

```
proyecto_restaurante/
├── src/
│   ├── domain/
│   │   ├── usuarios/           # Clases de usuarios y roles
│   │   │   ├── Usuario.java
│   │   │   ├── Administrador.java
│   │   │   ├── Empleado.java
│   │   │   ├── Mozo.java
│   │   │   ├── Cocinero.java
│   │   │   ├── Cajero.java
│   │   │   ├── Repartidor.java
│   │   │   └── Cliente.java
│   │   ├── modulo/             # Lógica de negocio y modelos
│   │   │   ├── GestionUsuario.java
│   │   │   ├── GestionPedidos.java
│   │   │   ├── GestionMenu.java
│   │   │   ├── GestionInventario.java
│   │   │   ├── GestionVentas.java
│   │   │   ├── GestionFacturacion.java
│   │   │   ├── GestionMesa.java
│   │   │   ├── Pedido.java
│   │   │   ├── Plato.java
│   │   │   ├── Mesa.java
│   │   │   ├── Insumo.java
│   │   │   ├── Venta.java
│   │   │   ├── Factura.java
│   │   │   └── PrecargaDatos.java
│   │   └── menus/              # Interfaces de usuario
│   │       ├── MenuAdministrador.java
│   │       ├── MenuMozo.java
│   │       ├── MenuCocinero.java
│   │       ├── MenuCajero.java
│   │       ├── MenuRepartidor.java
│   │       └── MenuCliente.java
│   └── test/
│       └── RestauranteApp.java  # Punto de entrada principal
├── out/                         # Archivos compilados
└── README.md
```

## Requisitos del Sistema

- Java Development Kit (JDK) 8 o superior
- IntelliJ IDEA (recomendado) o cualquier IDE compatible con Java
- Sistema Operativo: Windows, Linux o macOS

## Instalación

1. Clonar el repositorio:
```bash
git clone https://github.com/HotCode2025/EscuadronLobo-SegundoSemestre.git
cd proyecto_restaurante
```

2. Abrir el proyecto en IntelliJ IDEA:
   - File → Open → Seleccionar la carpeta del proyecto

3. Asegurarse de que el JDK esté configurado:
   - File → Project Structure → Project → SDK

## Ejecución

### Desde IntelliJ IDEA:
1. Navegar a `src/test/RestauranteApp.java`
2. Click derecho → Run 'RestauranteApp.main()'

### Desde la línea de comandos:
```bash
# Compilar
javac -d out src/test/RestauranteApp.java src/domain/**/*.java

# Ejecutar
java -cp out test.RestauranteApp
```

## Uso del Sistema

### Datos de Prueba Precargados

El sistema incluye datos de prueba para facilitar las pruebas:

**Usuarios:**
- Admin: `admin` / `1234`
- Mozo: `mozo1` / `mozo123`
- Cocinero: `cocina1` / `cocina123`
- Cajero: `cajero1` / `caja123`
- Repartidor: `reparto1` / `reparto123`
- Cliente: `cliente1` / `cliente123`

### Flujo de Trabajo Típico

1. **Cliente** se registra o inicia sesión
2. **Cliente** visualiza el menú y crea un pedido
3. **Mozo** recibe el pedido y lo asigna a una mesa
4. **Cocinero** marca el pedido como "En preparación"
5. **Cocinero** marca el pedido como "Listo"
6. **Cajero** genera la factura y procesa el pago
7. **Repartidor** (si es delivery) gestiona la entrega
8. **Administrador** revisa reportes de ventas e inventario

## Funcionalidades por Rol

### Administrador
- Gestión completa de usuarios (CRUD)
- Gestión de menú
- Gestión de inventario
- Reportes de ventas
- Configuración de mesas
- Acceso a todas las funcionalidades

### Mozo
- Tomar pedidos
- Gestionar mesas
- Ver estado de pedidos
- Asignar pedidos a mesas

### Cocinero
- Ver pedidos pendientes
- Marcar pedidos en preparación
- Marcar pedidos como listos

### Cajero
- Generar facturas
- Registrar pagos
- Ver historial de ventas

### Repartidor
- Ver pedidos de delivery
- Actualizar estado de entregas

### Cliente
- Ver menú
- Realizar pedidos
- Ver historial de pedidos
- Consultar saldo
- Repetir pedidos anteriores

## Arquitectura del Sistema

### Patrón de Diseño
- **MVC Simplificado**: Separación entre modelos (domain/modulo), vistas (menus) y lógica de negocio
- **Herencia**: Jerarquía de usuarios (Usuario → Empleado/Cliente → Roles específicos)
- **Gestores**: Clases de gestión para cada módulo del negocio

### Modelos de Datos

**Usuario**
- Clase base abstracta
- Atributos: nombre, apellido, dni, email, contraseña, rol

**Pedido**
- ID único
- Cliente asociado
- Lista de platos
- Mesa (si es local)
- Estado del pedido
- Tipo (local/delivery)

**Plato**
- Nombre
- Tipo (entrada, principal, postre, bebida)
- Precio

**Mesa**
- Número
- Estado (libre/ocupada)
- Mozo asignado

## Características Técnicas

- **Colecciones**: Uso extensivo de ArrayList y Stream API
- **Validaciones**: Validación de entrada de usuario
- **Manejo de errores**: Try-catch para operaciones críticas
- **Formateo**: Uso de emojis y formato de consola para mejor UX
- **Búsquedas**: Algoritmos de búsqueda y filtrado eficientes
- **IDs únicos**: Generación automática de IDs para pedidos, facturas y ventas

