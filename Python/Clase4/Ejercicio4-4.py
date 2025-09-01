#4.4 Ejercicio 1 con Matemáticas y la clase math

#Sacar la raíz cuadrada de un número positivo, aquí vamos a seguir aprendiendo, 
#debe quedar claro el trabajo con la clase math...

import math

numero =  int(input('Digite un numero positivo '))
while numero < 0:
    print('Error >>> Deberia ser un numero positivo + ')
    numero = int(input('Ingrese un numero positivo +: '))
print(f'\nLa raiz cuadrada es: {math.sqrt(numero):.2f}\n')