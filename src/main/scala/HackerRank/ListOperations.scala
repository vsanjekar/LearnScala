package HackerRank

/**
  * Created by vsanjekar on 12/14/15.
  */
object ListOperations {
  // List creation
  def f(num:Int) : List[Int] = (1 to num).toList
  def f1(num:Int) : List[Int] = List.fill(num)(1)
  def f2(num:Int) : List[List[Int]] = List.fill(2, 3)(7)

  // List reversal
  def reverse(arr: List[Int]):List[Int] = arr.reverse

  // List size
  def listSize(arr: List[Int]): Int = arr.map(_ => 1).sum

  // Sum of list elements
  def sumList(arr: List[Int]):Int = arr.sum
  def sumOddIndices(arr: List[Int]):Int = arr.zipWithIndex.filter(_._2 % 2==0).map(_._1).sum
  def sumEvenIndices(arr: List[Int]):Int = arr.zipWithIndex.filter(_._2 % 2!=0).map(_._1).sum
  def sumOddElements(arr: List[Int]):Int = arr.filter(_ % 2 != 0).sum

  def main(args: Array[String]) {
    println(f(10))
    println(f1(10))
    println(f2(10))
    println(reverse(f(5)))
    println(sumList(f(10)))
    println(sumOddIndices(f(10)))
    println(sumEvenIndices(f(10)))
    println(sumOddElements(f(10)))
    println(listSize(f(10)))
  }
}