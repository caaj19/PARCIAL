
/*


PARCIAL

CAMILO ANDRES ARVALO JIMENEZ 

PARTE TEORIA:


1. Basado en el concepto de interface indique cuales de los siguientes enunciados son ciertos. 

A. Una interface puede tener métodos estáticos.            =     FALSA
B. Una interface puede extender uno o más interfaces.      =     VERDADERA
C. Una interface puede extender una clase abstracta.       =     FALSA
D. Una clase abstracta puede extender una interface.       =     VERDADERA
 


2. Qué es una clase abstracta. En qué se diferencia una clase abstracta de una clase normal y una clase abstracta de una interface.


+DEFINICION CLASE ABSTRACTA: define atributos y métodos, pero estos métodos no son implementados en esa clase, son heredados a sus 
                             hijos que extiendan dicha clase abstracta. Ellos si deben usar los métodos definidos anteriormente. 
                             (su palabra reservada es “abstract”.)


+DIFERENCIA ENTRE INTERFAZ Y CLASE ABSTRACTA: Una interfaz define los métodos abstractos pero no especifica que van a hacer dichos métodos,
                                              las demás clases pueden implementar varias interfaces, mientras que la clase Abstracta
                                              al definir los métodos especifica cómo se debe implementar.


+DIFERENCIA ENTRE CLASE ABSTRACTA Y CLASE NORMAL: La clase normal tiene varios atributos que pueden ser usados en los distintos métodos que estén
                                                  también definidos en esa misma clase o que hayan implementados de una clase padre (no puede heredar 
                                                  métodos ni atributos). Mientras que la clase Abstracta puede heredar sus atributos y métodos.


3. Suponga que la clase Sub Exteniente de la clase Sándwich. Cuál de los siguientes estamentos son válidos. 

Sandwich x = new Sandwich ();
Sub y = new Sub ();

A. x=y                                                     =     VERDADERA
B. y=x                                                     =     FALSA
C. y = new Sandwich ();                                    =     FALSA
D. x = new Sub ();                                         =     VERDADERA



4.Considere que debe escribir un programa que va ser usado para gestionar una
colección de películas. Hay tres tipos de películas en la colección: dramas,
comedias y documentales. El coleccionista quiere guardar el título de cada
película, el nombre de su director y el año en el cual la película fue realizada.
Respecto a las operaciones (Métodos) se tiene:

 Algunas operaciones (Métodos) son implementadas para todas las
películas.

 Hay operaciones especiales para cada uno de los tres tipos de película.

 Existen operaciones que deben tener todas las películas. Sin embargo, las
debe implementar obligatoriamente cada uno de los tipos.

Presente el diseño de clases para representar el sistema de gestión de películas.



*/



