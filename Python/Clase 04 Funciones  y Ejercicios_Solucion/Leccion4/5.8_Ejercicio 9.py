# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le
# devolverá la misma frase pero sin espacios en blanco, y
# además un contador de cuántos caracteres tiene la frase
# (sin contar los espacios en blanco)
# Ejemplo:
# frase = vivir por siempre en paz
# frase_final = vivirporsiempreenpaz
# N° de caracteres = 20

# ingrese una frase
frase = input("Ingrese una frase: ")

# Eliminamos los espacios en blanco y contamos los caracteres
frase_final = frase.replace(" ", "")
n_caracteres = len(frase_final)

# Mostramos la frase sin espacios y el número de caracteres
print("Frase sin espacios:", frase_final)
print("Número de caracteres =", n_caracteres)