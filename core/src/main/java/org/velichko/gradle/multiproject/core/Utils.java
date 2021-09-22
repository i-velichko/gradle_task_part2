package org.velichko.gradle.multiproject.core;

import org.velichko.gradle.util.StringUtils;

import java.util.Arrays;

/**
 * The type Utils.
 *
 * @author Ivan Velichko
 * @date 15.09.2021 1:23
 */
public class Utils {
    /**
     * Is all positive numbers boolean.
     *
     * @param str the str
     * @return the boolean
     */
    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
