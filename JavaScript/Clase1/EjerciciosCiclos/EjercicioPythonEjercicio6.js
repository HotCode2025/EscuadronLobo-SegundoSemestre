/*
# Clase 9 - Ejercicios
# Ejercicio 4: Calificaciones de Alumnos
# Suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos. 
# Realizar un algoritmo para calcular la calificación promedio y la calificación más baja de todo el grupo

total = 0
menor = 99
for i in range(1, 11):
    notas = float(input(f"Ingrese nota {i}: "))
    total += notas
    if notas < menor:
        menor = notas
promedio = total / 10
print(f"El promedio de las calificaciones ingresadas es: {promedio}")
print(f"La calificación más baja es: {menor}")
*/

total = 0;
menor = 99;
for (let i = 1; i <= 10; i++){ 
    mensaje = "Ingrese la nota " + i;
    nota = parseFloat(prompt(mensaje));
    total += nota;
    console.log(nota);
    if (nota < menor){
        menor = nota;
    }
}
promedio = total / 10;
console.log("El promedio de las calificaciones ingresadas es: ", promedio);
console.log("La calificación más baja es: ", menor);