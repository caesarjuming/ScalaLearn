package com.helloworld

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

/**
 * Created by juming.wang on 2015/12/7.
 */
object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
