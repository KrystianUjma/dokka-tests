package bug._342_protected_property_getters_and_setters_show_the_wrong_visibility_modifier

class NanoClock {
    fun seconds() = 0.0

    companion object {
        fun default(): NanoClock = NanoClock()

    }

}

