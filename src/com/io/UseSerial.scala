package com.io

import java.io.{FileInputStream, ObjectInputStream, FileOutputStream, ObjectOutputStream}

import com.oop.Person

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Administrator on 2015/12/20.
 */
object UseSerial {

  //�����඼�ǿ����л���
  private val friends=new ArrayBuffer[Person]()

  def main(args: Array[String]) {
    val fed=new Serial
    import io._
    val out=new ObjectOutputStream(new FileOutputStream("Serial.scala"))
    out.writeObject(fed)
    out.close()
    val in = new ObjectInputStream(new FileInputStream("Serial.scala"))
    val svaeFed = in.readObject().asInstanceOf[Serial]

  }


}
