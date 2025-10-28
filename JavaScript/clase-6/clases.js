//como crerar una clase
class Persona{
    //se deve de inicializar un constructor
    constructor(nombre, apellido){
        this._nombre   = nombre
        this._apellido = apellido
    }
    //metodo get
    get nombre(){
        return this._nombre
    }

    set nombre(newName){
        this._nombre = newName
    }

}
//para crear crear una clase se debe de llamar con el new
const persona = new Persona("Peres" , "carlos")
console.log(persona);
const persona2 = new Persona("Marin", "Sanches")
console.log(persona2);

//test de metodo get y set
console.log(persona.nombre);
persona.nuevo = "Mario";
console.log(persona);
