// Leccion 4
// Intruccion a los Objetos en JavaScript 
// Parte 1 (video 1 JS)

let x = 10; // Variable de tipo primitiva (Número).
// ERROR DE LÓGICA: Las variables primitivas (números, booleanos, etc.) NO tienen la propiedad 'length'.
// Solo los objetos (como las cadenas/strings o arreglos) la tienen. Esto generará 'undefined'.
console.log(x.length); // Resultado: undefined
console.log('Tipos Primitivos');

// --- Definición de Objeto Literal (JSON) ---
let persona = {
    // Propiedades del objeto: Clave-Valor
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@mail.com',
    edad: 28,
    idioma: 'es', 
    
    // Método GET para la propiedad 'lang'.
    // Permite acceder al atributo encapsulado 'idioma' de forma controlada.
    get lang(){ // Creamos un get en idioma (Clase 5 video 1)
        // Retorna el valor de 'idioma' siempre en mayúsculas.
        return this.idioma.toUpperCase(); 
    },
    
    // Método SET para la propiedad 'lang'.
    // Permite modificar el atributo 'idioma' de forma controlada, aplicando lógica.
    set lang(lang){ // Creamos un set en idioma (Clase 5 video 2)
        // Almacenamos el nuevo valor de 'idioma' convertido a mayúsculas.
        this.idioma = lang.toUpperCase(); 
    },
    
    // Método: Una función asociada al objeto.
    nombreCompleto: function(){ // Agregamos método o función a los objetos Parte 3 (video 3JS)
        // 'this' hace referencia al objeto actual ('persona') dentro del método.
        return this.nombre + ' ' + this.apellido; 
    },
    
    // Método GET para una propiedad combinada.
    get nombreEdad(){ // Este es el método get
        // Retorna un string formateado combinando dos atributos. Se accede como una propiedad: persona.nombreEdad
        return 'El nombre es: ' + this.nombre + ', Edad: ' + this.edad;
    }
}
console.log(persona.nombre); // Acceso a la propiedad 'nombre'.

// Parte 2 (video 2 JS)
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona); // Imprime el objeto completo (llaves y valores).
console.log(persona.nombreCompleto()); // Llamada al método.
console.log('Ejecutando con un objeto');

// Agregamos métodos a los objetos ( video 4 JS)
// --- Creación de Objeto con el Constructor 'new Object()' ---
let persona2 = new Object(); // Crea un nuevo objeto genérico en memoria.
// Asignación de propiedades dinámicamente:
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '123456789';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');

// Como acceder a la propiedad de los Objetos ( video 5 JS)
// Acceso a la propiedad usando notación de corchetes (similar a un arreglo/diccionario).
console.log(persona['apellido']);
console.log('Usamos el ciclo for in');

// --- Ciclo for...in ---
// Itera sobre las PROPIEDADES enumerables de un objeto.
for(propiedad in persona){
    console.log(propiedad); // Imprime la clave (e.g., 'nombre', 'apellido').
    console.log(persona[propiedad]); // Imprime el valor asociado a esa clave.
}

// Agregar y eliminar propiedades a los Objetos (video 6 JS)
console.log('Cambiamos y eliminamos un error');
// Cambiamos el valor de una propiedad existente o la creamos si no existe.
persona.apellido = 'Farias'; 
// Eliminamos una propiedad del objeto dinámicamente.
delete persona.apellida; 
console.log(persona);

// Ejecutamos desde el navegador html (Video 7 JS)
// (Esto es una nota, no código ejecutable en la consola).

// Didtintas formas de imprimir un objeto (Video 8 JS)

// NÚMERO 1: Concatenación manual de propiedades.
console.log('Didtintas formas de imprimir un objeto: NÚMERO 1');
console.log(persona.nombre+', '+persona.apellido);

