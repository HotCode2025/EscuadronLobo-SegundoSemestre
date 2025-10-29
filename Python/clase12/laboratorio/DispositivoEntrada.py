class DispositivoEntrada:
    def __init__(self, marca ,tipoEntrada):
        self._marca = marca
        self._tipoEntrada = tipoEntrada

    #metodos getter y setter
    @property
    def tipoEntrada(self):
        return self._tipoEntrada
    @tipoEntrada.setter
    def tipoEntrada(self, tipoEntrada):
        self._tipoEntrada = tipoEntrada
    @property
    def marca(self):
        return self._marca
    @marca.setter
    def marca(self, marca):
        self._marca = marca

    #imprimir
    def __str__(self):
        return f" Marca: {self._marca}, Tipo de entrada: {self._tipoEntrada}"

if (__name__ == "__main__"):
    disp = DispositivoEntrada("redragon", "USB")
    print(disp)