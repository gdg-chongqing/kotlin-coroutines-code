import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking


fun main(args: Array<String>) {
  runBlocking {
    (1 until 100_000).forEach {
      launch {
        print(".")
        delay(1000)
      }
    }

    delay(1000)
  }
}
