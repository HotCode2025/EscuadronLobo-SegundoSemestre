#4.8 Ejercicio 3 Insertar Elementos y Ordenarlos Función sort(), 
# este ejercicio se los dejo para que tengan claro el trabajo con la función sort...

numeros = []

n = int(input("¿Cuántos números desea ingresar? "))

for i in range(n):
    num = int(input(f"Ingrese el número {i+1}: "))
    numeros.append(num)

print("\nLista original:", numeros)

# Ordenados de menor a mayor
numeros.sort()
print("Lista ordenada (ascendente):", numeros)

# Ordenados de mayor a menor
numeros.sort(reverse=True)
print("Lista ordenada (descendente):", numeros)