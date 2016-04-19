package MapOpt

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
object MakeMap {
  def main(args: Array[String]) {
    /**
     * 映射：
     *
     *
     *
     *
     *
     *
     */


    //TODO:映射,默认是不可变的[String,Int]映射
    val maps=Map("a"->1,'b'->2)
    //TODO：可变映射
    val muMaps=scala.collection.mutable.Map("who"->1,"im"->2,"i"->3)
    muMaps("im")=3
    println(muMaps)
    val muMapsO=Map(("a",1),("b",2))

    // 不存在会抛出异常
    // muMapsO("notExist")

    //TODO:获取映射中的值,if null else取法
    muMapsO.getOrElse("c",-1)

    muMapsO.contains("c")

    // 映射.get(键) 返回一个Optional值,要么是some,要么是none


    //TODO:更新映射中的值，不可以改变val的Map
    val newMap=scala.collection.mutable.Map("a"->1,"b"->2)
    // 如果存在就更新,不存在插入
    newMap("newKey")=100

    newMap+=("c"->3,"d"->4)
    println(newMap)
    newMap("c")=10
    //去掉C
    newMap-="c"

    // 不能修改一个不可修改的Map,但是可以重新生成一个
    var generMap=Map(1->11,2->22,3->33)
    // 更新3,添加4
    var generMap2=generMap+(3->88,4->44)

    //老的映射和新的映射共享大部分数据

    //TODO：迭代映射
    val iMap=Map("a"->1,"b"->2,"c"->3)
    for((key,value)<-iMap){
      println(key+"@"+value)
    }
    println(iMap.keySet)

    for(v<-iMap.values){
      println(v)
    }

    for(k<-iMap.keys){
      println(k)
    }


    val yMap=for((k,v)<-iMap)yield {
      (v,k)
    }
    println(yMap)

    // map默认是hash实现,如果要树实现的话需要指定




  }

}
