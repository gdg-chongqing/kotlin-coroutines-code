
fun main(args: Array<String>) {
  (1 until 100_000).forEach {
    Thread {
      print(".")
      Thread.sleep(1000)
    }.start()
  }
}