class Persona{ //Creación de la Clase Persona

    static contadorPersonas = 0; //atributo static

    constructor(nombre, apellido, edad){ //construc persona
        this._idPersona = ++Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    //set and getter

    get idPersona(){
        return this._idPersona;
    }

    get nombre(){
        this._nombre;
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

    toString(){
        return this._idPersona+"  "+this._nombre+" "+this._apellido+" "+this._edad;
    }
    
}