inicio = int(input("Ingrese el número inicial del rango: "))
fin = int(input("Ingrese el número final del rango: "))
suma_pares = 0
for numero in range(inicio, fin + 1):
    if numero % 2 == 0:
        suma_pares += numero
print(suma_pares)