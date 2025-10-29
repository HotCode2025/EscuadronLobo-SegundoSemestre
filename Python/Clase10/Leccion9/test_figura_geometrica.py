from Cuadrado import Cuadrado
from Rectangulo import Rectangulo
from FiguraGeometrica import FiguraGeometrica

print('Creación de objero clase Cuadrado'.center(50,'_'))
cuadrado1 = Cuadrado(8, 'Azul')
cuadrado1.alto = 7
cuadrado1.ancho = 7
#rint(f'Alto: {cuadrado1.alto}')
#print(f'Ancho: {cuadrado1.ancho}')
print(f'Calculo del Area del Cuadrado: {cuadrado1.calcular_area()}')
print(cuadrado1)

# MRO = Method Resolution Order
#print(Cuadrado.mro())

print('Creación de objero clase Rectangulo'.center(50,'_'))
rectangulo1 = Rectangulo(9, 3, 'Rojo')
rectangulo1.ancho = 8
#print(f'Alto: {rectangulo1.alto}')
#print(f'Ancho: {rectangulo1.ancho}')
print(f'Calculo del Area del Rectangulo: {rectangulo1.calcular_area()}')
print(rectangulo1)

# MRO = Method Resolution Order
#print(Rectangulo.mro())

#figura1 = FiguraGeometrica() # No se puede instanciar, es abstracta
print(Cuadrado.mro())