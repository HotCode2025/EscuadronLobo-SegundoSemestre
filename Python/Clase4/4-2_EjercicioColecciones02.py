
# Ejercicio 2: Operaciones de conjuntos con listas
#Escriba un programa que tenga 2 listas y que acontinuación
#cree las siguientes listas (en las que no debebn deben haber repetición)
#1 Lista de palabras que aparecen en las listas
#2 Listas de palabras que aparecen en la primera lista, pero no en la segunda
#3 Lista de palabras que aparecen en la senga lista, pero que no aparecen en la primera
#4 Lista de palabras que aparecen en ambas listas

# Creamos dos listas de ejemplo
lista1 = ["manzana", "pera", "uva", "banana", "kiwi"]
lista2 = ["pera", "kiwi", "melon", "sandia", "uva"]

print("Lista 1:", lista1)
print("Lista 2:", lista2)

# Convertimos a conjuntos para evitar repeticiones
conjunto1 = set(lista1)
conjunto2 = set(lista2)

# 1. Lista de palabras que aparecen en las listas (unión)
lista_union = list(conjunto1 | conjunto2)
print("\n1. Palabras que aparecen en las listas:", lista_union)

# 2. Palabras que aparecen en la primera lista pero no en la segunda (diferencia)
solo_primera = list(conjunto1 - conjunto2)
print("2. Palabras solo en la primera lista:", solo_primera)

# 3. Palabras que aparecen en la segunda lista pero no en la primera
solo_segunda = list(conjunto2 - conjunto1)
print("3. Palabras solo en la segunda lista:", solo_segunda)

# 4. Palabras que aparecen en ambas listas (intersección)
en_ambas = list(conjunto1 & conjunto2)
print("4. Palabras en ambas listas:", en_ambas)

