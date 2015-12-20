package com.io

/**
 * Created by Administrator on 2015/12/20.
 */
class Reg {
  val numPattern="[0-9]+".r
  //如果要包含反斜杠
  val wsPattern="""\s+[0-9]+\s+""".r

  def main(args: Array[String]) {
    for(matching<-numPattern.findAllIn("99 bbbb 88 cccc"))print(matching)
    val matchings=numPattern.findAllIn("99 bbbb 88 cccc").toArray
    numPattern.findFirstIn("99 bbbb 88 cccc")
    numPattern.findPrefixOf("99 bbbb 88 cccc")
    numPattern.

  }
}
