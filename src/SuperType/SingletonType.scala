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
         ���汣��       ����BUG
         Create by Caesar,2016/5/6
*/
class SetSample {

  def setTitle(title:String)={
    this
  }
  // �������صľ���Singleton�������Ǹ���
  def setAuthor(author:String):this.type={
    this
  }

  //������ô���� a.setTitle("aa").setAuthor("bb")
  //����������������������࣬����sub.setTitle("aa").setAuthor("bb")�ͻ������Ϊ���ص�this�Ǹ��࣬����������
  //����ķ����ǰѷ����ķ�����������Ϊthis.type

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
    // ע�⣬Title�����Ͷ����Ƕ���
    ss.set(Title).setTitle("aaa")
  }
}
