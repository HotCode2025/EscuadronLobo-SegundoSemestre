'''
#Clase 1: Colecciones Parte 1

#Listas Parte 1 (video 1 Python), se las conoce en otros lenguajes como arreglos o vectores

#lista = Ariel, Liliana, Natalia, Osvaldo (conjunto de elemntos)

nombre = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombre)
print(nombre[0])
print(nombre[3])
print(nombre[-1])

#Listas Parte 2 (video 2 Python)
#Recuperar un rango de la lista
nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print(nombres[0:2]) #solo muestra el indice 0,1 pero no el indice 2
#Ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3]) #Indices a mostrar 0,1,2
#Desde el indice indicadi el final
print(nombres[1: ])
#Modificar un valor
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)
#Iterar una lista
for nombre in nombres: # nombre es singular, la lista es plural
    print(nombre)
else:
    print('se acabaron los elemntos de la lista')


#Listas Parte 3 (video 3 Python)
#preguntamos cuantos elementos tiene
print(len(nombres)) #le pasamos como parametro la lista

#Agregamos un elemento (puede tener varios elementos (booleano, flotante, n° entero, otra lista))
nombres.append('Marcelo')
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

#Insertar un elemento en un indice especifico
nombres.insert(1,'Alberto')
print(nombres)
nombres.insert(3,'Debora')
print(nombres)

#Eliminamos un elemnto
nombres.remove('Alberto')
print(nombres)

#Eliminar el ultimo elemnto de la lista
nombres.pop()
print(nombres)
#Eliminarun indice especifico
del nombres[2] #Significa delete (eliminar)
print(nombres)
#Eliminar, borrar o limpiar todos los elemntos
nombres.clear()
print(nombres)
#Eliminar la lista
del nombres
#print(nombres)#Aqui nos mostrará un error


#Tuplas Parte 1 (video 6 Python)
#Definimos una tupla
cocina = ('cuchara', 'cuchillo', 'tenedor') #Tupla al ejecutarlo siempre debe tener a un que sea un elemento: la coma ('...' ,)
print(cocina)
print(len(cocina))

#Acceder a un elemnto, para esto utilizamos corchetes No parentesis
print(cocina[0])
#Mostrar de manera inversa
print(cocina[-1])
#Acceder a un rango
print(cocina[0:1])
#ejemplo
verduras = ('papa')#Tipo string cadena no lleva esto ('...' ,), solo el nombre simple ej: papa
print(verduras)

#Tuplas Parte 2 (video 7 Python)
#Recorrecemos los elemntos de la Tupla
for cocinar in cocina: #Print esta usando \n para saltos de lineas
    print (cocinar, end=' ') #usamos end= para eliminar los saltos de linea
#En las tuplas no se pueden utilizar LAS FUNCIONES: appen, insert, remover
#Modificamos Un Tupla a lista o bisceversa
cocinaLista = list(cocina)
cocinaLista [0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

#Eliminamos una Tupla
#del cocina
#print(cocina)

#CLASE  o Leccion 2: COLECCIONES PARTE 2
#Tipos Set (video 1 Python); 
#El orden es aleatorio. Un elemento de tipo set: es una coleccion sin orden y sin indice.
planetas = {'Martes', 'Jupiter', 'Venus'}
print(len(planetas))#Len = length significa largo () nos indica la cantidad de elementos)

#Revisar si un elemnto existe dentro del set
print('Martes' in planetas)# esta este planeta? verdadero o falso

#Agregar un elemnto
planetas.add('Tierra') #add es una función
print(planetas)


#Tipos Set o conjuntos (video 2 Python); 
#Eliminar elemntos, puede arrojar un error si el elemnto no existe
planetas.remove('Jupiter')#Esta función ante de un mal ingreso u inexistente del elemnto da error
print(planetas)
planetas.discard('Tierra')#Esta función no nos presenta ningun error
print(planetas)

#Limpiar set o conjunto
planetas.clear()
print(planetas)

#Eliminar set o conjunto
del planetas #Al eliminar nos muestra un error

#Diccionario Parte 1 de PYTHON (video 3 Python)
##Esta compuesto por dos elementos: se puede hacer en forma de columnas o en filas
#'Maradona': 10 //Tipo cadena 1ro 'Maradona' y 2do tipo numerico 10
#dict (key, value)
diccionario = {
    'IDE': 'Integrated Development Environment',
    'POO': 'Programación Orientada a Objetos',
    'SABD': 'Sistema de Administración de Base de Datos'
}

#Verificamos la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

#Acceder a un diccionario con la llave (Key)
print(diccionario['IDE'])

#Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

#Modificamos los elementos
diccionario['IDE'] = 'Entorno  de Desarrollo Integrado'
print(diccionario)


#Diccionario Parte 2 de PYTHON (video 4 Python)
#Como recorrer los elemntos
for termino in diccionario: #Recorremos mostrando solo llaves
    print(termino)

#for termino, valor in diccionario:
#    print(termino, valor)#No se puede acceder al valor, sale error

#Necesitamos una función para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

#Otras maneras de accdeder a un diccionario
for termino in diccionario.keys():
    print(termino) #Muestra solo las llaves


#Usamos una función para acceder al valor
for valor in diccionario.values():
    print(valor)

#Comprobar la existencia de algun elemento
print('IDE' in diccionario)#Devuelve un booleano

#Agregar un elemento
diccionario['PK'] = 'Primary Key'
print(diccionario)

#Eliminar un elemento un elemento
diccionario.pop('SABD')
print(diccionario)

#Vaciar un diccionario
diccionario.clear()
print(diccionario)

#Eliminar diccionario 
#del diccionario #Diccionario se borro

#Repaso y más conceptos de Listas (video 5 Python)
#Agregamos un elemento (puede tener varios elementos (booleano, flotante, n° entero, otra lista))
nombres.append('Marcelo')
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

#Concatenar listas (video 6 Python)
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2 #Concatenación
print(lista3)

lista3.extend([7, 8, 9, 1])# Funcion para agregar varios elementos a una lista
print(lista3)
print(lista3.index(5))#Funcion para ubiacar en que indice esta el valor ingresado
#print(lista3.index(0)) #esto daria un error por no ser el elemento parte de la lista

#como saber cuamtos valores repetidos hay dentro de una lista
print(lista3.count(1)) #cuenta cuantos valores iguales hay dentro de la lista

#Para poner el reves una lista
lista3.reverse()
print(lista3)

#Para que una lista se multiplique repitiendo sus elemntos (video 7 Python)
lista3 =lista3 * 2
print(lista3)

#Métodos de ordenamiento, en  Python es una función 
lista3.sort() #Ordena los elemntos ascendentemente
print (lista3)
lista3.sort(reverse=True) #Ordena los elemntos descendentemente
print(lista3)

# Repaso de las  TUPLAS (video 8 Python)
tupla = (4, 'Hola', 6.78, [1, 2, 78], 4, 'Hola') #Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla) #Accion booleana, su respuesta es de tipo booleana
#Lo que podemos usar dentro de tuplas son: index, count, len
#En tuplas se puede convertir de tupla a lista y de lista a tupla 

from typing import final
'''
#Clase  o Leccion 3:
#Repaso de set o conjunto (video 1 Pyton)
#Para definir un conjunto grupo de elementos desordenados y su principal caracteristica 
#es que no pueden haber duplicados dentro de un conjunto, es decir hay valores unicos y puede tener diferentes tipos de datos
conjunto2 = set()
conjunto1 = {'bye', }# un conjunto vacio no se puede, debe tener siempre un elemento
conjunto2.add(7)# dato tipo entero
conjunto2.add('Hola')# dato tipo cadena
print(conjunto2)
conjunto1.add('hola')
print(conjunto1)
print(3 not in conjunto1)#Preguntamos si el numero 3 NO estará en el conjunto (nos devuelve un valor booloneano)

