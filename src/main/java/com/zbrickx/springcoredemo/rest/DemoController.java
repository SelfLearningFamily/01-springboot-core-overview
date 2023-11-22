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
    private Coach anotherCoach;

//    @Autowired
//    DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach anotherCoach){
//        System.out.println("in constructor: "+ getClass().getSimpleName());
//        this.myCoach = theCoach;
//        this.anotherCoach = anotherCoach;
//    }

    @Autowired
    DemoController(@Qualifier("aquatic") Coach theCoach){
        System.out.println("in constructor: "+ getClass().getSimpleName());
        this.myCoach = theCoach;
    }


//    @Autowired
//    public void setCoach(@Qualifier("cricketCoach") Coach theCoach){
//        myCoach = theCoach;
//    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "comparing Beams, mycoach == anotherCoach: " + (myCoach ==  anotherCoach);
    }

}
