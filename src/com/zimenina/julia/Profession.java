package com.zimenina.julia;


abstract class Profession {

    private String name;
    private String industry;

    public Profession(String name, String industry) {
        this.name = name;
        this.industry = industry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    abstract void doWork();


    @Override
    public abstract String toString();
}

