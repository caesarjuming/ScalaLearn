package HigherOrderFunction

import java.awt.event
import java.awt.event.{ActionEvent, ActionListener}


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
  def firstFun(): Unit = {

    import scala.math._
    //cei函数，下划线_把cei方法转成函数
    val myceil = ceil _
    println(myceil(5.2))

    //匿名函数
    val dd = (x: Double) => x * 3
    println(dd(5))

    //接收函数参数的函数-- 被接收的函数是入参为double,返回类型为double的
    def revFunc(f: (Double) => Double) = {
      f(0.25)
    }

    revFunc(ceil _)

    // 注意:如果省略等号,那么就不会自动推断返回类型,那么返回类型就为Unit,而不是函数
    def makeFunc(d: Double) = {
      (din: Double) => d * din
    }

    makeFunc(5)(6)

    // equals
    revFunc(_ * 5)
    revFunc(x => x * 5)
    revFunc((x) => x * 5)

    (1 to 9).map("*" * _).foreach(println _)

    (1 to 10).filter(_ % 2 == 0).foreach(println _)

    println((1 to 10).reduceLeft(_ * _).toInt)

    val d = "b,a,d,c".split(",").sortWith(_.compare(_) > 0)

    println(d.toSeq)

    // 闭包
    def closure(d: Double): (Double => Double) = {
      Double => Double * d
    }

    //上面的函数可以柯里化为,就是把两个参数的函数转化为 func()()调用
    def closure2(d: Double)(d1: Double) = {
      d * d1
    }

    // 用途,把单个函数参数拎出来,用于类型推断

    val a = Array("hello", "world")
    val b = Array("welcome", "jack")
    a.corresponds(b)(_.equalsIgnoreCase(_))



    val myClosure = closure(2)
    val value = myClosure(3)
    println(value + ":" + myClosure(8))

    // 隐式转换,把Action转换成ActionListener的实例

    implicit def makeAction(action: (ActionEvent) => Unit) = {
      new ActionListener {
        override def actionPerformed(e: event.ActionEvent): Unit = action(e)
      }
    }

    def runInThread(block: () => Unit) {
      new Thread() {
        override def run() = block()
      }.start()
    }

    runInThread(()=>printf("hello,world"))

    //换名调用简化
    def runInThread2(block: =>Unit)={
      new Thread(){
        override def run()=block
      }
    }

    // 可以不用 ()=>{} 调用了
    runInThread2{printf("")}

    def util(condition: =>Boolean)(block: =>Unit){
      if(!condition){
        block
        util(condition)(block)
      }
    }

    def indexOf(str:String,ch:Char): Int ={
      var i=0
      util(i==str.length){
        // 当这里返回时,会传递给上层函数
        if(i==str(i))return i
        i+=1
      }
      return -1

    }


  }
}

object MyFunction {
  def main(args: Array[String]) {
    val f: MyFunction = new MyFunction
    f.firstFun()
  }
}
