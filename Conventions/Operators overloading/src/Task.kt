import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

class MultiTimeInterval(val timeInterval: TimeInterval, val multiplier: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval , 1)

operator fun TimeInterval.times(n: Int): MultiTimeInterval = MultiTimeInterval(this, n)

operator fun MyDate.plus(multiTimeInterval: MultiTimeInterval): MyDate = 1.rangeTo(multiTimeInterval.multiplier)
        .fold(this) { acc, i -> acc + multiTimeInterval.timeInterval}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
