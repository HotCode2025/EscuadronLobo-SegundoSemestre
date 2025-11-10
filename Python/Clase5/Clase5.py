#Clase 5:
#Video 6.3 Desempaquetado de listas o list Unpacking
def show(name,lastName):
     print(name+' '+lastName)
person = ["Valeria", "Pinaya"]
show(person[0],person[1]) #Pasamos uno por uno los datos de la lista a la funcion
show(*person) #Esto es lo mismo que lo anterios pero lo pasamos todo junto
person2 = ("Martina", "Pinaya") #Desempaquetamos a traves de una tupla
show(*person2)
person3 ={"lastName": "Martin", "name": "Lautaro"}
show(**person3)

#Video 6.4 Repaso del ciclo for else
numbers = [1, 2, 3, 4, 5] #Aun con la losta vacia el else se ejecuta
for n in numbers:
    print(n)
    #if n == 3:
    #break #esta es la unica manera para que no se ejecute el else
else:
    print("Esto se terminó")

#Video 6.5 List Comprehension: Lista de comprensión
names = ["Noelia", "Paola", "Pepe", "Sofia", "Marta", "Franco"]
alongP = [p for p in names if p[0] == 'P'] #Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mexico"},
           {"name": "Stella Artois", "country": "Belgium"},
]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

#Video 6.6: Funciones:Paso de Argumentos
def mi_funcion2(name, lastName):
    print("Saludos a todos los que ven a traves del canal de YouTube")
    print(f"Nombre:{name}, Apellido: {lastName}")
mi_funcion2('Valeria','Pinaya')
mi_funcion2("Alejandra", "Pinaya")

#Video 6.7:Funciones:Palabra return
#Creamos una funcion para sumar
def sumar(a,b):
    return a + b
#resultado = sumar(78 ,22)
#print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55, 45)}')

#Video 6.8:Funciones: Valores por Default en Argumentos
def sumar2(a:int = 0, b:int = 0) -> int : #le damos un valor por default
    return a + b
resultado = sumar2()
print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar2(22, 66)}')

#Video 6.9 Funciones:Argumentos, Variables en funciones
def listarNombres(*nombres): #Normalmnte se utiliza: *args
    for nombre in nombres: #Se va a covertir en una tupla
        print(nombre)
listarNombres('Lucas', 'Jose', 'Claudia', 'Rosa', 'Maria')
listarNombres('Marcos', 'Daniel', 'Romina', 'Carlos', 'Marcela')

#Clase 5 parte 3 Funciones Recursivas
#Video 7.2 Argumentos variables para un diccionario

def listarTerminos(**terminos): #Los mas utilizado es **kwargs para recibir los argumentos
    for llave, valor in terminos.items(): #kwargs significa: key word argument
        print(f'{llave} : {valor}')
listarTerminos() #No recibe nada,nada se va a listar
listarTerminos(IDE='Integrated Develoment Enviroment', PK = 'Primary Key')
listarTerminos(Nombre='Leonel Messi')

#Video 7.3 Lista de elementos con funciones(Convertir)
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10) #No es un objeto iterable
desplegarNombres((10, 11)) #La convertimos a una tupla, en un solo elemento no olvidar la coma
desplegarNombres([22, 55]) #La convertimos en una lista

#Video 7.4 Funciones recursivas con factorial
#Funcion recursiva se manda a llamar a si misma para completar una tarea.
def factorial(numero):
    if numero == 1: #Caso base
        return 1
    else:
        return numero*factorial(numero-1) #Caso recursivo
numeroFactorial = int(input("Digite el numero para calcular el factorial: "))
resultado = factorial(5) #Lo hacemos en codigo duro
print(f'El factorial del numero 5 es: {resultado}')


