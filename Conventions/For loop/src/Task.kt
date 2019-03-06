class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {

    override fun iterator(): Iterator<MyDate> = object : Iterator<MyDate> {
        var current = start

        override fun hasNext() = current <= end

        override fun next(): MyDate {
            val item = current
            current = current.nextDay()
            return item
        }
    }

}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
