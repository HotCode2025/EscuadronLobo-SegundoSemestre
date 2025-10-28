// Ejercicio 2: Crear un sistema simple de gestión de tareas

function createTaskManager() {

    let tasks = [];
    let nextId = 1; // contador para asignar ID

    return {

        addTask: function(task) {
            // crea un objeto para la tarea
            let nuevaTarea = {
                id: nextId,
                nombre: task,
                completada: false
            };

            // agrega la tarea al arreglo
            tasks.push(nuevaTarea);

            // aumenta el ID para la próxima tarea
            nextId++;
        },

        completeTask: function(taskId) {
            // busca la tarea y márcala como completada
            for (let i = 0; i < tasks.length; i++) {
                if (tasks[i].id === taskId) {
                    tasks[i].completada = true;
                }
            }
        },

        listTasks: function() {
            // muestra todas las tareas
            for (let i = 0; i < tasks.length; i++) {
                let estado = "Pendiente";
                if (tasks[i].completada === true) {
                    estado = "Completada";
                }
                console.log(tasks[i].id + ". " + tasks[i].nombre + " - " + estado);
            }
        }

    };

}

// Pruebas

const myTasks = createTaskManager();

myTasks.addTask("Aprender JavaScript");
myTasks.addTask("Hacer ejercicio");

myTasks.completeTask(1);

myTasks.listTasks();
