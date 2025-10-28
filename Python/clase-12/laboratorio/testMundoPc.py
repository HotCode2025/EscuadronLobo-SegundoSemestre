from teclado import *
from Raton import *
from Monitor import *
from Computadora import *
from Orden import *

#orden 1
# objetos
raton1 = Raton("logitech", "Bluetoon")
teclado1 = Teclado("Redragon", "USB")
monitor1 = Monitor("samsung", 28)
pc1 = Computadora("PC gamer", monitor1, teclado1, raton1)

# objetoo 2
raton2 = Raton("Generico", "USB")
teclado2 = Teclado("Generico", "USB")
monitor2 = Monitor("Generico", 24)
pc2 = Computadora("PC Trabajo", monitor2, teclado2, raton2)

#lista de computadores
conputadoras = [pc1, pc2]
orden = Orden(conputadoras)
print(orden)

#orden 2
raton3 = Raton("Noga", "Bluetoon")
teclado3 = Teclado("Noga", "USB")
monitor3 = Monitor("Gigabyte", 32)
pc3 = Computadora("PC gamer", monitor3, teclado3, raton3)

# objetoo 2
raton4 = Raton("Generico", "Bluetoon")
teclado4 = Teclado("Generico", "Bluetoon")
monitor4 = Monitor("Samsung", 24)
pc4 = Computadora("PC Trabajo", monitor4, teclado4, raton4)

#lista de computadores
conputadora2 = [pc3, pc4]
orden = Orden(conputadoras)
print(orden)