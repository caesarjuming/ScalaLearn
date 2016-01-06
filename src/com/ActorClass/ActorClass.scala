package com.ActorClass

import scala.actors.Actor

/**
 * Created by Administrator on 2016/1/2.
 */
class ActorClass extends Actor{

  //不同Actor的act方法是并行运行的
  override def act(): Unit = {
    while (true){
      receive{
        case "hi"=>println("hello")
        case _=> println("nothing")
      }
    }
  }
}
