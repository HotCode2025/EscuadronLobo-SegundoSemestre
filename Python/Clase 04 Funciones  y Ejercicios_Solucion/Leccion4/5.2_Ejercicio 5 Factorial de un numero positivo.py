# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

'''numero = int(input("Ingrese un número: "))
factorial = 1

for i in range(1, numero + 1):
    factorial *= i

print("El factorial de", numero, "es:", factorial)
'''

numero = int(input("Digite un numero: "))
while numero < 0: #Miestras el numero sea negativo
    print("Error -> El numero tiene que ser positivo")
    numero = int(input("Digite un numero: "))
factorial = 1 #La variable para calcular el factorial
for i in range(1, numero+1):
    factorial *=i
print(f"\nEl factorial del numero {numero} positivo ingresado es: {factorial}")