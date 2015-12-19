package com.oop

/**
 * Created by juming.wang on 2015/12/19.
 */
class Employee(name:String,age:Int,hobby:String) extends Person(name:String,age:Int){
  var salary=0.0
  override def toString=getClass.toString;print(super.toString+"$Employee\n")

  def isEmployeeObject(ob :AnyRef) ={
    if (ob.isInstanceOf[Person]){
      println("ob.isInstanceOf[Person]")
      val a=ob.asInstanceOf[Person]
    }else{
      println("not ob.isInstanceOf[Person]")
      val b=ob.asInstanceOf[Employee]

    }

    if(ob.getClass== classOf[Person]){
      println("ob.getClass== classOf[Person]")
    }else{
      println("ob.getClass!= classOf[Person]")
    }


  }

  def isSameObject (ref1: AnyRef,ref2: AnyRef)={
    if(ref1.eq(ref2)){
      println("equals")
    }else{
      print("not equals")
    }
  }



}
