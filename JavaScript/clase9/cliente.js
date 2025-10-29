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