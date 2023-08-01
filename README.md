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
Persona persona1 = new Persona("Vicoria", 22);

// Accediendo a sus atributos y métodos
System.out.println(persona1.getNombre()); // Imprime "Victoria" 
System.out.println(persona1.getEdad()); // Imprime 22
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

## Ejemplo completo

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

Otros tips:

- void es un tipo de dato en Java que representa la ausencia de un valor.

- Los constructores tampoco tienen retorno porque solo inicializan el objeto.

- El compilador automáticamente pone void si no se especifica un tipo de retorno.
