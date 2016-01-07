package ProcessControl

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
         Create by Caesar,2016/1/7
*/
object Function {
  def main(args: Array[String]) {
    /**
     * 函数：函数名(参数名:参数类型)返回类型={函数体}
     * 过程：返回类型为Unit函数，可省略=
     *
     *
     *
     */


    //TODO:函数
    //def 函数名(参数名:参数类型)返回类型={函数体}，非递归函数，返回类型可以编译器推断出来，
    def abs(x:Double)=if(x>=0)x else -x

    //TODO:递归函数，必须指定返回类型
    def fac(x:Int):Int=if(x>0)x*fac(x-1) else 1

    //TODO:默认参数和带名参数
    def decorate(y:String,x:String="[",z:String="]")=x+y+z

    //如果y在中间，则不能匹配,也可以按照参数名称进行匹配
    println(decorate("hello"))
    println(decorate("aa","@","#"))
    println(decorate("vv","@"))

    println(decorate(x="<<<",y = "6",z = ">>>"))

    //TODO:变长参数
    def sum(args:Int*)={
      var result = 0
      for (a<-args){
        result+=a
      }
      result
    }

    println(sum(1,2,3))
    //1 to 3:_* 1到3当做参数序列传入
    println(sum(1 to 3:_*))



    //TODO:过程,函数体包含在花括号中，且前无等号,那么返回类型就是Unit
    def box(s:String): Unit ={

    }
    def box2(s:String){}



  }

}
