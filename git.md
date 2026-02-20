## GIT 

### 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto normal? 
Un repositorio en Git es un espacio donde se almacenan los archivos de un proyecto junto con el historial de cambios. A diferencia de un proyecto normal, Git permite llevar control de versiones y recuperar estados anteriores del proyecto. 

### 2. ¿Cuáles son las tres áreas principales de Git? 
- Working Directory: donde se modifican los archivos. 
- Staging Area: donde se preparan los cambios antes del commit. 
- Repository: donde se guardan definitivamente los cambios confirmados. 


### 3. ¿Cómo representa Git los cambios internamente? 
Git utiliza objetos: 
- Blob: almacena el contenido de los archivos. 
- Tree: guarda la estructura de carpetas. 
- Commit: registra un conjunto de cambios. 
- Tag: marca commits importantes. 

### 4. ¿Cómo se crea un commit y qué información almacena? 
Se crea usando el comando git commit. Un commit almacena el autor, la fecha, un mensaje descriptivo y un enlace al commit anterior. 

### 5. ¿Diferencia entre git pull y git fetch? 
git fetch descarga cambios sin aplicarlos, mientras que git pull descarga y aplica los cambios automáticamente. 

### 6. ¿Qué es un branch en Git? 
Un branch es una rama del proyecto que permite trabajar en cambios sin afectar la rama principal. 

### 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? 
Un merge une ramas. Pueden surgir conflictos cuando dos ramas modifican la misma línea. Se resuelven editando manualmente los archivos. 

### 8. ¿Cómo funciona el área de staging? 
El área de staging guarda los archivos antes del commit. Si se omite, los cambios no se guardan en el repositorio. 

### 9. ¿Qué es el archivo .gitignore? 
Es un archivo que indica a Git qué archivos no deben ser rastreados. 

### 10. Diferencia entre commit amend y un nuevo commit 
--amend modifica el último commit, mientras que un nuevo commit crea uno adicional. 

### 11. ¿Qué es git stash? 
Permite guardar cambios temporalmente sin hacer commit. 

### 12. ¿Cómo deshacer cambios en Git? 
Usando comandos como git reset, git revert y git checkout. 

### 13. ¿Cómo funciona la configuración de remotos? P
ermite conectar el repositorio local con repositorios en GitHub usando nombres como origin. 

### 14. ¿Cómo inspeccionar el historial? 
Usando git log, 
git diff 
git show.