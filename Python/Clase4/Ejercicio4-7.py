# 4.7 Ejercicio 2 Modificar los Elemento de una Lista
'''Ejercicio 2: Modificar los elementos de una lista
Llenar una lista con los numeros del 1 al 10, luego modificar los elementos
de la lista multiplicandolos por un valor ingresado por el usuario
'''

numeros = list(range(1, 11))
print(numeros)

multiplicador = int(input("Ingrese un valor para multiplicar los elementos: "))
for i in range(len(numeros)):
    numeros[i] *= multiplicador

print("Lista modificada:\n",numeros)