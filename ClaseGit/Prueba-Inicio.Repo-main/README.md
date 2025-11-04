# Comienza el Readme
---
# Clase 1


Ha comenzado el repositorio. 

```sh
    cd Documents
    mkdir Proyectos
    git clone https://github.com/mathias5525/Prueba-Inicio.Repo.git
    cd Prueba-Inicio.Repo
    git pull origin main
    git fetch
    git branch  # veran que esta la rama main por defecto
    touch README.md  # creamos el readme
    git staus
    git add .
    git commit -m "Creacion del readme"
```

## Agregamos este trabajo en el readme online

> ¿Como hacemos este?

Ingresamos al repositorio y luego solo presionamos punto <br>

```sh
    .
```

Ingresamos toda esta informacion y terminamos.

---

# Clase 2


# Cargar la llave SSH pública en GitHub

## Generar y copiar la llave SSH pública

Para copiar la llave pública, debes ir a la carpeta `.ssh` en tu computadora.  
Allí encontrarás un archivo con extensión `.pub` (por ejemplo, `id_rsa.pub`).

Puedes abrir este archivo con un editor de texto (como el Bloc de notas o VS Code) y copiar todo el contenido que contiene.

---

## Agregar la llave SSH a GitHub

1. Inicia sesión en tu cuenta de **GitHub**.  
2. Ve a **Settings → SSH and GPG keys**.  
3. Crea una nueva clave haciendo clic en **New SSH Key**.  
4. Asigna un nombre descriptivo (por ejemplo, el nombre del ordenador donde estás trabajando).  
5. Pega el contenido de la llave pública en el campo correspondiente.  
6. Guarda los cambios.  

> 💡 **Consejo:** Es recomendable que cada computadora o dispositivo tenga su propia llave SSH para acceder a tu cuenta de GitHub.

---

## Comandos básicos de Git

```bash
git branch  # Ver en qué rama estamos actualmente
git checkout master  # Cambiar a la rama master
git branch -M main  # Cambiar el nombre de la rama master a main
git remote add origin git@github.com:n  # Agregar el repositorio remoto
git remote -v  # Verificar si el repositorio remoto está correctamente conectado
git merge segunda  # Fusionar los cambios de la rama segunda en main
git commit -am "Uso de GitHub parte 20" #  Realizar un commit con un mensaje descriptivo
git push origin main  # Subir los cambios a GitHub
```

Cambio de nombre de rama principal en GitHub

Cuando renombramos la rama master a main, puede ocurrir que en el repositorio de GitHub se creen dos ramas: master y main.

Para corregirlo:

Ve al repositorio en GitHub.

Entra a Settings → Branches.

Cambia la rama principal (default branch) a main.

Luego de esto, puedes eliminar la rama master.

---

# Clase 3

Cambios en GitHub: de master a main

El escritor Argentino Julio Cortázar afirma que las palabras tienen color y peso. Por otro lado, los sinónimos existen por definición, pero no expresan lo mismo. Feo no es lo mismo que desagradable, ni aromático es lo mismo que oloroso.


Por lo anterior, podemos afirmar que los sinónimos no expresan lo mismo, no tienen el mismo “color” ni el mismo “peso”.

Sí, esta lectura es parte de la enseñanza profesional de Git & GitHub.

Desde el 1 de octubre de 2020 GitHub cambió el nombre de la rama principal: ya no es “master” -como aprenderás aquí- sino main.

Este derivado de una profunda reflexión ocasionada por el movimiento #BlackLivesMatter.

La industria de la tecnología lleva muchos años usando términos como master, slave, blacklist o whitelist y esperamos pronto puedan ir desapareciendo.

Y sí, las palabras importan.

Por lo que de aquí en adelante cada vez que me escuches mencionar “master” debes saber que hago referencia a “main”.

¿Cuando es que sigue siendo master y cuando sigue siendo main?
Cuando se crea un repositorio desde git bash en nuestro ordenador a través de git init, sigue siendo el estandar como master. ¿Qué hacer con esto? Debes cambiar el nombre de la rama master a main con el comando:

```bash
git branch -M main
```

O cambiando la asignación por default con este otro comando:

```bash
git config --global init.defaultBranch main
```

A partir de este comando siempre que ingreses git init será la rama main.