#como hacer la igualdad de los conjuntos
print(conjunto1 == conjunto2)#Nos devuelve como respuesta un booleano

#Operaciones en conjuntos (video 2 Python)
conjunto3 = conjunto1 | conjunto2 #La linea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 #Que elemento tienen en común
print(conjunto3)

conjunto3 =conjunto1 - conjunto2 #Asigna el valor que esta en el conjunto1 y no en el conjunto2
print(conjunto3)
conjunto3 =conjunto2 - conjunto1
print(conjunto3)

conjunto3 =conjunto1 ^ conjunto2 #Elemento que no comparten o que son modificables entre ambos
print(conjunto3)

#Aqui preguntamos si un conjunto es un subconjunto dentro de otro (Video 3 Python)
conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3))
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto1))


print(conjunto3.issuperset(conjunto1)) #Preguntamos si los elementos del conjunto1 están dentro del 3
print(conjunto3.issuperset(conjunto2)) #Si es verdadero quiere decir que el conjunto3 es un superconjunto
print(conjunto2.issuperset(conjunto3))

#como saber si ambos conjuntos son Disconexos, esto es si NO comparten ningún elemento en común
print(conjunto1.isdisjoint(conjunto2)) #No hay cosas en común

#convertir un conjunto totalmente en inmutable
conjunto1 = frozenset #Esto hace que el conjunto sea totalmente inmutables
#No se puede agregar, modificar ni eliminar un elemento del conjunto

