# CLASE 12 POO Parte 9 Polimorfísmo
# Creamos la Clase Gerente (video 3 Py)

# Importamos la clase padre (superclase) para poder heredar sus atributos y métodos.
from Empleado import *


# Clase Hija: Gerente hereda de Empleado (un Gerente ES UN Empleado).
class Gerente(Empleado):

    # --- Constructor (Método de Inicialización) ---
    # Un gerente tiene sus propios atributos (departamento) más los heredados (nombre, sueldo).
    def __init__(self, departamento, nombre, sueldo):
        # 1. Llamada al constructor de la clase padre (Empleado).
        # Inicializa los atributos 'nombre' y 'sueldo' que son comunes a todos los empleados.
        super().__init__(nombre, sueldo)

        # 2. Inicialización de los atributos propios de la clase Gerente.
        self.departamento = departamento  # Atributo específico del Gerente.

    # --- Método Especial de Representación (String) ---
    # Sobreescribimos el método __str__ para mostrar la información del Gerente.
    # Esta es una forma de Polimorfismo, ya que diferentes clases (Empleado, Gerente)
    # responden al mismo método (__str__) de manera diferente.
    def __str__(self):
        # 1. Agregamos la información específica de Gerente (Departamento).
        # 2. Llamamos al método __str__ de la clase padre (super().__str__())
        #    para obtener la representación base del Empleado (nombre y sueldo),
        #    evitando duplicar ese código.
        return f"Gerente: [Departamento: {self.departamento}] {super().__str__()}"