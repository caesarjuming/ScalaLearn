package com.io

import java.io.{PrintWriter, FileInputStream, File}

/**
 * Created by Administrator on 2015/12/20.
 */
class ReadByte {
  //read byte
  val file=new File("filename")
  val in =new FileInputStream(file)
  val byte=new Array[Byte](file.length().toInt)
  in.read(byte)

  val out = new PrintWriter("a.txt")
  for (i<-1 to 10)out.print(i)
  out.close()

  val quantity:String="aaa"
  val price:Int=88
  out.print("%6d,%10.2f".format(quantity,price))




}
