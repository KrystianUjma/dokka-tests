package bug._262_overloaded_fun_is_not_shown

import java.math.BigDecimal


class A<T>

/**
 * my fun 1
 */
fun <T: Any> A<T>.foo(expected: T): A<T> = throw UnsupportedOperationException("...")

/**
 * my fun2
 */
fun <T: BigDecimal> A<T>.foo(expected: T): A<T> = throw UnsupportedOperationException("...")