package com.zkesong.access

/**
  * Created by Administrator on 2018/5/6.
  */
class Main {
  val str = "public" //默认为public修饰

}

//private
class Outer{
  class Inner{
    private val str = "hello"

    private def innerMethod(): Unit ={
      println(str)
    }

    class SecondInner{
      innerMethod()
    }
  }

  //只能访问自己的private成员 注：内部类的private成员不可以访问
  //(new Inner).innerMethod()//Symbol innerMethod is inaccessible from this place

}

//protected
class Super{
  protected def f() {
    println("f")
  }
}

class Sub extends Super{
  super.f()  //子类可以访问
 // (new ClassA).g()
}

class Other{
  // (new Super).f() //非子类不可以访问
 // (new ClassA).g()
}

class ClassA{
  private[this] def g(){}  //除了this可以访问其他都不可以
}