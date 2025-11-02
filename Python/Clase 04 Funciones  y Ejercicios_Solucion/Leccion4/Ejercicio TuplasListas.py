#Ejercicio
tupla = (13, 1, 8, 3, 2, 5, 8) #Definimos la tupla
#Crea una lista que solo incluya los números menores a 5
#e impremi por consola [1, 3, 2]

lista = [] #Definimos fla lista
#Filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)