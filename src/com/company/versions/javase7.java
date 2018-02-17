package com.company.versions;

import java.util.*;

/**
 * Created by ycarvajalm on 2/16/18.
 */
public class javase7 extends version {

    public List<String> team;

    /**
     * Constructor
     */
    public javase7() {
        super("Java SE 7");
        example();
    }

    public void example() {
        team = new ArrayList<>();
        team.add("Yelko");
        team.add("Francisco");
        team.add("Javier");
        team.add("Daniel");
        team.add("Christian");

        for (String name : team) {
            String lastName = "";

            switch (name) {
                case "Yelko":
                    lastName = "Carvajal";
                    break;
                case "Christian":
                    lastName = "Aguilar";
                    break;
                case "Daniel":
                    lastName = "Arrieta";
                    break;
                case "Francisco":
                    lastName = "Alvarado";
                    break;
                case "Javier":
                    lastName = "Mendoza";
                    break;
            }

            System.out.println(name + " " + lastName);
        }
    }
}
