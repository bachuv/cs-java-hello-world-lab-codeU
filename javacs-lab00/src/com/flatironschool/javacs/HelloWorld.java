package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
        return Double.parseDouble(System.getProperty("java.specification.version"));
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
        System.out.println(getVersion());
    }
}
