# ***Lab # 4 Taller de arquitecturas de Servidores y Aplicaciones***

## Introducción Del Proyecto

En este laboratorio 4 Introducción a esquemas de nombres, redes, clientes y servicios con Java, 4 aprendimos a construir un servicio web tipo (Apache) en java, en donde el servidor debe ser capaz de entregar paginas HTML e imágenes tipo PNG. EL proyecto tiene como objetivo que cuando el usuario consulte a nuestro servidor, la aplicación sea capaz de redireccionar las peticiones que envía el servidor, desprendiendo las anotaciones que tenga. Después de realizar la contención de estos servicios se hace una desaplique en Heroku y una integración continua en circleCI.



### Pre-Requisitos

- Para la realización de este laboratorio es necesario el uso de los aplicativos mencionados abajo de la descripción, en donde si no cuenta con alguno de estos,
       solo es necesario darle clic al que necesite y lo dirigirá a la página de instalación:


    * [Java 11](https://www.java.com/es/) - Codificación
    * [Maven](https://maven.apache.org/) - Manejo de Dependencias
    * [Git](http://git-scm.com/book/en/v2/Getting-Started-Installing-Git) - Control de Sistemas de veriones.
    * [Heroku](https://devcenter.heroku.com/articles/heroku-cli#download-and-install) - Despligue de Ambiente Web


### Despliegue con Heroku App

>[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://sheltered-woodland-90071.herokuapp.com/)


### Integracion Continua con Circle CI
>[![CircleCI](https://circleci.com/gh/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI.svg?style=svg)](https://app.circleci.com/pipelines/github/Fabimauri47/-AREP-Lab3-CLIENTES-Y-SERVICIOS)
>
### Calidad Del Código con Codacy

>[![Codacy Badge](https://app.codacy.com/project/badge/Grade/b62c449e43f24a86803f524a67d373ea)](https://app.codacy.com/gh/Fabimauri47/-AREP-Lab3-CLIENTES-Y-SERVICIOS/dashboard)

### Guia de Instalación

1. Primero se debe clonar el repositorio, con el siguiente comando descrito:

       git clone https://github.com/Fabimauri47/-AREP-Lab3-CLIENTES-Y-SERVICIOS
    

2. Luego proceda abrir el cmd (Ventana de comandos) en donde tiene el repositorio alojado y ejecute el siguiente comando:

       mvn package
    

3. Ejecutamos el programa con el siguiente comando:

       mvn exec:java -D "exec.mainClass"="edu.escuelaing.demo.NanoSparkWebDemo"
   

4. Gereramos la documentación con el siguiente comando ejecutandolo desde consola:

       mvn javadoc:javadoc
   
 

## Corriendo Pruebas

Para correr las pruebas, usamos el siguiente comando en una terminal CMD o en una terminal GIT:

         mvn test

 
## Desarrollo e Informe

- Para conocer más sobre el desarrollo del proyecto, descargue el proyecto como se explica arriba o revise el informe:

    -[Presione Aqui para revisar documento](https://github.com/Fabimauri47/-AREP-Lab3-CLIENTES-Y-SERVICIOS/blob/main/Lab3_Introducci_n_a_esquemas_de_nombres__redes__clientes_y_servicios_.pdf)

## Construido con

* [Java 11.0](https://www.java.com/es/) - Codificación y Lenguaje de Programacíon.
* [Maven](https://maven.apache.org/) - Manejo de Dependencias.
* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/) - Programa usado para la Codificacíon.


## Autor

* **Fabián Mauricio Ramirez Pinto** [Fabimauri47](https://github.com/Fabimauri47)


## Licencia

Este proyecto cuenta con la licencia GNU: General Public License - see the [LICENSE.md](https://github.com/Fabimauri47/AREP-Lab1-Calculadora/blob/main/LICENSE.txt) 
