import math.abs
object exercise {
  val tolerance = 0.0001
  def isCloseEnough(x: Double, y: Double) = {
    abs(x-y)/x < tolerance
  }
  def fixedPoint(f: Double => Double)(guess: Double) = {
    def iterate(x: Double) : Double = {
      // println("Guess = " + x)
      val next = f(x)
      if (isCloseEnough(next, x)) next
      else iterate(next)
    }
    iterate(guess)
  }
  fixedPoint(x => 1 + x/2)(0)
  // Take average damp to avoid oscillating values
  def averageDamp(f: Double => Double)(x: Double) = (x + f(x))/2
  def sqrt(x: Double) = {
    fixedPoint(averageDamp(y => x/y))(1)
  }
  sqrt(2)
  sqrt(100)
  sqrt(729)

}