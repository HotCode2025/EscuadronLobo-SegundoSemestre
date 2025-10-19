from cuadrado import *
from rectangulo import *
print("creacion de un objeto rectangulo".center(50, "-"))
rec = cuadrado(5, 5, "verde")
print(rec.ancho)
#no se tomaran los valores
rec.ancho = 30
print(rec.alto)
print(rec.color)
print(rec.area())

# MRO = Method Resolution Order
print(cuadrado.mro())

print("creacion de un objeto cuadrado".center(50, "-"))
cua = rectangulo(10, 5, "azul")
print(cua.ancho)

#para evitar que las propiedades sean modificadas se le deve de quitar el metodo setter de la clase principal
rec.ancho = 15
print(cua.alto)
print(cua.color)
print(cua.area())

