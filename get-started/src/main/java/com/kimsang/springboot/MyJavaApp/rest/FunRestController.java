package com.kimsang.springboot.MyJavaApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach name: " + coachName + ", Team name: " + teamName;
    }

    // expose "/" that return "Hello world"
    //    @GetMapping("/")
    //    public String sayHello() {
    //        return "Hello World!";
    //    }
    //
    //    @GetMapping("/workout")
    //    public String getDailyWorkout() {
    //        return "Run a marathon!";
    //    }
}
