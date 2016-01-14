/**
 * Created by vsanjekar on 4/29/15.
 */

/*
Functions as first class arguments
 */

object Timer {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread.sleep(1000)
    }
  }
  def currentTime(): Unit = {
    val now = System.currentTimeMillis()
    println("Time flies " + now)
  }

  def main (args: Array[String]) {
    // oncePerSecond(currentTime)
    oncePerSecond(() => {
      val now = System.currentTimeMillis()
      println("Anonymous: Time flies " + now)
    })
  }
}