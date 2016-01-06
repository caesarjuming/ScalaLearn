package com.ActorClass

import scala.actors.Actor

/**
 * Created by Administrator on 2016/1/2.
 */
class AccountActor extends Actor{

  //不要在多个Actor共享数据

  private var balance = 0.0
  override def act(): Unit = {
    while (true){
      receive{
        //case + -  balance
        case _ => println("")
      }
    }

  }
}


object AccountActor {

}
