//metodos get y set
let persona1 = {
    nombre: "zelada",
    edad  : 18,
    ID    : 304,

    //metodo get = obtener datos, es un metodo no una funcion
    get nombreEdad(){
        return this.nombre +" "+ this.edad
    },
    //metodo set = modificar, se le deve de pasar un dato para poder trabajar
    get edadUsuario(){
        return this.edad.toString().toUpperCase()//convierte a str y pasa todo a mayuscula
    },
    set nuevaEdad(edadNew){
        this.edad = edadNew.toString().toUpperCase()
    }

};

console.log(persona1.nombreEdad);

console.log(persona1.edadUsuario);
//asigandole la nueva edad
persona1.nuevaEdad = 25
console.log(persona1.edad);


//constructores de objeto/  todo constrctor empieza con mayuscula/  es un contrcutor n una clase
function Persona(nombre, edad, email){
    this.nombre = nombre
    this.edad   = edad
    this.email  = email
    //agregando metodos de contructor al contructor
    this.nombreEdad = function(){
        return this.nombre
    }
}
//creacioon de objetos
const persona2 = new Persona("orlando", 20, "orlando@gmail.com")
console.log(persona2)


//distintas formas de crea run objeto
const objeto1 = new Object()
const objeto2 = new String()
const objeto3 = new Number()
const objeto4 = new Boolean()
const objeto5 = new Array()
//con funciones
const objeto6 = new function(){} //todo objeto creado con new se considera un objeto

//uso de prototuype
Persona.prototype.nombre = "zelada"
console.log(persona2.nombre);


//uso de call  /un metodo que se utiliza para poder usar funciones o metodos de otros objetos
const persona3 = {
    nombre   : "zelada",
    apellido : "Gira",
    edad     : 23,
    nameComp : function(){
        return this.nombre + " " +this.apellido + " uwu"
    }
}
const persona4 = {
    email: " orlando@gamail.com"
}
const objeto7 = persona3.nameComp.call(persona4)
console.log(objeto7);

//metodo apply
console.log(persona3.nameComp.apply(persona4))

