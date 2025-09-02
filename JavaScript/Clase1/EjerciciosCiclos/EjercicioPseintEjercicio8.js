/*
//Clase 3a - Capítulo 6: Estructuras Repetitivas
// Calcular la sumatoria: 
//S =   1  +  x  +  x2  +  x3  +  .... xn 
//			  1!    2!     3!          n!   
Proceso Ejercicio12
	Definir i, numerador, potencia, cantidad, factorial Como Entero;
	Definir sumatoria Como Real;
	i <- 1;
	sumatoria <- 1;
	potencia <- 1;
	factorial <- 1;
	Repetir
		Escribir "Ingrese la cantidad de terminos:";
		Leer cantidad;
	Hasta Que cantidad > 0
	Escribir "Ingrese valor de x:";
	Leer numerador;
	Mientras i <= cantidad Hacer
		potencia <- numerador ^ i;	
		factorial <- factorial * i;
		sumatoria <- sumatoria + (potencia / factorial);
		i <- i + 1;
	FinMientras	
	Escribir "La sumatoria es: ",sumatoria;
FinProceso
*/
i = 1;
sumatoria = 1;
potencia = 1;
factorial = 1;
do {
    cantidad = parseInt(prompt("Ingrese la cantidad de terminos"));
} while (cantidad < 0);
numerador = parseInt(prompt("Ingrese valor de x"));
while (i <= cantidad){
    potencia = numerador ** i;
    factorial = factorial * i;
    sumatoria = sumatoria + (potencia / factorial);
    i = i + 1;
}
console.log("La sumatoria es: ", sumatoria);
