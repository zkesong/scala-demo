package com.zkesong.string

/**
  * Created by Administrator on 2018/5/7.
  */
class Main {

}

object Test{
  def main(args: Array[String]): Unit = {
    testString
    testStringBuilder
  }

  def testString{
    var str = "hello scala"

    println(str.length)
    println(str(0))
    println(str.apply(0))
    println(str.charAt(0))
    println(str.toUpperCase)
    println(str.contains("sc"))

  }

  def testStringBuilder: Unit ={
    val buf = new StringBuilder;
    buf += 'a'
    buf ++= "bcdef"
    println("buf is : " + buf.toString);
  }
}
