# Tipo set
planetas = {'Marte', 'Júpiter','Venus'}
print(planetas)
print(len(planetas)) #Usamos la funcion len para obtener el tamaño

# Revisar si un elemento existe dentro del set
print('Marte' in planetas) # true
print('Martes' in planetas) # false, tiene que ser totalmente igual, con acentos, mayus o min. En el caso que no. Es falso

# Agregar un elemento
planetas.add('Tierra') # add es una funcion
planetas.add('Tierra') # No admite elementos duplicados
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove('Júpiter') # Esta funcion ante un mal ingreso u inexistencia da error
print(planetas)
planetas.discard('Tierra') # Esta funcion NO presenta ningun error si no encuentra el elemento.
print(planetas)

# Limpiar set
planetas.clear()
print(planetas)

# Eliminar set
del planetas
print(planetas) # al eliminar nos da error por q ya no existe el set