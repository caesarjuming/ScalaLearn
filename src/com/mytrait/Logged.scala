package com.mytrait

/**
 * Created by Administrator on 2015/12/24.
 */
trait Logged {
  def log(msg:String){
    // do nothing
  }
  def absLog(msg:String)
}
trait AALogged extends OutputLogged{
  override def log(msg:String){
    super.log("AA:"+msg)
  }
}

trait BBLogged extends OutputLogged{
  override def log (msg:String){
    super.log("BB:"+msg)
  }
}
