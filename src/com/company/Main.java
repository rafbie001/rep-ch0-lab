package com.company;

public class Main {

    public static void main(String[] args) {

        String userDir = System.getProperty("user.dir");
        Path path = Paths.get(userDir);
        String project = path.getFileName();



        System.out.println("Wersja JDK: "+System.getProperty("java.version"));
        System.out.println("Wersja JRE: "System.getProperty("java.runtime.version"));
        DEV2 dev2 = new DEV2;
   	dev2.author;
	System.out.println (dev2.author);

	DEV1 dev1 = new DEV1;
   	dev1.author;
	System.out.println (dev1.author);

	
	

    }
}
