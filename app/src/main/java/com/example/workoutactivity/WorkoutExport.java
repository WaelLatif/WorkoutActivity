package com.example.workoutactivity;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExport {

    List<String> getWorkouts (String workouttypes) {

        ArrayList<String> workout = new ArrayList<>();

        switch (workouttypes){

//            Chest
            case "Chest":
                workout.add("Dumbbell Squeeze Press");
                workout.add("Incline barbell bench press");
                workout.add("Close-grip barbell bench press");
                workout.add("Decline press-up");
                workout.add("Cable fly");
                workout.add("Staggered press-ups");
                workout.add("Chest dips");
                break;

//            Biceps
            case "Biceps":
                workout.add("Fat-Grip Hammer Curl");
                workout.add("Behind-the-Back Cable Curl");
                workout.add("EZ-Bar Preacher Curl");
                workout.add("Reverse Curl");
                workout.add("Wide-Grip Curl");
                workout.add("Close-Grip Curl");
                break;

//            Triceps
            case "Triceps":
                workout.add("Close-grip Bench Press");
                workout.add("Rope Tricep Pushdown");
                workout.add("Tricep Dips Advanced");
                workout.add("Overhead Triceps Extension");
                workout.add("Skullcrushers");
                workout.add("The Diamond Press-up");
                break;

//            Shoulders
            case "Shoulders":
                workout.add("Barbell Overhead Press");
                workout.add("Standing Dumbbell Fly");
                workout.add("Face Pull");
                workout.add("High Pull");
                workout.add("Seated Dumbbell Clean");
                workout.add("Trap Raise");
                break;

            default:
                break;
        }
        return workout ;

    }
}
