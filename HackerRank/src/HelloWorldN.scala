/**
  * Created by vinay on 12/13/15.
  */
object HelloWorldN {
  def f(n: Int) = for (i <- 1 to n) println("Hello World")
  def main(args: Array[String]): Unit = {
    // val n = io.Source.stdin.getLines().take(1).map(_.toInt).toList.last
    // val n = readLine().toInt
    val n = scala.io.StdIn.readInt()
    f(n)
  }

}
