/*
//Clase 3a - Capítulo 6: Estructuras Repetitivas
// Ingresar "N" números, calcular el máximo y mínimo de ellos. 

Proceso Ejercicio10
	Definir i, num, menor, mayor, total Como Entero;
	
	Repetir
		Escribir "Ingrese total de numeros:";
		Leer total;
		//total <- 100;
	Hasta Que total > 0
	
	Escribir "1- Ingrese un número:";
	Leer num;
	menor <- num;
	mayor <- num;
	Para i <- 2 Hasta total Hacer
        Escribir i,"- Ingrese un número:";
        Leer num;
		si num > mayor Entonces //si num es mayor a mayor
			mayor <- num;
        FinSi
		Si num < menor Entonces //si num es menor a menor
			menor <- num;
		FinSi        
    FinPara
    Escribir "El mayor número ingresado fue: ", mayor;
	Escribir "El menor número ingresado fue: ", menor;

FinProceso
*/
do{
    total = parseInt(prompt("Ingrese el total de números"));
} while (total < 0);
num = parseInt(prompt("1- Ingrese un número"));
menor = num;
mayor = num;
for (let i = 2; i <= total; i++){
    mensaje = i + "- Ingrese un número";
    num = parseInt(prompt(mensaje));
    if (num > mayor){
        mayor = num;
    }
    if (num < menor){
        menor = num;
    }
}
console.log("El mayor número ingresado fue: ", mayor);
console.log("El menor número ingresado fue:", menor);