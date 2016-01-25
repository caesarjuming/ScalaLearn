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
         Create by Caesar,2016/1/23
*/

/**
 * 不同包可以包含多个空间
 * scala包总是被引用
 * scala中包名是相对的，可以用根目录来区别包中的相对路径
 */

package a{
  package aa{

  }
}

package b{
  package bb{
    class tem1{
    }
  }

  //多重包，也可以不带大括号，和Java一样直接一个package
  package bb2.bbb2.bbbb2{
  class MyPackage {
    //import引入包,_和Java的*类似，在任何地方都可以用import
    import scala.collection.mutable.ArrayBuffer._

    //引用同一个包的class
    val a=new bb.tem1

    //根路径
    val sub=new _root_.scala.collection.mutable.ArrayBuffer

    //包修饰符，只在自己包的作用域有效
    private[MyPackage] val aa="hello"
    //向外扩展了一些范围
    private[bb2] val aaa="helloo"

    //单个引入,=>给引入的类重命名,class=>_是隐藏某个类，而不是重命名
    import scala.collection.immutable.{BitSet,TreeMap=>MyTreeMap,TreeSet=>_}

    //隐式引入
    import java.lang._
    import scala._
    import Predef._



    }
  }

}


