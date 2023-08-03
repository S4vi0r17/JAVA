# Índice

- [Creación de clases y objetos](#creación-de-clases-y-objetos)
- [Creación de métodos](#creación-de-métodos) 
- [Constructores](#constructores)
- [Sobrecarga](#sobrecarga)
- [Modificadores de acceso](#modificadores-de-acceso)
- [Encapsulamiento](#encapsulamiento)
- [Constantes](#constantes)
- [Clases wrapper](#clases-wrapper)
- [Miembros estáticos](#miembros-estáticos)

# Creación de clases y objetos en Java POO

## Clase
- Una clase es como una plantilla o molde que define las características y comportamientos de un tipo de objeto. 
- Se declara con la palabra clave `class`, un nombre de clase y llaves que contienen los atributos y métodos.

## Atributos 
- Los atributos son las variables que representan el estado del objeto.  
- Se declaran dentro de la clase con un tipo de dato y nombre.

## Métodos
- Los métodos son las funciones que definen el comportamiento del objeto. 
- Se declaran dentro de la clase con un tipo de retorno, nombre, parámetros y cuerpo.

## Creación de objetos
- Para crear un objeto a partir de una clase se usa la palabra `new` y se invoca el constructor. 
- Esto reserva memoria para el objeto y lo inicializa.

## Constructor
- El constructor es un método especial usado para inicializar un objeto recién creado. 
- Suele tener el mismo nombre que la clase y no tiene tipo de retorno.

## Acceso a atributos y métodos
- Se accede a los atributos y métodos de un objeto usando la notación punto: `objeto.atributo`, `objeto.metodo()`.

## Encapsulamiento
- En Java todo está contenido en clases, incluso los tipos primitivos se encapsulan en clases wrapper como `Integer`, `Double`, etc.

## Ventajas POO
- La POO permite crear código más modular y organizado al modelar objetos del mundo real y definir claramente sus responsabilidades.

## Ejemplo

```java
public class Persona {

  // Atributos
  String nombre;
  int edad;  

  // Método constructor
  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  // Otros métodos
  public String getNombre() { 
    return this.nombre;  
  }

  public int getEdad() {
    return this.edad;
  }

}

// Creación de un objeto Persona
Persona persona1 = new Persona("Juan", 25);

// Accediendo a sus atributos y métodos
System.out.println(persona1.getNombre()); // Imprime "Juan" 
System.out.println(persona1.getEdad()); // Imprime 25
```


# Creación de métodos en Java

Los métodos son bloques de código que realizan una tarea específica. Se declaran dentro de una clase y pueden ser llamados más tarde.

## Declaración

Se declaran con:

- Modificador de acceso (public, private, etc) 
- Tipo de retorno
- Nombre del método
- Parámetros entre paréntesis 
- Cuerpo entre llaves

Ejemplo:

```java
public double calcularPromedio(int n1, int n2) {
  return (n1 + n2) / 2.0;
}
```

## Llamada a un método

Para llamar a un método se utiliza el nombre del objeto seguido por un punto y el nombre del método con los argumentos.

Ejemplo:

```java
double prom = calculadora.calcularPromedio(10, 8);
```

## Parámetros y argumentos

Los parámetros son variables en la declaración del método. Los argumentos son los valores pasados al llamarlo.

## Retorno de valores

Con la palabra return se devuelve un valor al terminar el método. Si no se pone return, el método devolverá null o void.

## Ejemplo

```java
public class Calculadora {

  public double calcularPromedio(int n1, int n2) {
    return (n1 + n2) / 2.0; 
  }
  
  public double sumar(double a, double b) {
    return a + b;
  }
  
}

Calculadora calc = new Calculadora();
double prom = calc.calcularPromedio(10, 8);
double suma = calc.sumar(4.5, 1.3);
```

## Métodos sin retorno

Si un método no necesita devolver ningún valor, se declara con void como tipo de retorno.

Ejemplo:

```java
public void imprimirSuma(int a, int b) {
  int suma = a + b;
  System.out.println("La suma es: " + suma);
}
```

En lugar de return se utiliza una sentencia print o otra lógica pero no se devuelve nada.

Para llamarlo:

```java 
imprimirSuma(5, 3);
```

No se puede asignar el resultado a una variable porque no devuelve nada. Solo ejecuta la lógica del método.

> Otros tips:
>
> - void es un tipo de dato en Java que representa la ausencia de un valor.
>
> - Los constructores tampoco tienen retorno porque solo inicializan el objeto.
>
> - El compilador automatically pone void si no se especifica un tipo de retorno.


# Creación de Constructores en Java

## Constructores

- El constructor es un método especial que se invoca automáticamente en la creación de objetos.

- Sirve para inicializar los atributos del objeto.

- Tiene el mismo nombre de la clase y no tiene tipo de retorno.

Ejemplo:

```java
public class Persona {

  String nombre;

  public Persona(String nom) {
    this.nombre = nom;
  }
  
  public Persona() {}
  
  public String getNombre() {
    return this.nombre;
  }

}

public class Main {

  public static void main(String[] args) {
    // Constructor por defecto
    Persona p1 = new Persona();
    
    // Constructor con parametros
    Persona p2 = new Persona("Juan");
    
    System.out.println(p1.getNombre()); // null
    System.out.println(p2.getNombre()); // Juan
  }

}
```

- Puede haber sobrecarga de constructores para admitir diferentes parametros.

- Si no se define un constructor, Java agrega un constructor por defecto sin parámetros.

## Características de los constructores

- Un constructor es un método especial usado para inicializar objetos.

- Tiene el mismo nombre que la clase.

- No tiene tipo de retorno ni void.

- Puede recibir parámetros para inicializar los atributos.

- Se invoca automáticamente al crear un objeto con `new`. 

- Suele ser la primera línea dentro de la clase.

- Puede haber múltiples constructores sobrecargados.

- Si no se define un constructor, Java agrega uno por defecto sin parámetros.

Ejemplo:

```java
public class Persona {

  String nombre;
  
  // Constructor con un parámetro
  public Persona(String nom) {
    this.nombre = nom;
  }

  // Constructor sin parámetros 
  public Persona() {
  }

  // Otros métodos y código..

}
```

- El constructor asigna valores a los atributos como `nombre`, conecta con otros objetos, obtiene recursos, etc.

- Es obligatorio para crear el objeto antes de usarlo.


## Sintaxis

La sintaxis para declarar un constructor es:

```
[modificador_acceso] NombreClase ([lista_de_parámetros]) {
  // cuerpo del constructor
}
```

Donde:

- Modificador de acceso (public, private, protected, default)
- NombreClase es el mismo nombre de la clase.
- Lista de parámetros entre paréntesis (opcional) 
- Llaves con el cuerpo del constructor

Ejemplos:

```java 
public class Persona {

  public Persona() { 
    // Constructor por defecto sin params
  }
  
  public Persona(String nombre) {
    // Constructor con un param 
  }

  private Persona(int id, String nombre) {
    // Constructor privado con dos params 
  }

}
```

- El modificador de acceso define la visibilidad del constructor (generalmente public).

- Los parámetros permiten pasar datos para inicializar los atributos.

- El cuerpo contiene la inicialización de atributos y otra lógica.


# Sobrecarga de Métodos y Constructores

La sobrecarga (overloading) en Java permite declarar métodos o constructores con el mismo nombre pero diferentes firmas.

## Métodos

- Permite tener métodos con el mismo nombre pero diferentes parámetros.

- Java identificará cual usar basado en los tipos y orden de los argumentos. 

Ejemplo:

```java
public class Operaciones {

  public int sumar(int a, int b) {
    return a + b;
  }
  
  public double sumar(double a, double b) {
    return a + b;
  }

}
```

- La sobrecarga es útil para métodos que realizan tareas similares para diferentes tipos de datos.

## Constructores 

- Los constructores también pueden sobrecargarse declarando versiones con diferentes parámetros.

Ejemplo: 

```java
public class Persona {

  public Persona() {}
  
  public Persona(String nombre) {}
  
  public Persona(String nombre, int edad) {}

}
```

- Permite crear objetos de la misma clase de diferentes formas.

- El compilador elige automáticamente el constructor apropiado.

La sobrecarga otorga flexibilidad y reutilización al permitir varias firmas de métodos y constructores.


# Modificadores de Acceso en Java

Los modificadores de acceso controlan la visibilidad y el alcance de clases, atributos, métodos y constructores. Hay 4 niveles:

## Public 

- Permite acceso desde cualquier clase y paquete.

- Es el nivel de acceso más permisivo.

- Se declara con la palabra `public`.

```java
public class ClaseEjemplo {
  public String atributoPub = "hola"; 
  
  public void metodoPublico() {
    //...
  }
}
```

## Protected

- Permite acceso desde clases del mismo paquete y subclases en otros paquetes.

- Proporciona acceso entre clases relacionadas. 

- Se declara con `protected`.

```java
class ClaseEjemplo {
  protected String atributoProt = "adios";
}
```

## Default (package-private)

- Permite acceso solo dentro del mismo paquete.

- No se declara explícitamente, es el nivel por defecto.

```java 
class ClaseEjemplo {
  String atributoDefault = "hola";
}
```

## Private 

- Solo permite acceso dentro de la misma clase.

- Previene acceso desde otras clases.

- Se declara con `private`.

```java
public class ClaseEjemplo {
  private String atributoPriv = "secreto";
} 
```


> NOTA:
> 
> - Public permite acceso sin restricciones.
> 
> - Private limita el acceso a la misma clase.
> 
> - Protected y default proporcionan acceso intermedio.
> - En resumen, los modificadores de acceso controlan la encapsulación y ocultación de información de una clase.

Aquí un resumen completo sobre encapsulamiento y métodos accesores (getters y setters) en Java:

# Encapsulamiento

El encapsulamiento es un principio de la POO que consiste en ocultar los detalles de implementación de una clase y solo exponer una interfaz para interactuar con los objetos. 

## Características

- Los atributos se declaran como privados o protegidos para ocultar los datos.

- Se proveen métodos públicos para acceder (getters) y modificar (setters) los atributos de forma controlada.

- Permite cambiar la implementación interna sin afectar otras clases.

- Previene modificaciones no autorizadas y mantiene la integridad de los objetos.

## Ventajas

- Reduce acoplamiento entre clases.

- Facilita reutilización de código.

- Permite aplicar control de acceso.

- Mejora la seguridad y evita comportamientos inesperados.

## Métodos Accesores

Los getters y setters son métodos especiales que permiten leer y modificar atributos privados desde otras clases.

## Setters

Asignan un nuevo valor al atributo.

Ejemplo:

```java  
public void setEdad(int nuevaEdad) {
  this.edad = nuevaEdad;
}
```

## Getters

Devuelven el valor del atributo.

Ejemplo:

```java
public int getEdad() {
  return this.edad;
}
``` 

En resumen, el encapsulamiento y los métodos accesores son clave en la POO para controlar el acceso a los objetos y proteger su estado.


> Reducir el acoplamiento entre clases significa disminuir la dependencia directa entre dos clases. El encapsulamiento ayuda a reducir el acoplamiento de varias formas:
>
> - Al hacer que los atributos sean privados o protegidos, se evita que otras clases accedan a ellos directamente. Sólo se puede acceder a través de los métodos públicos de la clase.
>
> - Los métodos accesores como getters y setters abstractan los detalles de implementación de una clase. Si se cambia un atributo privado, no afecta a las otras clases que usan los getters y setters.
>
> - Las clases no expuestas directamente sus datos, sino una interfaz. Esto permite cambiar la implementación interna de una clase sin afectar las dependencias con las demás.
>
> - Se reduce la dependencia en nombres de atributos específicos. Las clases dependen solo de la interfaz abstracta, no de los detalles internos.
>
> - Si una clase solo interactúa con otra a través de esta interfaz encapsulada, son más independientes. El cambio en una no debería impactar a la otra.
>
> En resumen, el encapsulamiento permite abstraer los detalles de implementación y reducir el acoplamiento al exponer solo lo necesario a otras clases. Esto facilita el mantenimiento y la independencia entre clases.

# Constantes en Java

Las constantes son valores fijos que no cambian durante la ejecución de un programa. Se utilizan para representar datos que no varían, como números mágicos, mensajes, códigos, etc.

## Declaración

Se declaran con la palabra clave `final`:

```java
final tipo NOMBRE_CONSTANTE = valor;
```

Pueden ser variables o métodos marcados como final. Las convenciones de nombres son en mayúsculas y guiones bajos.

## Tipos 

Pueden ser cualquier tipo de dato primitivo o por referencia:

```java
final int MAX_INTENTOS = 5;

final double PI = 3.1416;  

final String SALUDO = "Hola Mundo";
```

También se pueden usar clases wrapper de tipos primitivos:

```java 
final Integer CODIGO_POSTAL = 1170;
```

## Ámbito

El ámbito de una constante depende de donde se declare:

- Dentro de una clase - visible en toda la clase.
- Dentro de un método - solo visible en el método.
- Como static - visible globalmente en toda la clase.

## Modificación

El valor de una constante no se puede modificar después de asignarse. Esto generaría un error de compilación.

## Ventajas

- Mayor legibilidad del código.
- Reutilización. 
- Reducen acoplamiento al evitar valores mágicos en múltiples lugares.
- Mayor facilidad de mantenimiento.

En resumen, las constantes mejoran la calidad del código y facilitan el manejo de valores fijos y configuraciones.

# Clases Wrapper
Las clases wrapper en Java son clases que envuelven o encapsulan tipos de datos primitivos para poder tratarlos como objetos. 

Las principales diferencias entre un tipo primitivo como int y su clase wrapper Integer son:

- int es un tipo de dato primitivo que almacena directamente el valor entero. 

- Integer es una clase que encapsula el tipo primitivo int en un objeto.

- Las variables int se declaran como:

```
int numero = 5; 
```

- Las variables Integer se declaran como:

```
Integer numero = new Integer(5);
```

- int solo puede almacenar el valor. Integer puede tener métodos y atributos.

- int se pasa por valor, Integer se pasa por referencia.

- Los int no pueden ser null, los Integer si pueden ser null.

- Se debe hacer autoboxing y unboxing para convertir entre int e Integer.

En resumen, las clases wrapper como Integer permiten tratar los tipos primitivos como objetos y darles características de la POO como null y paso por referencia.

# Miembros Estáticos

Los miembros estáticos (static) pertenecen a la clase directamente en lugar de a objetos individuales. También son conocidos como miembros de clase.

## Características

- Se declaran con la palabra clave `static`.
- Hay una sola copia que es compartida por todos los objetos. 
- Se pueden acceder sin necesidad de crear un objeto, mediante el nombre de la clase.
- Se almacenan en memoria de manera global para la clase.
- Se inicializan cuando se carga la clase en memoria.

## Uso Común

- Constantes o configuraciones globales:

```java
public static final double PI = 3.14;
```

- Métodos de utilidad que no requieren un objeto:  

```java 
public static int max(int a, int b){
  return (a > b) ? a : b;
} 
```

- Contadores o acumuladores:

```java
public static int contador;
```

## Ventajas

- No es necesario crear una instancia para utilizar miembros estáticos.
- Ideal para datos compartidos por toda la clase.
- Se puede importar directamente la constante o método.

## Desventajas

- No se pueden referenciar con this o super.
- No es posible tener métodos sobrecargados estáticos.
- Excesivo uso puede dificultar testing y extensibilidad.

En resumen, los miembros estáticos proveen variables y métodos globales para toda la clase.

## Atributos Estáticos

- Variables declaradas con static que pertenecen a la clase.
- Almacenan estado a nivel de clase en lugar de objetos. 
- Ideales para datos consistentes para todos los objetos como contadores.

Ejemplo:

```java
public static int contadorObjetos = 0; 
```

## Métodos Estáticos

- Métodos declarados como static.
- Pueden acceder solo a datos estáticos.
- Sirven para operaciones genéricas sin necesidad de objetos.

Ejemplo: 

```java
public static double promedio(double[] numeros) {
  // calcular promedio  
}
```

- Se accede mediante NombreClase.metodoEstatico().

## Ventajas

- Reutilizables sin crear instancias. 
- Procesamiento genérico de datos.
- Operaciones stateless o con estado compartido.

En resumen, los atributos y métodos estáticos proveen variables y funcionalidad a nivel de clase sin necesidad de objetos.

# Caso de uso para miembros estáticos 

Imagina que tienes una clase `Libro` y quieres llevar el contador de cuántos libros se han creado en total.

Si declaras el contador como estático, podría funcionar así:

```java
public class Libro {

  public static int contadorLibros = 0;

  public Libro(String titulo) {
    // constructor
    contadorLibros++; 
  }

}
```

Y para acceder al contador:

```java 
Libro libro1 = new Libro("El principito"); 
Libro libro2 = new Libro("El alquimista");

System.out.println(Libro.contadorLibros); // Imprime 2
```

Como el contador es estático, es compartido entre todos los objetos Libro. Cada vez que se crea un Libro, incrementa el contador.

Si fuese un contador normal, pertenecería a cada objeto por separado en lugar de ser global a la clase.

> En resumen, los contadores estáticos permiten llevar un recuento global de cuántos objetos se crean o cuentan otras métricas a nivel de toda la clase.
