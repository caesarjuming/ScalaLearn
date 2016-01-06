package com.ActorClass

/**
 * Created by Administrator on 2016/1/2.
 */
class FutureActor {


}
object FutureActor{
  def main(args: Array[String]) {
    val aac=new AccountActor()
    //发送一个消息并等待回复
    val reply= aac !? "aaa"
    reply match {
      case "bbb" => println("ccc")
    }

  }
}