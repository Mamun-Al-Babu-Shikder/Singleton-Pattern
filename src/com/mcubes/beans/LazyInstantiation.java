package com.mcubes.beans;

/**
 * Created by A.A.MAMUN on 7/13/2020.
 */

/**
 * Lazy Instantiation, that create the instance when required.
 */
public class LazyInstantiation {

    // Lazy, instance will be created when it required.
    private static LazyInstantiation object = null;

    /**
     * Define constructor as private so that
     * out side class can't create an instance
     * through new keyword.
     */
    private LazyInstantiation(){}

    /**
     * Create a static method that instantiate and return
     * the object of 'LazyInstantiation' when the 'object'
     * is 'null' otherwise it return object that created
     * first time.
     */
    public static LazyInstantiation getInstance(){
        if(object == null)
            object = new LazyInstantiation();
        return object;
    }

}
