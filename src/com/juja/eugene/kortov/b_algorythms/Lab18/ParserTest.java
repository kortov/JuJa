package com.juja.eugene.kortov.b_algorythms.Lab18;

/**
 * Created by eugenekortov on 06/03/17.
 */
public class ParserTest {
    public static void main(String[] args) {
        System.out.println(">> 123 = " + Parser.eval("123"));
        System.out.println(">> 2*3 = " + Parser.eval("2*3"));
        System.out.println(">> (1+3)*2 = " + Parser.eval("(1+3)*2"));
        System.out.println(">> ((13/6)*2-5)+1 = " + Parser.eval("((13/6)*2-5)+1"));
    }
}
