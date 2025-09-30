# Tarea crear tres objetos mas utilizando los metodos getter and setter
# para modificar y mostrar los cambios con el metodo mostrar detalles

class Personas2:
    def __init__(self, nombre, apellido, edad): # Esta encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalle(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")


    @property #Decorador
    def nombre(self): # Metodo Getter
        print("Estamos utilizando el metodo get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre): # Metodo Setter
        print("Estamos utilizando el metodo set")
        self._nombre = nombre

    @property #Decorador
    def apellido(self): #Metodo Getter
        print("Estamos utilizando el metodo get")
        return self._apellido

    @apellido.setter
    def apellido(self, apellido): #Metodo Setter
        self._apellido = apellido

    @property
    def edad(self):
        print("Estamos en el metodo get")
        return self._edad

    @edad.setter
    def edad(self, edad):
        print("Estamos en el metodo set")
        self._edad = edad

    #Metodo destructor
    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")

if __name__ == "__main__":

# Objeto n°1
    persona2 = Personas2("Luz", "Gómez", 28)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = "Luciana"
    persona2.apellido = "Gómezi"
    persona2.edad = 29
    print(persona2.mostrar_detalle())

# Objeto n°2
    persona3 = Personas2("Mau", "Torres", 24)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = "Mauricio"
    persona3.apellido = "Torre"
    persona3.edad = 26
    print(persona3.mostrar_detalle())

# Objeto n°3
    persona4 = Personas2("Ana", "Rivas", 32)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = "Anabella"
    persona4.apellido = "Rivasi"
    persona4.edad = 30
    print(persona4.mostrar_detalle())

print(__name__)