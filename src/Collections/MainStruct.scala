package Collections

/**
  * Created by caesar on 16/4/25.
  */
class MainStruct {
  //                Iterable  可迭代的
  //    先后次序的       |
  //      Seq         Set           Map
  //    随机访问的
  //    IndexSeq     SortedSet    SortedMap

}

object MainStruct{

  def main(args: Array[String]) {

    scala.collection.Map
    //继承上面
    scala.collection.immutable.Map
    scala.collection.mutable.Map

    val map1=scala.collection.Map(1->"a")

    // Predef.Map 和 map1 一样

    val set1=scala.collection.Set(1)
    println((set1 + 2).hashCode())
    println(set1.hashCode())

    // 序列

    //                    Seq
    //                     |
    //    IndexedSeq                         List  Stream  Stack  Queue
    //        |
    // Vector   Range

    // vector 是ArrayBuffer的不可变版本,一个带下标的序列,支持随机访问,向量以树的形式实现
    // 访问某个元素在100万只需要4跳




  }



}
