from DispositivoEntrada import *
class Teclado(DispositivoEntrada):

    contadorTeclado = 0 #contador
    def __init__(self, marca, tipoEntrada):
        super().__init__(marca, tipoEntrada)
        Teclado.contadorTeclado += 1
        self.idTeclado = Teclado.contadorTeclado
    def __str__(self):
        return f"ID: {self.idTeclado}, {super().__str__()}"


if (__name__ == "__main__"):
    teclado = Teclado("Redragon", "Bluetoonth")
    print(teclado)