from Empleado import *
class Gerente(Empleado):
    def __init__(self, departamento, nombre, sueldo):

        super().__init__(nombre, sueldo)
        self.departamento = departamento

    def __str__(self):
        return f"Gerente: [departamento: {self.departamento}. {super().__str__()}"