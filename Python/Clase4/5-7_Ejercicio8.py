# Ejercicio 8: Menú interactivo Cajero automatico
# Hacer un programa que simule un cajero automatico con un saldo inicial de 1000$ y tendrá el siguiente menú de opciones:
# 1. Ingresar dinero en la cuenta
# 2. Retirar dinero de la cuenta
# 3. Mostrar dinero disponible
# 4. Salir
saldo = 1000
while True:
    print("-----------------------------------")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. salir")
    opcion = int(input("Ingrese la opcion: "))
    if opcion == 1:
        ingresar = int(input("Dinero a ingresar: "))
        saldo += ingresar
    if opcion == 2:
        retirar = int(input("cuanto dinero desea retirar:"))
        saldo -= retirar
        if saldo < 0:
            print("Saldo Insuficiente...")
    if opcion == 3:
        print(f"Su saldo es: {saldo}")
    if opcion == 4:
        print("Hasta luego..")
        break
