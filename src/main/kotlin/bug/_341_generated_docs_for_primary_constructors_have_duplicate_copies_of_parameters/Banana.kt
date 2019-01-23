package bug._341_generated_docs_for_primary_constructors_have_duplicate_copies_of_parameters

/**
 * Just a fruit
 *
 * @param weight in grams
 * @param ranking quality from 0 to 10, where 10 is best
 * @param color default is yellow
 */
class Banana (
        private val weight: Double,
        private val ranking: Int,
        val color: String = "yellow"
)


