class MiClase:
    #variable de clase,este atributo dara a cada objeto el mismo valor
    variableDeClase = "esta es una variable de clase"

    #la variable de indtancia da diferentes valores
    def __init__(self, variableDeInstancia):
        self.variableDeInstancia = variableDeInstancia


print(MiClase.variableDeClase)

miclase = MiClase("mi variable de instancia")
print(miclase.variableDeInstancia)

#para acceder a esta variable se necesita averle asignado una instancia y desde esa instancia se accede a la variable de clase
print(miclase.variableDeClase)
#en las variable de instancia se le puede cambiar de valor
miclase2 = MiClase("esta es otra variable de instancia")