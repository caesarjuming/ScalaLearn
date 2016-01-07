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
object IfControl {
  def main(args: Array[String]) {
    /**
     * if:表达式是有返回值的，返回值有不同的类型.如果为空，那么返回的是Unit类型
     * 语句终止:不需要加分号，如果是多个语句需要加；
     * 块表达式和赋值：块中最后一个值就是块的值
     * 循环：for(i<-区间) while(条件)
     * 高级for：多值，守卫，中间变量，yield
     *
     */

    //TODO:if
    val value = if(2>1) 1 else -1
    //也可以是两个不同的类型
    val differ = if(3>2) "abc" else 1.2
    //返回值为空,()就和Java中的void差不多
    val retnull = if(1>0) 1 else ()


    //TODO:语句终止
    println('a');println('b')

    //TODO：块表达式和赋值,返回值为最后一句
    val blockValue={
      val a,b=1
      a+b
    }
    println(blockValue)
    //TODO:由于赋值语句返回值是Unit，所以不能连等
    //不能这么做val a=b=c=1

    //TODO:循环

    for (i<-1 to 10){
      println(i)
    }

    var l=10
    while(l>0){
      println(l)
      l-=1
    }

    //有时候，不需要用下标进行遍历，直接遍历字符串
    val str="hello"
    for(s<-str){
      println(s)
    }

    // scala没有break,可以用以下方法实现break
    // 使用Boolean控制
    // 嵌套函数，从函数中return
    // 用Breaks对象的break方法

    //多值for
    for(i<-1 to 10 ;j<-2 to 5){
      println(i+"!"+j)
    }
    //守卫
    for(i<-1 to 10 ;j<-2 to 5 if i!=j){
      println(i+"!"+j)
    }

    //中间变量
    for(i<-1 to 10;m=i+1;j<-m to 100){
    }

    //yield
    for(i<-1 to 10) yield i*2

    //多行for
    for{
      i<-1 to 10
      j<-1 to 10
    }println("")




  }

}
