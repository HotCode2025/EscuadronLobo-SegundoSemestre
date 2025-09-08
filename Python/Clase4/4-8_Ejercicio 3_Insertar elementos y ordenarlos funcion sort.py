# Ejercicio 3: Insertar elementos y ordenarlos
#Pedir números y meterlos en una lista, cuando el usuario
#introduzca un número 0, nuestro programa dejaria de insertar.
#Por ultimo, mostrar los números de menor a mayor.

numeros = []  # Lista vacía para guardar los números

print("Ingrese números (para terminar escriba 0):")

while True:
    num = int(input("Número: "))
    if num == 0:
        break  # Salir del bucle si el usuario ingresa 0
    numeros.append(num)  # Agregar el número a la lista

# Ordenar la lista de menor a mayor
numeros.sort()

# Mostrar la lista ordenada
print("Números ordenados de menor a mayor:", numeros)
