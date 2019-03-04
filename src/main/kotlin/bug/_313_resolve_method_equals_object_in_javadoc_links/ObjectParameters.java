package bug._313_resolve_method_equals_object_in_javadoc_links;

/**
 {@link #equals(Object)}{@link #increment(Integer)}{@link #nativeBoolean(Boolean)}{@link #toFoo(String)}
 */
public class ObjectParameters {

    public boolean equals(Object other) {
        return false;
    }

    public void increment(Integer number) {}

    public void nativeBoolean(Boolean bool) {}

    public void toFoo(String str) {};
}