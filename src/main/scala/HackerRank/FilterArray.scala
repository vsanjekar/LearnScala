/**
  * Created by vinay on 12/13/15.
  */
object FilterArray {

  def f(delim:Int,arr:List[Int]): List[Int] = arr.filter(num => num < delim)

  def main(args: Array[String]) {
    val s = scala.io.StdIn.readInt()
    val list : List[Int] = Iterator.continually(Console.readLine).takeWhile(_.nonEmpty).map(_.toInt).toList
    println(f(s, list))

  }
}
