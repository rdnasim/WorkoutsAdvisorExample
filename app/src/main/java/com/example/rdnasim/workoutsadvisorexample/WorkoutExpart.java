package com.example.rdnasim.workoutsadvisorexample;


import java.util.ArrayList;
import java.util.List;

public class WorkoutExpart {
    List<String> getWorkouts(String workouttypes) {
        List<String> workout = new ArrayList<String>();

        if (workouttypes.equals("Physics")){
            workout.add("class 9 Physics");
            workout.add("Class 11 Physics");
        }
        else if (workouttypes.equals("Chemistry")){
            workout.add("Class 9 Chemistry");
            workout.add("Class 11 Chemistry");
        }
        else if (workouttypes.equals("Math.")){
            workout.add("Class 9 Math.");
            workout.add("Class 11 Math.");
        }
        else if (workouttypes.equals("Biology")){
            workout.add("Class 9 Biology");
            workout.add("Class 11 Biology");
        }
        else if (workouttypes.equals("Higher Math.")){
            workout.add("Class 9 Higher Math.");
            workout.add("Class 11 Higher Math.");
        }
        return workout;
    }
}
