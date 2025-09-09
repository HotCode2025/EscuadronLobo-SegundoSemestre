SeleccionArgentina = {
    23: {'Nombre': 'Emiliano Martinez', 'Edad': 32, 'Altura': 1.95, 'Precio': '20 Millones', 'Posicion': 'Arquero'},
    4: {'Nombre': 'Facundo Medina', 'Edad': 26, 'Altura': 1.84, 'Precio': '25 Millones', 'Posicion': 'Lateral izquierdo'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 37, 'Altura': 1.83, 'Precio': '1 Millones', 'Posicion': 'Defensa central'},
    13: {'Nombre': 'Cristian Romero', 'Edad': 27, 'Altura': 1.85, 'Precio': '50 Millones', 'Posicion': 'Defensa central'},
    16: {'Nombre': 'Nahuel Molina', 'Edad': 27, 'Altura': 1.75, 'Precio': '20 Millones', 'Posicion': 'Lateral derecho'},
    7: {'Nombre': 'Rodrigo De Paul', 'Edad': 31, 'Altura': 1.80, 'Precio': '25 Millones', 'Posicion': 'Mediocentro'},
    5: {'Nombre': 'Leandro Paredes', 'Edad': 31, 'Altura': 1.80, 'Precio': '5 Millones', 'Posicion': 'Pivote'},
    8: {'Nombre': 'Enzo Fernández', 'Edad': 24, 'Altura': 1.78, 'Precio': '75 Millones', 'Posicion': 'Mediocentro'},
    9: {'Nombre': 'Julián Alvarez', 'Edad': 25, 'Altura': 1.70, 'Precio': '100 Millones', 'Posicion': 'Delantero centro'},
    10: {'Nombre': 'Lionel Messi', 'Edad': 38, 'Altura': 1.70, 'Precio': '18 Millones', 'Posicion': 'Extremo derecho'},
    11: {'Nombre': 'Thiago Almada', 'Edad': 24, 'Altura': 1.71, 'Precio': '25 Millones', 'Posicion': 'Mediocentro ofensivo'},
}

print(seleccionArgentina)

for llave, valor in seleccionArgentina.items():
    print(llave, valor)

# Agregar al menos 4 jugadores más
seleccionArgentina[5] = {'Nombre': 'Leandro Paredes', 'Edad': 31, 'Altura': 1.80, 'Precio': '5 Millones', 'Posicion': 'Pivote'},
seleccionArgentina[8] = {'Nombre': 'Enzo Fernández', 'Edad': 24, 'Altura': 1.78, 'Precio': '75 Millones', 'Posicion': 'Mediocentro'},
seleccionArgentina[9] = {'Nombre': 'Julián Alvarez', 'Edad': 25, 'Altura': 1.70, 'Precio': '100 Millones', 'Posicion': 'Delantero centro'},
seleccionArgentina[10] = {'Nombre': 'Lionel Messi', 'Edad': 38, 'Altura': 1.70, 'Precio': '18 Millones', 'Posicion': 'Extremo derecho'},
seleccionArgentina[11] = {'Nombre': 'Thiago Almada', 'Edad': 24, 'Altura': 1.71, 'Precio': '25 Millones', 'Posicion': 'Mediocentro ofensivo'},
# Mostrar cantidad de jugadores
print('Tenemos cargados en el diccionario la cantidad de:', end=' ')
print(len(seleccionArgentina))
