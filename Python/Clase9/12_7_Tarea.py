# Clase padre: FiguraGeometrica
class FiguraGeometrica:
    def __init__(self, alto, ancho):
        self.alto = alto
        self.ancho = ancho

    def get_alto(self):
        return self.alto

    def get_ancho(self):
        return self.ancho

    def set_alto(self, alto):
        self.alto = alto

    def set_ancho(self, ancho):
        self.ancho = ancho

    def __str__(self):
        return f"Figura Geométrica -> Alto: {self.alto}, Ancho: {self.ancho}"


# Clase padre: Color
class Color:
    def __init__(self, color):
        self.color = color

    def get_color(self):
        return self.color

    def set_color(self, color):
        self.color = color

    def __str__(self):
        return f"Color -> {self.color}"


# Clase hija: Cuadrado
class Cuadrado(FiguraGeometrica, Color):
    def __init__(self, lado, color):
        FiguraGeometrica.__init__(self, lado, lado)  # mismo valor para alto y ancho
        Color.__init__(self, color)

    def area(self):
        return self.alto * self.ancho

    def __str__(self):
        return f"Cuadrado de color {self.color}, lado = {self.alto}, área = {self.area()}"


# Clase hija: Rectangulo
class Rectangulo(FiguraGeometrica, Color):
    def __init__(self, alto, ancho, color):
        FiguraGeometrica.__init__(self, alto, ancho)
        Color.__init__(self, color)

    def area(self):
        return self.alto * self.ancho

    def __str__(self):
        return f"Rectángulo de color {self.color}, alto = {self.alto}, ancho = {self.ancho}, área = {self.area()}"


# Ejemplo de uso
cuadrado1 = Cuadrado(5, "rojo")
rectangulo1 = Rectangulo(4, 6, "azul")

print(cuadrado1)
print(rectangulo1)