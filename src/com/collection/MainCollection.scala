package com.collection

import java.awt.Color

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Administrator on 2015/12/30.
 */
object MainCollection {
  def main(args: Array[String]) {
  /*

                     trait

                   Iterator

                  /    |     \
                 /     |      \
                /      |       \
              Seq     Set      Map
               |       |        |
          IndexedSQ SortedSet SortedMap

  */


  // seq 是一个有先后顺序的，IndexSeq允许通过下标访问,ArrayBuffer带下标，但链表不是
  // 集合都可以用Iterator迭代进行访问
  // IndexSeq是数组的父类，而不是链表的

  //每个Scala集合特质或类，都有一个带Apply方法的伴生对象，可以用来构建集合中的实例

    Iterable(0x11,0x222,0x333)
    Set(Color.red,Color.green)


    //Scala同时支持可变和不可变集合,Scala优先采用不可变集合scala.collection产生的是不可变对象
    scala.collection.Map(1->2)
    scala.collection.immutable.Map('a'->2)


    //整个数字中出现的阿拉伯数字
    def digits(n:Int):Set[Int]={
      if(n<0){
        digits(-n)
      }else if (n<10){
        Set(n)
      }else{
        digits(n/10)+(n%10)
      }
    }

    /*
    重要的不可变序列
                    Seq
                       |
          ------------------------------------------
          |                    |      |     |      |
      IndexedSeq             List  Stream Stack  Queue
          |
       ----------
     Vetor    Range

     Vetor是ArrayBuffer的不可变版本，一个带下标的序列，支持快速的随机访问
     Range不是储存的所有值，是起始值，终值，增值

     */

    // 列表，要么是nil，要么是head+tail，然而tail又是一个列表
    // ::操作符可以从给定的头尾创建一个列表
    val l1=9::List(8,7)
    println(l1)

    // :: 操作符是从后面结合的
    val l2=9::6::5::Nil
    println(l2)

    def sum(list:List[Int]):Int={
      if(list==Nil) 0 else list.head+sum(list.tail)
    }

    // :: 是解析，解析为head和tail
    def sum2(list:List[Int]):Int=list match {
      case Nil=>0
      case h::t=>h+sum2(t)
    }

    // 可变列表
    var lst = scala.collection.mutable.LinkedList(1,-2,3,5)
    var cur=lst
    while(cur!=Nil){
      if(cur.elem<0)cur.elem=0
      cur=cur.next
    }
    println(lst)

    var curr= lst
    while(curr!=Nil&&curr.next!=Nil){
      curr.next=curr.next.next
    }
    println(curr)


    //集,操作返回的是一个新的Set，集是哈希实现的，所以顺序无关
    var s= Set(1,2,3)+3
    println(s)
    s=s+5
    println(s)

    //有顺序的
    var linkset=scala.collection.mutable.LinkedHashSet(1)
    linkset=linkset+2+3
    println(linkset)

    var sortset=scala.collection.mutable.SortedSet(2,3,6,7,4,5)
    println(sortset)

    //如果要用可变的排序树，可以用java.util.TreeSet

    //位集，存放非负整数
    var dig=Set(1,7,2,9)
    println(dig contains 1)
    println(Set(1,2) subsetOf dig)

    val un=Set(1,2,3) union  Set(3,4,5)
    val un2=Set(1,2,3) |  Set(3,4,5)
    val un3 = Set(1,2,3) ++ Set(3,4,5)
    println(un)
    val inter=Set(1,2,3) intersect Set(3,4,5)
    val inter2=Set(1,2,3) & Set(3,4,5)

    println(inter)
    val diff=Set(1,2,3) diff Set(3,4,5)
    val diff2=Set(1,2,3) &~ Set(3,4,5)
    val diff3=Set(1,2,3) -- Set(3,4,5)
    println(diff)

    //一般而言，+用于添加到无序的集合中,:+,+:是添加到有先后次序的集合开头或末尾,这些操作都是返回新的集合
    println(Vector(1,2):+3)
    println(3+:Vector(1,2))
    // +=可以改变左边的集合
    println(ArrayBuffer(1,2)+=3)

    //函数映射到集合
    var names=List("caesar","jack","bill")
    names=names.map(_.toUpperCase())
    println(names)

    val low=for(n<-names) yield n.toLowerCase

    println(low)

    def ulcase(s:String)=Vector(s.toUpperCase(),s.toLowerCase)

    println(names.map(ulcase))

    //collect 用于偏函数，没有对所以可能值进行定义的函数
    val col="-1+2".collect{case '-'=>"负" case '+' =>"正"}
    println(col)

    names.foreach(println)

    //化简，折叠，扫描

    val sumlistleft=List(1,2,6,7).reduceLeft(_+_)
    println(sumlistleft)
    val sumlistright=List(1,2,6,7).reduceRight(_+_)
    println(sumlistright)

    //传入一个初始元素进行运算
    val foldSum=List(1,2,6,7).foldLeft(-20)(_+_)
    println(foldSum)
    //也可以用:/操作符来进行运算
    (-20/:List(1,2,6,7))(_+_)

    //拉链操作
    val zipList=List(1,2,3) zip List('a','b','c')
    println(zipList)

    println((zipList)map(p=>p._1+"?"+p._2))
    println("Caesar".zipWithIndex)
    println("Caesar".zipWithIndex.max)

    //流 是一个尾部懒计算的不可变列表，当你需要时才会加载
    def numsForm(n:BigInt):Stream[BigInt]=n #:: numsForm(n+1)
    // #::构建一个流
    val tenOrMore= numsForm(10)
    //得到的是 Stream(10,?)，其尾部是未被求值得
    tenOrMore.tail.tail.tail
    //返回的是 Stream(13,?)

    //如果想要多个答案可以用take
    val squares= numsForm(1).map(x=>x*x)
    squares.take(5).force


    //懒视图,用view方法可以产出视图,视图不存在缓存，如果多次调用，计算多次
    val powers=(0 until  1000).view.map(Math.pow(10,_))
    println(powers(100))

    //Sync前缀的一些线程安全的数据结构






  }













}
