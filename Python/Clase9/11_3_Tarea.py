class Persona: # Esta clase hereda de la clase Object
    def  __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

class Empleado(Persona): #Esta clase es hija de la clase persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.sueldo = sueldo

empleado1 = Empleado('Carlos', 50, 35000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)



#Tarea: encapsular los atributos y agregar los metodos getters and setters
# Crear otro objeto, pasar los datos para nombre, edad y sueldo
# Mostrar estos datos, luego modificar y mostrar nuevamente