#Repaso de diccionario: otro forma de hacerlo en lineas (video 4 Python)
diccionarioNuevo = {'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green', 'Amarillo': 'Yellow'}
print(diccionarioNuevo)

#Como eliminar
del (diccionarioNuevo['Azul'])
print(diccionarioNuevo)

#Los diccionarios pueden almacenar diferentes tipos de datos "FILAS"
diccionario2 = {'Cecilia': {'Edad': 39, 'Altura': 1.70}, 'Osvaldo': [45, 1.85], 'Natalia': [35, 1.67]}
                #Cadena:
                        #Diccionario:Cadena, entero,cadena, flotante
                                                          #Cadena: lista (entero y flotante
                                                                                #Cadena: lista (entero y flotante
print(diccionario2)

# Recorrer el diccionario
# Los diccionarios pueden almacenar diferente tipos de datos "COLUMNAS"
diccionario2 = {
    'Cecilial': {'Edad': 39, 'Altura': 1.70},
    'Osvaldo': [45, 1.85],
    'Natalia': [35, 1.67]
}
print(diccionario2)

#(video 5 Pyton)
# Diccionario seleccionArgentina
seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 Millones', 'Posicion': 'Extremo Derecho'},
    11: {'Nombre': 'Ángel Di María', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 Millones', 'Posicion': 'Extremo Derecho'},
    21: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 Millones', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 Millones', 'Posicion': 'Defensa Central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 Millones', 'Posicion': 'Portero'},
    23: {'Nombre': 'Emiliano Martinez', 'Edad': 32, 'Altura': 1.95, 'Precio': '20 Millones', 'Posicion': 'Arquero'},
    4:  {'Nombre': 'Facundo Medina', 'Edad': 26, 'Altura': 1.84, 'Precio': '25 Millones', 'Posicion': 'Lateral izquierdo'},
    13: {'Nombre': 'Cristian Romero', 'Edad': 27, 'Altura': 1.85, 'Precio': '50 Millones', 'Posicion': 'Defensa central'},
    16: {'Nombre': 'Nahuel Molina', 'Edad': 27, 'Altura': 1.75, 'Precio': '20 Millones', 'Posicion': 'Lateral derecho'},
    7:  {'Nombre': 'Rodrigo De Paul', 'Edad': 31, 'Altura': 1.80, 'Precio': '25 Millones', 'Posicion': 'Mediocentro'},
}
print(seleccionArgentina)
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

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
print(seleccionArgentina.values())#Muestra los valores dentro del diccionario
# Recorrer el diccionario
for llave in seleccionArgentina: #Forma común para recorrer un diccionario
   print(llave)

for valor in seleccionArgentina.values():
    print(valor)

for llave, valor in seleccionArgentina.items():
    print(llave, valor)

#pilas usando listas (video 6 Pyton)
pila = [1, 2, 3]

#Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

#Sacamos elementos desde el final
#pila.pop()
#print(pila)

#Quita el ultimo elemento y lo guarda en la variable
elementoBorrado = pila.pop()
print(f'Sacamos el elemento {elementoBorrado}')
print(f'La pila ahora quedo asi: {pila}')

#Colas con listas (video 7 Pyton)
#estructura de datos de tipo fifo(first input/ first output
cola = ['Ariel', 'Osvaldo', 'Liliana','Pilar']

#Agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('Jose')
print(cola)

#Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')#Se retira quien ya fue atendido
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')#Se retira quien ya fue atendido
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')#Se retira quien ya fue atendido
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')#Se retira quien ya fue atendido
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')#Se retira quien ya fue atendido
print(cola)

#Clase o Leccion 4 (video 2 Py)
#Recorremos el Diccionario de la seleccion  Argentina

#Seguimos mostrando como recorrer un diccionario con el ciclo for
for i in seleccionArgentina:
    print(f'{i} -> {seleccionArgentina[i]}')

