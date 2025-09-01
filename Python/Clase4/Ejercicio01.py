#Ejercicio01: Llenar una lista
#Llenar una lista con los números de 1 al 50, luego mostra
#la lista con el bucle for, los elementos deben mostrarse
#de la siguiente forma:
#1-2-3-4-5....50

# Genera la lista del 1 al 50
lista = list(range(1, 51))
for i in lista:
    print(i, end="-")