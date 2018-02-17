package com.company.versions;



import java.lang.reflect.Method;

/**
 * Created by ycarvajalm on 2/15/18.
 * Copy from https://javapapers.com/core-java/java-synthetic-class-method-field/
 */
public class j2se13 extends version {

    public String Nombre;
    /**
     * Constructor
     */
    public j2se13() {
        super("J2SE 1.3");
    }

    public static void example() {
        SampleNestedClass nestObj = new SampleNestedClass();
        System.out.println("Nested Variable: " + nestObj.aPrivateVariable);

        Class c = nestObj.getClass();
        Method[] methods = c.getDeclaredMethods();

        for (Method m : methods) {
            System.out
                    .println("m: " + m + " m.isSynthetic: " + m.isSynthetic());
        }
    }

    private static final class SampleNestedClass {
        private String aPrivateVariable = "Hola";

    }


}
