class Monitor:

    #contador
    contadorMonitor = 0
    def __init__(self, marca, tamanio):
        Monitor.contadorMonitor += 1
        self.idMonitor = Monitor.contadorMonitor
        self._marca = marca
        self._tamanio = tamanio

    #metodos getter y setter
    @property
    def marca(self):
        return self._marca
    @marca.setter
    def marca(self, marca):
        self._marca = marca
    @property
    def tamanio(self):
        return self._tamanio
    @tamanio.setter
    def tamanio(self, tamanio):
        self._tamanio = tamanio

    #STR
    def __str__(self):
        return f"ID: {self.idMonitor}, Marca: {self.marca}, Tamanio: {self.tamanio}"


if (__name__ == "__main__"):
    monitor = Monitor("samsung", 27)
    print(monitor.__str__())
    monitor2 = Monitor("samsung", 24)
    print(monitor2.__str__())