# Ejercicio 3: Insertar elementos y ordenarlos
#Pedir números y meterlos en una lista, cuando el usuario
#introduzca un número 0, nuestro programa dejaria de insertar.
#Por ultimo, mostrar los números de menor a mayor.
'''
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
'''
#Como realizo el Profe el ejercicio
lista = []
salir = False
while not salir:
    numero = int(input('Digite un numero: '))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
lista.sort()# la lista esta ordenada con esta funcion
print(f'\nLista ordenada: \n{lista}')
