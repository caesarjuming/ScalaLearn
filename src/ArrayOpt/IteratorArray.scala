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
object IteratorArray {
  /**
   * 遍历数组：
   * for:
   * 常用算法：
   *
   *
   */
  def main(args: Array[String]) {
    //TODO:遍历数组
    var r=Array(1,2,3)
    // the same as 0 util r.length 范围是0-r.length-1
    for (x <- 1 to r.length-1){
      println(r(x))
    }

    for(i<-Array("hello","world")){
      println(i)
    }
    //区间,包含,他们是richInt的方法
    println(1 to 10)
    //不包含10
    println(1 until (10,2))
    //反转
    println(1.to(10).reverse)

    //转换,生成新数组
    // 如果从数组出发,转换后的也是数组,如果是数组缓冲,转换后也是数组缓冲
    val newArr=for (i<-"abc")yield i*2
    println(newArr)

    //守卫，增加判断条件
    val guardArr=for(j<-"abcd" if j.compareTo('a')>0)yield {val x=j+"aa";x}
    println(guardArr)

    //常用算法：
    println(Array(1,2,3).sum)
    println(Array(7,8,9).max)

    // 可以对数组排序,不能对数组缓冲排序
    val ar=ArrayBuffer(1,2,3,4,5,6)
    ar.sorted

    scala.util.Sorting.quickSort(Array(2,3,4))
    println(Array(1,2,3).mkString("<","#","?"))


    var f=Array(1,2,3)
    var ff=f.filter(x=>x>1).map(x=>x+10)
    ff.foreach(x=>println(x))


  }
}
