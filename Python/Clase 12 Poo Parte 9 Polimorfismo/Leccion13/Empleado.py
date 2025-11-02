# CLASE 12 POO Parte 9 Polimorfísmo
# Creamos la Clase Empleado (video 2 Py)

# Clase padre. Es la clase base de la que heredarán otras clases (como Gerente, etc.).
class Empleado:
    # Hereda implícitamente de 'object', que es la clase raíz de todas las clases en Python.
    # El comentario "#No hereda si no solo de la Clase Objeto" es correcto.

    # --- Constructor (Método de Inicialización) ---
    def __init__(self, nombre, sueldo):
        # Inicializa los atributos de instancia que son comunes a TODOS los empleados.
        # Estos atributos son públicos (no tienen guion bajo).
        self.nombre = nombre
        self.sueldo = sueldo

    # --- Método Especial de Representación (String) ---
    # Define cómo se ve el objeto cuando se convierte a string (e.g., print(empleado)).
    def __str__(self):
        # Retorna una f-string formateada con el nombre y el sueldo.
        return f"Empleado: [nombre: {self.nombre}, sueldo: {self.sueldo}]"

    # Clase 12 POO Parte 9 Polimorfísmo
    # Prueba con otro objeto y método (video 5 Py)

    # --- Método de Instancia para Mostrar Detalle ---
    # Este método será clave para el Polimorfismo.
    # Por convención, todas las clases hijas heredarán y sobrescribirán este método.
    def mostrarDetalle(self):
        # Simplemente llama al método __str__ de la propia clase para obtener la representación.
        # En las clases hijas (por ejemplo, Gerente), este método será sobrescrito
        # para mostrar la información específica de esa clase.
        return self.__str__()
