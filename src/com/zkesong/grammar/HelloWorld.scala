//定义包名方式一:一个文件一个包
package com.zkesong.grammar
/*
  定义包名方式二: 一个文件可以定义多个包
  package com.zkesong.package1{

    class TestPackage{

    }
  }
  package com.zkesong.package2{

    class TestPackage{

    }
  }
*/

/**
  * Created by Administrator on 2018/5/5.
  * 多行注释
  */
object HelloWorld {

  //单行注释  主方法执行程序入口
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    printSingleLine()
    printMultiLine()
  }

  //单行多句需要分号分割
  def printSingleLine(): Unit = {
    val constant = "learn scala";println(constant)
  }

  //多行不需要分号
  def printMultiLine(): Unit ={
    val constant = "learn scala"
    println(constant)
  }
}

import java.awt.{Color,Font} //多个包
import java.awt._ //所有包
import java.util.{HashMap => JavaHashMap} //重命名包

object TestImport {
  def handle(): Unit ={
    val carColor = Color.BLACK;
    //类型申明可以省略>:JavaHashMap[String, Color]
    val colorContext = new JavaHashMap[String, Color](16)
    colorContext.put("car", carColor)
    println(colorContext)
  }

  def main(args: Array[String]): Unit = {
    handle()
  }
}