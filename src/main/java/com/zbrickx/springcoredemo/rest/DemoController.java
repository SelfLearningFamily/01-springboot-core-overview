package com.zbrickx.springcoredemo.rest;

import com.zbrickx.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for dependency
    private Coach myCoach;

    DemoController(){
        System.out.println("in constructor: "+ getClass().getSimpleName());
    }

    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach theCoach){
        myCoach = theCoach;
    }
//@Qualifier("trackCoach")
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
