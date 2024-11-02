package com.mycompany.app;

import org.jspecify.annotations.Nullable;

public class App {
    static void log(Object x) {
        System.out.println(x.toString());
    }
    static void foo() {
        log(null);
    }

    // @Nullable
    Object m(@Nullable Object x) {
        return x; // oops!  return type is unannotated, hence @NonNull
    }

    static void deref_expression_nullable() {
        Object x = null;
        String s = x.toString();
        System.out.println(s);
    }

    void nonNullParam(Object x) {}
    void caller(@Nullable Object y) {
        nonNullParam(y); // bad!
}
}