// NÚMERO 2: A través del ciclo for...in (imprime valores, no claves).
console.log('Didtintas formas de imprimir un objeto: NÚMERO 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

// NÚMERO 3: Objeto.values() - Retorna un arreglo (array) con los VALORES de las propiedades.
console.log('Didtintas formas de imprimir un objeto: NÚMERO 3');
let personaArray = Object.values(persona);
console.log(personaArray);

// NÚMERO 4: JSON.stringify() - Convierte el objeto a una cadena de texto en formato JSON.
console.log('Distintas formas de imprimir un objeto: NÚMERO 4');
let personaString = JSON.stringify(persona);
console.log(personaString);

// Clase 5 objeto Parte 2: (video 1 y 2 JS)
// Métos get y set Parte 1 y 2
console.log('Comenzamos a utilizar el método get');
// Se llama al método get nombreEdad, pero se accede como una propiedad.
console.log(persona.nombreEdad); 

console.log('Comenzamos con eñ método get y set para idioma');
// Se llama al método set lang, que convierte 'en' a 'EN' y lo asigna a this.idioma.
persona.lang = 'en';
// Se llama al método get lang, que retorna this.idioma (que es 'EN').
console.log(persona.lang); 

// --- Constructores de Objetos (video 3 JS) ---
// Función Constructor: Una plantilla para crear objetos del mismo tipo.
function Persona3(nombre, apellido, email){ 
    // 'this' se refiere a la nueva instancia que se está creando.
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    // Agregamos un método directamente al constructor (Video 4 JS).
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}

// Creación de instancias con el constructor 'new'.
let padre = new Persona3('Leo','Lopez', 'lopezl@gmail.com'); 
// Modificamos una propiedad de la instancia 'padre'.
padre.nombre = 'Luis';
// Agregamos una propiedad específica a la instancia 'padre'.
padre.telefono = '8955848923546';
console.log(padre);
console.log(padre); // Imprime el objeto 'padre' dos veces.
console.log(padre.nombreCompleto()); // Utilizamos la función (método).

let madre = new Persona3('Laura', 'Contreras', 'contrerasl@gmail.com');
console.log(madre);
// Esta propiedad fue añadida SÓLO a 'padre', por lo que aquí es undefined.
console.log(madre.telefono); 
console.log(madre.nombreCompleto());

// --- Distintas formas de crear objetos (Video 5 JS) ---
// Se demuestra que la sintaxis literal es la más recomendada para tipos de datos.

// Caso Objeto 1: Formal (menos usada)
let miObjeto = new Object(); 
// Caso Objeto 2: Literal (más breve y recomendada)
let miOojeto2 = {}; 

// Caso String 1: Formal (innecesaria)
let miCadena1 = new String('Hola'); 
// Caso String 2: Literal (recomendada)
let miCadena2 = 'Hola'; 

// Caso con números 1: Formal (innecesaria)
let miNumero = new Number(1); 
// Caso non números 2: Literal (recomendada)
let miNumero2 = 1; 

// Booleano 1: Formal (innecesaria)
// ¡CORRECCIÓN DE SINTAXIS AQUÍ!
let miBollean1 = new Boolean(false); // Necesita el punto y coma. 
// Booleano 2: Literal (recomendada)
let miBollean2 = false; // Declaración correcta después de la corrección.

// Arreglos 1: Formal (innecesaria)
let miArreglo1 = new Array(); 
// Arreglos 2: Literal (recomendada)
let miArreglo2 = [];

// Caso Función 1: Formal (funciona, pero menos común)
let miFunción1 = new function(){}; 
// Caso Función 2: Literal (recomendada)
let miFuncion2 = function(){}; 

// --- El uso de prototype (Video 6 JS) ---
// Agrega la propiedad 'telefono' directamente al PROTOTIPO del constructor Persona3.
// Esto hace que la propiedad sea accesible por TODAS las instancias (padre, madre, etc.).
Persona3.prototype.telefono = '261895479';
console.log(padre); // Veremos que padre ahora tiene 'telefono' heredado del prototipo.
console.log(madre.telefono); // madre ahora puede acceder al teléfono del prototipo.
// Cuando se asigna un valor a una instancia, se crea una propiedad propia, 
// que "oculta" o sobreescribe la del prototipo (shadowing).
madre.telefono = '55556662555';
console.log(madre.telefono);

// --- El uso de call (Video 7 JS) ---
// 'call' permite invocar un método de un objeto, pero especificando 'this' (el objeto al que se aplicará).
let Persona4 = {
    nombre:'Juan',
    apellido: 'Perez',
    // Método que requiere argumentos.
    nombreCompleto2: function(titulo, telefono){ 
        // 'this' en la invocación normal es Persona4.
        return titulo + ': ' + this.nombre + ' ' + this.apellido + ' ' + telefono;
    }
}

let Persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

// Invocación normal: this es Persona4.
console.log(Persona4.nombreCompleto2('Licenciado', '5555444'));

// Invocación con 'call': Ejecuta nombreCompleto2, pero establece 'this' a Persona5.
// Los argumentos (titulo, telefono) se pasan de forma individual.
console.log(Persona4.nombreCompleto2.call(Persona5, 'Ing', '111000222'));

// --- El uso de apply (Video 8 JS) ---
// 'apply' es idéntico a 'call', pero los argumentos del método se pasan como un ARREGLO.
let arreglo = ['Ing.', '77779995'];
// Aplica nombreCompleto2, establece 'this' a Persona5, y usa los elementos del arreglo como argumentos.
console.log(Persona4.nombreCompleto2.apply(Persona5, arreglo));

