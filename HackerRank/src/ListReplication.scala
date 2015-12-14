/**
  * Created by vinay on 12/13/15.
  */
object ListReplication {

  def f1(n: Int, num: Int): List[Int] = List.fill(n)(num)
  def f(n: Int, list: List[Int]):List[Int] = list.flatMap(x => f1(n,x))
  // def f(n: Int, list: List[Int]):List[Int] = list.flatMap(x => List.fill(n)(x))

  def main(args: Array[String]) {
    val s = scala.io.StdIn.readInt()
    // Iterator.continually(Console.readLine).takeWhile(_.nonEmpty).foreach(line => println("read " + line))
    val list : List[Int] = Iterator.continually(Console.readLine).takeWhile(_.nonEmpty).map(_.toInt).toList

    println(f(s, list))
  }
}
