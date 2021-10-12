package com.zimenina.julia;

/*
Create an abstract class Profession with private fields "Name" and "Industry".
This class must have an abstract method "Do Work".
Create a class "Developer" with a private field "Specialty",
which inherits from the Profession class and implements an abstract method.
Also create a class "Pilot", with a private field "Type of aircraft",
which also inherits from the Profession class and implements an abstract method.
Instances of the "Pilot" and "Developer" classes must be created in the Runner class,
as well as an instance of type Profession which creates another developer.
All parameters are set in the constructor, the constructors of the inherited classes are based on the constructor of the parent class.
Also, in all classes where it is necessary to create methods for working with parameters and organized data output (toString).

        */

public class Runner {
    public static void main (String [] args) {

// Create an instance of the Pilot class inherited from the Profession class with method calls
        Pilot pilot = new Pilot ("Jack", "Aviation", "Boeing-747");

        System.out.println (pilot.toString ());
        pilot.doWork ();
        System.out.println ();

// Create an instance of the Developer class inherited from the Profession class with method calls
        Developer developer = new Developer ("Jane", "Software development provided", "Software DEV");

        System.out.println (developer.toString ());
        developer.doWork ();
        System.out.println ();

// Create an instance of the class Developer through the class - parent Occupation with method calls
        Profession developer2 = new Developer ("Din", "Software development provided", "Android DEV");
        System.out.println (developer2.toString ());
        developer2.doWork ();



    }
}
