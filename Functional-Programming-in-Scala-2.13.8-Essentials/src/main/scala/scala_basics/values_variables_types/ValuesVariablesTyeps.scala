package com.scala2FP.essentials
package scala_basics.values_variables_types

object ValuesVariablesTyeps extends App {

  /**
   * +++ Value types in Scala +++
   *
   * Value type in immutable in Scala, so value types cannot be reassigned
   *
   * Declared using 'val'
   *
   * Value types are similar to constants or 'final' in Java
   *
   * Value types are not really regarded as constants to be used in different parts of the code, but more like
   * intermediate computations to later use in bigger computations
   *
   * Use of value types is inspired from 'Functional Programming' paradigm of coding
   */
  val x: Int = 7

  /**
   * +++ Type Inference in Scala +++
   *
   * It is not necessary to mention the type annotation in Scala
   *
   * Compiler can infer the type of a variable or method from based on the value defined for the variable or the value
   * returned by the method
   *
   * So, it is not mandatory to explicitly mention type annotation in Scala
   *
   * But, if the type annotation is mentioned for a value/variable, the value assigned to that variable should be of the
   * same mentioned type. Else, the compiler will throw exception
   */
  val y = 42
  println(y)

  /**
   * +++ Semi-colon in Scala +++
   *
   * String is created with double quotes in Scala
   *
   * Use of semicolon is not mandatory in Scala
   *
   * Use of semicolon becomes essential only if multiple code statements (expressions in Scala) are written on the same line
   *
   * In Scala, it is recommended to have expressions on a separate line
   */
  val aString: String = "This is a string in Scala"

  /**
   * +++ Types in Scala +++
   *
   * 1. Boolean - a Boolean value can either be true or false. It's size is possibly 1 bit and default value is false
   * 2. Char - a Char value is single character in single quotes. It is unsigned unicode character of size 2 byte,
   *           ranging from 0 to 'scala.math.pow(2, 16).toLong - 1' and default value is '\u000'
   * 3. Byte - a Byte value is a non-decimal number type. It is a signed value of size 1 byte, ranging from
   *           '-1 * scala.math.pow(2, 7)' to 'scala.math.pow(2, 7) - 1' and default value is 0
   * 3. Short - a Short value is a non-decimal number type. It is a signed value of size 2 byte, ranging from
   *            '-1 * scala.math.pow(2, 15)' to 'scala.math.pow(2, 15) - 1' and default value is 0
   * 3. Int - an Int value is a default non-decimal number type in Scala. If we want to declare a non-decimal value as
   *          Long, we need to explicitly subscript it with character 'L', else the compiler with consider it as Int. It
   *          is signed value of size 4 byte, ranging from
   *          '-1 * scala.math.pow(2, 31).toLong' to 'scala.math.pow(2, 31).toLong - 1L' and default value is 0
   * 4. Long - a Long value is non-decimal number type. It is a signed value of size 8 byte, ranging from
   *           '-1 * scala.math.pow(2, 63) - 1L' to 'scala.math.pow(2, 63)' and default value is 0L. A number type is
   *           defined as Long with subscript 'L' in the number
   * 5. Float - a Float value is decimal number type. It is 32 bit IEEE 754 single-precision ranging from
   *            '-1 * scala.math.pow(2, 128) - 1' to 'scala.math.pow(2, 128) - 1' and default value is 0.0F. A decimal
   *            type is defined as Float with subscript 'F' in the number
   * 6. Double - a Double is a default decimal number type in Scala. If we want to declare a decimal value as Float, we
   *             need to explicitly subscript it with character 'F', else the compiler with consider it as double. It is
   *             64 bit IEEE 754 double-precision ranging from
   *             '-1 * scala.math.pow(2, 1024) - 1' to 'scala.math.pow(2, 1024) - 1' and default value is 0.0D.
   *             Though a decimal value is by default considered as double, if not explicitly defined as Float, a double
   *             value can also be declared by subscripting the value explicitly with character 'D'
   */

  val aBoolean: Boolean = true

  val aChar: Char = 'a'

  val aByte: Byte = 120

  val aShort: Short = 4613

  val anInt: Int = x

  val aLong: Long = 99990000L

  val aFloat: Float = 9.8F

  val aDouble: Double = 10D

  /**
   * +++ Min/Max values of data types in Scala +++
   *
   * The max value can be obtained by using MaxValue and min value can be obtained by using MinValue attribute on
   * data types such as Char, Short, Byte, Int, Long, Float, Double, i.e all the data types except Boolean
   */
  println(
    s"""
      |This is max value of Int - ${Int.MaxValue}
      |This is min value of Int - ${Int.MinValue}
      |""".stripMargin)

  /**
   * +++ Variables in Scala +++
   *
   * Variables are mutable in Scala, so variables can be reassigned
   *
   * Declared with keyword 'var'
   *
   * Variables are used to implement side-effects
   */
  var aStringVariable: String = "This is variable"
  aStringVariable = "Oh, the variable value just changed!"

}
