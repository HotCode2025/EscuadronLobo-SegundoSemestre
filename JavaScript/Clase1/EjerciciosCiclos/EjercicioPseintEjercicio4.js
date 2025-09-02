/*
//Clase 3a - Capítulo 6: Estructuras Repetitivas
// Dada las horas trabajadas de 5 personas y la tarifa de pago 
// calcular el salario, y la sumatoria de todos los salarios

Proceso Ejercicio8
	Definir i, horas, tarifa, salario, suma_salarios Como Entero;
	suma_salarios <- 0;
	i <- 1;
	Repetir
		Escribir "Ingrese horas trabajadas de Persona", i, ": ";
		Leer horas;
		Escribir "Ingrese tarifa por hora: $";
		Leer tarifa;
		salario <- horas * tarifa;
		Escribir "El salario de Persona",i , " es: $",salario;
		Escribir "----------------------------------------------------";
		suma_salarios <- suma_salarios + salario;
		i <- i + 1;
	Hasta Que i > 5
	Escribir "---------------------------------------------------";
	Escribir "La sumatoria de los salarios es: $", suma_salarios;
FinProceso
*/
sumaSalarios = 0;
i = 1;
do {
	mensaje = "Ingrese horas trabajadas de Persona " + i;
	horas = parseInt(prompt(mensaje));
	tarifa = parseFloat(prompt("Ingrese tarifa por hora"));
	salario = horas * tarifa;
	console.log("El salario de Persona ", i, "es: $", salario);
	console.log("------------------------------------------------");
	sumaSalarios = sumaSalarios + salario;
	i++;
} while (i <= 5);
console.log("------------------------------------------------");
console.log("La sumatoria de los salarios es: $", sumaSalarios);