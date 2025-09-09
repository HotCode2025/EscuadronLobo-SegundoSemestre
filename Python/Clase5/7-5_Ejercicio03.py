#Ejercicio03: Funcion recursiva
#Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
#Puede ser cualquier valor positivo, por ejemplo, si pasamo el
#valor de 5, debe imprimir:
#5
#4
#3
#2
#1
#En caso de ser el número 3 debe imprimir:
#3
#2
#1
#Si se ingresa número negativos no imprime nada

def mostrar_descendente(numero):
    if numero >= 1: 
        print(numero)
        mostrar_descendente(numero-1)
    elif numero == 0:
        return
    elif numero <= 0:
        print("Numero invalido.")

mostrar_descendente(5)