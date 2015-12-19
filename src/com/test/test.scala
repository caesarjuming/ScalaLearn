package com.test

import com.oop.Employee

/**
 * Created by juming.wang on 2015/12/19.
 */
object test {
  def main(args: Array[String]) {
    val employee:Employee =new Employee("aaa",2,"bb")
    //println(employee.toString)
    //employee.isEmployeeObject(employee)
    val employee2=new Employee("aaa",2,"bb")
    val employee3=new Employee("aaa",2,"bb")
    employee.isSameObject(employee2,employee3)
  }


}
