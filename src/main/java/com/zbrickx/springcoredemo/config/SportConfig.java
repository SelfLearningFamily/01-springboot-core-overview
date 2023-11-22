package com.zbrickx.springcoredemo.config;

import com.zbrickx.springcoredemo.common.Coach;
import com.zbrickx.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
