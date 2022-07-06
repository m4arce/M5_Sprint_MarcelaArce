# M5_Sprint_MarcelaArce
Desarrollo de App Web para Empresa Prevencion de Riesgos (Ejercicio)

# SPRINT M5 - FULL STACK JAVA - @MARCELA_ARCE
#REPOSITORIO GITHUB: https://github.com/m4arce

## CONTEXTO:

PARA ESTE EJERCICIO, SE PIDE CREAR UNA APLICACION WEB PARA UNA EMPRESA DE PREVENCION DE RIESGOS, QUE PERMITA MANEJAR USUARIOS Y
DONDE SE PUEDA REALIZAR LO SIGUIENTE:

* CREAR CAPACITACIONES 
* LISTAR CAPACITACIONES
* CREAR USUARIO
* LISTAR USUARIOS
* FORMULARIO CONTACTO
* ACCESO CONTROLADO EN LOGIN
* VISTAS NO PUEDEN SER ACCEDIDAS SI NO ESTA LOGUEADO
* CONECTAR CON BASE DE DATOS USANDO MYSQL
* UTILIZAR PATRONES DE DISEÑO ADECUADOS
* APLICACION RESPONSIVA

**NOTA: EL PLANTEAMIENTO GENERAL Y CONTEXTO ORIGINAL ES MUCHO MAS EXTENSO, SIN EMBARGO, EN EL TRANSCURSO DEL MODULO DE APRENDIZAJE, SE PLANTEAN
SOLAMENTE LOS REQUERIMIENTOS ANTERIORES. POR ESTA RAZON ES QUE, SE REALIZA UN RESUMEN CON LO ESTRICTAMENTE SOLICITADO**

### SOLUCION:

* SE CREA APLICACION CON DISEÑO RESPONSIVO UTILIZANDO EL FRAMEWORK DE BOOTSTRAP PENSANDO EN LA AGILIDAD DEL PROYECTO.
* SE UTILIZAN SERVLET COMO CONTROLADORES
* SE UTILIZAN INTERFACES PARA IMPLEMENTAR METODOS (CRUD)
* SE UTILIZAN CLASES PARA DEFINIR MODELOS DE DATOS
* SE UTILIZAN VISTAS JSP (SE USA JSTL Y LIBRERIAS CORE PARA OPTIMIZACION)
* SE USA PATRON DE DISEÑO SINGLETON PARA CONEXION DE BASE DE DATOS MYSQL
* TODO LO ANTERIOR, DEBIDAMENTE CLASIFICADO EN PAQUETES REFERENCIALES AL USO

** NOTA: SE CREA UN DISEÑO FUNCIONAL Y BASICO PARA EFECTOS DE INTERFAZ, NO SE CONSIDERAN VISTAS SEGUN TIPO DE USUARIO, PUESTO QUE EL EJERCICIO
Y SU SECUENCIA NO ERA LO SUFICIENTE CLARA, SIN EMBARGO, SE PIENSA EN UNA SOLUCION QUE FACILITE LA RESOLUCION DEL PROBLEMA DE UNA FORMA MAS GENERICA
UTILIZANDO EN LA VISTA DE CREACION DE USUARIO, UN SELECT DONDE ESPECIFICA EL TIPO DE USUARIO PARA SER MODIFICADO DE SER NECESARIO Y, A SU VEZ,
IMPLEMENTARLO ASOCIADO A ESTE CAMPO RESPECTO DE LOS OTROS MODELOS DE USUARIO SOLICITADOS PARA UNA SEGUNDA ETAPA DE LA APLICACION.

#### DATABASE: MYSQL

PARA PROBAR LA EJECUCION CORRECTA DE LA APLICACION, SE DEBE UTILIZAR EL SIGUIENTE SCRIPT Y CREAR LA DB:

/*nota: no se considera usuarios ni privilegios para facilitar la creacion del script de caracter pedagogico*/

CREATE SCHEMA `prevencionderiesgos` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci ;
CREATE TABLE `prevencionderiesgos`.`capacitaciones` (
  `idcapacitaciones` INT NOT NULL AUTO_INCREMENT,
  `nombreCurso` VARCHAR(45) NULL,
  `nombreDocente` VARCHAR(45) NULL,
  `fechaInicio` VARCHAR(45) NULL,
  `fechaTermino` VARCHAR(45) NULL,
  `precio` VARCHAR(45) NULL,
  PRIMARY KEY (`idcapacitaciones`));
  
 /*Se insertan registros para poblar la tabla y poder ejecutar el despliegue de lista solo para efectos de rapida ejecucion */
  
INSERT INTO `prevencionderiesgos`.`capacitaciones` (`idcapacitaciones`,`nombreCurso`,`nombreDocente`,`fechaInicio`,`fechaTermino`,`precio`) VALUES (1,'Prevencion Total','Juanito Perez','01-07-2022','01-09-2022','200000');
INSERT INTO `prevencionderiesgos`.`capacitaciones` (`idcapacitaciones`,`nombreCurso`,`nombreDocente`,`fechaInicio`,`fechaTermino`,`precio`) VALUES (2,'Prevencion Escaleras','Perico Los Palotes','01-07-2022','01-09-2022','150000');
INSERT INTO `prevencionderiesgos`.`capacitaciones` (`idcapacitaciones`,`nombreCurso`,`nombreDocente`,`fechaInicio`,`fechaTermino`,`precio`) VALUES (3,'Prevencion Oficina','Doña Juanita','01-07-2022','01-09-2022','200000');
INSERT INTO `prevencionderiesgos`.`capacitaciones` (`idcapacitaciones`,`nombreCurso`,`nombreDocente`,`fechaInicio`,`fechaTermino`,`precio`) VALUES (4,'Prevencion Codigo','Juan Jose','01-07-2022','01-07-2022','200000');

CREATE TABLE `prevencionderiesgos`.`usuarios` (
  `idusuarios` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `tipo` VARCHAR(45) NULL,
  PRIMARY KEY (`idusuarios`));

/*Se insertan registros para poblar la tabla y poder ejecutar el despliegue de lista solo para efectos de rapida ejecucion */

INSERT INTO `prevencionderiesgos`.`usuarios` (`idusuarioss`,`usuario`,`password`,`tipo`) VALUES (1,'pepito123','clave123','cliente');
INSERT INTO `prevencionderiesgos`.`usuarios` (`idusuarioss`,`usuario`,`password`,`tipo`) VALUES (2,'pepito123','clave123','cliente');
  
  CREATE TABLE `prevencionderiesgos`.`contactoform` (
  `idcontactoForm` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `mensaje` VARCHAR(45) NULL,
  PRIMARY KEY (`idcontactoForm`));

/*END SCRIPT*/

**************************************************************************************************************************************

***CHALLENGE ACCEPTED!! THANK FOR YOUR ATTENTION*** 
