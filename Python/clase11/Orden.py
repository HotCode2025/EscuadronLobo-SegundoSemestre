from Producto import *
class Orden(Producto):
    contadorOrdenes = 0
    def __init__(self, producto):
        Orden.contadorOrdenes += 1
        self._idOrden = Orden.contadorOrdenes
        self._producto = list(producto)

    #añador productos a una lista
    def productoLista(self, producto):
        self._producto.append(producto)

    #caculamos el total
    def calcularTotal(self):
        total = 0
        for producto in self._producto:
            total += producto.precio
        return total

    #imprimimos
    def __str__(self):
        productos_str = ""
        for producto in self._producto:
            productos_str += producto.__str__() + "|"
        return f"orden: {self._idOrden}, productos = {productos_str}"

if __name__ == "__main__":
    torta = Producto("Torta", 40000)
    pescado = Producto("Pescado", 10000)
    print(torta.__str__())
    print(pescado.__str__())
    productos = [torta, pescado]
    orden1 = Orden(productos)
    print(orden1)