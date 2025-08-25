#Repaso y mas conceptos de listas
#Se pueden agregar varios tipos de elementos a la lista
nombres = ['Naty','Osvaldo', 'Lily','Ariel']
nombres.append('Marcelo')
nombres.append([1, 2, 3]) #Lista dentro de lista
nombres.append(True) #Tipo booleano
nombres.append(10.45) #Tipo float
nombres.append([4, 5])
nombres.append(7)
print(nombres)

#Concatenar listas
Lista1=[1,2,3,1]
Lista2=[4,5,6,1]
Lista3=Lista1 + Lista2
print(Lista3)

Lista3.extend([7, 8, 9, 1]) #Funcion para agregar varios elementos
print(Lista3)

#Para conocer en que indice está un elemento
print(Lista3.index(5))
#print(Lista3.index(0)) #Error el elemento 0 no está en la lista

#Para saber cuantos valores repetidos hay dentro de na lista
#usamos la funcion COUNT
print(Lista3.count(1))

#Para poner una lista al reves
Lista3.reverse()
print(Lista3)

#Para que una lista se multiplique repitiendo sus elementos
Lista3 = Lista3 * 2
print(Lista3)

#Metodos de ordenamiento
Lista3.sort()
print(Lista3) #Ordena de manera ascendente

Lista3.sort(reverse=True)
print(Lista3)