# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta 10. Por ejemplo:
# Si digita 5 la lista tendrá: 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
tabla = []
numero = int(input("ingrese el numero para saber su tabla: "))
for i in range(1, 11, 1):
    tabla.append(numero * i)
print(tabla)
