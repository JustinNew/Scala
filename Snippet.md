### List Map

```scala
val l = List(1,2,3,4)
l.map(x => x * 2)
```
Output: List[Int] = List(2,4,6,8)

### Map Examples

```scala
val states = Map("AL" -> "Alabama", "AK" -> "Alaska")
states.getOrElse("AS", "Not Included")
```

### Concise Functions
This is a function mapping any integer x to x + 1.
```scala
(x: Int) => x + 1
```

### Access the members in tuple.

```scala
val t = (1,2,3,4)

// Access the first element in "t".
t._1
```

### _instance 

```scala
class Product private(var state : Int) {
  def DoSomething() = {
    state += 1
    System.out.println("I did something for the " + this.state + " time")
  }
}

object Product {
  private var _instance : Product = null
  def instance() = {
    if (_instance == null)
      _instance = new Product(0)
    _instance
  }
}
Product.instance.DoSomething()
Product.instance.DoSomething()
```

### "_" use case
 - Initialization to the default value
 - Initialization using an underscore corresponds to assigning the value of the variable to null.

Scala language requires you initialize your instance variable before using it. However, Scala does not provide a default value for your variable. Instead, you have to set up its value manually by using the wildcard underscore, which acts like a default value, as follows

```scala
var i: Int = _  
``` 

### toString 
A method defined in class java.lang.Object. Can be override when define a class to provide more useful information.

```scala
  class Rational(n: Int, d: Int) {
    override def toString = n + "/" + d
  } 
```
  
### Option Example
 - Scala Option[T] is a container for zero or one element of a given type. 
 - An Option[T] can be either Some[T] or None object, which represents a missing value.

In short, if you have a value of type A that may be absent, Scala uses an instance of Option[A] as its container. An Intance of **Option** is either an instance of case class **Some** when it is present or case object **None** when it is not. Since both **Some** and **None** are children of **Option**, your function signature should declare that the returned value is an **Option** of some type, e.g. **Option[A]** in the above example.

```scala
def toInt(in: String): Option[Int] = {
    try {
        Some(Integer.parseInt(in.trim))
    } catch {
        case e: NumberFormatException => None
    }
}
```

If you're a consumer of this toInt function, your code will look something like this:
```scala
toInt(someString) match {
    case Some(i) => println(i)
    case None => println("That didn't work.")
}
```
