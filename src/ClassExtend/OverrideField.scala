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
class OverrideField {
  val val1="val1"
  var var1="var1"
  def functionNoParm={}
  def functionParm(name:String)={}
}

class MyOverrideField extends OverrideField{
  //def 只能重写另一个def
  override def functionParm(name:String)={
    printf("重写")
  }
  //val重写另一个val或不带参数的def
  override val val1="new val1"
  override val functionNoParm=""

  //var重写var
  override var var1="bbb"

}
