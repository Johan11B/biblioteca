                                    SISTEMA DE GESTIÓN BIBLIOTECA

-----DESCRIPCIÓN DEL PROYECTO----

Este proyecto implementa un sistema de gestión de biblioteca, permitiendo agregar, eliminar, buscar y
visualizar libros. Se aplican principios de programación orientada a objetos, 
incluyendo encapsulamiento, clases, métodos, estructuras de control y manejo de excepciones.
Además, incorpora un menú interactivo que facilita la navegación 
del usuario y la gestión de la colección de libros.

-----FUNCIONAMIENTO-------

En primer lugar, se define la clase Libro, la cual contiene atributos privados como título, autor, año de
publicación, género y disponibilidad. Además, esta clase incluye métodos de acceso y modificación 
(getters y setters) para cada uno de sus atributos, lo que garantiza el principio de encapsulación. 
A su vez, se sobrescribe el método toString() con el propósito de retornar una representación
estructurada de la información del libro.

Por otro lado, se desarrolla la clase Biblioteca, la cual tiene como función principal gestionar la colección de 
libros mediante un ArrayList. En esta clase, se implementan métodos que permiten agregar, eliminar y buscar 
libros por título o autor. Asimismo, se incluye la funcionalidad de mostrar la lista completa de libros 
disponibles. Para la interacción con el usuario, se utiliza un menú interactivo mediante el método 
menu(), el cual tiene diferentes opciones y procesa la entrada del usuario a través de un Scanner.
Finalmente, la clase Main es la encargada de ejecutar el programa llamando al método menu() de Biblioteca.

-----INTEGRANTES DEL GRUPO-----

   1. Johan Steven Briceño Layton
   2. Daniel Esteban Contreras Motoa
   3. Juan David Catrillon Varon

