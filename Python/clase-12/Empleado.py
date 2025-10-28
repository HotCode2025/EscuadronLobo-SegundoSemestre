class Empleado:
    def __init__(self, nombre, sueldo):
        self.nombre = nombre
        self.sueldo = sueldo

    def __str__(self):
        return f"Empleado: [nombre: {self.nombre}, sueldo: {self.sueldo}]"

    def mostrarDetalle(self):
        return self.__str__()

