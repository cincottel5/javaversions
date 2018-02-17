package com.company.versions;

/**
 * Created by ycarvajalm on 2/16/18.
 */
public class javase8 extends version {

    /**
     * Constructor
     */
    public javase8() {
        super("Java SE 8");
        example();
    }

    public void example() {
        MyInterface test1 = (n) -> n + n;
        MyInterface test2 = (n) -> n+10;

        System.out.println(test1.test("FRancisco"));

        System.out.println(test2.test("Yelko"));
    }

    @FunctionalInterface
    interface MyInterface {
        String test(String n);
    }




}
