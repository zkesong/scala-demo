package com.zkesong.cycle

/**
  * Created by Administrator on 2018/5/6.
  */
class Main {

}

//while循环
object Test3 {
  def main(args: Array[String]) : Unit = {
    var a = 15;

    while(a < 20) {
      println( "Value of a: " + a );
      a+=1;
    }
  }
}

//do while循环
object Test2 {
  def main(args: Array[String]) : Unit = {
    var a = 20;

    do {
      println( "Value of a: " + a );
      a+=1;
    }while(a < 20)
  }
}
