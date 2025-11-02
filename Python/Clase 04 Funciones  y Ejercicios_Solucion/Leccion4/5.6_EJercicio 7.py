# Ejercicio 7: Juego adivina el número
# Realizar un juego para adivinar un número. Para ello se debe generar un número aleatorio entre 1 100, y luego ir pidiendo
# números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta
# y alli se debe mostrar el número de intentos
import random

numRam = random.randint(1, 100)
print(numRam)
acu = 0
for i in range(1, 101, 1):
    numero = int(input("Ingresa un número entre 1 y 100: "))
    acu += 1
    if numero < numRam:
        print("El número secreto es mayor.")        
    elif numero > numRam:
        print("El número secreto es menor.")
    else:
        print(f"¡Felicidades ganaste, el numero era {numRam} en {acu} intentos.")
        break