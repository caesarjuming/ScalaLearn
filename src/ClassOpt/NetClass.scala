package ClassOpt

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
object NetClass {

  /**
   * 嵌套类：
   *
   *
   *
   */
  class B{
    class BB{

    }

  }
  class C{
    class BB{

    }
  }
  val value=100
  class D{
    //引用外class的属性
    outer=>class DD{
      println(outer.v)
    }
    private val v=100
  }


  def main(args: Array[String]) {
    //是两个不同的类
    val b=new B
    val b2=new B

    //投影
    //val b3=new B#BB

  }




}
