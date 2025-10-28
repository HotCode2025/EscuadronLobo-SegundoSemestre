class Empleado extends Persona{

    static contadorEmpleados = 0;

    constructor(nombre, apellido, edad, sueldo){
        //impor class Persona
        super(nombre, apellido, edad);

        this._idEmpleado = ++contadorEmpleados;
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