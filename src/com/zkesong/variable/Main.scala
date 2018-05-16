package com.zkesong.variable

/**
  * Created by Administrator on 2018/5/6.
  */
object Main {

  def main(args: Array[String]): Unit = {
    //常量
    val str1 = "abcd"
    //变量
    var str2 = "abcd"

    println(str1 == str2)
    println(str1.eq(str2))
    println(str1.equals(str2))

    //str1 = "efgh" //reassignment to val
    str2 = "efgh"

    //申明多个变量常量
    var a, b = 10
    val c, d = 12

    var pa = (1, "qwer")
    println(pa)
  }

}
