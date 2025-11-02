# CLASE 12 POO Laboratorio
# Creamos una clase independiente: MONITOR (video 6 Py)

# Definición de la clase Monitor.
class Monitor:
    # --- Atributos de Clase ---
    # Contador de clase: Almacena cuántos objetos Monitor se han creado.
    # Es un contador compartido por todas las instancias de Monitor.
    contadorMonitor = 0

    # --- Constructor (Método de Inicialización) ---
    # Se ejecuta al crear un nuevo objeto Monitor. Recibe la marca y el tamaño.
    def __init__(self, marca, tamaño):
        # 1. Incrementamos el contador de clase para obtener el siguiente ID.
        Monitor.contadorMonitor += 1

        # 2. Asignamos el ID único a esta instancia específica de Monitor.
        self.idMonitor = Monitor.contadorMonitor

        # 3. Asignamos la marca y el tamaño a los atributos de instancia encapsulados.
        # El guion bajo (_) indica que son atributos internos de la clase.
        self._marca = marca
        self._tamaño = tamaño

    # --- Propiedades (Getters y Setters) ---
    # Permiten acceder y modificar los atributos encapsulados (_marca, _tamaño)
    # de forma controlada.

    @property  # Getter: Permite leer el valor de la marca.
    def marca(self):
        return self._marca

    @marca.setter  # Setter: Permite modificar el valor de la marca.
    def marca(self, marca):
        self._marca = marca

    @property  # Getter: Permite leer el valor del tamaño.
    def tamaño(self):
        return self._tamaño

    @tamaño.setter  # Setter: Permite modificar el valor del tamaño.
    def tamaño(self, tamaño):
        self._tamaño = tamaño

    # --- Método Especial de Representación (String) ---
    # Define la representación en cadena del objeto.
    # Se llama automáticamente al usar 'print(monitor)' o 'str(monitor)'.
    def __str__(self):
        # Retornamos una f-string concisa con la información clave del Monitor.
        return f"ID: {self.idMonitor}, Marca: {self.marca}, Tamaño: {self.tamaño}"


# --- Bloque de Pruebas (Solo se ejecuta si este archivo es el principal) ---
if (__name__ == "__main__"):
    # Creamos la primera instancia de Monitor. contadorMonitor pasa a 1.
    monitor1 = Monitor("Samsung", 27)
    # Imprimimos la representación en string del objeto.
    # Nota: Es más común usar 'print(monitor1)' que 'print(monitor1.__str__())'.
    print(monitor1.__str__())

    # Creamos la segunda instancia de Monitor. contadorMonitor pasa a 2.
    monitor2 = Monitor("Samsung", 24)
    # Imprimimos la representación en string del objeto.
    print(monitor2.__str__())