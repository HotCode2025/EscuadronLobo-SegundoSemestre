#Recorremos los elementos de la tupla con un ciclo FOR
cocina = ('cuchara','cuchillo','tenedor')
for cocinar in cocina: #Print usa \n para saltos de linea
    print(cocinar, end=' ') #Si no queremos que sea una lista Usamos end= para eliminar los saltos de linea


 #En una tupla no pueden haber modificaciones
#cocina[0] = 'plato'
#print(cocina)
# Al ejecutar muestra un error. Sin embargo las tuplas se pueden modificar indirectamente:
# se hace haciendo una conversion de tupla a lista y de lista a tupla
cocinaLista = list(cocina) #Pasamos de tupla a lista
cocinaLista[0]='plato'
cocina = tuple(cocinaLista) #Convertimos de lista a tupla
print('\n', cocina)

#Para eliminar una tupla:
#del cocina






