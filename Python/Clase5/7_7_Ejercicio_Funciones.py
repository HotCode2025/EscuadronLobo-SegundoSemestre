# 7.7 Ejercicio 5 Funciones (Celsius a Fahrenheit)
# Ejerciccio 5: Convertidor de temperatura 
# Realizar dos funciones para convertir de grados Celsius a Fahrenheit y viceversa.
# Investigar las formualas
def celsius_a_fahrenheit(celsius):
    return (celsius * 9/5) + 32

def fahrenheit_a_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9
print("0° C son: ",celsius_a_fahrenheit(0), "°F")      # 32.0
print("100° C son: ",celsius_a_fahrenheit(100), "°F")  # 212.0
print("32° F son: ",fahrenheit_a_celsius(32), "°C")    # 0.0
print("212° F son: ",fahrenheit_a_celsius(212), "°C")  # 100.0
