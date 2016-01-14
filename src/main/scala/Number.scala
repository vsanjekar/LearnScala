/**
 * Created by vsanjekar on 5/1/15.
 */
object Numbers {
class ComplexNumber(real: Double, imaginary: Double) {
  def realPart() = real
  def imaginaryPart() = imaginary
  def re = real
  def imag = imaginary

  override def toString() =
    "" + re + (if (imaginary < 0) "" else "+") + imaginary + "i"
}

  def main(args: Array[String]) {
    val c = new ComplexNumber(1.2, -3.4)
    println(c.realPart() +" "+ c.imaginaryPart())
    println(c.re+" "+c.imag)
    println(c.toString())
  }
}