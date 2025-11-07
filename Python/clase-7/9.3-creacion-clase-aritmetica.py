class opaercio:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def suma(self):
        return  self.a + self.b


sumar = opaercio(1, 2)
print(sumar.suma())