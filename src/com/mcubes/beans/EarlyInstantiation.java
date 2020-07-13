package com.mcubes.beans;

/**
 * Created by A.A.MAMUN on 7/13/2020.
 */

/**
 * Early Instantiation, that create the instance at load time.
 */
public class EarlyInstantiation {

    // Early, instance will be created at load time
    private static EarlyInstantiation object = new EarlyInstantiation();

    /**
     * Define constructor as private so that
     * out side class can't create an instance
     * through new keyword.
     */
    private EarlyInstantiation(){}

    /**
     * Create static method that return the
     * pre-defined object of 'EarlyInstantiation'.
     */
    public static EarlyInstantiation getInstance(){
        return object;
    }

}
