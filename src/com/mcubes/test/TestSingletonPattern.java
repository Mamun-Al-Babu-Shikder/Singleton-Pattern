package com.mcubes.test;

import com.mcubes.beans.EarlyInstantiation;
import com.mcubes.beans.LazyInstantiation;

/**
 * Created by A.A.MAMUN on 7/13/2020.
 */

/**
 * Singleton Pattern says that just"define a class that has only one
 * instance and provides a global point of access to it".
 * There are two forms of singleton design pattern :
 * (i)  Early Instantiation
 * (ii) Lazy Instantiation
 */
public class TestSingletonPattern {

    public static void main(String[] args) {

        /**
         * Observe the following objects carefully, we can see that
         * earlyInstantiation1, earlyInstantiation2 reference
         * of 'EarlyInstantiation' will be print same value
         * because they are pointing the same memory location.
         * We can observe same behaviour for LazyInstantiation.
         */

        System.out.println("EarlyInstantiation :");

        EarlyInstantiation earlyInstantiation1 = EarlyInstantiation.getInstance();
        System.out.println(earlyInstantiation1);

        EarlyInstantiation earlyInstantiation2 = EarlyInstantiation.getInstance();
        System.out.println(earlyInstantiation2);

        System.out.println("\nLazyInstantiation :");

        LazyInstantiation lazyInstantiation1 = LazyInstantiation.getInstance();
        System.out.println(lazyInstantiation1);

        LazyInstantiation lazyInstantiation2 = LazyInstantiation.getInstance();
        System.out.println(lazyInstantiation2);

    }
}
