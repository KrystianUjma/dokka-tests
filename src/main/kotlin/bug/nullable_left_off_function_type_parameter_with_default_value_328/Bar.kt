package bug.nullable_left_off_function_type_parameter_with_default_value_328

class Bar<T> {
    val dataList = mutableListOf<T>()

    open fun checkElement(
            elem: T,
            addFunc: ((elem: T) -> Unit)? = { dataList.add(it) }
    ): Int = 1
}