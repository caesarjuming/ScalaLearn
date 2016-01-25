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

//所有类都是公有可见性
class NoParamClass {
  //必须初始化
  private var value=0
  var sgValue=1
  //方法默认是公有的
  def increment()={
    this.value+=1
  }
  def current=value
}

object other{
  def main(args: Array[String]) {

    val c=new NoParamClass
    c.increment()
    //可以省略()
    c.current

    //自动生成get和set,sgValue是getter方法,sgValue_=是setter方法
    println(c.sgValue)
    c.sgValue=2
    println(c.sgValue)



  }
}
