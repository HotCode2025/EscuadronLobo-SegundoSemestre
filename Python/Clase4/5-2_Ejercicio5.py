# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

numero = int(input("Ingrese un número: "))
factorial = 1

for i in range(1, numero + 1):
    factorial *= i

print("El factorial de", numero, "es:", factorial)
