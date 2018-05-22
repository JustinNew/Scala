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
  
### Using IntelliJ IDEA
  - Setup Java SDK, Scala SDK, gradle
  - import gradle.build 
  
### Scala Application Enter Point
  - To run a Scala program, you must supply the name of a standalone singleton object with a main method that takes one parameter, an Array[String], and has a result type of Unit.
  - Any standalone object with a main method of the proper signature can be used as the entry point into an application.

### Singleton Objects
  - A singleton is a class that can have only one instance, i.e., Object.
  - In particular, a singleton object is initialized the first time some code accesses it.
  - Most often, you need an object to hold methods and values/variables that shall be available without having to first instantiate an instance of some class.
  - Since you can't instantiate a singleton object, you can't pass parameters to the primary constructor.
  - When a singleton object shares the same name with a class, it is called that class's companion object. You must define both the class and its companion object in the same source file.
  - A singleton object that does not share the same name with a companion class is called a standalone object.
  - **You can use standalone objects for many purposes, including collecting related utility methods together or defining an entry point to a Scala application.**
  
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

#### companion object
  - The companion object basically provides a place where one can put "static-like" methods. Furthermore, a companion object, or companion module, has full access to the class members, including private ones.
  - Companion objects are great for encapsulating things like factory methods.
  - A class and its companion object can access each other's private members.
  - Given just a definition of object ChecksumAccumulator, you can't make a variable of type ChecksumAccumulator. Rather, the type named ChecksumAccumulator is defined by the singleton object's companion class.

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
  - If you wish to mix a trait into a class that explicitly extends a superclass, you use extends to indicate the superclass and with to mix in the trait.
  - A trait also defines a type. A trait can be used as a type.
  - Traits can declare fields and maintain state.

```scala
    class Animal
  
    class Frog extends Animal with Philosophical {
      override def toString = "green"
    }
```

  - Declare a trait with extend
```scala
    trait Doubling extends IntQueue {
      abstract override def put(x: Int) = { super.put(2 * x) }
    }
```
  - This declaration means that the trait can only be mixed into a class that also extends IntQueue.
  
#### Linearization
  - When you instantiate a class with new, Scala takes the class, and all of its inherited classes and traits, and puts them in a single, linear order.

### package
  - You can place the contents of an entire file into a package by putting a package clause at the top of the file.
 
```scala
   package com.bobsrockets.navigation
   class Navigator
```

### var vs val
  - Object fields can be both mutable and immutable types and can be defined using either var or val.
  - Method parameters are always immutable which are defined by val keyword.
  - Local variables can be both mutable and immutable types and can be defined using either var or val.
  
### final
  - final members cannot be overridden.
  
### lazy val
  - The difference between them is, that a val is executed when it is defined whereas a lazy val is executed when it is accessed the first time.
 
### private
  - Private fields can only be accessed by methods defined in the same class, all the code that can update the state will be localized to the class.
  - The way you make members public in Scala is by not explicitly specifying any access modifier. Public is Scala's default access level.
  
```scala
  class ChecksumAccumulator {
    private var sum = 0
  }
```

### Unit Return
  - Scala is an expression oriented language, every function returns some result. If no explicit return expression is given, the value (), which is pronounced “unit”, is assumed.
  
### Case Classes
  - Case classes are regular classes which export their constructor parameters and which provide a recursive decomposition mechanism via pattern matching.

### pattern match
  - Whenever you write a pattern match, you need to make sure you have covered all of the possible cases.
  
### self type
  - what is the difference between a self type and extending a trait, that is simple. If you say B extends A, then B is an A. When you use self-types, B requires an A.

### Call-By-Value vs Call-By-Name
  - Call-by-value has the advantage that it avoids repeated evaluation of arguments.
  - Call-by-name has the advantage that it avoids evaluation of arguments when the parameter is not used at all by the function.
  - Scala uses call-by-value by default, but it switches to call-by-name evaluation if the parameter type is preceded by =>.
  
### Anonymous Function
  - An anonymous function is an expression that evaluates to a function; the function is defined without giving it a name.
  - Generally, the Scala term (x1: T1, ..., xn: Tn) => E defines a function which maps its parameters x1, ..., xn to the result of the expression E (where E may refer to x1, ..., xn).
  
### Structural Typing

```scala
class Foo {
  def hello(name: String): String = "Hello there, %s".format(name)
}

object FooMain {

  def main(args: Array[String]) {
    val foo  = Class.forName("Foo").newInstance.asInstanceOf[{ def hello(name: String): String }]
    println(foo.hello("Walter")) // prints "Hello there, Walter"
  }
}
```

### Seq vs List
  - In Java terms, Scala's Seq would be Java's List, and Scala's List would be Java's LinkedList.