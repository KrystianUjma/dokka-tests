package bug._342_protected_property_getters_and_setters_show_the_wrong_visibility_modifier

/**
 * Generic [Path] follower for time-independent pose reference tracking.
 *
 * @param clock clock
 */
abstract class PathFollower @JvmOverloads constructor(protected val clock: NanoClock = NanoClock.default()) {
    private var startTimestamp: Double = 0.0
    protected var path: Pathh? = Pathh()

    /**
     * Follow the given [path].
     */
    open fun followPath(path: Pathh) {
        this.startTimestamp = clock.seconds()
        this.path = path
    }

    /**
     * Returns true if the current path has finished executing.
     */
    abstract fun isFollowing(): Boolean

    /**
     * Run a single iteration of the path follower.
     *
     * @param currentPose current robot pose
     */
    abstract fun update(currentPose: Pose2d)
}