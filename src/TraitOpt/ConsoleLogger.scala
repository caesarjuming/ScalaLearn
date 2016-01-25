package TraitOpt

import java.util.logging.Logger

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
         Create by Caesar,2016/1/17
*/
//实现特质用extends而不是implements，多个特质用with分割
class ConsoleLogger extends MyLog with Serializable{
  //重写抽象方法不需要override
  def log(msg:String)={
    println(msg)
  }
  //使用特质中实现的方法
  def useLog(): Unit ={
    impLog("使用implog")
  }
}
object ConsoleLogger{
  def main(args: Array[String]) {
    //使用其他的特殊特质方法
    val cl:ConsoleLogger=new ConsoleLogger with MySpecialLog
    //调用的是MySpecialLog中的特质
    cl.useLog()
  }
}


trait MyLog{
  //特质中，没有实现的方法，都默认是abstract的
  def log(msg:String)
  //特质中可以带实现的方法
  def impLog(msg:String)={
    println("在特质中实现的log"+msg)
  }
}

trait MySpecialLog extends MyLog{
  override def impLog(msg:String)={
    println("MySpecialLog")
  }
}
