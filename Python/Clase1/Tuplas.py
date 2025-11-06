#Definimos una tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)
print(len(cocina)) #Vemos cuanto elementos hay

#Acceder a un elemento, para esto se utiliza corchetes no parentesis
print(cocina[0])

#Mostramos de la menera inversa
print(cocina[-1])

#Acceder a un rango
print(cocina[0:2]) #

#Ejemplo
verduras = ("papa",) # Una tupla necesita auque sea de un elemento: la coma
#de lo contrario solo seria un tipo str cadena
print(verduras)

#Recorremos los elementos de la tupla
for cocinar in cocina:
    #print(cocinar) # Print esta usando /n para saltos de líneas
    print(cocinar, end=" ") #Usamos end= para eliminar los saltos de líneas

#Conversion de tupla a lista y de lista a tupla, para modificar un elemento (NO ES BUENA PRACTICA)
cosinaLista = list(cocina)
cosinaLista[0] = "Plato"
cocina = tuple(cocinaLista)
print(cocina)

#Eliminamos una tupla
#del cocina
print(cocina)