Ahora cuando creamos un repositorio desde la nube, osea desde GitHub, ya verás que la rama principal tiene por default el nombre de main y al clonar a nuestro ordenador seguira teniendo este nombre y no será necesario ningun cambio.
Otro comando que deben saber es:

```bash
gitk
```

Si no te funciona el comando gitk es posible no lo tengas instalado por defecto.
Para instalar gitk debemos ejecutar los siguientes comandos:

```bash
sudo apt-get update

sudo apt-get install gitk
```

Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.

---

# Clase 4

Tu primer push
La creación de las SSH es necesario solo una vez por cada computadora. Aquí conocerás cómo conectar a GitHub usando SSH.

Luego de crear nuestras llaves SSH podemos entregarle la llave pública a GitHub para comunicarnos de forma segura y sin necesidad de escribir nuestro usuario y contraseña todo el tiempo.

Para esto debes entrar a la Configuración de Llaves SSH en GitHub, crear una nueva llave con el nombre que le quieras dar y el contenido de la llave pública de tu computadora.

Ahora podemos actualizar la URL que guardamos en nuestro repositorio remoto, solo que, en vez de guardar la URL con HTTPS, vamos a usar la URL con SSH:

```bash
ssh
git remote set-url origin url-ssh-del-repositorio-en-github
```

Comandos para copiar la llave SSH:

ESTAS SON LAS RUTAS DEL SSH PUBLICO

-Mac:
```bash
pbcopy < ~/.ssh/id_rsa.pub
```

Windows (Git Bash):
```bash
clip < ~/.ssh/id_rsa.pub
```

Linux (Ubuntu):
```bash
cat ~/.ssh/id_rsa.pub
```

Importante

Las buenas costumbres nos enseñan que antes de hacer un push, siempre debemos hacer un pull, un fetch, esto para que si alguien ya hizo algún cambio, no se genere un conflicto.

Invitar a un colaborador

Para invitar a un colaborador debemos ir a GitHub y seleccionar:
setting -> colaborators -> ingresar contraseña o un F2A de verificación y enviar la invitación escribiendo el nombre de usuario.

Del otro lado el usuario invitado solo debe aceptar y listo, ya puede participar del proyecto haciendo commit.

---

# Clase 5

Git tag y versiones en GitHub

En Git, las etiquetas o Git tags tienen un papel importante al asignar versiones a los commits más significativos de un proyecto. Aprender a utilizar el comando git tag, entender los diferentes tipos de etiquetas, cómo crearlas, eliminarlas y compartirlas, es esencial para un flujo de trabajo eficiente.

Creación de etiquetas en Git

```sh
git tag -a v1.0 -m "Product release"

git tag -a ronburgundy -m "Brick killed a guy with a trident."
```

Sustituye con un identificador semántico que refleje el estado del repositorio en el momento de la creación. Git admite etiquetas anotadas y ligeras.

Listado de etiquetas
Para obtener una lista de etiquetas en el repositorio, ejecuta el siguiente comando:

```sh
git tag
```

Para crear una etiqueta, ejecuta el siguiente comando:

Las etiquetas anotadas almacenan información adicional como la fecha, etiquetador y correo electrónico, y son ideales para publicaciones públicas. Las etiquetas ligeras son más simples y se emplean como “marcadores” de una confirmación específica.


git tag

Esto mostrará una lista de las etiquetas existentes, como:

v1.0

v1.1

v1.2

Para perfeccionar la lista, puedes utilizar opciones adicionales, como -l con una expresión comodín.

Uso compartido de etiquetas

Compartir etiquetas requiere un enfoque explícito al usar el comando git push. Por defecto, las etiquetas no se envían automáticamente. Para enviar etiquetas específicas, utiliza:

```bash
git push origin
```

Para enviar varias etiquetas a la vez, usa:

```bash
git push origin --tags
```

Eliminación de etiquetas
Para eliminar una etiqueta, usa el siguiente comando:

```bash
git tag -d
```

Esto eliminará la etiqueta identificada por en el repositorio local.

En resumen, las etiquetas en Git son esenciales para asignar versiones y capturar instantáneas importantes en el historial de un proyecto. Aprender a crear, listar, compartir y eliminar etiquetas mejorará tu flujo de trabajo con Git.

---

# Clase 6

Error con los tags
Investigación: ¿Qué pasa si por error cargamos un tag dos veces?

