#CLASE 3:
#REPASO DEL TIPO SET O CONJUNTO
#Pra definir un conjunto
conjunto2 = set()
conjunto1 = {'bye', }
conjunto2.add(7)
conjunto2.add("Hola")
print(conjunto2)
conjunto1.add('hola')
print(conjunto1)
print(3 not in conjunto1) #Preguntamos si el número 3 no está en el conjunto1

#Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2) #Nos devuelve como respuesta un booleano

#Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2 #La loinea une los dos conjuntos
print(conjunto3)

#Interseccion
conjunto3 = conjunto1 & conjunto2 #Que elementos tienen en comun
print(conjunto3)

#Valor que esta en un conjunto y no en el otro
conjunto3 = conjunto1 - conjunto2
print(conjunto3)
conjunto3 = conjunto2 - conjunto1
print(conjunto3)

#Elementos que no comparten o que son diferentes entre ambos
conjunto3 = conjunto1 ^ conjunto2
print(conjunto3)

#Como determinar si un conjunto es un subconjunto de otro
conjunto3 = conjunto1 | conjunto2
print(conjunto1.issubset(conjunto3))
print(conjunto2.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

#Preguntamos si los elementos del conjunto1 estan dentro de 3,
#si es verdadero quiere decir que el conjunto3 es un superconjunto
print(conjunto3.issuperset(conjunto1))
print(conjunto3.issuperset(conjunto2))
print(conjunto2.issuperset(conjunto3))

#Como saber si ambos conjuntos son disconexos, esto e si no compartes elementos en comun
print(conjunto1.isdisjoint(conjunto2)) #No hay cosas en comun

#Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset #Esto hace que el conjunto sea totalmente
#inmutable. No se puede agregar, modificar ni eliminar elementos del conjunto

#REPASO DE DICCIONARIOS
diccionarioNuevo = {'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green', 'Amarillo': 'Yellow'}
print(diccionarioNuevo)

#Como eliminar
del(diccionarioNuevo['Azul'])
print(diccionarioNuevo)

#Los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {'Ariel': {'Edad': 40,'Altura': 1.83}, 'Osvaldo':[45,1.85], 'Natalia':[35,1.67]}
print(diccionario2)

#METODO CON LISTAS LLAMADO PILAS
pila = [1,2,3]

#Agregamos elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

#Sacando elementos por el final
pila.pop()
print(pila)

#Como quitar el último elemento y guardarlo en otra variable
elementoBorrado = pila.pop()
print(f'Sacamos el elemento: {elementoBorrado}')
print(f'La pila ahora queda asi: {pila}')

#METODO CON LISTAS LLAMADO COLA
#Colas son estructuras de datos de tipo fifo(first input/first output)primero en entrar/primero en salir
cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

#Agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('Jose')
print(cola)

#Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)