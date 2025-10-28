class Persona{
    //metodo static
    static contadorPersona = 0;

    constructor (nombre, apellido, edad){
        this._nombre    = nombre;
        this._apellido  = apellido;
        this._edad      = edad;
        this._idPersona = ++Persona.contadorPersona;
    }

    //metodos get y set
    get idPersona(){
        return this._idPersona;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    get edad(){
        return this._edad;
    }
    set edad(edad){
        this._edad = edad;
    }

    //metodos toString
    toString(){
        return "ID: "+this._idPersona +" = " + this._nombre + " " + this._apellido + " " + this._edad
    }
}


class Empleado extends Persona{

    static contadorEmpleados = 0;

    constructor(nombre, apellido, edad, sueldo){
        //impor class Persona
        super(nombre, apellido, edad);

        this._idEmpleado = ++Persona.contadorPersona;
        this._sueldo     = sueldo;
    }
    //metodos get and set
    get idEmpleado(){
        return this._idEmpleado;
    }

    get sueldo(){
        return this._sueldo;
    }
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }

    //tostring
    toString(){
        return super.toString() + " " + this.idEmpleado + " " + this._sueldo;
    }

}


class Cliente extends Persona{
    //static
    static contadorCliente = 0;

    constructor (nombre, apellido, edad, fechaRegistro){

        super(nombre, apellido, edad);

        this._idCliente     = ++Persona.contadorCliente;
        this._fechaRegistro = fechaRegistro;
    }

    //metodos get y set
    get idCLiente(){
        return this._idCliente;
    }

    get fechaRegistro(){
        return this._fechaRegistro;
    }
    set fechaRegistro(fechaRegistro){
        this._fechaRegistro = fechaRegistro;
    }

    //toString
    toString(){
        return super.toString() + " " + this.idCLiente + " " + this._fechaRegistro;
    }
}


//prueba clase Persona
const persona1 = new Persona("juan", "peres" , 32)
console.log(persona1.toString());
const perosna2 = new Persona("zelada" , "Mendoza", 44)
console.log(perosna2.toString());

//prueba clase empleado
const persona3 = new Empleado("Pedro", "Roman", 18, 8000);
console.log(persona3.toString());
const persona4 = new Empleado("Jonas", "Torres", 25, 10000)
console.log(persona4.toString());

//prueba clase 5
const cliente1 = new Cliente("Niguel", "Zala", 30, new Date());
console.log(cliente1.toString());
const cliente2 = new Cliente("Natali", "Ortega", 22, new Date());
console.log(cliente2.toString());
