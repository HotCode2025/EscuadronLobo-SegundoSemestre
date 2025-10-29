class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre
        this._apellido = apellido
    }
    //get y set nombre
    get nombre(){
        return this._name
    }
    set nombre(newName){
        return this._nombre = newName
    }
    //get y set apellido
    get apellido(){
        return this._apellido
    }
    set apelldio(newApellido){
        return this._apellido = newApellido
    }
}

//herencia  /para eredar todo de una clase padre se debe de usar extends
class Obrero extends Persona{
    constructor (departamento, nombre, apellido){
        //el super smpre se le debe de agregar con los parametro de la clase padrre, para invocar todo de la clase padre
        super(nombre, apellido)
        this._departamento = departamento
    }
    get departamento(){
        return this._departamento
    }
    set departamento(newDepartamento){
        return this._departamento = newDepartamento
    }
}
const laburante = new Obrero("piso 1", "zelada", "Gira")
console.log(laburante);

//como se ve heredo los elemtos de clase padre
console.log(laburante._nombre);