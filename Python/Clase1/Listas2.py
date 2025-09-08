#parte2
# Colecciones en Python

# Las listas es lo que se conoce en otro lenguajes como arreglos o vectores

nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print(nombres[0:2])  # solo muestra el indice 0, 1 perono el indice 2
# ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3])
# Desde el inidice indicado hasta el final
print(nombres[1: ])
# modificamos un valor
nombres[3] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)
# iterar una lista
for nombre in nombres: # nombre es singular, la lista es plural
    print(nombre)
else: 
    print('Se acabaron los elementos de la lista')