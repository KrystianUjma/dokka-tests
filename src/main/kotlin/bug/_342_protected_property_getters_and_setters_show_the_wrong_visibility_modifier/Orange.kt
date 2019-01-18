package bug._342_protected_property_getters_and_setters_show_the_wrong_visibility_modifier

/**
 * Just a fruit
 *
 */
abstract class Orange {
    private var color: String = "orange"
    protected var foo: String? = "bar"
}