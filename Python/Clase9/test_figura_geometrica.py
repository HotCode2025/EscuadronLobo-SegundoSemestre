from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, "azul")
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f"Calculo del área del cuadrado: {cuadrado1.calcular_area()}")

#MRO = Method Resolution Order (forma de saber de donde provinenen las clases padres)
print(Cuadrado.mro()) # Nos muestra el orden en que son llamadas las clases
#[<class 'Cuadrado.Cuadrado'>, <class 'FiguraGeometrica.FiguraGeometrica'>, <class 'Color.Color'>, <class 'object'>]




rectangulo1 = Rectangulo(3, 8, "verde")
print(f"Calculo del area del rectangulo: {rectangulo1.calcular_Area()}")
print(rectangulo1)