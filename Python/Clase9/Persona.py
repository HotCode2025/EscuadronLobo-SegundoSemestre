class Persona:

    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __str__(self): #Override = sobrescribir
        return f'Persona: [Nombre: {self._nombre}. Edad: {self._edad}'


class Empleado(Persona): #Asi le asignamos una clase hija a la clase padre

    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f"Empleado: [sueldo: {self._sueldo} {super().__str__()}"

empleado1 = Empleado("Juan",  32, 75000)
print(empleado1.nombre)
print(empleado1.edad)