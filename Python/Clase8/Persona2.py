class Persona2:
    def __init__(self,nombre,apellido,edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles (self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre}{self._apellido}{self._edad}")

    @property # Decorador
    def nombre(self): # Metodo getter
        print("Utilizando el metodo getter")
        return self._nombre

    @nombre.setter # Metodo setter
    def nombre(self, nombre):
        print("Utilizando el metodo setter")
        self._nombre = nombre

    @property # Decorador
    def apellido(self): # Metodo getter
        print("Utilizando el metodo getter")
        return self._apellido

    @apellido.setter # Metodo setter
    def apellido(self, apellido):
        print("Utilizando el metodo setter")
        self._apellido = apellido

    @property # Decorador
    def edad(self): # Metodo getter
        print("Utilizando el metodo getter")
        return self._edad

    @edad.setter # Metodo setter
    def edad(self, edad):
        print("Utilizando el metodo setter")
        self._edad = edad

    def __del__(self):
        print(f"Persona2: {self._nombre}{self._apellido}{self._edad}")

if __name__== '__main__':
    persona1 = Persona2('Facundo', 'Moreno',31)
    print(persona1._nombre) #Llamamos al metodo getter
    print(persona1.apellido)
    print(persona1.edad)
    persona1.nombre = 'Juan Pedro' #Llamamos el metodo setter
    print(persona1.nombre) #Otra vez con el metodo getter
    print(persona1.mostrar_detalles()) #Llamamos el metodo mostras detalles
    #Atributo read-only seria la edad porque no tiene el metodo ser
    print(persona1.edad)

  

    print(__name__)