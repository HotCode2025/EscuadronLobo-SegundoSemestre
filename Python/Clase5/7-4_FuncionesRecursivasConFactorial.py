# Funciones Recursivas
def factorial(numero):
    if numero == 1:  # Caso Base
        return 1
    else:
        return numero * factorial(numero - 1) # Caso Recursivo

# Tarea
num = int(input("Ingrese un número para sacar su factorial: "))
resultado = factorial(num)
print(f"El factorial del numero {num} es: {resultado}")