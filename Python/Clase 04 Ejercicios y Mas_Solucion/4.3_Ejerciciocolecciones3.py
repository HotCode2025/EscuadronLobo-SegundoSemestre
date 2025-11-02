# 4.3 Ejercicio de Colecciones 3
'''Ejercicio 3: agregar personajes a una lista
Escriba un programa donde cree una lista con los siguientes
personajes del senor de los anillos
Nombre: Aragon
Clase: Guerrero
Raza: Dunadan del norte

Nombre: Gandalf
Clase: Mago
Raza: Istar

Nombre: Legolas
Clase: Arquero
Raza: Elfo Sindar

'''

# Creamos la lista de personajes
personajes = []

# Agregamos cada personaje como un diccionario
personajes.append({
    "Nombre": "Aragon",
    "Clase": "Guerrero",
    "Raza": "Dúnadan del norte"
})

personajes.append({
    "Nombre": "Gandalf",
    "Clase": "Mago",
    "Raza": "Istar"
})

personajes.append({
    "Nombre": "Legolas",
    "Clase": "Arquero",
    "Raza": "Elfo Sindar"
})

# Para mostrar los personajes
for personaje in personajes:
    print(f"Nombre: {personaje['Nombre']}, Clase: {personaje['Clase']}, Raza: {personaje['Raza']}")