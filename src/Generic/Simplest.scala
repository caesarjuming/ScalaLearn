package Generic

/**
  * Created by caesar on 16/4/16.
  */
class Simplest {

}

object Simplest{

  def getMiddle[T](a:Array[T])=a(a.length/2)



  def main(args: Array[String]) {
    getMiddle(Array("hello","world"))
    // 偏函数
    val f=getMiddle[Int] _
    print(f(Array(1,2,3)))
  }

}

class lowPair[T](val first:T,val second:T){
  // 下界 R 是T的父
  def replaceFirst[R>:T](newFist:R)=new lowPair[R](newFist,second)
}


class Pair[T <:Comparable[T] ](val first:T,val second:T){
  // 上界 ,Int无法满足
  def smaller=if(first.compareTo(second)<0)first else second

  // 要实例化一个范型的Array[T],需要一个Manifest[T]对象,让基本类型的数组能工作的话,这是必须的
  // 如果你调用makePair(4,9)编译器定位到隐式的Manifest[Int]并实际上调用makePair(4,9)(intManifest)
  // 这样一来该 方法调用的就是new Array(2)(intManifest)
  def makePair[T:Manifest](first:T,second:T): Unit ={
    val  r=new Array[T](2);r(0)=first;r(1)=second;r
  }
  // 多重界定
}

// 视图界定 因为Int不满足,没有CompareTo方法,用视图界定就可以转成richInt了
class myPair[T<% Comparable[T]] (val first:T,val second:T){

}

// 上下文界定
class contextPair[T:Ordering](val first:T,val second:T){
  // 要求必须存在为Ordering[T] 的隐式值
  def smaller(implicit ord:Ordering[T])={
    if(ord.compare(first,second)<0)first else second
  }
}






