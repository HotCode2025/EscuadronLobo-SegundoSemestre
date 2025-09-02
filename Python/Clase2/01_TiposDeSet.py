# 2.1 Tipo set o conjunto

# Tipo set
planetas = {'Marte', 'Jupiter', 'Venus'}
print(len(planetas))  #usamos la funcion len = legth significa largo

# Revisar si un elemento existe dentro de set
print('Jupiter' in planetas)

# Agregar un elemento
planetas.add('Tierra')  # es una funcion
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no eixste

planetas.remove('Jupiter')  # esta funcion antel un mal ingreso, va a mostrar error
print(planetas)
planetas.discard('Tierra')  # esta funcion antel un mal ingreso, no genera error
print(planetas)

# Limpiear set o conjunto
planetas.clear()
print(planetas)

# Eliminar set o conjunto
del planetas
# print(planetas)  #genera error xq se elimina