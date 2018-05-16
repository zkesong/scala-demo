package com.zkesong.cycle

/**
  * Created by Administrator on 2018/5/6.
  */
class For {

}

object Test1{
  def main(args: Array[String]): Unit = {
    //普通for循环
    for(i <- 1 to 10){
      println(i)
    }

    //多区间for循环
    for(i <- 1 to 3;j <- 1 to 3){
      println(i + "与" + j + "组合")
    }
    println()
    //上面等同于嵌套循环
    for(i <- 1 to 3){
      for(j <- 1 to 3) {
        println(i + "与" + j + "组合")
      }
    }

    println()
    //集合for循环
    var nums = List(1, 2, 3, 4, 5, 6)
    for(a <- nums){
      println(a)
    }

    println()
    //过滤for循环
    for(a <- nums if a <= 3; if a != 2){ //需要满足条件 a<=3&&a!=2
      println(a)
    }

    println()
    //for循环与yield结合 返回List类型
    println(for{a <- nums if a <= 5; if a !=2}yield a)
  }
}