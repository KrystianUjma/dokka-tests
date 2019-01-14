package bug.modifiers_sorted_in_wrong_order_389

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