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
        return "ID: "+this._idPersona +" = " + this._nombre + this._apellido + this._edad
    }
}
