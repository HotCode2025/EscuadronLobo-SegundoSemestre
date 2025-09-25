# 6.1 Ejercicio 10 No Repetir Caracteres
# Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres.

cadena = input("Introduce una cadena de texto: ")
lista_sin_repetir = []
for caracter in cadena:
    if caracter not in lista_sin_repetir:
        lista_sin_repetir.append(caracter)
print("Lista sin repetir caracteres:", lista_sin_repetir)
