/*
//Clase 3a - Capítulo 6: Estructuras Repetitivas
// Ingresar "N" enteros, visualizar la suma de los números pares de la lista, 
// cuántos números pares existen y cuál es el promedio de los números impares. 

Proceso Ejercicio7
	Definir i, num, n_enteros, suma_pares, cont_pares, promedio_impares, cont_impares, suma_impares Como Entero;
	
	Escribir "Ingresar cantidad de enteros para realizar los calculos:";
	Leer n_enteros;
	suma_pares <- 0;
	suma_impares <- 0;
	cont_pares <- 0;
	cont_impares <- 0;
	i <- 1;
	
	Mientras i <= n_enteros Hacer
		Escribir "Ingrese entero número ", i, ": ";
		Leer num;
		Si num mod 2 == 0 Entonces
			suma_pares <- suma_pares + num;
			cont_pares <- cont_pares + 1;
		SiNo
			suma_impares <- suma_impares + num;
			cont_impares <- cont_impares + 1;
		FinSi
		i <- i + 1;
	FinMientras
	Si conteo_pares = 0 Entonces
        Escribir "No se han ingresado números pares";
    SiNo
        Escribir "La suma de los números pares ingresados es: ", suma_pares;
        Escribir "La cantidad de números pares ingresados es: ", cont_pares;
    FinSi
    Si conteo_impares = 0 Entonces
        Escribir "No se han ingresado números impares";
    SiNo
        promedio_impares <- suma_impares / cont_impares;	    
	    Escribir "El promedio de los números impares ingresados es: ", promedio_impares;
    FinSi
FinProceso
*/
nElementos = parseInt(prompt("Ingresar cantidad de enteros para realizar los calculos:"))
sumaPares = 0;
sumaImpares = 0;
contPares = 0;
contImpares = 0;
i = 1;

while (i <= nElementos){
    mensaje = "Ingrese entero número " + i;
    num = parseInt(prompt(mensaje))
    if (num %2 == 0){
        sumaPares = sumaPares + num;
        contPares++;
    } else {
        sumaImpares = sumaImpares + num;
        contImpares++;
    }
    i++;
}
if (contPares == 0){
    console.log("No se han ingresado números pares");
} else {
    console.log("La suma de los números pares ingresados es: ", sumaPares);
    console.log("La cantidad de números pares ingresados es: ", contPares);
}
if (contImpares == 0){
    console.log("No se han ingresado números impares");
} else {
    promedioImpares = sumaImpares / contImpares;
    console.log("El promedio de los números impares ingresados es: ", promedioImpares);
}

