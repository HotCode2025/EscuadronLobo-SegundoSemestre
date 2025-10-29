class Producto:
    CONTADOR_P = 0

    def __init__(self, Nombre, Precio):
        Producto.CONTADOR_P += 1
        self._Id = Producto.CONTADOR_P
        self._Nombre = Nombre
        self._Precio = Precio

    #metodos setter y getter
    @property
    def nombre(self):
        return self._Nombre
    @nombre.setter
    def nombre(self, Nombre):
        self._Nombre = Nombre

    #metodos setter y getter
    @property
    def precio(self):
         return self._Precio
    @precio.setter
    def precio(self, Precio):
        self._Precio = Precio

    def __str__(self):
        return f"ID: {self._Id}, nombre: {self._Nombre}, precio: {self._Precio}"


#pruebas
if __name__ == "__main__":
    torta = Producto("Torta", 40000)
    pescado = Producto("Pescado", 10000)
    print(torta.__str__())
    print(pescado.__str__())