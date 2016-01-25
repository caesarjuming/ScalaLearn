package ClassOpt

import scala.beans.BeanProperty

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
class NewClass {
  /**
   * 覆盖getter和Setter方法：
   *
   * 生成getter和setter规则：
   *  1，如果字段是私有的，那么getter和setter也是私有的
   *  2，如果字段是val，那么只生成getter
   *  3，如果不需要getter和setter，可以使用private[this]
   *
   * 只带getter：
   *
   */
  private var v=0
  val vv=10
  private[this] var vNot=1
  //自动生成getter，setter,生成四个方法,beanPro,beanPro_=,getBeanPro,setBeanPro
  @BeanProperty var beanPro:String=_

  def value={
    v
  }

  def value_=(i: Int){
    v=i
  }

  def vvOb(ii:NewClass)={
    //可以访问另一个对象的私有变量
    ii.v
    //error ii.vNot不能访问
  }



 object myMain{
   def main(args: Array[String]) {
     val nc=new NewClass

     //get
     nc.value
     //set
     nc.value=2

     //nc.vv=2
     //error,只生成getter，没有setter

     //自动生成的getter方法，类似Java风格
     nc.getBeanPro()



   }
 }


}
