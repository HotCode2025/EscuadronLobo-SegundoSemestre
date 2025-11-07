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
    //metodo nombre complto
    nombreCompleto(){
        return this._nombre + " " + this._apellido
    }
    //devuelve un str
    toString(){
        return this.nombreCompleto()
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

    //metodo sobre escritura  /se re escribe de una forma identica un metodo de la clase padre y se le agrega en la clase hija nuevas cosas
    nombreCompleto(){
        return super.nombreCompleto() + " " + this._departamento
    }
}

//creacion de un objeto
const laburante = new Obrero("piso 1", "zelada", "Gira")
console.log(laburante);

//como se ve heredo los elemtos de clase padre
console.log(laburante._nombre);

//imprimir metodo nombre completo
console.log(laburante.nombreCompleto());

//imprimir sobre escritura
console.log(laburante.nombreCompleto());


//Object.prototype.toString  /esta es la manera de acceder a los datos de manera dinamica
console.log(laburante.toString());//rretorna un str
