package com.oop

/**
 * Created by juming.wang on 2015/12/19.
 */
/**
 * final class can't be extended
 *
 */
class Person(name:String="caesar",age:Int=0) {
  val myname:String=this.name
  val myage:Int=this.age
  override def toString: String = getClass.toString;print(super.toString+"$Person\n")
}
