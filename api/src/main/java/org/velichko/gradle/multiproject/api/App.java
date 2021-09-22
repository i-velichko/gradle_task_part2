package org.velichko.gradle.multiproject.api;

import org.velichko.gradle.multiproject.core.Utils;

/**
 * The type App.
 *
 * @author Ivan Velichko
 * @date 15.09.2021 10:42
 */
public class App {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(Utils.isAllPositiveNumbers("12", "79"));

    }
}
