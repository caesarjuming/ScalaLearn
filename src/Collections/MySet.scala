package Collections

/**
  * Created by caesar on 16/4/26.
  */
class MySet {

}

object MySet{
  def main(args: Array[String]) {
    val s=Set(1)+1+2+3+4+5
    println(s)
    // 集是以hash实现的

    //链式hashSet会记住顺序的
    val lset=scala.collection.mutable.LinkedHashSet(1,2,1,3,3,4,5,5,5)
    println(lset)

    // 红黑树
    val sortedSet=scala.collection.immutable.SortedSet(2,1,4,3,5)
    println(sortedSet)

    // bitset 存放非负的最大不是很大的整数
    val bit=Set(1,2,3,4)
    println(bit contains(1))
    println(Set(1,2) subsetOf(bit))

    //集合运算
    val b1=Set(1,2,3,4)
    val b2=Set(3,4,5,6)
    println(b1 | b2)
    println(b1 & b2)
    // b1中独有
    println(b1 &~ b2)
    println(b2 &~ b1)






  }

}
