package com.bteconosur.common.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class IdentifierCreatorUtil {

    private static final List<Character> CHARACTERS = Arrays.asList(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'r', 'o'
            , 'p', 'q', 's', 't', 'u', 'v', 'w', 'k', '1', '2', '3', '4', '5',
            '6', '7', '8', '9'
    );

    private static final Random RANDOM =
            new Random();

    private IdentifierCreatorUtil() {
        throw new AssertionError("You can't instance this class");
    }

    public static String generateId(int length) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            stringBuilder.append(charRandom());
        }

        return stringBuilder.toString();
    }

    private static char charRandom() {
        return CHARACTERS.get(
                RANDOM.nextInt(
                        CHARACTERS.size()
                )
        );
    }

    @Override
    public boolean equals(Object obj) {
        throw new AssertionError();
    }

}
