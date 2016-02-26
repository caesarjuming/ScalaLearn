package ObjectOpt

import com.mytrait.Logged

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
         Create by Caesar,2016/1/13
*/
class SingleObject{
  def useSayHello={
    //调用伴生对象的方法，得用  伴生对象.对象的方法
    SingleObject.sayHello

    //调用apply方法
    SingleObject("a@")
  }

}

//一个Object可以扩展一个至多个类和特质
object SingleObject extends Logged with App{

  //空实现
  def log():Unit={}
  def absLog(msg: String): Unit ={}

  private def sayHello={
    println("hello")
  }

  def apply(str:String): Unit ={
    println("apply"+str)
  }


  //每个scala程序都必须从对象的main方法开始,除了自己提供main方法外，也可以实现app特质
  override def main(args: Array[String]) {
    /**
     * Object：某个类的单个实例，构造器在第一次使用时运行，如果没有使用，就不运行
     *         对象本质上拥有类所有的特性，设置可以扩展其他类和特质
     *         注意：但是不能提供构造器参数
     *
     * 伴生对象：和类名一样的Object，类和伴生对象，可以互相访问私有属性
     *
     * apply: Array(10)形式，就是应用的Array的apply方法
     *
     */



  }


}
