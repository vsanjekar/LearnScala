/**
  * Created by vinay on 12/13/15.
  */
object FilterOddPositions {

  def f(arr:List[Int]):List[Int] = arr.zipWithIndex.filter(_._2 % 2 != 0).map(_._1)

  def main(args: Array[String]) {
    val list:List[Int] = Iterator.continually(Console.readLine()).takeWhile(_.nonEmpty).map(_.toInt).toList
    print(f(list))
  }

}
