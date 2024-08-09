<h1 center> 
$${\color{red} Patrones \space Creacionales \space en \space Java}$$
</h1>
Estos son mecanismos que nos ayudan y guian en la creación de objetos, buscando incrementar la flexibilidad y la reutilización del código existente y haci obtener un sistema independiente. Hay varios tipos como: 


  * ***Singleton:***
Se encarga de que las clases tengan una única instancia y permite que tengan un acceso global a la instancia. Al solucionar dos problemas al mismo tiempo rompe con "el Principio de responsabilidad única".
Para solucionar aquel problema debe cumplir con dos requisitos:
    * Hacer privado el constructor para evitar que otros objetos utilicen el operador con la clase.
    * Crear un método de creación estático que actúe como constructor. Este método invoca al constructor privado para crear un objeto y lo guarda en un campo estático.
    * Si tiene acceso a la clase Singleton, tendran acceso al constructor.

 * ***Factory Method:***
Es un método que nos permite crear instancias de objetos de un tipo determinado, encapsulando la creación de dichos objetos, mientras permite a las subclases alterar el tipo de objetos que se crearán. Busca crear ojetos sin necesidad de conocer que objeto se instanciara.
Puedes utilizar este metodo cuando quieras ahorrar recursos del sistema mediante la reutilización de objetos existentes en lugar de reconstruirlos cada vez.
Con este metodo bien implementado se evitara que el código quede obligado a trabajar con un dato especifico, dando así la posibilidad de agregar más metodos que en el momento de la creación del código eran desconocidos.

 * ***Prototype:***
Este patron nos permite copiar objetos existentes que seran independientes de sus clases, este proceso sedelegara a los propios objetos que estan siendo clonados. Parte escencial de este proceso es la interfaz en común que deben tener los objetos creados.

 * ***Abstract Factory:***
Nos permite producir familias de objetos relacionados sin especificar sus clases concretas. Adicionalmente, se tiene la posibilidad de poder expandir el código sin afectar el ya existente.
Lo que se hara es declarar de forma explícita interfaces para cada producto diferente de la familia de productos. Después podemos hacer que todas las variantes de los productos sigan esas interfaces. 

 * ***Builder:***
Con este patron se nos permite construir objetos complejos paso a paso. El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción. 
Un problema que puede presentar es al momento de manejar un objeto complejo que requiera una inicialización laboriosa, paso a paso, de muchos campos y objetos anidados. Normalmente, este código de inicialización está sepultado dentro de un monstruoso constructor con una gran cantidad de parámetros. 
La solución que nos ofrece este programa es que saques el código de construcción del objeto de su propia clase y lo coloques dentro de objetos independientes llamados constructores.
