package HigherOrderFunction

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
         Create by Caesar,2016/1/25
*/
class MyFunction {
  def firstFun(): Unit ={

    import scala.math._
    //cei函数，下划线_把cei方法转成函数
    var myceil =ceil _
    println(myceil(5.2))

    //匿名函数
    val dd=(x:Double)=>x*3
    println(dd(5))


  }
}
object MyFunction{
  def main(args: Array[String]) {
    val f :MyFunction = new MyFunction
    f.firstFun()
  }
}
