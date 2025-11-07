
#Crear una clase llamada Rectangulo, debe tenér 2 atributos: altura y base el nombre del método será calcular area utilizando la formula:
#area base altura. Pero la base y la altura deben ser ingresadas por el usuario y los objetos deben ser tres.

class triangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def operacion(self):
        area = self.base * self.altura
        return area

#definimos los datos
base = int(input("Ingresa la base: "))
altura = int(input("Ingresa la altura: "))

#guarda la clase y pasa los datos definidos como argumento
triangulo1 = triangulo(base, altura)

#lama ala operacion de la clase triangulo guardado en triangulo1
print(triangulo1.operacion())

