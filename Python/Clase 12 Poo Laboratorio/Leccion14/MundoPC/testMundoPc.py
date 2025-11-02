# CLASE 12 POO Laboratorio

# Importamos todas las clases que vamos a utilizar desde sus respectivos módulos (archivos .py).
from Teclado import *
from Raton import *
from Monitor import *
from Computadora import *
from Orden import *

# --- Creación de la ORDEN 1 ---
# Esta sección demuestra cómo se crea una Orden, la cual agrupa varias Computadoras.

# Objetos/Componentes para PC 1 (La primera vez que se instancian, sus contadores se inicializan a 1)
raton1 = Raton("Logitech", "Bluetooth")   # ID Ratón: 1
teclado1 = Teclado("Redragon", "USB")    # ID Teclado: 1
monitor1 = Monitor("samsung", 28)        # ID Monitor: 1

# Instancia de Computadora 1 (usa los objetos creados arriba)
# Esta PC "compone" o "tiene" estos objetos.
pc1 = Computadora("PC Gamer", monitor1, teclado1, raton1) # ID Computadora: 1

# Objetos/Componentes para PC 2 (Los contadores se incrementan a 2)
raton2 = Raton("Genérico", "USB")        # ID Ratón: 2
teclado2 = Teclado("Genérico", "USB")    # ID Teclado: 2
monitor2 = Monitor("Genérico", 24)       # ID Monitor: 2

# Instancia de Computadora 2
pc2 = Computadora("PC Trabajo", monitor2, teclado2, raton2) # ID Computadora: 2

# Lista de computadoras que irán en la primera orden
computadoras = [pc1, pc2]

# Creamos la primera instancia de la clase Orden.
# El contadorOrden de la clase Orden se incrementa a 1.
orden1 = Orden(computadoras) # ID Orden: 1
#orden1.agregarComputadora(pc3)
print(orden1) # Imprimimos la Orden 1, que llama al método __str__ de Orden.


# --- Creación de la ORDEN 2 ---

# Objetos/Componentes para PC 3 (Los contadores se incrementan a 3)
raton3 = Raton("Noga", "Bluetooth")       # ID Ratón: 3
teclado3 = Teclado("Noga", "USB")        # ID Teclado: 3
monitor3 = Monitor("Gigabyte", 32)       # ID Monitor: 3

# Instancia de Computadora 3
pc3 = Computadora("PC Gamer", monitor3, teclado3, raton3) # ID Computadora: 3

# Objetos/Componentes para PC 4 (Los contadores se incrementan a 4)
raton4 = Raton("Genérico", "Bluetooth")   # ID Ratón: 4
teclado4 = Teclado("Genérico", "Bluetooth")# ID Teclado: 4
monitor4 = Monitor("Samsung", 24)        # ID Monitor: 4

# Instancia de Computadora 4
pc4 = Computadora("PC Trabajo", monitor4, teclado4, raton4) # ID Computadora: 4

# Lista de computadoras que irán en la segunda orden
computadoras2 = [pc3, pc4]

# Creamos la segunda instancia de la clase Orden.
# El contadorOrden se incrementa a 2.
orden2 = Orden(computadoras2) # ID Orden: 2
#orden1 = Orden(computadora1)', lo cual reescribía la primera orden.
#orden2 = Orden(computadoras2)' para crear la segunda orden correctamente.
print(orden2) # Imprimimos la Orden 2.

#orden1.agregarComputadora(pc3) #para agregar más computadoras a las órdenes