package com.company.versions;

/**
 * Created by ycarvajalm on 2/15/18.
 */
public class jdk1  extends version{
    innerClass inner;
    /**
     * Constructor
     */
    public jdk1(){
        super("JDK 1");
        inner = new innerClass();
    }

    /**
     * Clase interna
     */
    public class innerClass {

        /**
         * Constructor
         */
        public innerClass() {
            System.out.println("Hola, soy una clase interna");
        }
    }
}
