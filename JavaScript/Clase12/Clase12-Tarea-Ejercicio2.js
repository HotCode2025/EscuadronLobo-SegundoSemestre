// Ejercicio 2: Crear un sistema simple de gestión de tareas

/**
 * Función Principal: Crea y retorna un objeto de gestión de tareas.
 * Usa el concepto de 'Clausura' para encapsular (proteger) 
 * las variables 'tasks' y 'nextId', haciéndolas privadas y solo accesibles 
 * a través de los métodos públicos (addTask, completeTask, listTasks).
 */
function createTaskManager() {

    // --- Variables Encapsuladas (Privadas) ---
    
    // Arreglo (array) que almacenará todos los objetos de tareas.
    // Solo puede ser accedido o modificado por los métodos definidos dentro de esta función.
    let tasks = []; 
    
    // Contador para asignar un ID único a cada nueva tarea.
    let nextId = 1; 

    // --- Métodos Públicos ---
    // Retornamos un objeto literal (el 'Módulo') que contiene los métodos que
    // el usuario final puede usar.
    return {

        // Método para añadir una nueva tarea al sistema.
        addTask: function(task) {
            
            // Crea un objeto JavaScript para representar la nueva tarea.
            let nuevaTarea = {
                id: nextId,        // Asigna el ID único actual.
                nombre: task,      // Guarda el nombre/descripción de la tarea.
                completada: false  // Inicializa el estado como Pendiente (false).
            };

            // Agrega el objeto de tarea al arreglo 'tasks'.
            tasks.push(nuevaTarea);

            // Aumenta el ID para la próxima tarea, asegurando que cada tarea tenga un ID único.
            nextId++;
        },

        // Método para marcar una tarea como completada usando su ID.
        completeTask: function(taskId) {
            
            // Bucle for: Itera sobre todas las tareas en el arreglo 'tasks'.
            for (let i = 0; i < tasks.length; i++) {
                // Comprobación: Si el ID de la tarea actual coincide con el ID pasado como argumento.
                if (tasks[i].id === taskId) {
                    // Marca la tarea como completada y sale del bucle (podría usarse 'break' aquí para optimizar).
                    tasks[i].completada = true;
                }
            }
            
            // Nota: En código moderno, se usaría Array.prototype.find() o findIndex() para simplificar la búsqueda.
        },

        // Método para mostrar todas las tareas y su estado actual.
        listTasks: function() {
            
            // Bucle for: Itera sobre todas las tareas para imprimirlas.
            for (let i = 0; i < tasks.length; i++) {
                // Inicializa el estado para mostrarlo en texto.
                let estado = "Pendiente";
                
                // Comprueba si la tarea está completada.
                if (tasks[i].completada === true) {
                    estado = "Completada";
                }
                
                // Imprime la tarea en la consola con su ID, nombre y estado.
                console.log(tasks[i].id + ". " + tasks[i].nombre + " - " + estado);
            }
        }

    };
}

// --- Pruebas del Gestor de Tareas ---

// Instancia el gestor de tareas. La variable 'myTasks' ahora contiene el objeto { addTask, completeTask, listTasks }.
const myTasks = createTaskManager();

// Usamos el método público addTask para añadir tareas.
myTasks.addTask("Aprender JavaScript"); // ID 1
myTasks.addTask("Hacer ejercicio");      // ID 2

// Usamos el método completeTask para cambiar el estado de la tarea con ID 1.
myTasks.completeTask(1);

// Usamos listTasks para imprimir el estado final.
// Debería mostrar:
// 1. Aprender JavaScript - Completada
// 2. Hacer ejercicio - Pendiente
myTasks.listTasks();