# Scala

### Install Scala
  - 0 Check Java Installation
    - java -version
  - 1 Download binary scala-2.12.6.tgz from https://www.scala-lang.org/download/
  - 2 tar -xzf scala-2.12.6.tgz
  - 3 Add in ~/.bash_profile
	- export SEARCH_PROJECT_DIR="/Users/tkg8w58/Documents/Programs"
	- export SCALA_HOME="$SEARCH_PROJECT_DIR/scala-2.12.6"
	- export PATH=$PATH:$SCALA_HOME/bin
  - 4 source ~/.bash_profile
  
### Singleton Objects
  - A singleton is a class that can have only one instance, i.e., Object.
  - Most often, you need an object to hold methods and values/variables that shall be available without having to first instantiate an instance of some class.
  - Since you can't instantiate a singleton object, you can't pass parameters to the primary constructor.
  
Note:
  - If a method were a member of some class A, then you would need to make an instance first.
```scala
class A() {
  def twice(i: Int): Int = 2 * i
}

val a = new A()
a.twice(2)
``` 
  - A method in object does not. 
  
```scala
object A {
  def twice(i: Int): Int = 2*i
}

A.twice(2)
``` 

### object A extends B with C

  - You can also use the object itself as some special instance of a class or trait. When you do this, your object needs to extend some trait in order to become an instance of a subclass of it.

  - Consider the following code:

```scala
object A extends B with C {
  ...
}
```

  - This declaration first declares an anonymous (inaccessible) class that extends both B and C, and instantiates a single instance of this class named A.

  - This means A can be passed to functions expecting objects of type B or C, or B with C.


### trait
  - A trait encapsulates method and field definitions, which can then be reused by mixing them into classes.
  - Unlike class inheritance, in which each class must inherit from just one superclass, a class can mix in any number of traits.

### var vs val
  - Object fields can be both mutable and immutable types and can be defined using either var or val.
  - Method parameters are always immutable which are defined by val keyword.
  - Local variables can be both mutable and immutable types and can be defined using either var or val.
  
### final
  - final members cannot be overridden.
  
### lazy val
  - The difference between them is, that a val is executed when it is defined whereas a lazy val is executed when it is accessed the first time.
 
### Unit Return
  - Scala is an expression oriented language, every function returns some result. If no explicit return expression is given, the value (), which is pronounced “unit”, is assumed.
  
### Case Classes
  - Case classes are regular classes which export their constructor parameters and which provide a recursive decomposition mechanism via pattern matching.
  
### Call-By-Value vs Call-By-Name
  - Call-by-value has the advantage that it avoids repeated evaluation of arguments.
  - Call-by-name has the advantage that it avoids evaluation of arguments when the parameter is not used at all by the function.
  - Scala uses call-by-value by default, but it switches to call-by-name evaluation if the parameter type is preceded by =>.
  
### Anonymous Function
  - An anonymous function is an expression that evaluates to a function; the function is defined without giving it a name.
  - Generally, the Scala term (x1: T1, ..., xn: Tn) => E defines a function which maps its parameters x1, ..., xn to the result of the expression E (where E may refer to x1, ..., xn).