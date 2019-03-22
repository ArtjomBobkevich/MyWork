package com.itacademy.bobkevich.jdbc.util;

import lombok.experimental.UtilityClass;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

@UtilityClass
public class Peek {

    public static <T> UnaryOperator<T> peek(Consumer<T> consumer) {
        return object -> {
            consumer.accept(object);
            return object;
        };
    }
}
