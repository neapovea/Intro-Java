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
- GIT->REPOSITORY->BRANCHES
   - BRANCHE master ->> CHECKOUT
- GIT->REPOSITORY->merge Branches-->>
   - Branches to merge (marcar develop)
- GIT->REPOSITORY->TAG
   - Crear Tag en branch master
- GIT->REPOSITORY->PUSH
   - Marcar Push Tags
