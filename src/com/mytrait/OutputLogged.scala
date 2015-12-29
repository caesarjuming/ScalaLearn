package com.mytrait

/**
 * Created by Administrator on 2015/12/24.
 */
trait OutputLogged extends Logged{
  override def log(msg:String)={
    println("OutputLogged"+msg)
  }
}
