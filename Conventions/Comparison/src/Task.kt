data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) =
        when {
            year != other.year -> Integer.compare(year, other.year)
            month != other.month -> Integer.compare(month, other.month)
            else -> Integer.compare(dayOfMonth, other.dayOfMonth)
        }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
