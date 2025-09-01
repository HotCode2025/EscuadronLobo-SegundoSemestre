# Ejericio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro de un rango
# por ejemplo:
#   suma de números pares del 2 al 30
#   suma = 240

pares = 0
for i in range(0,31,1):
    if i % 2 == 0:
        pares += i
print(pares)