package com.mytrait

/**
 * Created by Administrator on 2015/12/24.
 */
object test {
  def main(args: Array[String]) {
    //the same as interface
    val mylog:SavingAccount = new SavingAccount with OutputLogged
    mylog.log("gaga")

    //实现不同的特质，顺序不同
    val val1:SavingAccount = new SavingAccount with AALogged with BBLogged
    val1.log("first")
    val val2:SavingAccount = new SavingAccount with BBLogged with AALogged
    val2.log("second")



  }
}
