package ClassExtend

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
         Create by Caesar,2016/1/14
*/
class ClassExtend extends CanExtend{
  /**
   * 继承：
   * 重写：重写一个非抽象方法必须使用override，字段也是一样
   *
   */

  //重写
  override var VarParm="666"
  override val ValParm="888"
  //重写抽象类的未赋值方法
  val AbsVal=123

  //调用父类方法用super
  def Method1={super.Method1()}


}

//不可继承的类
final class UnExtend{

}

abstract class CanExtend{
  var VarParm:String="变量参数"
  val ValParm:String="常量参数"
  //抽象类可以未定义的变量用于重写
  val AbsVal:String

  def Method1()
  abstract def AbsMethod
}
