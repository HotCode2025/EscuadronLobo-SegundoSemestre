from abc import ABC, abstractmethod
#ABC significa: Abstract Base Class, convierte una clase en abstracta

class FiguraGeometrica(ABC):
    def __init__(self, alto, ancho):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            self.alto = 0
            print(f'Valor erroneo para el alto: {alto}')
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self.ancho = 0
            print(f'Valor erroneo para el ancho: {ancho}')
    
    @property
    def alto(self): # Método Getter
        return self._alto
    
    @alto.setter # SI QUITAMOS O NO AGREGAMOS EL SETTER SE HACE SOLO LECTURA. SOLO SE PODRIA MODIFICAR INSTANCIANDO, NO DIRECTAMENTE
    def alto(self, alto): # Método Setter
        if self._validar_valores(alto):
            self._alto = alto
        else:
            print(f'Valor erroneo para el alto: {alto}')
        
    @property
    def ancho(self): # Método Getter
        return self._ancho
    
    @ancho.setter
    def ancho(self, ancho): # Método Setter
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            print(f'Valor erroneo para el ancho: {ancho}')
    
    @abstractmethod #Esto hace que sea OBLIGATORIO que las clases hijas tengan implementado el metodo abstracto del Padre
    def calcular_area(self): 
        pass
    
    def __str__(self):
        return f'FiguraGeometrica [Alto: {self._alto}, Ancho: {self._ancho}]'
    
    def _validar_valores(self, valor):
        return True if 0 < valor < 10 else False