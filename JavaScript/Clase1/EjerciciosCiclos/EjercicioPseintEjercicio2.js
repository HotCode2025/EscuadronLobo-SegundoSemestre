/*//Clase 3a - Capítulo 6: Estructuras Repetitivas
// Calcular el factorial de un número mayor o igual a 0. 

Proceso Ejercicio5
	Definir i, num, factorial Como Entero;
	factorial <- 1;
	Repetir
		Escribir "Ingrese un número entero para calcular su factorial:";
		Leer num;
	Hasta Que num >= 0;
  	
  	Para i <- num Hasta 1 Con Paso -1 Hacer
  		factorial <- factorial * i;
  	Fin Para
	Escribir num, "! = ", factorial;

FinProceso
*/
factorial = 1;

do { //Repetimos el ciclo hasta que se haya ingresado un numero positivo
    num = parseInt(prompt("Ingrese un número entero para calcular su factorial"))
} while (num < 0); // mientras se menor menor o igual a cero va a repetir el bucle

for (let i = num; i > 0; i--){
    console.log(i)
    console.log(num)
    factorial = factorial * i;
}
console.log( num + "! = " + factorial);
