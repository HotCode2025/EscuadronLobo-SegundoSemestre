from abc import ABC, abstractmethod

class Figurageometrica(ABC):
    def __init__(self, alto, ancho):

        #validaciones, si ancho es mayor a 0 y menor a 10 tendra el mismo resultado
        self._alto = alto
        #   Metodo encabsulado
        if self._validaciones_(alto):
            self.alto = alto
        #si alto es menor a 0 y mayor a 10 su resultado sera 0
        else:
            self.alto = 0

        self._ancho = ancho
        if self._validaciones_(ancho):
            self.ancho = ancho
        else:
            self.ancho = 0

    @property
    def alto(self):
        return self._alto
    @alto.setter
    #metodo encapsulado
    def alto(self, newAlto):
        if self._validaciones_(newAlto):
            self._alto = newAlto
    @property
    def ancho(self):
        return self._ancho

    @ancho.setter
    #metodo encapsulado
    def ancho(self, newAncho):
        if self._validaciones_(newAncho):
            self._ancho = newAncho

    #este es el metodo astracto que se importo/ este metodo obliga a que la funcion are este implemetado en todas las clases
    @abstractmethod
    def area(self):
        #pass sirve para definirlo
        pass


    def __str__(self):
        return f"{self._alto} , {self._ancho}"

    def _validaciones_(self, valor):
        return True if 0 < valor < 10 else False