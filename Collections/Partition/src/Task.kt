// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter { c ->
    val (delivered, undelivered) = c.orders.partition { o -> o.isDelivered }
    undelivered.size > delivered.size
}.toSet()
