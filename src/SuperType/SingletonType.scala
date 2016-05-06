package SuperType

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
         Create by Caesar,2016/5/6
*/
class SetSample {

  def setTitle(title:String)={
    this
  }
  // 这样返回的就是Singleton，而不是父类
  def setAuthor(author:String):this.type={
    this
  }

  //可以这么调用 a.setTitle("aa").setAuthor("bb")
  //但是如果是上面这个类的子类，调用sub.setTitle("aa").setAuthor("bb")就会出错，因为返回的this是父类，而不是子类
  //解决的方法是把方法的返回类型设置为this.type

}
object Title

class SingletonType{
  private var useNextArgs:Any=null
  var title:String=""
  def set(obj:Title.type):this.type ={
    useNextArgs=obj
    this
  }
  def setTitle(title:String)={
    this.title=title
  }
}

object SingletonType{
  def main(args: Array[String]) {
    var ss:SingletonType = new SingletonType
    // 注意，Title是类型而不是对象
    ss.set(Title).setTitle("aaa")
  }
}
