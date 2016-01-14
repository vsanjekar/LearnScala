object exercise {
  val x = new Rational(7, 9)
  x.numer
  x.denom

  class Rational(x: Int, y:Int) {
    def numer = x
    def denom = y
  }
}