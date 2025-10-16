// Clase Producto
class Producto {
    static contadorProductos = 0;

    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto() {
        return this._idProducto;
    }

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
        this._precio = precio;
    }

    toString() {
        return `${this._idProducto} ${this._nombre} ${this._precio}`;
    }
}

// Clase Orden
class Orden {
    static contadorOrdenes = 0;
    static get MAX_PRODUCTOS() {
        return 5; // constante definida en la clase
    }

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
    }

    get idOrden() {
        return this._idOrden;
    }

    agregarProducto(producto) {
        if (this._productos.length < Orden.MAX_PRODUCTOS) {
            this._productos.push(producto);
        } else {
            console.log("No se pueden agregar más productos a la orden.");
        }
    }

    calcularTotal() {
        let total = 0;
        for (let producto of this._productos) {
            total += producto.precio;
        }
        return total;
    }

    mostrarOrden() {
        let productosOrden = '';
        for (let producto of this._productos) {
            productosOrden += '\n   ' + producto.toString();
        }
        return `${this._idOrden} ${this.calcularTotal()} ${productosOrden}`;
    }
}

//VentasTest
let producto1 = new Producto("Gabinete", 800);
let producto2 = new Producto("Monitor", 400);
let producto3 = new Producto("Combo-Gamming", 250);
let producto4 = new Producto("Teclado", 150);
let producto5 = new Producto("Mouse", 100);
let producto6 = new Producto("Auriculares", 200);

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
orden6.agregarProducto(producto6); // No se debe agregar
console.log(orden6.mostrarOrden());