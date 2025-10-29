from Empleado import *
from Gerente import *
def imprimirDetalles(objeto):
    print(objeto)#de manera indirecta se llama ala clase padre con la funcion STR
    print(type(objeto))#rdto es para saber el tipo de dato que es

    #errores y validacion intance // si solo se imprime con un print dara error
    if (isinstance(objeto, Gerente)):
        print(objeto.departamento)

empleado = Empleado("zelada", 40000)
imprimirDetalles(empleado)

gerente = Gerente("Tupungato", "zelada", 80000)
imprimirDetalles(gerente)

