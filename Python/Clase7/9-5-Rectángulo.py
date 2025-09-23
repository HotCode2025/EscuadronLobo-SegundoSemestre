# 9.5 Creamos la clase: Rectángulo
'''
Crear una clase llamada rectangulo, debe tener 2 atributos:
altura y base el nombre del metodo sera calcuar area utilizando
la formula: area = base * altura. Pero la base y la altura deben
ser ingresadas por el usuario y los objetos deben ser tres.
'''

class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    
    def area(self):
        return self.base * self.altura
Area = Rectangulo(8, 5)
print(Area.area())

# definidos por el usuairo

class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    
    def area(self):
        return self.base * self.altura

rectangulos = []

for i in range(3):
    print(f"\nRectángulo {i+1}:")
    base = float(input("Ingrese la base: "))
    altura = float(input("Ingrese la altura: "))
    rect = Rectangulo(base, altura)
    rectangulos.append(rect)

# Mostrar las áreas
for i, rect in enumerate(rectangulos, start=1):
    print(f"El área del rectángulo {i} es: {rect.area()}")