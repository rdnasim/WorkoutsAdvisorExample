package com.example.rdnasim.workoutsadvisorexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    private WorkoutExpart expart = new WorkoutExpart();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickFindWorkout(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);

        Spinner spinner = (Spinner) findViewById(R.id.workoutType);

        String string = String.valueOf(spinner.getSelectedItem());

        //textView.setText(string);

        List<String> WorkoutList = expart.getWorkouts(string);
        StringBuilder WorkoutsFormatted = new StringBuilder();

        for (String work : WorkoutList){
            WorkoutsFormatted.append(work).append('\n');
        }

        textView.setText(WorkoutsFormatted);
    }
}
