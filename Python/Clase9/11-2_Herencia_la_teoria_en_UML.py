class Persona: #Clase Padre
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad
    
    @property
    def nombre(self): # Método Getter
        print('Estamos utilizando el método get')
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre): # Método Setter
        print('Estamos utilizando el método set')
        self._nombre = nombre
    
    @property
    def edad(self): # Método Getter
        print('Estamos utilizando el método get')
        return self._edad
    
    @edad.setter
    def edad(self, edad): # Método Setter
        print('Estamos utilizando el método set')
        self._edad = edad

class Empleado(Persona): #Clase Hija
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo
    
    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._edad} {self._sueldo}")
    
    @property
    def sueldo(self): # Método Getter
        print('Estamos utilizando el método get')
        return self._sueldo
    
    @sueldo.setter
    def sueldo(self, sueldo): # Método Setter
        print('Estamos utilizando el método set')
        self._sueldo = sueldo

empleado1 = Empleado('Dario', 42, 95000)
print(empleado1)
print(empleado1._nombre)
print(empleado1._edad)
print(empleado1._sueldo)

# Tarea:
empleado2 = Empleado('Andrea', 42, 100000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
empleado2.nombre = 'Luciano'
empleado2.edad = 13
empleado2.sueldo = 50000
empleado2.mostrar_detalles()