# 'Maradona':10 Un Diccionario está compuesto por dos elementos
# UNA LLAVE Y UN VALOR
# dict(key, value)
diccionario = {
    'IDE': 'Integrated Development Environment',
    'POO': 'Programación Orientada a Objetos',
    'SABD': 'Sistema de Administración de Base de Datos'
}

# Verificar la cantidad de elementos del diccionario
print(diccionario)
print(len(diccionario)) # funcion que conocemos para ver el tamaño

# Acceder a un diccionario con la llave(key)
print(diccionario['IDE'])

# Otra forma de recuperar un elemento
print(diccionario.get('POO')) # con la función get
print(diccionario.get('SABD'))

# Modificamos elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Como recorrer los elementos
for termino in diccionario: # Recorremos mostrando solo las llaves
    print(termino)

# Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)
    
# Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino) # Muestra solo las llaves
    
for valor in diccionario.values(): # Usamos una funcion para acceder al valor
    print(valor) # muestra solo el valor

# Comprobar la existencia de algun elemento
print('IDE' in diccionario) # devuelve un booleano
print('IDE' not in diccionario) # tambien se puede negar

# Agregar un elemento
diccionario['PK'] = 'Primary Key' # Agrega el nuevo elemento, si ponemos una llave existente actualiza su valor
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario