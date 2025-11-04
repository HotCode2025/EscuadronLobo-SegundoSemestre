#15.2 Creamos la clase Orden: Parte 1, 2 y 3,  hacer tarea
from Producto import Producto

class Orden:
    contador_ordenes = 0
    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_producto(self, producto):
        self._productos.append(producto) # para agregar el nuevo producto

    def _calcular_total(self):
        total = 0  # variable temporal para almacenar el total temporal
        for producto in self._productos:
            total += producto.precio
        return total
    
    def __str__(self):
        productos_str = ''
        for producto in self._productos:
            productos_str += producto.__str__() + '|'
        return f'Orden: {self.id_orden}, \nProducto: {productos_str}' 
    
if __name__ == '__main__':  
    producto1 = Producto('Camiseta', 100.00)
    print(producto1)
    producto2 = Producto('Pantalon', 150.00)
    print(producto2)
    productos1 = [producto1, producto2]
    orden1 = Orden(productos1)  # primer objeto pasando la lista de productos
    print(orden1)
    orden2 = Orden(productos1)
    print(orden2)
    # tarea modificar la orden2 ingresando nuevos productos con sus nombres y precios
    # crear una nueva lista de productos y agregarlos a la orden2
    producto3 = Producto("Remera", 200.00)
    producto4 = Producto("Bermuda", 150.00)
    prodcuto5 = Producto("Buzo", 250.00)
    productos2 = [producto3, producto4, prodcuto5]
    orden3 = Orden(productos2)
    print(orden3)
