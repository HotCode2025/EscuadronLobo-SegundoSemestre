from Figurageometrica import *
from Color import *
class cuadrado(Figurageometrica, Color):
    def __init__(self, alto, ancho, color):
        Figurageometrica.__init__(self, alto, ancho)
        Color.__init__(self, color)

    def area(self):
        return self._alto * self._ancho
