import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    var arrayList: ArrayList<Int> = ArrayList()
    var linkedList: LinkedList<Int> = LinkedList()

    var list2: List<Int>;

    var start = System.nanoTime();
    for(i in 1..100000) {
        arrayList.add(0,i)
    }
    var end = System.nanoTime()
    var total = end - start
    println("ArrayList add to the begin:  $total")

    start = System.nanoTime();
    for(i in 1..100000) {
        linkedList.add(0,i)
    }
    end = System.nanoTime()
    total = end - start
    println("LinkedList add to the begin: $total")

    start = System.nanoTime();
    for(i in 30000..60000) {
        arrayList.get(i)
    }
    end = System.nanoTime()
    total = end - start
    println("ArrayList get from the middle:  $total")

    start = System.nanoTime();
    for(i in 30000..60000) {
        linkedList.get(i)
    }
    end = System.nanoTime()
    total = end - start
    println("LinkedList get from the middle: $total")


    start = System.nanoTime();
    for(i in 0..30000) {
        arrayList.add(i)
    }
    end = System.nanoTime()
    total = end - start
    println("ArrayList add to the end:   $total")

    start = System.nanoTime();
    for(i in 0..30000) {
        linkedList.add(i)
    }
    end = System.nanoTime()
    total = end - start
    println("LinkedList add to the end: $total")
}
