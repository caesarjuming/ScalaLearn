package com.mytrait

/**
 * Created by Administrator on 2015/12/22.
 */
class ConsoleLogger extends Logger with Cloneable with Serializable{
  def log(msg: String){print(msg)}
  mylog("jack")

}
