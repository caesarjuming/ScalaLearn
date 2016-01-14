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
class CheckType {
  /**
   * 类型检查和转换：
   *
   *
   *
   */

  def checkTypeMethod(anyRef: AnyRef):AnyRef={
    //检查对象是否属于某个类
    if(anyRef.isInstanceOf[MyType])
      //实例化这个类
      anyRef.asInstanceOf[MyType]
    else
      anyRef
  }

  def checkClass(anyRef: AnyRef):Boolean={
    //指示的是对象而不是子类
    anyRef.getClass==classOf[MyType]
  }

  val mytype:MyType2=new MyType2
  mytype.printPro

}

class MyType{

  //子类可访问，对于类所属的包而言是不可见得
  protected val pro="i im pro"

}

class MyType2 extends MyType{

  def printPro={
    println(pro)
  }

}