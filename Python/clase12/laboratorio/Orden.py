class Orden:
    # Contador de órdenes
    contadorOrden = 0

    def __init__(self, listaComputadora):
        Orden.contadorOrden += 1
        self.idOrden = Orden.contadorOrden
        self._listaComputadora = listaComputadora  # corregido: antes estaba mal escrito

    def agregarComputadora(self, computadora):
        self._listaComputadora.append(computadora)

    def __str__(self):
        computadoras_str = ""
        for computadora in self._listaComputadora:
            computadoras_str += f"\n\t{computadora}"
        return f"Orden: {self.idOrden}\nComputadoras: {computadoras_str}"
