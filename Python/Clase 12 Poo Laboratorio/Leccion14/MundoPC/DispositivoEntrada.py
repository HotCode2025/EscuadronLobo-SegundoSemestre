# CLASE 12 POO Laboratorio
# Creamos la clase PADRE: Dispositivo de Entrada (video 3 Py)

# Definición de la clase base.
class DispositivoEntrada:

    # --- Constructor (Método de Inicialización) ---
    # Se ejecuta al crear un objeto de esta clase o al ser llamado por una clase hija (Teclado/Raton) a través de super().
    # Esta clase NO necesita un contador, ya que son las clases hijas las que llevan el registro de sus IDs específicos.
    def __init__(self, marca, tipoEntrada):
        # Asignamos los atributos principales que son comunes a TODOS los dispositivos de entrada.
        # Estos atributos son encapsulados (con el guion bajo) y son heredados por Teclado y Raton.
        self._marca = marca
        self._tipoEntrada = tipoEntrada

    # --- Propiedades (Getters y Setters) ---
    # Permiten leer y modificar los atributos encapsulados (encapsulamiento).

    @property  # Getter para obtener el tipo de entrada
    def tipoEntrada(self):
        return self._tipoEntrada

    @tipoEntrada.setter  # Setter para modificar el tipo de entrada
    def tipoEntrada(self, tipoEntrada):
        self._tipoEntrada = tipoEntrada

    @property  # Getter para obtener la marca
    def marca(self):
        return self._marca

    @marca.setter  # Setter para modificar la marca
    def marca(self, marca):
        self._marca = marca

    # --- Método Especial de Representación (String) ---
    # Define la representación en cadena del objeto (lo que se hereda).
    # Este método es llamado por las clases hijas (Teclado y Raton) a través de super().__str__().
    def __str__(self):
        return f" Marca: {self._marca}, Tipo de entrada: {self._tipoEntrada}"


# --- Bloque de Pruebas ---
# Esto solo se ejecuta si corres este archivo directamente, no cuando lo importas.
if (__name__ == "__main__"):
    # Creamos un objeto directamente de la clase Padre (DispositivoEntrada).
    disp = DispositivoEntrada("redragon", "USB")
    print(disp)