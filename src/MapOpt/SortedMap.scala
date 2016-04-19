package MapOpt

import java.awt.Font
import java.util

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
         Create by Caesar,2016/1/10
*/
object SortedMap {
  def main(args: Array[String]) {
    /**
     * 排序映射：
     *
     *
     *
     */

    //TODO:排序映射,不是可变的树形结构,树型是有序的
    val sMap=scala.collection.immutable.SortedMap("c"->3,"b"->2,"a"->1)
    println(sMap)

    val months=scala.collection.mutable.LinkedHashMap("a"->1,"b"->2)
    println(months)

    import scala.collection.JavaConversions.mapAsScalaMap
    val scalaMap:scala.collection.mutable.Map[String,Int]=new util.TreeMap[String,Int]()

    import scala.collection.JavaConversions.propertiesAsScalaMap
    val props:scala.collection.mutable.Map[String,String]=System.getProperties

    import scala.collection.JavaConversions.mapAsJavaMap
    import java.awt.font.TextAttribute._
    val attr=Map(FAMILY->"Serif",SIZE->12)
    val font=new Font(attr)

    //TODO:元组，不同类型的集合
    val tu=("a",1,1.1)
    //访问第一个元素,是从1开始而不是0
    println(tu._1)
    println(tu _2)
    //记得加括号
    val (a,b,c)=(1,2,3)
    println(a,b,c)
    //不需要的可以加上_
    val (cc,_,_)=(1,2,3)
    println(cc)

    //按照条件分为几个部分，分别是满足条件的部分和不满足条件的部分
    val (aa,bb)="Hello,World".partition(_.isUpper)
    println(aa,bb)

    //TODO:拉链操作
    val zips=Array("a","b","c").zip(Array(1,2,3))
    println(zips.toMap)


  }


}
