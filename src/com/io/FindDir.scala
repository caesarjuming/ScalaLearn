package com.io

import java.io.File
import java.nio.file.attribute.BasicFileAttributes
import java.nio.file.{Files, FileVisitResult, SimpleFileVisitor, Path}


/**
 * Created by Administrator on 2015/12/20.
 */
class FindDir {

  def subDir(dir:File):Iterator[File]= {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subDir _)
  }

  implicit def makeFileVisitor(f:(Path)=>Unit)=new SimpleFileVisitor[Path]{
    override def visitFile(p: Path, attrs: BasicFileAttributes): FileVisitResult = {
      f(p)
      FileVisitResult.CONTINUE
    }
  }

  //Files.walkFileTree(dir.toPath,(f:Path)=>println(f))

}
