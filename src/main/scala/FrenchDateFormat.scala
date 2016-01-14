/**
 * Created by vsanjekar on 4/28/15.
 */
import java.util.Date
import java.util.Locale
import java.text.DateFormat._

object FrenchDateFormat {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df.format(now))
  }
}