package com.zkesong.function

/**
  * Created by Administrator on 2018/5/6.
  */
class Main {

}
object Test1{
  def main(args: Array[String]): Unit = {
    printStrings("Runoob", "Scala", "Python")

    println(integerAdd(34, 23))

    println(integerAdd2(34, 5))

    println(integerAdd2(34))

    printWord

    printTime(time)

    printTime2(time2(1))

    println(apply(layout, 22))

    println(stringcat("hello")("bob"))

    println(stringConcat("hello")("kity"))

    println(closureMethod(3)(4))

    println(closure(3)(4))
  }

  //有返回值函数
  private def integerAdd(var1 : Int, var2 : Int) : Int = {
    var var3 : Int = var1 + var2
    return var3
  }

  //有默认参数的函数
  private def integerAdd2(var1 : Int, var2 : Int  = 4) : Int = {
    var var3 : Int = var1 + var2
    return var3
  }

  //无参数无返回值函数
  private def printWord: Unit ={
    println("无参数无返回值函数")
  }

  //可变参数函数
  private def printStrings(strs : String*): Unit ={
    for(i <- 1 to strs.length){
      println("param " + i + " : " + strs(i-1))
    }
  }

  //函数作为参数传递 匿名函数
  private val time = ()=>{println("time method");System.nanoTime}
  private def printTime(time : ()=>Long): Unit ={
    println("printTime method")
    println("time1 " + time())
    println("time2 " + time())
  }

  //函数作为参数 高阶函数
  def apply(f: Int => String, v: Int) = f(v)

  def layout[T](x: T) = "[" + x.getClass.getName + "" + x.toString() + "]"

  //函数传名调用
  private def time2(var1 :Int) ={println("time2 method"); var1 * System.nanoTime}
  private def printTime2(time : => Long): Unit ={
    println("printTime2 method")
    println("time1 " + time)
    println("time2 " + time)
  }

  //函数柯里化
  def stringcat(str1 : String) = (str2 : String) => str1 + str2

  def stringConcat(str1 : String)(str2 : String): String ={
    str1 + " , " + str2
  }

  //闭包函数 closure  即函数定义和函数表达式位于另一个函数的函数体内 可以进行函数柯里化
  def closureMethod(factor : Int) : Int => Int ={
    val multiplier = (i:Int) => i * factor
    return multiplier
  }

  def closure(factor : Int) = (i : Int) => i * factor
}