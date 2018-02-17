package com.company.versions;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by ycarvajalm on 2/16/18.
 */
public class javase6 extends version {

    public javase6() {
        super("Java SE 6");
        example();
    }

    public void example() {
        ScriptEngineManager sm = new ScriptEngineManager();

        ScriptEngine engine = sm.getEngineByName("JavaScript");

        try{
            engine.eval("var x = 10+10; print(x)");
        }
        catch( ScriptException ex) {
            System.out.println("Error al compilar");
        }
    }
}

