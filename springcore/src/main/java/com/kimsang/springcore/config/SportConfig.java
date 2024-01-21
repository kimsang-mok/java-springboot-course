package com.kimsang.springcore.config;

import com.kimsang.springcore.common.Coach;
import com.kimsang.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // we can also use a custom bean ID
    //@Bean("beanID")
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
