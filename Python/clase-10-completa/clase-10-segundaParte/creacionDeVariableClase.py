class MiClase:
    #variable de clase,este atributo dara a cada objeto el mismo valor
    variableDeClase = "esta es una variable de clase"

    #la variable de indtancia da diferentes valores
    def __init__(self, variableDeInstancia):
        self.variableDeInstancia = variableDeInstancia


    #metodos estaticos, estos metodos estaticos se asocian con la clase
    @staticmethod
    def metodo_estatico():
        print(MiClase.variableDeClase)


    #metodos de clase
    @classmethod
    def metodo_de_clase(cls):
        print(cls.variableDeClase)

    #contexto
    def metodo_de_instancia(self):
        self.metodo_estatico()
        self.metodo_de_clase()
        print(self.variableDeClase)
        print(self.variableDeInstancia)


print(MiClase.variableDeClase)

miclase = MiClase("mi variable de instancia")
print(miclase.variableDeInstancia)

#para acceder a esta variable se necesita averle asignado una instancia y desde esa instancia se accede a la variable de clase
print(miclase.variableDeClase)
#en las variable de instancia se le puede cambiar de valor
miclase2 = MiClase("esta es otra variable de instancia")


#para poder crear una variable de clase desde cualquier lado de la pag
MiClase.variableDeClase2 = "esta es mi segunda variable de clase"
print(miclase.variableDeClase2)
print(miclase2.variableDeClase2)

#este es e metodo estatico
MiClase.metodo_estatico()

#este es un metodo de clase
MiClase.metodo_de_clase()

#contexto
miobjeto = MiClase("variable de instancia")
miobjeto.variableDeClase
miobjeto.variableDeInstancia







