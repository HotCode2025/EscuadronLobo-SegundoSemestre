from teclado import *
from Raton import *
from Monitor import *


class Computadora:
    #contador
    contadorComputadora = 0
    def __init__(self, nombre, monitor, teclado, raton):
        Computadora.contadorComputadora += 1
        self.idConputadora = Computadora.contadorComputadora
        self._nombre = nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton

    #getter y setter
    @property
    def nombre(self):
        return self._nombre
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre
    @property
    def monitor(self):
        return self._monitor
    @monitor.setter
    def monitor(self, monitor):
        self._monitor = monitor
    @property
    def teclado(self):
        return self._teclado
    @teclado.setter
    def teclado(self, teclado):
        self._teclado = teclado
    @property
    def raton(self):
        return self._raton
    @raton.setter
    def raton(self, raton):
        self._raton = raton

    #STR
    def __str__(self):
        return f"""Nombre: {self._nombre}: ID {self.idConputadora}
                Monitor: {self._monitor}
                Teclado: {self._teclado}
                Raton: {self._raton}"""


if (__name__ == "__main__"):
    #objetos
    raton1 = Raton("logitech", "Bluetoon")
    teclado1 = Teclado("Redragon", "USB")
    monitor1 = Monitor("samsung", 28)
    pc1 = Computadora("PC gamer", monitor1, teclado1, raton1)
    print(pc1)

    #objetoo 2
    raton2 = Raton("Generico", "USB")
    teclado2 = Teclado("Generico", "USB")
    monitor2 = Monitor("Generico", 24)
    pc2 = Computadora("PC Trabajo", monitor2, teclado2, raton2)
    print(pc2)
