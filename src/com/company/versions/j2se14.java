package com.company.versions;

/**
 * Created by ycarvajalm on 2/16/18.
 */
public class j2se14 extends version{

    /**
     * Constructor
     */
    public j2se14() {
        super("J2SE 1.4");

        example(null);
        example("no es nulo");
    }

    public void example(String param) {
        assert (param == null) : "Hay un error";



        System.out.println("El valor es: " + param);
    }
}
