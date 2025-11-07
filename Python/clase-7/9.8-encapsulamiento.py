class persona :
    def __init__(self, nombre, apellido, dni):
        self.nombre = nombre
        self.apellido = apellido

        #es como una opcion para que no se pueda modificar
        #para encabsularlo de manera mas estricta se utiliza __ doble
        self._dni = dni
    def mostrar(self):
        print(f"mi nombre es {self.nombre} y mi apellido es {self.apellido} y dni es {self._dni}")

per1 = persona("alejandro", "botella", "560.392.63")
per1.mostrar()