package com.mytrait


/**
 * Created by Administrator on 2015/12/22.
 */
trait Logger {
  def log(msg:String)
  def mylog(msg:String)={
    print("mylog:"+msg)
  }
}
