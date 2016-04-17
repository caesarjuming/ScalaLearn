package ArrayOpt

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
         Create by Caesar,2016/1/9
*/
object MatrixArray {
  /**
   * 多维数组：
   *
   *
   *
   */
  def main(args: Array[String]) {
    val maA=Array.ofDim[Int](2,2)
    maA(0)(0)=99
    //不规则数组
    val maB=new Array[Array[Int]](10)
    maB(0)=new Array[Int](8)

    import scala.collection.JavaConversions.bufferAsJavaList
    import scala.collection.mutable.ArrayBuffer
    var arr=ArrayBuffer("ls","-al","/usr/local")
    // sacal 到Java的转化
    // 数组缓冲被包装成为Java的List
    var pb=new ProcessBuilder(arr)

    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable.Buffer
    // Java 到scala转换,包装起来的只能保护是个Buffer不能保证是ArrayBuffer
    val cmd:Buffer[String]=pb.command()


  }


}
