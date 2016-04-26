package Collections

import java.util

/**
  * Created by caesar on 16/4/26.
  */
class MyList {

}

object MyList{

  val dig=List(1,2,3,4,5)

  def main(args: Array[String]) {

    println(dig)
    println(dig.head)
    println(dig.tail)

    // the same as 10::(dig:Nil)
    // 右结合的
    val dig2=10::dig::Nil
    println(dig2)

    def sum(list: List[Int]):Int={if(list.tail==Nil) 0 else list.head+sum(list.tail)}

    def sum1(list:List[Int]):Int=list match {
      case Nil=>0
      case a::b=>a+sum1(b)
    }

    println(List(1,2,3,4).sum)

    // 可变列表是通过element进行赋值,而不是head,tail
    val elist=scala.collection.mutable.LinkedList(1,-2,3,4)
    var cur=elist
    while(cur!=Nil){
      if(cur.elem<0){
        cur.elem = -cur.elem
      }
      cur=cur.next
    }
    println(elist)

    // 如果要把某个节点设置为最后一个节点,用empty,而不是next赋值给nil
    cur.next=scala.collection.mutable.LinkedList.empty



  }


}
