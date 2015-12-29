package com.mytrait

/**
 * Created by Administrator on 2015/12/24.
 */
trait asbLogger{
  def log(msg:String)
}


trait TimeStapLogger extends asbLogger{
  //因为特质混入的顺序不同调用的也不同，不知道那个特质的log方法会被调用
  abstract override def log(msg:String)={
    super.log(msg)
  }
}