package com.kimsang.springcore.rest;

import com.kimsang.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define a private field for the dependency
    private Coach myCoach;
//    private Coach otherCoach;

//    Define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach) {
        myCoach = theCoach;
//        otherCoach = theOtherCoach;
    }

//    @Autowired
//    public void setCoach(Coach theCoach) {
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    };

//    @GetMapping("/check")
//    public String check() {
//        return "Comparing beans: myCoach == otherCoach, " + (myCoach == otherCoach);
//    }
}

