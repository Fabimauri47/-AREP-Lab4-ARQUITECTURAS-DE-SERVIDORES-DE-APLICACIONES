package edu.escuelaing.arep.baseLab;

import edu.escuelaing.arep.DemoSpring.RequestMapping;

public class HelloController {
    @RequestMapping("Hola Mauricio ")
    public static String hola() {

        return " como estas ? ";
    }
    @RequestMapping("Hello Mauricio")
    public static String hello() {

        return "How are you?";
    }
}
