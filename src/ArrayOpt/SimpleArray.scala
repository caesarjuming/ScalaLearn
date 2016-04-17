package ArrayOpt

import scala.collection.mutable.ArrayBuffer

/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         佛祖保佑       永无BUG
         Create by Caesar,2016/1/9
*/
object SimpleArray {
  def main(args: Array[String]) {
    /**
      *
      * Array: var num =new Array[Int](10)
      * ArrayBuffer:数组缓冲
      *
      *
      *
      *
      */

    //包含10个Int的数组
    var num = new Array[Int](10)
    var str=new Array[String](5)
    for (x <- num) {
      // 默认都是0
      print(x)
    }
    for(y<-str){
      // 默认为null
      print(y)
    }

    println()

    //可以自动推断类型
    var s = Array("aaa", 22,1.0,null)
    //底层是Java数组实现的
    println(s(1), s(0),s(2),s(3))
    println(s(1).isInstanceOf[String])
    s(1)="java"
    println(s(1))


    //TODO:ArrayBuffer,变长数组

    var b = new ArrayBuffer[Int](10)
    println(b)

    // 不同之处,一个有new一个没有new,如果有初始值的话用不带new的方法
    var b1= ArrayBuffer[String]("bbb")
    var b3=new ArrayBuffer[String](10)
    println(b1)
    b1+="aaa"
    println(b1)

    b += 1
    b += 2
    println(b)
    //加一个数组
    b ++= Array(7, 8)
    println(b)
    //删除后两个 可以省略. 用空格代替
    b trimEnd (2)
    println(b)

    //插入操作，尽管不是很高效
    b.insert(0, 88)
    println(b)
    //从0个，开始移除2个元素
    b.remove(0, 2)
    println(b)

    //转成Array
    b.toArray

    //数组转为
    var m=Array[Int]()
    var m2=Array[String]()
    var buf=m.toBuffer
    buf+=3

    println(buf.toArray.foreach(x=>println(x)))

  }

}
