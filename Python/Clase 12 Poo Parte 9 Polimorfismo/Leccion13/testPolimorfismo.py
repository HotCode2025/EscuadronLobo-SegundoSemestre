#Clase 12 Poo Parte 9 Polimorfísmo: Múltiples formas en tiempo de ejecución
#Creamos la plantilla de test_polimorfismo (video 4 Py)

from Empleado import *
from Gerente import *

def imprimirDetalles(objeto):
    #print(objeto)#De manera indirecta se llama al "str" de la clase Empleado o Gerente
    print(type(objeto))#Esto es para saber el tipo de dato que recibe

# Clase 12 Poo Parte 9 Polimorfísmo
# Prueba con otro objeto y método (video 5 Py)
    print(objeto.mostrarDetalle())

# Clase 12 Poo Parte 9 Polimorfísmo
# Prueba de errores y validación con: métodos isinstance() (video 6 Py)
    #Si solo se imprime con un print dara error
    if isinstance(objeto, Gerente):#Esto pregunta si un objeto que estamos viendo o apuntando
                                    # pertenece a cierta clase
            print(objeto.departamento)

empleado = Empleado("Cecilia", 40000)
imprimirDetalles(empleado)

#Clase 12 Poo Parte 9 Polimorfísmo
#Pruebas con otros objetos y métodos (video 5 Py)
gerente = Gerente("Sistemas", "Andrea", 80000)
imprimirDetalles(gerente)

# Clase 12 Poo Parte 9 Polimorfísmo
#Debug (paso a paso) en Polimorfismo (video 7 Py)