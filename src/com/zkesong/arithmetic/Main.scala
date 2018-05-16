package com.zkesong.arithmetic

/**
  * Created by Administrator on 2018/5/6.
  */
object Test {
  def main(args: Array[String]) {
    var a = 10;
    var b = 20;
    var c = 25;
    var d = 25;
    println("a + b = " + (a + b) );
    println("a - b = " + (a - b) );
    println("a * b = " + (a * b) );
    println("b / a = " + (b / a) );
    println("b % a = " + (b % a) );
    println("c % a = " + (c % a) );

  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var a = false
    var b = true
    println(a == b)
    println(a || b)
    println(a && b)
    println(!a)

    var c = 1
    if(a != b || (c+=1) == c){
      println("hello")
    }
    println(c) //2  &&运算符具有短路功能 左边运算为false时不进行右边的运算

  }

}

object Test2 {
  def main(args: Array[String]) {
    var a = 60;           /* 60 = 0011 1100 */
    var b = 13;           /* 13 = 0000 1101 */
    var c = 0;

    c = a & b;            /* 12 =0000 0000 0000 1100 */
    println("a & b = " + c );

    c = a | b;            /* 61 =0000 0000 0011 1101 */
    println("a | b = " + c );

    c = a ^ b;            /* 49 = 0000 0000 0011 0001 */
    println("a ^ b = " + c );

    c = ~a;               /* ~a = 1111 1111 1100 0011最高位为1负数 取反+1（最高位不变）1000 0000 0011 1101 = -61*/
    println("~a = " + c );

    c = a << 2;           /* 240 =0000 0000 1111 0000 */
    println("a << 2 = " + c );

    c = a >> 2;           /* 15 =0000 0000 0000 1111 */
    println("a >> 2  = " + c );

    c = a >>> 2;          /* 15 =0000 0000 0000 1111 */
    println("a >>> 2 = " + c );
  }
}
