class MiClase:
    # Variable de clase, este atributo dará a cada objeto el mismo valor
    variabla_clase = 'Esta es una variable de clase'
    
    def __init__(self, variable_instancia): #La variable de instancia, da diferentes valores
        self.variabla_instancia = variable_instancia

print(MiClase.variabla_clase)
miClase = MiClase('Esta es una variable de instancia')
print(miClase.variabla_instancia)
print(miClase.variabla_clase)
miClase2 = MiClase('Esta es otro prueba de variable de instancia')
print(miClase2.variabla_instancia)
print(miClase2.variabla_clase)