# 8.1 Creación de una clase
#class Persona:
#    pass  # no se procesa nada mas (no tiene contenido)

#print(type(Persona))

# 8.2 Atributos en métodos y creación de un objeto
'''
class Persona:
    def  __init__(self):   # se lo llama metodo init dunder
        self.nombre = 'Juan'
        self.apellido = 'Zalazar'
        self.edad = 22

persona1 = Persona()
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
'''
# 8.3 Creación de objetos con argumentos

class Persona:
    def  __init__(self, nombre, apellido, edad):   # se lo llama metodo init dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    # 8.8 Métodos de instancia: Definimos un método
    def mostar_detalles(self):
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')



persona1 = Persona('Ariel','Betancud', 40)  # necesitamos enviar argumentos 
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

print(f'El objeto1 de la clase persona es: {persona1.apellido}, {persona1.nombre} y que tiene {persona1.edad} años')

# 8.4 Creamos más objetos en una clase

persona2 = Persona('Osvaldo', 'Giordanini', 45)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

# 8.5 Referencias de memoria de objetos con el Debug

# 8.6 Modificar atributos de un objeto
persona1.nombre = 'Liliana'
persona1.apellido = 'Bucella'
persona1.edad = 40
print(f'El objeto1 modificado de la clase persona es: {persona1.apellido}, {persona1.nombre} y que tiene {persona1.edad} años')

# 8.7 Métodos de instancia. crear UML
# los atributos son: caracteristicas
# los metodos son: el comportamiento que van a tener los objetos (acciones)

# 8.8 Métodos de instancia: Definimos un método

persona1.mostar_detalles()
persona2.mostar_detalles()


##   Clase 7 POO Parte 2  ##


# 9.1 Palabra reservada self y atributos de instancia

# Persona.mostrar_detalle(persona1)  # debemso pasarle una referencia para el self o dara error
