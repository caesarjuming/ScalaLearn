package com.oop

/**
 * Created by juming.wang on 2015/12/19.
 */
class SecurityPerson extends Person{
  override val myname ="securityName"
  override val toString="securityToString"

  val alien=new Person{
    def greeting= "it's alien"

  }
  def me(p:Person{def greeting:String})={
    p.greeting
  }
}
