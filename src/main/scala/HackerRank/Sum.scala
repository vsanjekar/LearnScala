/**
  * Created by vinay on 12/13/15.
  */
object Sum {

  def main(args: Array[String]) {
    // println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
    val lines = io.Source.stdin.getLines()
    val numbers = lines.take(2)
    val sum = numbers.map(_.toInt).sum
    println(sum)
  }
}