1. Si el tag ya existe en el remoto y apunta al mismo commit

No pasa nada.
Git simplemente te dirá algo como:

*Everything up-to-date*

o ignorará la acción, porque el tag ya apunta al mismo commit.

2. Si el tag existe pero apunta a otro commit diferente

Entonces Git rechaza el push por defecto para evitar sobrescribir el tag remoto.

El mensaje típico es algo así:

*! [rejected]        v1.0 -> v1.0 (already exists)*
*error: failed to push some refs to 'origin'*
*hint: Updates were rejected because the tag already exists in the remote.*

Esto ocurre porque los tags en Git están pensados como referencias inmutables (no deberían cambiar una vez creados).

3. Si realmente querés actualizar o reemplazar el tag remoto

Podés forzar el push con:

```bash
git push origin -f v1.0
```
Pero no se recomienda hacerlo si otros colaboradores ya están usando ese tag, ya que puede causar inconsistencias (por ejemplo, alguien podría tener el viejo tag apuntando a otro commit).

4. Buenas prácticas

Evitá sobrescribir tags publicados.
Si necesitás corregir algo, creá un nuevo tag (por ejemplo, v1.0.1 o v1.0-fix).
Podés eliminar un tag remoto si fue un error:

```bash
git push origin :refs/tags/v1.0
```
y luego volver a crearlo correctamente.

---

# Clase 7-8

## Manejo de ramas en GitHub

Es bueno recordar sobre gitk. Si no te funciona el comando gitk es posible no lo tengas instalado por defecto. Esta es una herramienta muy util a la hora de ver graficamente nuestro trabajo y así entender mejor todo el funcionamiento de ramas, merge y todo el flujo en un formato ordenado.

Para instalar gitk debemos ejecutar los siguientes comandos:

```sh

sudo apt-get update

sudo apt-get install gitk

```

Repasa: ¿Qué es Git?

Las ramas nos permiten hacer cambios a nuestros archivos sin modificar la versión principal (main). Puedes trabajar con ramas que nunca envías a GitHub, así como pueden haber ramas importantes en GitHub que nunca usas en el repositorio local. Lo crucial es que aprendas a manejarlas para trabajar profesionalmente.

Si, estando en otra rama, modificamos los archivos y hacemos commit, tanto el historial(git log) como los archivos serán afectados. La ventaja que tiene usar ramas es que las modificaciones solo afectarán a esa rama en particular. Si luego de “guardar” los archivos(usando commit) nos movemos a otra rama (git checkout otraRama) veremos como las modificaciones de la rama pasada no aparecen en la otraRama.

Comandos para manejo de ramas en GitHub
Crear una rama:

```sh
git branch branchName #Crear una rama
git checkout -b branchName #También crea una rama
git checkout branchName #Movernos a otra rama 
git push origin branchName #Publicar una rama local al repositorio remoto
```

Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.

---

# Clase 9 

## Configurar múltiples colaboradores en un repositorio de GitHub

Por defecto, cualquier persona puede clonar o descargar tu proyecto desde GitHub, pero no pueden crear commits, ni ramas. Esto quiere decir que pueden copiar tu proyecto pero no colaborar con él, si este es publico, de otra manera, osea, si es privado es necesario que realmente estes haciendo una invitación, sino no lo van a poder ver. Existen varias formas de solucionar esto para poder aceptar contribuciones. Una de ellas es añadir a cada persona de nuestro equipo como colaborador de nuestro repositorio.

Cómo agregar colaboradores en Github
Solo debemos entrar a la configuración de colaboradores de nuestro proyecto. Se encuentra en:

Repositorio > Settings > Collaborators
Ahí, debemos añadir el email o username de los nuevos colaboradores.

![alt text](image-1.png)

Si, como colaborador, agregaste erróneamente el mensaje del commit, lo puedes cambiar de la siguiente manera:

Hacer un commit con el nuevo mensaje que queremos, esto nos abre el editor de texto de la terminal:

```sh
git commit —amend #Corregimos el mensaje
git pull origin main #Traer el repositorio remoto
git push --set-upstream origin main #Ejecutar el cambio, el error arreglado
```

Comienzo del colaborador

```sh
cd Documentos #Abre git bash
mkdir class-git #Crea la carpeta o directorio de trabajo
ls -al #Revisa lo que va haciendo, los archivos o directorios que tiene
```

