class Persona:
    #contador
    contadorPersona = 0

    #para mejorar se usar el class metodo
    @classmethod
    def contador(cls):
        cls.contadorPersona += 1
        return cls.contadorPersona


    def __init__(self ,nombre, edad):
        #[[[por objeto creado se sumara 1 al contador
        #Persona.contadorPersona += 1]]]

        #[[[y IDpersona tomara ese valor actualizandolo al crear un nuevo objeto
        #self.IDpersona = Persona.contadorPersona]]]

        #modo mejorado
        self.IDpersona = Persona.contador()

        self.nombre = nombre
        self.edad = edad

    #imprimimos
    def __str__(self):
        return f"ID: {self.IDpersona}= {self.nombre}, {self.edad}"

persona1 = Persona("orlando", 19)
print(persona1)
persona2 = Persona("zelada", 22)
print(persona2)
persona3 = Persona("Gira", 23)
print(persona3)