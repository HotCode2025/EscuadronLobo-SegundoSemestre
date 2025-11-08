class Vehiculo:
    """
    Definir una clase padre llamada vehiculo y dos clases hijas llamadas
    autos y bicicleta, las cuales heredan de la clase padre vehiculo. La clase
    debe tener los siguientes atributos y métodos:

    Vehiculos (Clase padre)
    -Atributos(color, ruedas)
    _Métodos(__init__(color, ruedas) y __str__())

    Autos (Clase hija de vehiculo)
    -Atributos(velocidad(km/hr))
    -Métodos(__init__(color, ruedas, velocidad) y __str__())

    Bicicleta(Clase hija de vehiculo)
    -Atributos(tipo(urbana/montaña/etc))
    -Métodos(__init__(color, ruedas, tipo) y __str__())

    Crear un objeto de cada clase
    """

    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return "Color: "+ self.color + ", Ruedas: "+ str(self.ruedas)

class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__()+", Velocidad(km/hr): "+ str(self.velocidad)

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__()+ ", Tipo: "+self.tipo


#Primero objeto de la clase padre Vehiculo
vehiculo = Vehiculo("Blanco", 4)
print(vehiculo)

#Segundo objeto, Pero ahora de la clase Auto
auto = Auto("Amarillo", 4, 120)
print(auto)

#Tercer objetos, pero ahora de la clase Bicicleta
bici = Bicicleta("Azul", 2, "Urbana")
print(bici)
