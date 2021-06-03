# Examen Java para Cash Online

_API Rest programada en Java utilizando Spring Boot y JPA_

## Tecnologías aplicadas

* Spring JPA
* Spring Boot
* Base de datos MySQL
* Gestor XAMPP

## Documentacion de métodos

* API Usuario: _localhost:8080/usuario_
** _/save_: guarda un usuario cargado
** _/showAll_: lista todos los usuarios existentes
** _/show/id_: lista el usuario correspondiente al id
** _/delete/id_: elimina el usuario correspondiente al id

* API Loans: _localhost:8080/loans_
** _?page=x&size=y_: realiza la paginacion con los parametros page con valor "x" y size con valor "y"
