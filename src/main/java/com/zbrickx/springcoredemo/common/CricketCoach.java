package com.zbrickx.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    @PostConstruct
    public void customStarter(){
        System.out.println("in post construct" + getClass().getSimpleName());
    }

    CricketCoach(){
        System.out.println("in constructor: "+ getClass().getSimpleName());
    }

    @PreDestroy
    public void customDestroy(){
        System.out.println("in pre destroy" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!";
    }
}
