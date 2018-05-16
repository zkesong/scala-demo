package com.zkesong.oop

/**
  * Created by Administrator on 2018/5/8.
  * Point Location
  */
class Point(xc : Int=0, yc : Int=0) {
  protected var x : Int = xc
  protected var y : Int = yc
  @deprecated("new", "2018")
  def move(dx : Int, dy : Int){this.x += dx;this.y += dy}
  override def toString= "Point(x:" + x + ", y:" + y + ")"
}
class Location(xc: Int=0, yc: Int=0, zc :Int) extends Point(xc, yc){
  var z: Int = zc
  def move(dx: Int, dy: Int, dz: Int) {x += dx;y += dy;z += dz}
  override def toString= "Location(x:" + x + ", y:" + y + ", z:" + z + ")"
}
/*
  Person Employee
 */
class Person {
  var name = ""
  override def toString = "Person[name=" + name
}
class Employee extends Person {
  var salary = 0.0
  override def toString = super.toString + ",salary=" + salary + "]"
}

object Test extends App{
    var point = new Point
    println(point)
    point.move(44, 53)
    println(point.getClass.getDeclaredMethod("move", classOf[Int], classOf[Int]).getAnnotation(classOf[deprecated]))
    println(point)
    point.move(-5, 3)
    println(point)
    var location = new Location(zc=3)
    println(location)
    location.move(1, 2, 3)
    println(location)
}


object Test2 extends App{
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred)
}