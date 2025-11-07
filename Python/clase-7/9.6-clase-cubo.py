class cubo:
    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad

    def operacion(self):
        volumen = self.ancho * self.altura * self.profundidad
        return volumen

#definimos los datos
ancho = int(input("Ingresa la base: "))
altura = int(input("Ingresa la altura: "))
profundidad = int(input("Ingresa la profundidad: "))

#guarda la clase y pasa los datos definidos como argumento
calculo = cubo(ancho, altura, profundidad)

#lama ala operacion de  la clase cubo guardada en calculo
print(calculo.operacion())