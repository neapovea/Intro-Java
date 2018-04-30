# Intro-Java
Introducción a Java


# Comandos Git
- git checkout develop
- git add DIRECTORIO
- git commit -m "COMENTARIO"
- git checkout master
- git merge develop -m "Merge 0.xx branch 'develop'"
- git tag 0.xx
- git push origin master --tags


# Secuencia desde el IDE
- GIT->REPOSITORY->BRANCHES
   - BRANCHE develop ->> CHECKOUT (si no existe crear)
- GIT->ADD (files or directory)
- GIT->COMMIT (files or directory)
- GIT->REPOSITORY->TAG
   - Crear Tag en branch master
- GIT->REPOSITORY->PUSH
   - Marcar Push Tags

- GIT->REPOSITORY->BRANCHES
   - BRANCHE master ->> CHECKOUT
- GIT->REPOSITORY->merge Branches-->>
   - Branches to merge (marcar develop)
   
#Sentencias con GitFlow desde IDE.
https://dazzet.co/tutorial-de-git-flow/
- Instalar paquete git-flow en el sistema operativo
- Configurar GitFlow en IDE marcando en el apartado Release
	Push on finish release (-p)
	Use custom tag commit message --> %name%

---Pasos para realizar una Feature, se repetin tantas veces como necesitemos 	
- GitFlow: Init Repo
- GitFlow: Start Feature
- IDE: Agregar ficheros (Ctrl+Alt+A) y hacer commits
- GitFlow: Publish feature
- GitFlow: Finish feature

---Pasos para realizar una Release, que publicará los cambios. 
- GitFlow: Start Release
- GitFlow: Publish release
- GitFlow: Finish release
    Aquí se indica/revisa el tag, según la configuración puesta sera el mismo que el nombre de la Feature.



#comandos para revisión
- git branch -a 
    (para ver las ramas, si se ejecuta antes y después del release se veran las ramas creadas y como las borra al subir los cambios)
- git status

