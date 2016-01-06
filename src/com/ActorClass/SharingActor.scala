package com.ActorClass

import scala.actors.{OutputChannel, Channel, Actor}
import scala.actors.Actor._

/**
 * Created by Administrator on 2016/1/2.
 */
class SharingActor extends Actor{

  override def act(): Unit = {
    while (true){
      receive{
        case Compute(input,out)=>{val ok=100;out!ok}
      }
    }

  }

  //默认为当前Actor
  val channel = new Channel[Int]()
  val computeActor=new SharingActor()
  val input=Seq(1,2,3,4)
  computeActor ! Compute(input,channel)

  channel.receive{
    case _=> println()
  }

}

case class Compute(input:Seq[Int],result:OutputChannel[Int])

object SharingActor{

  def main(args: Array[String]) {
  }

}
