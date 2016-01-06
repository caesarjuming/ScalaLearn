package com.ActorClass

import scala.actors.Actor._

/**
 * Created by Administrator on 2016/1/2.
 */
object ActorMain {
  def main(args: Array[String]) {
    val act = new ActorClass
    act.start()

    //临时创建一个Actor
    val act2 = actor {
      while(true){
        receive{
          case "?"=>"what?"
          case _=>"empty"
        }

      }

    }
    act2.start()

    //发送消息，发完就忘，不会等回复
    act ! "hi"
    act2 ! "?"

    //receive,如果没有消息，会阻塞，直到有消息


  }
}
