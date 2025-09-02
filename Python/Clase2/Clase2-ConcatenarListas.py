# Concatenar Listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2 # concatenamos con suma
print(lista3)

lista3.extend([7, 8, 9, 1]) # Función para agregar varios elemenos a una lista
print(lista3)

print(lista3.index(5)) # Función para ubicar en que indice esta el valor ingresado
# print(lista3.index(0)) esto daría error por no ser el elemento parte de la lista

# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1)) # Cuenta cuantos valores iguales hay dentro de la lista

# Para poner al reves una lista
lista3.reverse()
print(lista3)