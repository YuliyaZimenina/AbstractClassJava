package com.zimenina.julia;

public class Developer extends Profession {

    private String speciality;

//Create a constructor for a class with inherited
// parameters from the abstract parent class

    public Developer(String name, String industry, String speciality) {
        super(name, industry);
        this.speciality = speciality;
    }

    // Setters and getters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Override methods from the parent class
    @Override
    void doWork() {
        System.out.println("Work developer - write code");

    }

    @Override
    public String toString() {
        return "name:" + getName() + "\nindustry: " + getIndustry() + "\nspeciality: " + getSpeciality();
    }


}
