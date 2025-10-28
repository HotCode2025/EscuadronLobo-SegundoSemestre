class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
    def __add__(self,other):    #significa suma
        #se define con que trabajara
        return f"{self.nombre} + {other.nombre}"

    def __sub__(self, other):   #significa restar
        #se define con que trabajara
        return self.edad - other.edad


persona1 = Persona("Jose", 19)
persona2 = Persona("Altamirano", 22)

#imprime la suma de los nombres
print(persona1 + persona2)

#imprime la resta de los años
print(persona1 - persona2)