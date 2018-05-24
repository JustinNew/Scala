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
