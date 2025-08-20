# Ejercicio 4 - Tuplas y Listas
# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8) # Definimos la tupla
# Crear una lista que solo incluya los números menores a 5
# e imprimir por consola [1, 3, 2]
lista = [] # Definimos la lista

# ASI LO HICE YO
print("ASI LO HICE YO:")
for i in range(len(tupla)): # Asignamos el rango por la longitud de la tupla e iteramos
    if tupla[i] < 5: # comparamos el valor de cada posicion de la tupla para ver si es menor a 5
        lista.append(tupla[i]) # Si es verdadero, asignamos el valor de la posicion i a la nueva lista
print(lista) # Imprimimos la nueva lista con los numeros menores a 5

lista.clear() # Limpio la lista para el algoritmo del profe

print("-----------")
print("ASI EL PROFE ARIEL:")
# ASI EL PROFE ARIEL
for elemento in tupla:
    if elemento < 5: # comparamos el valor de cada posicion de la tupla para ver si es menor a 5
        lista.append(elemento) # Si es verdadero, asignamos el valor de elemento a la nueva lista
print(lista) # Imprimimos la nueva lista con los numeros menores a 5