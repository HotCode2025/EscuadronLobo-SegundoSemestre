//La palabra continue

for(let contando = 0; contando <= 10; contando++){
    if(contando %2 !== 0){
        continue; //Esto va a continuar a la siguiente iteracion    
    }
    console.log(contando);
}
console.log("Termina el ciclo");