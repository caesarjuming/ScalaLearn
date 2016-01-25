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
//主构造器,赋值默认参数值，如果不带val，var 的参数被使用，那么将升级为字段
class AuxiConst(private val m:Int=0) {
  //主构造器执行所有的语句
  println("执行构造器了啊！！！")
  def desc="aaaaaa"
  println(desc)


  //var name=_

  def this(m:Int,name:String)={
    //调用主构造器
    this(1)
    println(name)
  }
  def this(m:Int,name:String,age:Int)={
    //调用第一个辅助构造器
    this(m,name)
    println(name,age)
  }


}
