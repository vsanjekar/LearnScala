object exercise {
  1 + 2

  def sqrt(x: Double) = {
    def abs(x: Double) = if (x >= 0) x else -x

    def sqrtHelper(guess: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtHelper(improve(guess))

    def isGoodEnough(guess: Double, x: Double): Boolean =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtHelper(1.0)
  }

  sqrt(2)
  sqrt(10)
  sqrt(625)
  sqrt(1e-6)
  sqrt(1e-60)

  def gcd(a: Int, b: Int) : Int = {
    if (b == 0) a else gcd (b, a % b)
  }
  gcd(21, 14)
  gcd(15, 27)

  def factorial(n: Int) : Double = {
    if (n==0) 1 else n*factorial(n-1)
  }

  factorial(100)

  def factorialTailRec(n: Int): Double = {
    def factorialLoop(n: Int, acc: Double) : Double =
      if (n == 0) acc
      else factorialLoop(n-1, acc*n)

    factorialLoop(n, 1)
  }

  factorialTailRec(100)
}