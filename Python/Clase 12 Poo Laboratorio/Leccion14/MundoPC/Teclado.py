# CLASE 12 POO Laboratorio

# Importamos la clase padre o superclase de la que Teclado va a heredar.
# Esto significa que un Teclado ES UN DispositivoEntrada.
from DispositivoEntrada import DispositivoEntrada


# Creamos la clase Hija: TECLADO (video 5 Py)
# La clase Teclado hereda todos los atributos y métodos de DispositivoEntrada.
class Teclado(DispositivoEntrada):
    # --- Atributos de Clase ---
    # Contador de clase: Al igual que en las otras clases, se usa para asignar un ID único a cada Teclado.
    contadorTeclado = 0

    # --- Constructor (Método de Inicialización) ---
    # Recibe los mismos argumentos que la clase padre (marca, tipoEntrada) y los propios de Teclado.
    def __init__(self, marca, tipoEntrada):
        # 1. Llamada al constructor de la clase padre (DispositivoEntrada).
        # Esto inicializa los atributos heredados (marca y tipoEntrada) en la clase padre.
        super().__init__(marca, tipoEntrada)

        # 2. Inicialización de los atributos propios de la clase Teclado.
        # Incrementamos el contador.
        Teclado.contadorTeclado += 1
        # Asignamos el ID único a esta instancia de Teclado.
        self.idTeclado = Teclado.contadorTeclado

    # --- Método Especial de Representación (String) ---
    # Sobreescribimos el método __str__ para que incluya el ID de Teclado.
    def __str__(self):
        # 1. Agregamos el ID específico de Teclado.
        # 2. Llamamos al método __str__ de la clase padre (super().__str__())
        # para obtener la información de marca y tipoEntrada, evitando duplicar código.
        return f"ID: {self.idTeclado}, {super().__str__()}"


# --- Bloque de Pruebas ---
if (__name__ == "__main__"):
    # Creamos la primera instancia de Teclado.
    teclado1 = Teclado("Redragon", "Bluetoonth")
    print(teclado1)

    # Creamos la segunda instancia de Teclado.
    teclado2 = Teclado("HP", "USB")
    print(teclado2)