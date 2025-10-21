 ## 1 - Manipulación de Datos

Funciones centradas en la transformación, validación o subselección de información.

calculateTotalPrice() - Calcular Precio Total

    ¿Qué hace?
    Suma los precios de varios productos o servicios.


formatUserInput() - Formatear Entrada del Usuario

    ¿Qué hace?
    LLimpia o ajusta el texto que ingresa un usuario.
    

validateEmailAddress() - Validar Dirección de Correo

    ¿Qué hace?
    VVerifica si un email tiene formato correcto.
    

convertToCamelCase() - Convertir a Formato Camel Case

    ¿Qué hace?
    Transforma un texto (por ejemplo "mi_texto" o "mi-texto") en "miTexto".
    

filterActiveUsers() - Filtrar Usuarios Activos

    ¿Qué hace?
    Devuelve solo los usuarios que estén activos de una lista completa.
    
Puntos importantes:<br>
	Son funciones descriptivas y fáciles de entender.<br>
	Se enfocan en transformar o procesar datos.<br>
	Utilizan verbos que indican acción (calculate, format, validate…).<br>
	Mejoran la legibilidad del código.<br>
	Permiten reutilizar procesos comunes de manipulación.<br>


 ## 2 - Eventos o Interacción
    Funciones que responden a acciones del usuario, al estado de la interfaz o al flujo de la aplicación.<br>
    handleButtonClick() - Manejar Clic en Botón<br>
    ¿Qué hace?
    Ejecuta acciones cuando el usuario hace clic en un botón.
    

onFormSubmit() - Al Enviar un Formulario

    ¿Qué hace?
    Ejecuta una función al enviar datos de un formulario.
    

toggleDarkMode() - Alternar Modo Oscuro

    ¿Qué hace?
    Activa o desactiva el modo oscuro de una aplicación.
    

updateProgressBar() - Actualizar Barra de Progreso

    ¿Qué hace?
    Cambia visualmente el avance de una barra de progreso.
    

initializeApp() - Inicializar Aplicación

    ¿Qué hace?
    Inicia funciones o configuraciones básicas al cargar la app.

Puntos importantes:<br>

	Están relacionadas con acciones del usuario o del sistema.<br>
	Generalmente se asocian a eventos de clic, envío o carga.<br>
	Suelen comenzar con verbos como handle, on, update, toggle.<br>
	Aumentan la interactividad de la aplicación.<br>
	Son fundamentales para crear una experiencia dinámica en el navegador.<br>

    

 ## 3 - Operaciones CRUD
    Funciones que interactúan con la capa de persistencia de datos (API o base de datos).<br>
    createNewUser() - Crear Nuevo Usuario (Create)<br>

    ¿Qué hace?
    Agrega un nuevo registro de usuario en el sistema.
    


fetchUserData() - Obtener Datos del Usuario (Read)

    ¿Qué hace?
    Recupera información de usuarios desde una base de datos o API.
    


updateUserProfile() - Actualizar Perfil del Usuario (Update)

    ¿Qué hace?
    Modifica la información de un usuario existente.
    
Puntos importantes:<br>
	Corresponden a las operaciones básicas de bases de datos (CRUD).<br>
	Mantienen la información actualizada.<br>
	Son descriptivas y expresan claramente la acción que realizan.<br>
	Siguen un patrón estándar útil para backend o frontend.<br>
	Facilitan el mantenimiento y organización del código.<br>


deleteUserAccount() - Eliminar Cuenta de Usuario (Delete)

    ¿Qué hace?
    Borra definitivamente el registro del usuario.
    


## 4 - Utilidades
    Funciones de soporte general, reusables y sin lógica específica de negocio.<br>
    generateRandomId() - Generar ID Aleatorio<br>
    ¿Qué hace?<br>
    Crea un identificador único para objetos o elementos.<br>
    

formatCurrency() - Formatear Moneda

    ¿Qué hace?
    Muestra números con símbolo de moneda y decimales.
    

debounceSearch() - Retrasar Búsqueda

    ¿Qué hace?
    Evita ejecutar una búsqueda hasta que el usuario deje de escribir.
    

sanitizeInput() - Sanitizar Entrada

    ¿Qué hace?
    Elimina caracteres peligrosos o inválidos de un texto.
    

checkPermissions() - Verificar Permisos

    ¿Qué hace?
    Comprueba si un usuario tiene acceso a ciertas funciones.
    

Puntos importantes:<br>
    Son funciones de apoyo, no dependen de la interfaz.<br>
    Mejoran la seguridad, legibilidad o eficiencia del código.<br>
    Son reutilizables en distintas partes del programa.<br>
    Tienen nombres genéricos pero claros.<br>
    Evitan la repetición de lógica en múltiples lugares.<br>