- 1. No debe hacer un git init, debe buscar el repositorio en el cual esta invitado a participar, por supuesto en GitHub.
- 2. Pasa a clonar desde HTTPS, copiar la url, esto es porque no se arranca el proyecto desde cero, se esta uniendo otro colaborador.
- 3. En git bash ponemos el siguiente comando.

```sh
git clone url-copiada-github #Esto hace que clonemos el repositorio
```

- 4. No pide ni usuario ni contraseña si el repositorio es publico.

```sh
code . #Abre VSC y comienza con cambios, o abre el siguiente comando para hacer modificaciones
vim historia.txt #Vamos a escribir: Aquí esta un nuevo colaborador
vim escribimos el mensaje del commit #Esto en Ubuntu
ctrl + x
s #Para un si 
enter #Terminado el mensaje del commit
vim escribimos el mensaje del commit #Esto en git bash window
esc #Presionamos escaner luego de terminar de escribir
:wq! #Para salir del editor vim en window
git status
git commit -am "Mi primer commit, estoy muy emocionado!!!"
git pull origin main
git fetch
gti branch #Para ver las ramas que se trajo, no se trae sino solo main, si hay mas debes crearlas local
git log #Para ver toda las historia
git log --graph #Vemos el grafico de las diferentes ramas y del commit que acabamos de hacer que esta en el main, Git es una base de datos de toda las historia de todo lo que se ha hecho
git push origin main #Va a pedir un email que será el del colaborador, su contraseña.
```

- 5. Nos trae un denegado, ¿Por qué? Porque en el proceso de abordaje el jefe no le dio acceso: el dueño del repositorio no le agregó dandole acceso.
- 6. Ir a settings del repositorio, veremos la opsión Collaborators, agregamos el correo o nombre de usuario: el colaborador debe tener un email publico y visible o de otra manera debera ser con el nombre de usuario publico: ingresar el username y debe ir como colaborador.
- 7. Se puede enviar un email con la url, pero ya GitHub envia una notificación al usuario de invitado, es una cosa que debemos empezar a consultar y revisar.
- 8. El colaborador debe aceptar la invitación, una vez hecho eso ya tendrá total acceso para hacer push al repositorio.

```sh
git pull origin main
git push origin main #Colocar nombre de usuario y contraseña, listo
```

- 9. El dueño del repositorio no ve los cambios, ¿Qué hacer?

```sh
git pull origin main
git fetch
git log --stat #Se verá claro que el colaborador ingreso su primer commit
```

- 10. A partir de ahora el dueño del repositorio y el colaborador deberán repartir el trabajo, esto se hace con distintas ramas de trabajo: el dueño trabajará desde la rama header y el colaborador desde la rama footer, al final cuando se termine, se hara un merge para terminar el proyecto.

---

# Clase 10

## Flujo de trabajo profesional

Haciendo merge de ramas de desarrollo a main

Para poder desarrollar software de manera óptima y ordenada, necesitamos tener un flujo de trabajo profesional, que nos permita trabajar en conjunto sin interrumpir el trabajo de otros desarrolladores.

Una buena práctica de flujo de trabajo sería la siguiente:

- Crear ramas
- Asignar una rama a cada programador
- El programador baja el repositorio con git pull origin master
- El programador cambia de rama
- El programador trabaja en esa rama y hace commits
- El programador sube su trabajo con git push origin #nombre_rama
- El encargado de organizar el proyecto baja, revisa y unifica todos los cambios

---

# Clase 11

## Flujo de trabajo profesional -> Archivos binarios

Las imagenes cargandolas en el repositorio, representan un problema: porque las imagenes son pesadas, y si la subimos al repositorio, siempre que hagamos cambios, vamos a estar trayendo la imagen siempre, estas imagenes son binarios para GitHub, mientras mas binarios carguemos, más pesado va a ser el repositorio, algo que no es parte de las buenas practicas.

Otra cosa muy importante a tener en cuenta, es que en cada commit que hagamos hay un tamaño predefinido para la carga, este no lo podemos superar o no podremos subir los commits, el tamaño es 100 mb, si acoplamos un archivo binario en un commit que pese mas de esto, será un problema, no nos dejará seguir commiteando, porque siempre seguirá arrastrando el archivo binario.