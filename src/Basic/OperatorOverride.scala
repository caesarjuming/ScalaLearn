package Basic

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
         Create by Caesar,2016/1/6
*/
object OperatorOverride {
  def main(args: Array[String]) {
    /**
     * 运算符重载：
     * 调用函数和方法：
     * Apply方法：
     *
     *
     *
     */

    //TODO:运算符重载,+运算其实是调用1的+方法
    1 + 2
    1.+(2)
    //也可以简写
    1.to(2)
    1 to 2
    //递增用+=，Scala中没有++，--
    var a =2
    a+=3

    //TODO:导入mathbao，_和Java中的*一样
    import scala.math._
    sqrt(2)
    //不带参数方法可以省略()
    "hello".distinct

    //TODO:Scala没有静态方法，相对每个类可以有伴生对象，单例的对象，可以直接调用

    //TODO:Apply方法,()操作符重载，其实是调用伴生对象的Apply方法
    "hello"(4)
    "hello".apply(4)

  }
}