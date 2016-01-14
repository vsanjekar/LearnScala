object exercise {

  def cube(x: Int) : Int = x*x*x
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a+1, b)

  def sumCubes(a: Int, b: Int) = {
    sum(cube, a, b)
  }
  sumCubes(2,5)
  // tail recursion
  def sum2(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, f(a)+acc)
    }
    loop(a, 0)
  }
  // sum of squares
  sum2(x => x*x, 2, 5)
  // currying
  def sum3(f: Int => Int): (Int , Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0
      else f (a) + sumF (a + 1, b)
    sumF
  }
  // sum of cubes
  sum3(x => x*x*x)(2,5)
  sum3(cube)(2,5)
  def sum4(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sum4(f)(a + 1, b)
  }
  sum4(cube)(2,5)
  def product4(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product4(f)(a + 1, b)
  }
  product4(cube)(2,5)
  def fact(n: Int) = product4(x => x) (1, n)
  fact(5)
  // Function that generalizes sum and product
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, unit: Int)(a: Int, b: Int) : Int = {
    if (a > b)
      unit
    else
      combine(f(a), mapReduce(f, combine, unit)(a+1, b))
  }
  // define product in terms of mapReduce
  def product5(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x*y, 1)(a, b)
  product5(x => x*x)(1,4)
}