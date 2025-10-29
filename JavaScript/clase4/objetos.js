 //como crar un objeto
let objeto = {
    edad: 20,
    nombre: "zelada",
};
console.log(objeto);
//como imprimir los valores
console.log(objeto.edad);
console.log(objeto.nombre);


//como agregar metodos a los oobjetos
let objeto2 = {
    nombre: "zelada",
    apellido: "gira",
    //metodo
    nombreCompleto: function(){
        return this.nombre + " " + this.apellido
    }
};
objeto2.nombreCompleto();


//otra forma de crear un objeto
let objeto3 = new Object;
//se le asigna valores(Keys y value)
objeto3.nombre = "Gira";
objeto3.edad = 18;
console.log(objeto3);


//como acceder a los valores de un objeto
console.log(objeto3["nombre"]);
//usando un iterador
for(propiedades in objeto3){
    console.log(propiedades);//se imprime las keys
    console.log(objeto3[propiedades]);//se imprime los values
}


//agregar y eliminar propiedades de un objeto
//agregar
objeto3.sexo = "masculino";
console.log(objeto3);
//eliminar
delete objeto3.sexo
console.log(objeto3);


//distintas formas de imprimir un objeto
//Object.values(objeto a imprimir)
let imprimir = Object.values(objeto3)
console.log(imprimir);

//segunda forma JSON.stringify(objeto a imprimir)
imprimir2 = JSON.stringify(objeto3)
console.log(imprimir2);
