// Ejercicio 1: Función que valide una contraseña (mínimo 8 caracteres, 1 número, 1 mayúscula)

/**
 * Función que valida si una contraseña cumple con los requisitos mínimos de seguridad.
 * @param {string} password - La cadena de texto de la contraseña a validar.
 * @returns {boolean} - Retorna true si cumple con los requisitos, false en caso contrario.
 */
function validatePassword(password) {
    
    // --- Validación con Expresiones Regulares (RegEx) ---
    
    // Define una Expresión Regular: /.../ es el patrón.
    // [A-Z] significa "cualquier carácter entre A y Z (una mayúscula)".
    // .test(cadena) es un método de RegEx que retorna true si encuentra el patrón en la cadena.
    const tieneMayus = /[A-Z]/.test(password);

    // Define una Expresión Regular: /.../ es el patrón.
    // [0-9] significa "cualquier carácter entre 0 y 9 (un número)".
    const tieneNum = /[0-9]/.test(password);

    // --- Lógica Condicional ---
    
    // 1. Primer Requisito: Comprobamos que la longitud de la contraseña sea de al menos 8 caracteres.
    if (password.length >= 8) {
        // Si la longitud es suficiente (>= 8), comprobamos los otros dos requisitos.
        
        // El operador && (AND lógico) retorna true SÓLO si ambas variables son true.
        // Requisitos: (Tiene mayúscula) Y (Tiene número).
        return tieneMayus && tieneNum;
    } else {
        // Si la longitud es menor a 8, no es necesario verificar los otros requisitos, 
        // la contraseña es inválida.
        return false;
    }
}

// --- Pruebas de la Función ---

// Prueba 1: 'Abc12345' -> Cumple longitud (8), tiene mayúscula (A), tiene número (1). Resultado esperado: true.
console.log(validatePassword("Abc12345")); 

// Prueba 2: 'weak' -> No cumple longitud (4). Resultado esperado: false.
console.log(validatePassword("weak")); 

// Pruebas adicionales (no incluidas en tu código, pero útiles para el entendimiento):
// console.log(validatePassword("min8chars")); // false (No tiene número)
// console.log(validatePassword("MINUMERO8")); // false (No tiene mayúscula - si el requisito fuera 1 minúscula)
// console.log(validatePassword("min8num8"));  // false (No tiene mayúscula)