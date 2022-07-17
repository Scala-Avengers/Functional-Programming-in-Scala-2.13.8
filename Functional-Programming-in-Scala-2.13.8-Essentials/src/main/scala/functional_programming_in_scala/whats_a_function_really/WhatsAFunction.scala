package com.scala2FP.essentials
package functional_programming_in_scala.whats_a_function_really

//TODO: Add the part of this topic where 'MyPredicate' and 'MyTransformer' is transformed into function types
//      It was left as the topic where these traits were defined was skipped over and yet to be completed
object WhatsAFunction extends App {
  /**
   * a function which takes 2 string and concatenates them
   * Function2[A, B, R] ===
   */
  def stringConcatenate: (String, String) => String = new Function2[String, String, String] {
    override def apply(obj1: String, obj2: String): String = s"$obj1$obj2"
  }

  // concise and better syntax for writing the above expression
  def stringConcatenate1: (String, String) => String =
    (obj1: String, obj2:String) => s"$obj1$obj2"

  println(stringConcatenate("Hello", " World"))
  println(stringConcatenate1("Hello", " Scala"))

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * A function that accepts an integer and return a function that accepts an integer and returns the sum of integers
   * to the first function and the second function
   *
   * The function implementation in this case is called as 'Function Currying'. A curried function can be called with
   * multiple parameter list
   *
   * Here, function is returned as value
   */
  // below is the verbose way (like the form of inner classes) to override the apply method and define the logic
  val superAdder: Int => Int => Int = new Function1[Int, Function1[Int, Int]] {
    override def apply(arg1: Int): Int => Int = new Function1[Int, Int] {
      override def apply(arg2: Int): Int = arg1 + arg2
    }
  }

  // below is the concise way of writing the above logic using anonymous functions to finally return the sum of the
  // integer parameters
  val superAdder1: Int => Int => Int =
    (arg1: Int) => (arg2: Int) => arg1 + arg2

  println(s"Result of superAdder: ${superAdder(3)(4)}")

  println(s"Result of superAdder1: ${superAdder1(4)(5)}")

}
