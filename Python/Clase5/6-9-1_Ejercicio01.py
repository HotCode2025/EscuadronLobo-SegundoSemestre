# Ejercicio 01: Crear una funcion para sumar los valores recibidos de tipo
# numéricos, utilizando argumentos variables *args como parámetro de la Función
# y agregar como resultado la suma de todos los valores pasados como argumentos.

def sumar(*valores):
    suma = 0
    for valor in valores:
        suma = suma + valor
    print(suma)

sumar(1, 3, 4, 10, 15)