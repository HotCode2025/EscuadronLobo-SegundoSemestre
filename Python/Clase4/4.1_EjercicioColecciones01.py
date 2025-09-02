#Ejercicio 1: Eliminar duplicados de una lista
#Escriba un programa donde tenga una lista y que a continuación
#Elimine los elementos repetidos, por último  mostrar la lista

# Creamos una lista con números y cadenas repetidos
lista = [10, 4, 8, 15, 8, 4, 20, 10]

# Convertimos la lista a un conjunto (set) para eliminar duplicados
# y luego lo convertimos nuevamente a lista
lista = list(set(lista))

print("Lista sin repetidos:", lista)