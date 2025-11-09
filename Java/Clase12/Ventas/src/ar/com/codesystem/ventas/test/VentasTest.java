
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;


public class VentasTest {
    public static void main(String[] args) {
   Producto producto1 = new Producto("Pantalon", 9500.00);
   Producto producto2 = new Producto("Campera", 29900.00);
   
   Orden orden1 = new Orden();
   //Agregamos productos al arreglo
   orden1.agregarProducto(producto1);
   orden1.agregarProducto(producto2);
   orden1.mostrarOrden();
   
   //TAREA: CREAR MAS OBJETOS DE TIPO PRODUCTO = 10
   //CREAR MAS OBJETOS DE TIPO ORDEN =2
   
   Producto producto3 = new Producto("Remera", 7500.00);
   Producto producto4 = new Producto("Polera", 8000.00);
   Producto producto5 = new Producto("Camisa", 15500.00);
   Producto producto6 = new Producto("Musculosa", 8500.00);
   Producto producto7 = new Producto("Chaleco", 23000.00);
   Producto producto8 = new Producto("Zapatilla", 70000.00);
   Producto producto9 = new Producto("Zapato", 50000.00);
   Producto producto10 = new Producto("Cinturon", 6500.00);
   Producto producto11 = new Producto("Medias", 3500.00);
   Producto producto12 = new Producto("Corbata", 5000.00);
   
   Orden orden2 = new Orden();
   orden2.agregarProducto(producto7);
   orden2.agregarProducto(producto4);
   orden2.agregarProducto(producto11);
   orden2.mostrarOrden();
   
   Orden orden3 = new Orden();
   orden3.agregarProducto(producto8);
   orden3.agregarProducto(producto11);
   orden3.agregarProducto(producto3);
   orden3.agregarProducto(producto5);
   orden3.mostrarOrden();
   
    }
}
