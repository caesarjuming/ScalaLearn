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
object CommonType {
  def main(args: Array[String]) {
    /**
     * 常用类型：Byte,Int,Double,String,Long,Float,Char,Short,Scala并不刻意区分引用类和基本类型
     *
     */

    //TODO:数字调用方法:基本类型和包装类型编译器自动转化
    1.toString()
    var ten = 1.to(10)
    println(ten)

    //TODO:字符串类型自动转化高级类型,String转化为StringOps，同样还提供RichInt，RichChar等
    val c = "Hello".intersect("Bellow")
    println(c)



  }

}
