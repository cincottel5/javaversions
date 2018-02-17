package com.company;
import com.company.versions.*;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hola compañeros, estas son las versiones de java");

        /**
         * Uso de clases internas del jdk1
         */
	    jdk1 version1 = new jdk1();

        /**
         * Uso del strictfp del j2se1.2
         */
        j2se12 version2 = new j2se12();

        /**
         * Uso de clases sinteticas en java
         */
        j2se13 version3 = new j2se13();
        j2se13.example();

        /**
         * Uso de assert
         */
        //j2se14 version4 = new j2se14();

        /**
         * Using generics
         */
        j2se50 version5 = new j2se50();

        /**
         * Scripting Language Support
         */
        javase6 version6 = new javase6();

        /**
         * Diamond and string switch
         */
        javase7 version7 = new javase7();

        /**
         * Lambda Expressions
         */
        javase8 version8 = new javase8();
    }
}
