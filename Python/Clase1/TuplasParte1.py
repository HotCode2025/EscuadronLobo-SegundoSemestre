# Las tuplas son inmutables, es decir no modificables

#Definimos una tupla
#En las tuplas se usa parentesis, los corchetes son para las listas
cocina = ('cuchara', 'cuchillo','tenedor' )
print(cocina)
#Para saber la cantidad de elementos que tiene la tupla usamos el siguiente codigo
print(len(cocina))

#Acceder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])

#Mostrar el elemento de la manera inversa
print(cocina[-1])

#Como acceder a un rango, cuando queremos mostrar mas cantidades de elementos
print(cocina[0:1])
print(cocina[0:2])
print(cocina[0:3])
#ahi que acotar que cuando seleccionamos un rango el segundo numero por ejemplo [0:1] siempre se le resta un numero 
#por lo tanto solo tomaria la palabra cuchara
#Ejemplo de no tuplas
verdudas = ('papa')
#Para que sea una tupla necesita una coma, de lo contrario
#como en el ejemplo de arriba es de tipo string cadena
