# 7.1 Ejercicio 2 con funciones y argumentos variables

# Ejercicio 2: Funcion con * args para multiplicar. Crear una funcion para multiplicar los valores recibidos de
# tipo numerico, utilizando argumentos variales *args como parametro de la funcion y regresar como resultado
# la multiplicacion de todos los valores pasados como argumento.
def multiplicar(*args):
    resultado = 1
    for numero in args:
        resultado *= numero
    return resultado    
print(multiplicar(2, 3))          # 6
print(multiplicar(1, 2, 3, 4))    # 24
print(multiplicar(5, 5, 5, 5, 5))  # 625    
print(multiplicar())               # 1 (caso sin argumentos)




