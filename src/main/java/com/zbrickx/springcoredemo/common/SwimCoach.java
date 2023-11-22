package com.zbrickx.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "swim a 100 meters as warm up";
    }
}
