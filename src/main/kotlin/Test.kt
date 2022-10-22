import java.util.*
import kotlin.collections.ArrayList

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        val al1 = ArrayList<Int>()
        val ll1: LinkedList<Int> = LinkedList()
        val start = System.nanoTime()
        for (i in 0..99999) {
            al1.add(0, i)
        }
        val end = System.nanoTime()
        println("ArrayList add to begin:  " + (end - start))
    }
}