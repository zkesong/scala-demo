
package com.zkesong.ifelse

/**
  * Created by Administrator on 2018/5/6.
  */
class Main {

}

object Test1 {
  def main(args: Array[String]) {
    var x = 10;

    if( x < 20 ){
      println("x < 20");
    }
  }
}

object Test2 {
  def main(args: Array[String]) {
    var x = 30;

    if( x < 20 ){
      println("x 小于 20");
    }else{
      println("x 大于 20");
    }
  }
}

object Test3 {
  def main(args: Array[String]) {
    var x = 30;

    if( x == 10 ){
      println("X 的值为 10");
    }else if( x == 20 ){
      println("X 的值为 20");
    }else if( x == 30 ){
      println("X 的值为 30");
    }else{
      println("无法判断 X 的值");
    }
  }
}

//三目运算
object Test {
  def main(args: Array[String]) {
    var x = 30

    if(x == 30)  println("x==30") else println("x != 30")

    println(if(x == 30) "等于" else "不等于")
  }
}