/*
//Clase 3a - Capítulo 6: Estructuras Repetitivas
// Calcular la suma de los "N" términos de la siguiente serie:  
//S =   1  -  1  +  1  -  1  +  1  -  1  +  ?  1 
//			  2    3     4     5     6         N   
Proceso Ejercicio9
	Definir i, cantidad, sumatoria Como Real;
	i <- 1;
	sumatoria <- 0;
	Repetir
		Escribir "Ingrese la cantidad de terminos:";
		Leer cantidad;
	Hasta Que cantidad > 0		
	Mientras i <= cantidad Hacer
		Si i mod 2 <> 0 Entonces
			sumatoria <- sumatoria + (1/i);
		SiNo
			sumatoria <- sumatoria - (1/i);
		FinSi
		i <- i + 1;
	FinMientras	
	Escribir "La sumatoria es: ",sumatoria;
FinProceso
*/
i = 1;
sumatoria = 0;
do {
    cantidad = parseInt(prompt("Ingrese la cantidad de términos: "));
} while (cantidad < 0);
while (i <= cantidad){
    if (i % 2 != 0) {
        sumatoria = sumatoria + (1 / i);
    } else {
        sumatoria = sumatoria - (1 / i);
    }
    i++;
}
console.log("La sumatoria es: ", sumatoria);