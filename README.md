# MasivianRouletteAPI

## Pre-requisitos
* [MAVEN](https://maven.apache.org/) - Administrador de dependencias.
* [GIT](https://git-scm.com/) - Control de versiones.
* [DOCKER](https://www.docker.com/) - Contenedores.   

Para estar seguro de las versiónes que posee de maven, git y de java ejecute los siguientes comandos:
```
mvn -version  
git --version  
java -version  
```
## Instalación 
Para descargar el proyecto desde GitHub ejecute la siguiente linea:
```
https://github.com/Camu10/MasivianRouletteAPI.git
cd /MasivianRouletteAPI
```

## Ejecutar
Desde la consola de comandos para compilar ejecutamos la siguiente linea:
```
mvn package
```
Para ejecutar el proyecto de manera local desde la consola de comandos ejecutamos la siguiente linea:
```
java -cp target/classes;target/dependency/*  org.masivian.test.App
```
Si se quiere ejcutar como un contenedor de Docker:
```
docker-compose up -d 
```
## Ejemplos de creación de apuestas.
### Creación de apuesta por numero.
![NumberBet](https://github.com/Camu10/MasivianRouletteAPI/blob/main/img/NumberBet.jpg)
### Creación de apuesta por color.
![NumberBet](https://github.com/Camu10/MasivianRouletteAPI/blob/main/img/ColorBet.jpg)

## Construido con
* [MAVEN](https://maven.apache.org/) - Administrador de dependencias.
* [GIT](https://git-scm.com/) - Control de versiones.
* [JUNIT](https://junit.org/junit5/) - Framework para realizar y automatizar pruebas.
* [DOCKER](https://www.docker.com/) - Tecnología para el uso de contenedores.
* JAVA - Lenguaje de programación.

## Autor
* **Carlos Murillo** - [Camu10](https://github.com/Camu10)

## Licencia
Este proyecto está bajo la Licencia GNU(General Public License) - mira el archivo [LICENSE](LICENSE) para detalles.
