class persona :
    def __init__(self, nombre, apellido, *args, **kwargs):
        self.nombre = nombre
        self.apellido = apellido
        self.args = args
        self.kwargs = kwargs
    def mostrar(self):
        print(f"soy {self.nombre} {self.apellido} y vivo en : {self.args} {self.kwargs}")

per1 = persona("arturo", "zabala", "tupungato", "19 de septiembre", "primer piso")
per1.mostrar()