# CLASE 12 POO Laboratorio
# Creamos una clase independiente: ORDEN (Video 8 Py)

# Definición de la clase Orden (Order)
class Orden:
    # --- Atributos de Clase ---
    # Contador de órdenes: Es un atributo de clase que se usa para asignar un ID único a cada instancia de Orden.
    # Se inicializa a 0 y se incrementará cada vez que se crea una nueva Orden.
    contadorOrden = 0

    # --- Constructor (Método de Inicialización) ---
    # Este método se llama automáticamente cuando se crea una nueva instancia de la clase (un nuevo objeto Orden).
    def __init__(self, listaComputadora):
        # 1. Incrementamos el contador de clase para obtener el siguiente ID de orden.
        Orden.contadorOrden += 1

        # 2. Asignamos el ID único a la nueva instancia (objeto) de Orden.
        self.idOrden = Orden.contadorOrden

        # 3. Asignamos la lista de objetos Computadora que se pasa como argumento
        # al atributo de instancia '_listaComputadora'.
        # Nota: El guion bajo ('_') al inicio a menudo se usa para indicar que es un atributo
        # que no debería ser modificado directamente desde fuera de la clase.
        self._listaComputadora = listaComputadora  # corregido: antes estaba mal escrito

    # --- Métodos de Instancia ---
    # Método para agregar un objeto Computadora (Computer) a la lista.
    def agregarComputadora(self, computadora):
        # Usamos el método 'append' de la lista para añadir la nueva computadora.
        self._listaComputadora.append(computadora)

    # --- Método Especial de Representación (String) ---
    # Este método se llama cuando se intenta obtener la representación en cadena (string) del objeto Orden
    # (por ejemplo, al usar print(orden) o str(orden)).
    def __str__(self):
        # Inicializamos una cadena vacía para construir la lista de computadoras.
        computadoras_str = ""

        # Iteramos sobre cada objeto Computadora en la lista de la orden.
        for computadora in self._listaComputadora:
            # Agregamos la representación en string de cada computadora a la cadena,
            # incluyendo un salto de línea (\n) y una tabulación (\t) para el formato.
            # Se asume que el objeto 'computadora' tiene un método __str__ definido.
            computadoras_str += f"\n\t{computadora}"

        # Retornamos la cadena final formateada que representa la Orden,
        # incluyendo su ID y la lista de computadoras.
        return f"Orden: {self.idOrden}\nComputadoras: {computadoras_str}"
