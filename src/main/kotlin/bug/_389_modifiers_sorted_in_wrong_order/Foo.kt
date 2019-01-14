package bug._389_modifiers_sorted_in_wrong_order

class Foo {

    /**
    some docs
     */
    inline suspend fun foo1() = {
        print("foo")
    }

    /**
    some docs2
     */
    suspend inline fun foo2() = {
        print("foo")
    }


}