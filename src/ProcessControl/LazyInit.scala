package ProcessControl

import java.io.IOException
import java.lang.reflect.MalformedParameterizedTypeException

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
         Create by Caesar,2016/1/7
*/
object LazyInit {
  def main(args: Array[String]) {
    /**
     *
     * lazy:延迟初始化
     * 异常：scala没有受检异常
     *
     *
     */


    //TODO：lazy。 在执行到此时时，才进行初始化
    lazy val lazyval=scala.io.Source.fromFile("abc").mkString

    //TODO:Exception,抛出对象必须是Throwable子类
    //throw new IllegalArgumentException("")

    //throw表达式的类型是Nothing,第一部分返回类型是double，else的返回类型是Nothing
    def abc(x:Double)= {
      if (x >= 0) {
        math.sqrt(x)
      } else throw new IllegalArgumentException()
    }

    try{
      println("")
    }catch {
      case _:MalformedParameterizedTypeException=>println("1")
      case ex:IOException=>println(ex.printStackTrace()+"2")
    }


  }

}
