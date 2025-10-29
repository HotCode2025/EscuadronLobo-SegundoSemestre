from DispositivoEntrada import *

class Raton(DispositivoEntrada):

    contador_ratones = 0 #este es un contador
    def __init__(self, marca, tipoEntrada):
        super().__init__(marca, tipoEntrada)
        Raton.contador_ratones += 1
        self.idRaton= Raton.contador_ratones
    def __str__(self):
        return f"ID: {self.idRaton}, {super().__str__()}"

if __name__ == "__main__":
    raton = Raton("redragon", "USB")
    print(raton)