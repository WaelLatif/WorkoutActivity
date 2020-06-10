package com.example.workoutactivity;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends Activity {
    private WorkoutExport export = new WorkoutExport();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickfindworkout (View view)
    {
        TextView workouts=  (TextView) findViewById(R.id.workout);
        Spinner workouttype = (Spinner) findViewById(R.id.spineer);
        String workout = String.valueOf(workouttype.getSelectedItem());

        //workouts.setText(workout)
        List <String> workoutlist = export.getWorkouts(workout);
        StringBuilder workoutsformatted= new StringBuilder();
        for (String work: workoutlist){
            workoutsformatted.append(work).append("\n");
        }
        workouts.setText(workoutsformatted);



    }


}
