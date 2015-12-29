package com.higherOrderFunction

import java.awt.event
import java.awt.event.ActionListener

import scala.swing.event.ActionEvent

/**
 * Created by Administrator on 2015/12/28.
 */
object firstFun {

  def main(args: Array[String]) {
    //作为值得函数
    import scala.math._
    val num=3.14
    val fun=ceil _
    println(fun(num))
    // _ 把方法转成函数，因为无法直接操作方法，只能操纵函数

    val ar=Array(3.14, 7, -5.2).map(fun)
    println(ar.toList)

    val triple = (x: Double)=>3 * x
    println(triple(5))
    println(Array(1.2,0.5,7.5).map((x:Double)=>x*10).toList)

    //map也可以用{}
    println(Array(1.2,0.5,7.5).map{(x:Double)=>x*10}.toList)

    //带函数参数的函数,入参的类型为传入参数类型为Double，返回类型为Double的函数
    def valueAtOneQuarter(f:(Double)=>Double)=f(0.25)
    println(valueAtOneQuarter(ceil _))
    println(valueAtOneQuarter(sqrt _))

    //产生函数的函数
    def mulBy(x:Double)=(y:Double)=>x*3+y
    print(mulBy(5)(1))

    //参数类型推断,自动推断出是Double
    valueAtOneQuarter((x:Double)=>x*3)
    //由于valueAtOneQuarter知道你要传一个double :double类型的函数，所以不必传递类型
    valueAtOneQuarter((x)=>x*3)
    //只有一个参数可以省略()
    valueAtOneQuarter(x=>x*3)
    //如果参数在右侧只出现一次，那么可以省略=>
    valueAtOneQuarter(_*3)


    //一些有用的高阶函数
    print((1 to 9).map(0.1 * _))
    (1 to 9).map("*" *_).foreach(println _)

    println((1 to 9).filter(_%2==0))

    println((1 to 9).reduceLeft(_+_))

    println((1 to 9).reduceRight(_+_))

    //闭包，在执行函数后还保留5
    def mulBy2(factor:Double)=(x:Double)=>factor*x
    val m=mulBy2(5.0)
    println(m(3))
    println(m(1))


    //SAM转换,告诉某个函数做某件事，传递函数参数给他
    implicit def makeAction(action:(ActionEvent)=>Unit)=
    new ActionListener {
      override def actionPerformed(e: event.ActionEvent): Unit = println(111)
    }

    //柯里化, 将原来接收两个参数的函数，变成接收一个参数的函数，生成一个接收一个参数的函数
    def mulTwo(x:Int,y:Int)=x*y

    def mulTwoKLH(x:Int)=(y:Int)=>x*y

    val a1 =Array("hello","world")
    val a2 =Array("hello","world")
    a1.corresponds(a2)(_.equalsIgnoreCase(_))

    //抽象控制scala中可以将语句归结为不带参数和返回值的函数

    def runInThread(block:()=>Unit)={
      new Thread{
        override def run(){block()}
      }
    }

    runInThread(()=>{Thread.sleep(10000);println("hello,Thread")})


    def runInThreadSimple(block: =>Unit)={
      new Thread{
        override def run(){block}
      }
    }
    //这样可以省略=>
    runInThreadSimple{Thread.sleep(10000);println("hello,Thread")}


    def util(condition: =>Boolean)(block: =>Unit){
      if(!condition){
          block
          util(condition)(block)
      }
    }

    var x = 10
    util(x>0){
      x-=1
      println(x)
    }


    //return 表达式，函数的返回值就是函数体的值，所以不需要显示用return
    //但是可以从一个匿名函数中返值给包含这个匿名函数的带名函数

    def indexOf(str:String,c:Char):Int={
        var i=0
        util(i==str.length){
          if(str(i)==c)
            return i
          i+=1
        }

        return -1
    }
    /* 这块是匿名函数
    {
    if(str(i)==c)
      return i
    i+=1
    }*/

  }
}
