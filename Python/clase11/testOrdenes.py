from Orden import *
from Producto import *

#creacion de productos
producto1 = Producto("Torta", 40000)
producto2 = Producto("Pescado", 10000)
producto3 = Producto("papa", 20000)
producto4 = Producto("Asado", 40000)

#agrupacion de productos para la orden
productos = [producto1, producto2]
productos2 = [producto3, producto4]

#orden
orden1 = Orden(productos)
orden2 = Orden(productos2)
#imprimir orden
print(orden1)
print(orden2)

#imprimir total
print(orden1.calcularTotal())
print(orden2.calcularTotal())

#agregar productos a una orden definida
orden2.productoLista(producto1)
print(orden2)
