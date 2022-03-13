package com.scala2FP.essentials

import org.scalatest.funsuite.AnyFunSuite

class HelloTest extends AnyFunSuite {
  test ("message equals 'Hello World'") {
    val message: String = "Hello World"
    assert(message == "Hello World")
  }
}
