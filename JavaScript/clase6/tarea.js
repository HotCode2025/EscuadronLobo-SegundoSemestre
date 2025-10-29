//Crear el método get y set para el atributo de apellido, luego modificar el apellido a través del  
// set y mostrar con un console.log lo que es el get donde muestra el resultado obtenido
class Persona{
    constructor(nombre, apellido){
        this._nombre   = nombre
        this._apellido = apellido
    }
    //agregando metodo get
    get apellido(){
        return this._apellido
    }
    //metodo set
    set apellido(newApellido){
        return this._apellido = newApellido
    }
}
//test
const laburante = new Persona("orlando", "zelada")
console.log(laburante.apellido);
//modificando
laburante.apellido = "Gira";
console.log(laburante._apellido);
