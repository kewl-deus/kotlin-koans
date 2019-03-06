import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int>{
        override fun compare(i: Int, j: Int) = -Integer.compare(i, j)
    })
    return arrayList
}
