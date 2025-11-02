# CLASE 12 POO Laboratorio

# Importamos la clase padre (superclase) de la que Raton va a heredar.
# Esto establece la relación de herencia: Raton ES UN DispositivoEntrada.
from DispositivoEntrada import DispositivoEntrada


# Creamos la clase Hija: RATÓN (video 4 Py)
# Raton hereda los atributos y métodos genéricos de DispositivoEntrada.
class Raton(DispositivoEntrada):
    # --- Atributos de Clase ---
    # Contador de clase: Al igual que en Teclado, se usa para asignar un ID único a cada objeto Raton.
    contador_ratones = 0

    # --- Constructor (Método de Inicialización) ---
    # Se ejecuta al crear un objeto Raton. Recibe la marca y el tipo de entrada.
    def __init__(self, marca, tipoEntrada):
        # 1. Llamada al constructor de la clase padre (DispositivoEntrada).
        # Esto inicializa los atributos heredados (marca y tipoEntrada) usando el código de la clase superior.
        super().__init__(marca, tipoEntrada)

        # 2. Inicialización de los atributos propios de la clase Raton.
        # Incrementamos el contador.
        Raton.contador_ratones += 1
        # Asignamos el ID único a esta instancia de Raton.
        self.idRaton = Raton.contador_ratones

    # --- Método Especial de Representación (String) ---
    # Sobreescribimos el método __str__ para mostrar el ID específico del ratón.
    def __str__(self):
        # 1. Agregamos el ID de Raton.
        # 2. Llamamos al método __str__ de la clase padre (super().__str__())
        # para obtener la información de marca y tipoEntrada, completando la descripción.
        return f"ID: {self.idRaton}, {super().__str__()}"


# --- Bloque de Pruebas ---
# Hacemos pruebas
if __name__ == "__main__":
    # Creamos la primera instancia de Raton.
    raton1 = Raton("Redragon", "USB")
    print(raton1)

    # Creamos la segunda instancia de Raton.
    raton2 = Raton("HP", "Bluetooth")
    print(raton2)