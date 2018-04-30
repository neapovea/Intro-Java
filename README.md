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
- GitFlow: Init Repo
- GitFlow: Start Feature
- add files and commits
- GitFlow: Publish feature
- GitFlow: Finish feature
- Terminal: git push origin develop

   
- GitFlow: Start Release
- GitFlow: Publish release
- GitFlow: Finish release, aquí se indica el tag.
- Terminal: git push --tags
- Terminal: git push origin develop
- Terminal: git push origin master



 
#secuencia desde gitflow desde IDE
https://dazzet.co/tutorial-de-git-flow/
- instalar paquete git-flow en el sistema operativo
- Instalar git flow integration
- iniciar repo con la opción del menu (init repo), con las opciones por defecto
- realizar add, commit 
- realizar tag
- hacer git flow feature publish
- hacer git flow feature finish
- git branch -a (para ver las ramas)
- git push origin :feature/<feature>
- git branch -a (para ver las ramas y ver que ha desaparecido la rama <feature>)

