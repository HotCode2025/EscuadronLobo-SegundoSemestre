 ## 1 - Manipulación de Datos

Funciones centradas en la transformación, validación o subselección de información.
calculateTotalPrice() - Calcular Precio Total
    ¿Qué hace?
    Suma los precios y cantidades de varios ítems para obtener el precio total de una compra o transacción.



formatUserInput() - Formatear Entrada del Usuario
    ¿Qué hace?
    Limpia o ajusta el texto que ingresa un usuario para estandarizarlo.
    


validateEmailAddress() - Validar Dirección de Correo
    ¿Qué hace?
    Verifica si un email tiene formato correcto antes de procesarlo.
    


convertToCamelCase() - Convertir a Formato Camel Case
    ¿Qué hace?
    Transforma un texto (por ejemplo "mi_texto" o "mi-texto") en "miTexto".
    


filterActiveUsers() - Filtrar Usuarios Activos
    ¿Qué hace?
    Devuelve solo los usuarios que estén activos de una lista completa.
    


 ## 2 - Eventos o Interacción
    Funciones que responden a acciones del usuario, al estado de la interfaz o al flujo de la aplicación.
    handleButtonClick() - Manejar Clic en Botón
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
    


 ## 3 - Operaciones CRUD
    Funciones que interactúan con la capa de persistencia de datos (API o base de datos).
    createNewUser() - Crear Nuevo Usuario (Create)
    ¿Qué hace?
    Agrega un nuevo registro de usuario en el sistema.
    


fetchUserData() - Obtener Datos del Usuario (Read)
    ¿Qué hace?
    Recupera información de usuarios desde una base de datos o API.
    


updateUserProfile() - Actualizar Perfil del Usuario (Update)
    ¿Qué hace?
    Modifica la información de un usuario existente.
    


deleteUserAccount() - Eliminar Cuenta de Usuario (Delete)
    ¿Qué hace?
    Borra definitivamente el registro del usuario.
    


## 4 - Utilidades
    Funciones de soporte general, reusables y sin lógica específica de negocio.
    generateRandomId() - Generar ID Aleatorio
    ¿Qué hace?
    Crea un identificador único para objetos o elementos.
    

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
    

Puntos importantes:
    Son funciones de apoyo, no dependen de la interfaz.
    Mejoran la seguridad, legibilidad o eficiencia del código.
    Son reutilizables en distintas partes del programa.
    Tienen nombres genéricos pero claros.
    Evitan la repetición de lógica en múltiples lugares.
