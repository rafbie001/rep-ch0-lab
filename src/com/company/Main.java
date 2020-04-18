package com.company;

public class Main {

    public static void main(String[] args) {

        String userDir = System.getProperty("user.dir");
        Path path = Paths.get(userDir);
        String project = path.getFileName();

        System.out.println("Wersja JDK: "+System.getProperty("java.version"));
        System.out.println("Wersja JRE: "System.getProperty("java.runtime.version"));
        System.out.println(project));
    }
}
