package com.yknam

object ObjectOrientation extends App {
  class Animal{
    val age: Int =0
    def eat()=println("I'm eating")
  }

  val anAnimal= new Animal


  //inheritance
  class Dog(val name: String) extends Animal
  val aDog=new Dog("Lassie")

  //constructor arguments are not fields: need to put a val before the consttructor argument


  aDog.name

  val aDeclaredAnimal: Animal = new Dog("Hachi")
  aDeclaredAnimal.eat()

  abstract class WalkingAnimal{
    val hasLegs=true
    def walk():Unit
  }
  //interface=ultimate abstract type
  trait Carnivore{
    def eat(animal:Animal):Unit
  }
  // single-class inheritance, multi-trait "mixing"
  class Crocodile extends Animal with Carnivore{
    override def eat(animal: Animal): Unit = println("I am eating you, animal")

  }
  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog

}
