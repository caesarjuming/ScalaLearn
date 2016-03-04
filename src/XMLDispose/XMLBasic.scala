package XMLDispose



import scala.xml.{Text, NodeSeq, NodeBuffer, Elem}

/**
 * Created by juming.wang on 2016/2/25.
 */
class XMLBasic {

}

object XMLBasic{
  def main(args: Array[String]) {
    // 以下是scala.xml.Elem对象
    var xml1 = <html><head>hello,world</head></html>
    // 以下是scala.xml.NodeSeq
    val xml2 = <li>1</li><li>2</li><li>3</li>
    //为了避免大于小于号被解析为XML,在使用大于号时加个空格
    val (x, y)=(1,2)
    x > y
    //Node节点是所有XML节点的祖先，两个最重要的子类Elem和Text
    val xml3 = <a href="http://www.google.com">The <em>Scala</em> Language</a>

    for (x<-xml3.child) {
      println(x)
    }
    //对于XML注释和&实体引用，处理指令都有相应的对象对应

    //用程序构建节点
    var buffer = new NodeBuffer
    buffer += <li>a</li>
    buffer += <li>b</li>
    buffer += <li>c</li>

    val nodes:NodeSeq = buffer

    //获取属性
    val hrefSource = xml3.attribute("href")
    //这样调用的结果是一个序列不是一个字符串
    println(hrefSource)

    val xml4 = <img alt="aaaaaé&nbsp;"></img>
    val hrefSource2 = xml4.attribute("alt")

    val xml5 = <a href="http://www.baidu.com" ddd="aaa">aaa</a>
    xml5.attributes.get("href").getOrElse(Text(""))
    for (m<-xml5.attributes){
      println(m)
    }

    val attrMap =xml5.attributes.asAttrMap
    for ((k,v) <- attrMap){
      println(k,v)
    }

    val xml6 = <ul>{for(i<-1 to 10)yield <li>{i}</li>}</ul>
    println(xml6)

    val xml7 = <ul>{{"aa"}}</ul>
    val xml8 = <ul>{ {"aa"} }</ul>
    println(xml7)
    println(xml8)

    val fileName:String ="file"

    // 此方法必须在xml9之前定义
    def makeFile(filename:String):String={
      "myFile"
    }
    val xml9 = <a href={makeFile(fileName)}></a>

    println(xml9)

  }
}