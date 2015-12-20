package com.io

import scala.io.Source

/**
 * Created by Administrator on 2015/12/20.
 */
class ReadLine {


  def readFromFile(fileName:String,code:String) ={
    val source=Source.fromFile(fileName,code);
    val sourceLines =source.getLines()

    //1
    for(l<-sourceLines){
      println(l)
    }
    //2
    printf(source.mkString)
    //3
    val la=source.getLines().toArray
    //4 read single char
    for(c <- source){
      print(c+"~")
    }
    //5 buffered
    val bf=source.buffered
    while (bf.hasNext){
        print(bf.next())
    }
    source.close()
    //6
    val tokens=source.mkString.split("\\S+")
    //7
    val numbers=for(t<-tokens) yield t.toInt
    //8
    val doubleNumbers=tokens.map(_.toDouble)
    //9
    val read=readInt()
    //10
    val readUrl =Source.fromURL("http://www.baidu.com","UTF8")
    //11
    val readString = Source.fromString("hello,world")
    //12
    val readStd = Source.stdin
    //13


  }
}

