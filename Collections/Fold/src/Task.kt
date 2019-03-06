// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val orderedProdsPerCustomer = customers.map { c -> c.orders.flatMap { o -> o.products }.toSet() }
    val allProds = orderedProdsPerCustomer.flatMap{ it }.toSet()
    return allProds.filter { p -> orderedProdsPerCustomer.all { prodSet -> p in prodSet } }.toSet()
}