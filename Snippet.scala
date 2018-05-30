// List Map
val l = List(1,2,3,4)
l.map(x => x * 2)
// Output: List[Int] = List(2,4,6,8)

// Map Examples
val states = Map("AL" -> "Alabama", "AK" -> "Alaska")
states.getOrElse("AS", "Not Included")

// Concise Functions
// This is a function mapping any integer x to x + 1.
(x: Int) => x + 1

// Access the members in tuple.
val t = (1,2,3,4)
// Access the first element in "t".
t._1

// _instance 
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

// "_" use case
// Initialization to the default value
// Initialization using an underscore corresponds to assigning the value of the variable to null.
/* Scala language requires you initialize your instance variable before using it. 
 * However, Scala does not provide a default value for your variable. 
 * Instead, you have to set up its value manually by using the wildcard underscore,
 */ which acts like a default value, as follows
var i: Int = _   

// toString, a method defined in class java.lang.Object.
// Can be override when define a class to provide more useful information.
  class Rational(n: Int, d: Int) {
    override def toString = n + "/" + d
  } 
