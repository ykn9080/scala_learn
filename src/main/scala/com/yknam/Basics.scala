package com.yknam

object Basics extends App {
  // defineing a value
  val meaningOfLife: Int = 42 // const int meaningOfLife = 42;

  //Int,Boolean,Char,Double,Float, String
  val aboolean=false //type is optional

  val sString="I love Scala"
  val aComposedString="I"+" "+"love"+" "+"Scala"
  val anInterpolatedString= s"The meaning of life is $meaningOfLife"

  //expressions = structures that can be reduced to a value
  val anExpression=2+3

  // if-expression
  val ifExpression = if (meaningOfLife >43)56 else 999 // in other languages: meaningOfLife >43 ? 56 : 999
  val chainedIfExpression = {
    if (meaningOfLife>43) 56
    else if (meaningOfLife<0) -2
    else 0
  }

  //code blocks
  val aCodeBlock ={
    //definitions
    val aLocalValue = 67

    // value of block is the value of the last expression
    aLocalValue+3
  }

  // define a function
  def myFunction(x: Int, y:String): String ={
    y+" "+x
  }

  //recursive functions
  def factorial(n: Int):Int =
    if(n<=1) 1
    else n* factorial(n-1)
  /*
      factorial(5)=5*factorial(4)=4*24=120
      factorial(4)=5*factorial(3)=4*6
      factorial(3)=5*factorial(2)=3*2
      factorial(2)=5*factorial(1)=2*1
      factorial(1)=1
   */
  // In Scala don't use loops or iteration, use RECURSION!!

  //void function
  // type of SIDE EFFECTS
  println("I love")

  def myUnitReturningFuction(): Unit ={
    println("I dont returning Unit")
  }
}

