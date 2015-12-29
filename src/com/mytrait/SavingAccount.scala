package com.mytrait

/**
 * Created by Administrator on 2015/12/24.
 */
class SavingAccount extends Logged{
  override def absLog(msg: String): Unit = print("absLog")
}
