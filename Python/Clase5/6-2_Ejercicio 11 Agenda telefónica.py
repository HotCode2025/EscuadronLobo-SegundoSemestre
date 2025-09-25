# Ejercicio 11: Agenda telefónica
#Hacer un programa que simule una agenda de contactos.Crear un diccionario
#donde la clave sea nombre del ususario y el valor sea el teléfono,
#el programa tendrá el siguiente menú de opciones:
#       1.Nuevo contacto
#       2.Borrar contacto
#       3.Ver contactos exixtentes
#       4.Salir
def mostrar_menu():
    print("\n--- AGENDA TELEFÓNICA ---")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")

def agenda_telefonica():
    agenda = {}  # Diccionario donde clave = nombre, valor = teléfono
    
    while True:
        mostrar_menu()
        opcion = input("Elige una opción: ")

        if opcion == "1":
            nombre = input("Ingrese el nombre del contacto: ")
            telefono = input("Ingrese el número de teléfono: ")
            agenda[nombre] = telefono
            print(f"Contacto '{nombre}' agregado correctamente.")

        elif opcion == "2":
            nombre = input("Ingrese el nombre del contacto a borrar: ")
            if nombre in agenda:
                del agenda[nombre]
                print(f"Contacto '{nombre}' eliminado.")
            else:
                print("El contacto no existe.")

        elif opcion == "3":
            if agenda:
                print("\n Contactos guardados:")
                for nombre, telefono in agenda.items():
                    print(f" - {nombre}: {telefono}")
            else:
                print("No hay contactos guardados.")

        elif opcion == "4":
            print("Saliendo de la agenda. ¡Hasta luego!")
            break

        else:
            print("Opción no válida. Intente de nuevo.")

# Ejecutar la agenda
agenda_telefonica()
