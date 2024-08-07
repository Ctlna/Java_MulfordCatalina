# $${\color{red} Principios \space de \space SOLID}$$
Es uno de los fundamentos de la arquitectura y desarrollo de software. Con estos principios se busca crear un software eficaz, robusto y estable, donde el código escrito sea limpio, flexible ante los cambios y que se pueda reutilizar.

Es un acronimo para los principios a tener en cuenta en el diseño de aplicaciones:

* **S** –>Single Responsibility Principle (SRP)
* **O** –>Open/Closed Principle (OCP)
* **L** –>Liskov Substitution Principle (LSP)
* **I** –>Interface Segregation Principle (ISP)
* **D** –>Dependency Inversion Principle (DIP)

### 1. Principio de Responsabilidad Única (SRP):
Esta es la "S" del acronimo, según este principio una clase debería tener una, y solo una, razón para cambiar. Busca agrupar las clases que cambian por la misma razon.

### 2. Principio de Abierto/Cerrado (OCP):
En la "O" del acronimo, se busca extender el comportamiento de una clase, sin modificarla. En otras palabras: las clases que usas deberían estar abiertas para poder extenderse y cerradas para modificarse.

### 3. Principio de Sustitución de Liskov (LSP):
La "L" pertenece a "Barbara Liskov", quien dice que los objetos deben poder ser reemplazados por instancias de sus subtipos sin alterar el correcto funcionamiento del sistema. Es decir, si en un programa utilizamos cierta clase, deberíamos poder usar cualquiera de sus subclases sin interferir en la funcionalidad del programa.  

### 4. Principio de Segregación de la Interfaz (ISP):
Según la "I" del acronimo, es preferible contar con muchas interfaces que sea especializada para pocos métodos que tener una interface forzada a implementar muchos métodos a los que no dará uso.

### 5. Principio de Inversión de Dependencias (DIP):
La "D" consiste en reducir las dependencias entre los módulos del código, es decir, alcanzar un bajo acoplamiento de las clases. Unos consejos del creador de este principio son:
  * Los módulos de alto nivel no deberían depender de módulos de bajo nivel. Ambos deberían depender de abstracciones.
  * Las abstracciones no deberían depender de los detalles. Los detalles deberían depender de las abstracciones.
La abstracción en programación se refiere a la capacidad de representar y manejar conceptos complejos de manera simplificada.
