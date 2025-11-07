class persona:
    def __init__(self, edad, nombre, apellido):
        self.edad = edad
        self.nombre = nombre
        self.apellido = apellido

per1 = persona(20, "orlando", "zelada")
print(per1)


#de esta manera se crea nuevos atributos a un objeto creado
per1.num = 2622282520
print(per1.num)