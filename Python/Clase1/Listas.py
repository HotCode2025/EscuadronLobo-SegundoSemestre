# lista = Ariel, Liliana, Natalia, OSvaldo
#Las listas es lo que se conoce en otro lenguajes como arreglos o vectores
nombres = ["Naty", "Osvaldo", "Lily", "Ariel"]
print(nombres)
#print(nombres[0])
#print(nombres[1])
#print(nombres[3])
#print(nombres[-1]) #mostramos el ultimo elemento
#print(nombres[-2])

#Recuperar un rango de la lista
print(nombres[0:2]) #Solo muestra el indice 0, 1 pero no el indice 2

#Ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ : 3])# Inides a mostrar 0, 1, 2

#Desde el indice indicado hasta el final
print(nombres[1: ])

#Modificamos un valor
nombres[2] = "Liliana"
nombres[0] = "Natalia"
print(nombres)

#Iterar una lista
for nombre in nombres: #Nombre es singular, la lista es plural
    print(nombre)
else:
    print("Se acabaron los elementos de las lista")


#Preguntamos cuanto elementos tiene una lista
print(len(nombres)) # Le pasamos como paramentro la lista

#Agregamos un elemento a la lista
nombres.append("Marcelo")
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

#Insertar un elemento en un indice especifico
nombres.insert(1, "Alberto")
print(nombres)

nombres.insert(3, "Debora")
print(nombres)

#Eliminamos un elemento de la lista
nombres.remove("Alberto")
print(nombres)

#Eliminar el ultimo elemento de una lista
nombres.pop()
print(nombres)

#Eliminar un indice especifico
del nombres[2] # del significa eliminar
print(nombres)

#Eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)

#Eliminamos la lista
del nombres
print(nombres) # aqui nos mostrara un error