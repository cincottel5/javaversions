package com.company.versions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ycarvajalm on 2/16/18.
 */
public class j2se50 extends version {
    List<String> team = new ArrayList<String>();

    /**
     * Constructor
     */
    public j2se50() {
        super("J2SE 5.0");

        example();
        example2();
    }

    public void example() {
        team.add("Yelko");
        team.add("Christian");
        team.add("Daniel");
        team.add("Javier");
        team.add("Francisco");

        for (String name : team) {
            System.out.println(name);
        }
    }

    @Deprecated
    public void example2() {
        System.out.println("\nFuncion obsoleta");
    }
}
