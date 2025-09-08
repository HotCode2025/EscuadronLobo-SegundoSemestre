/*
//Clase 3a - Capítulo 6: Estructuras Repetitivas
// Imprimir la serie de los "N" términos de la serie de Fibonacci. 

Proceso Ejercicio11
	Definir i, num1, num2, aux, n_elementos Como Entero;	
	Repetir
		Escribir "Ingrese el total de terminos que quiere imprimir:";
		Leer n_elementos;
	Hasta Que n_elementos > 0
	num1 <- 0;
	num2 <- 1;
	Escribir Sin Saltar num1,",", num2;
	i <- 3;
	Repetir
		aux <- num1;
		num1 <- num2;
		num2 <- num2 + aux;
		Escribir Sin Saltar ",", num2;
		i <- i + 1;
	Hasta Que i > n_elementos
FinProceso
*/
do {
    nElementos = parseInt(prompt("Ingrese el total de términos que quiere imprimir"));
} while (nElementos < 0);
num1 = 0;
num2 = 1;
console.log(num1 + "," + num2);
i = 3;
do {
    aux = num1;
    num1 = num2;
    num2 = num2 + aux;
    console.log("," + num2);
    i++;
} while (i <= nElementos);