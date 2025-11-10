## Clase 3 Colecciones Parte 3

# 3.1 Repaso del tipo set o conjunto

# Repaso de set o conjunto
# para definir un conjunto
conjunto2 = set()  #la unica frma de inicializar con 0 es con set()
conjunto1 = {'bye', }  # no se puede iniciar asi porque no dejaria agregar elementos, si es con {} tiene q poseer algun elemento
conjunto2.add(7)
conjunto2.add('Hola')
print(conjunto2)
conjunto1.add('hola')
print(conjunto1)
print(3 not in conjunto1)  # Preguntamos si el numero 3 no esta en el conjunto1

# Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2) # nos devuelve como respuesta un booleano

# Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2  # la linea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 # que elemento tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2  # asigna el valor que esta en el conjunto 1 y no en el conjunto2
print(conjunto3)
conjunto3 = conjunto2 - conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2 # elementos que no comparten o que son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3))  #aqui preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issubset(conjunto1))  #preguntamos si los elementos del conjuunto1 estan dentro del 3
print(conjunto3.issubset(conjunto2))  # si es verdadero quiere decir que el conjunto 3 es un superconjunto
print(conjunto2.issubset(conjunto3))

# Como saber si ambos conjunos son disconexos, esto es si eno comparten elementos en comun
print(conjunto1.isdisjoint(conjunto2))  # no hay cosas en comun

# Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset  # Esto hace que el conjunto sea totalmente inmutable
# No se puede agregar, modificar ni eliminar elementos del conjunto

## 3.2 Repaso de Diccionarios

# Repaso de Diccionario
diccionarioNuevo = {'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green', 'Amarillo': 'Yellow'}
print(diccionarioNuevo)

# Como eliminar
del (diccionarioNuevo['Azul'])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {'Ariel':{'Edad': 40, 'Altura': 1.83},'Osvaldo':[45, 1.85], 'Natalia':[35, 1.67]}
print(diccionario2)

# 3.3 Ejercicio con Diccionario y tarea 

seleccionArgentina = {
    23: {'Nombre': 'Emiliano Martinez', 'Edad': 32, 'Altura': 1.95, 'Precio': '20 Millones', 'Posicion': 'Arquero'},
    4:  {'Nombre': 'Facundo Medina', 'Edad': 26, 'Altura': 1.84, 'Precio': '25 Millones', 'Posicion': 'Lateral izquierdo'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 37, 'Altura': 1.83, 'Precio': '1 Millones', 'Posicion': 'Defensa central'},
    13: {'Nombre': 'Cristian Romero', 'Edad': 27, 'Altura': 1.85, 'Precio': '50 Millones', 'Posicion': 'Defensa central'},
    16: {'Nombre': 'Nahuel Molina', 'Edad': 27, 'Altura': 1.75, 'Precio': '20 Millones', 'Posicion': 'Lateral derecho'},
    7:  {'Nombre': 'Rodrigo De Paul', 'Edad': 31, 'Altura': 1.80, 'Precio': '25 Millones', 'Posicion': 'Mediocentro'},
}

print(seleccionArgentina)

for llave, valor in seleccionArgentina.items():
    print(llave, valor)

#Recorrer diccionario y mostrar jugadores
for dorsal, jugador in seleccionArgentina.items():
    print(f"Dorsal: {dorsal}")
    for clave, valor in jugador.items():
        print(f"  {clave}: {valor}")
    print("-" * 40)  # separador

# Agregar al menos 4 jugadores más
seleccionArgentina[5] = {'Nombre': 'Leandro Paredes', 'Edad': 31, 'Altura': 1.80, 'Precio': '5 Millones', 'Posicion': 'Pivote'},
seleccionArgentina[8] = {'Nombre': 'Enzo Fernández', 'Edad': 24, 'Altura': 1.78, 'Precio': '75 Millones', 'Posicion': 'Mediocentro'},
seleccionArgentina[9] = {'Nombre': 'Julián Alvarez', 'Edad': 25, 'Altura': 1.70, 'Precio': '100 Millones', 'Posicion': 'Delantero centro'},
seleccionArgentina[10] = {'Nombre': 'Lionel Messi', 'Edad': 38, 'Altura': 1.70, 'Precio': '18 Millones', 'Posicion': 'Extremo derecho'},
seleccionArgentina[11] = {'Nombre': 'Thiago Almada', 'Edad': 24, 'Altura': 1.71, 'Precio': '25 Millones', 'Posicion': 'Mediocentro ofensivo'},


# Mostrar cantidad de jugadores
print('Tenemos cargados en el diccionario la cantidad de:', end=' ')
print(len(seleccionArgentina))

print(seleccionArgentina)

#3.4 Método con listas llamado PILAS
# Pilas usando listas
pila = [1,2,3]

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos desde el final
elementoBorrado = pila.pop()  # quita el ultimo elemento y lo guarda en la variable
print(f'Sacamos el elemento {elementoBorrado}')
print(f'La pila ahora quedo asi: {pila}')

# 3.5  Método con listas llamado COLA
# Colas con listas
# Estructura de datos de tipo fifo (first input / fis}rst output)

cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']
cola.append('Natalia')
cola.append('Jose')
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atendido el cliente {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente {seRetira}')
print(cola)

#3 3.6 Cerramos la clase de hoy con un commit
