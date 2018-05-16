package com.zkesong.datatype

/**
  * Created by Administrator on 2018/5/5.
  */
object Main {

  //多行字符串
  private val word =
    """曾克松
    www.baidu.com
    pubg.qq.com
    这是多行字符串"""

  def main(args: Array[String]): Unit = {
    println(word)
  }

  def getWord: String ={
    return word
  }

}

class DataType{
  def getWord(): String ={
    return Main.getWord
  }
}
object DataType{
  def main(args: Array[String]): Unit = {
    val dt = new DataType
    println(dt.getWord)
  }
}

/*
  数据类型
  Byte Short Int Long
  Float Double
  Char String
  Boolean
  Unit == void
  Null
  Nothing  所有类型的子类型
  Any  ==  Object 所有类型超类
  AnyRef 所有引用类型的基类
 */
