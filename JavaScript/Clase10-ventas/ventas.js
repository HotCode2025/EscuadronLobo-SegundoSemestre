//CLASE 10 Proyecto Ventas

//----------------------------
//Clase Producto
//----------------------------
<<<<<<< HEAD

class Producto {
    //Atributos estáticos: Cuenta cuantos productos se han creado en total
    static contadorProductos = 0;
    //Constructor: se ejecuta cada vez que se crea un nuevo producto
=======
class Producto {
    //Atributos estáticos: Cuenta cuantos productos se han creado en total
    static contadorProductos = 0;
//Constructor: se ejecuta cada vez que se crea un nuevo producto
>>>>>>> 7cd0172ede925f1f2b5854e9e185b9ec197b5268
    constructor(nombre, precio) {
        //Se incrementa el contador y se asigna in ID único al producto
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this.precio = precio;
    }
<<<<<<< HEAD
    //Getter: permite acceder al ID de forma segura
    get idProducto(){
=======
     //Getter: permite acceder al ID de forma segura
    get idProducto() {
>>>>>>> 7cd0172ede925f1f2b5854e9e185b9ec197b5268
        return this._idProducto;
    }
    //Getter y Setters para nombre y precio
    //Permiten leer y modificar los atributos privados (_nombre, _precio)
    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get precio() {
        return this._precio;
    }

    set precio(precio) {
        if (typeof precio === 'number' && precio >= 0) {
            this._precio = precio;
        } else {
            // Manejo del error o advertencia
            console.error(` ERROR: El precio '${precio}' no es válido. Debe ser un número positivo. Valor actual no modificado.`);
            
            // Si el precio es inválido en el constructor (ej: new Producto("A", -10)), 
            // aseguramos que al menos se establezca a 0.
            if (this._precio === undefined) {
                 this._precio = 0;
            }
        }
    }
    //Método para devolver el producto en formato de texto
    toString() {
<<<<<<< HEAD
        return `${this._idProducto} ${this._nombre} $${this._precio}`;//Usamos Template Literals
    }                                                           //Nos permite usar código dinamico
=======
        return `${this._idProducto} ${this._nombre} ${this._precio}`;//Usamos Template Literals
                                                                  //Nos permite usar código dinamico
    }
>>>>>>> 7cd0172ede925f1f2b5854e9e185b9ec197b5268
}//Fin de la clase producto

//----------------------------
// Clase Orden
//----------------------------

class Orden {//Relacion de agregación
    //Atributo estático: cuenta cuántas órdenes se han creado
    static contadorOrdenes = 0;
    //Getter estático: define el máximo de productos por orden (constantes)
<<<<<<< HEAD
    static get MAX_PRODUCTOS() {
        return 5;
    }

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;//ID único por orden
=======
    static get MAX_PRODUCTOS() {//ID único por orden
        return 5; // constante definida en la clase
    }

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
>>>>>>> 7cd0172ede925f1f2b5854e9e185b9ec197b5268
        this._productos = [];//Lista(array) para guardar productos
    }

    get idOrden() {
        return this._idOrden;
    }

    //Método para agregar producto a la orden
    agregarProducto(producto) {
        //Solo se agrega productos sino se supera el límite
<<<<<<< HEAD
        if (this._productos.length <Orden.MAX_PRODUCTOS) {
=======
        if (this._productos.length < Orden.MAX_PRODUCTOS) {
>>>>>>> 7cd0172ede925f1f2b5854e9e185b9ec197b5268
            this._productos.push(producto);//Tenemos 2 tipo de sintáxis: 1
            //this._productos[this._contadorProductosAgregados++] = producto; // 2da sintáxix
        } else {
            console.log("No se pueden agregar más productos a la orden.");
        }//Fin del método agregarProductos
    }//Fin de la clase orden

    //Calcula el total de la orden sumando los precios de los productos
    calcularTotal() {
        let total = 0;
        for (let producto of this._productos) {
            total += producto.precio;
        }
        return total;
<<<<<<< HEAD
    }//Fin del método calcularTotal
=======
}//Fin del método calcularTotal
>>>>>>> 7cd0172ede925f1f2b5854e9e185b9ec197b5268

    //Muestra la información completa de la orden
    mostrarOrden() {
        let productosOrden = '';
        for (let producto of this._productos) {
<<<<<<< HEAD
            productosOrden += '\n{ ' +producto.toString()+' }';
        }//Fin del ciclo for
        return `${this._idOrden} $${this.calcularTotal()} ${productosOrden}`;
        //console.log(`Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productosOrden}`);
=======
            productosOrden += '\n   ' + producto.toString();
        }//Fin del ciclo for
        return `${this._idOrden} ${this.calcularTotal()} ${productosOrden}`;
>>>>>>> 7cd0172ede925f1f2b5854e9e185b9ec197b5268
    }//Fin del método mostrarOrden
}//Fin de la clase orden

//----------------------------------
//Ejecución de prueba (VentasTest)
//-----------------------------------

//Se crean varios productos
let producto1 = new Producto("Gabinete", 800);
let producto2 = new Producto("Monitor", 400);
let producto3 = new Producto("Combo-Gamming", 250);
let producto4 = new Producto("Teclado", 150);
let producto5 = new Producto("Mouse", 100);
let producto6 = new Producto("Auriculares", 200);

//Se crean órdenes y se agregan productos
let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
console.log(orden1.mostrarOrden());

let orden2 = new Orden();
orden2.agregarProducto(producto3);
orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
console.log(orden2.mostrarOrden());

let orden3 = new Orden();
orden3.agregarProducto(producto4);
orden3.agregarProducto(producto5);
orden3.agregarProducto(producto6);
console.log(orden3.mostrarOrden());

let orden4 = new Orden();
orden4.agregarProducto(producto1);
orden4.agregarProducto(producto2);
console.log(orden4.mostrarOrden());

let orden5 = new Orden();
orden5.agregarProducto(producto3);
orden5.agregarProducto(producto4);
orden5.agregarProducto(producto5);
orden5.agregarProducto(producto6);
console.log(orden5.mostrarOrden());

let orden6 = new Orden();
orden6.agregarProducto(producto1);
orden6.agregarProducto(producto2);  
orden6.agregarProducto(producto3);
orden6.agregarProducto(producto4);
orden6.agregarProducto(producto5);
orden6.agregarProducto(producto6); //No se debe agregar (supera el máximo)
console.log(orden6.mostrarOrden());

