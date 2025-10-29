//funciones
function suma(a,b){
    console.log(a+ b);
}
console.log(suma(1,2));

//palabra return
function resta(a,b){
    return a-b;//esta palabra reservada devuele el resultado
}
console.log(resta(1,2));

//funcion de tipo expreciopn o aninima
let x = function(a,b){
    return a / b;
}
console.log(x(10,2));

//funiones tipo self y invoking / funciones que se invocan a si misma
(function(a,b){
    console.log("la funcion se esta ejecutando");
    return a * b;
}(9,2))

//tipos de datos en una funcion
console.log(typeof x);
 //como saber cunatos argumentos tiene una funcion
 function mate(a,b){
    console.log(arguments.length);
 }
 console.log(mate(7,45,5,6));

 //tostring
 let miFuncion = x.toString;
 console.log(miFuncion);

 //funcioens flecha(mas recomendado)
 //argumentos y parametros
 let hola = ()=>{ // alas fucniones se le pasan parametros en los () para trabajar
    return "hola";
 }
 console.log(hola());//al llamar a las funciones se debe completar con argumentos en los ()

//concepto hoisting
let sumarTodo = sumatodo(1,2,3,4);
console.log(sumarTodo);

function sumatodo(){
    let suma = 0;
    for (let i=0; i<= arguments.length; i++){
        suma += arguments[i];
    }
    return suma;
}

//paso por valor
let valor = 10;
function cambiarValor(a){
    a = 20;
}
console.log(cambiarValor(valor));

//paso por referencia
const personas = {
    per1: "zelada",
    perd2: "uwu"
}
let cambioValor = (per) =>{
    per.per1 = "uwu"
    per.perd2 = "OWO"
}
console.log(cambioValor(personas));