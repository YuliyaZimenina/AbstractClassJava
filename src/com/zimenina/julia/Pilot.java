package com.zimenina.julia;

public class Pilot extends Profession {

    private String typeOfPlane;

    public Pilot(String name, String industry, String typeOfPlane) {
        super(name, industry);
        this.typeOfPlane = typeOfPlane;
    }

    public void setTypeOfPlane(String typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    @Override
    void doWork() {
        System.out.println("Pilot work - drives a plane");

    }

    @Override
    public String toString() {
        return "name:" + getName()+ "\nindustry: "+ getIndustry() + "\ntype of plane: "+ getTypeOfPlane();
    }

}