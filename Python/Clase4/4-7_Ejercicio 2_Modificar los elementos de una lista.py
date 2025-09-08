# Ejercicio 2: Modificar los elementos de una lista

# Crear una lista con los números del 1 al 10
lista = list(range(1, 11))
print("Lista original:", lista)

# Pedir al usuario un valor para multiplicar
valor = int(input("Ingrese un número para multiplicar los elementos de la lista: "))

# Modificar los elementos multiplicándolos por el valor ingresado
lista_modificada = [x * valor for x in lista]

# Mostrar la lista modificada
print("Lista modificada:", lista_modificada)
