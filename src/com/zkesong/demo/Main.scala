package com.zkesong.demo

/**
  * Created by Administrator on 2018/5/4.
  */
object Main {

  def getHello(word : String) : String = {
    return "hello " + word
  }

  def main(args: Array[String]): Unit = {
    println(this.getHello("song"))
    printf("%s-----%d", "kesong", 78)
  }

}
