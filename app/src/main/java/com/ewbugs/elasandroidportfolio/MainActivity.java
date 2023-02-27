 package com.ewbugs.elasandroidportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.widget.ListView;

 public class MainActivity extends AppCompatActivity {//CMD + 'click' to see class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //belongs to the AppCompatActivity class.

        RecyclerView list = findViewById(R.id.recycler_view_projects);
        Project[] projects = {
                new Project("BMI Calculator", "A simple BMI Calculator - Learning about: Variables, Methods & Conditional Logic", R.drawable.bmicalcapp),
                new Project("Inches Converter", "A basic inches to meters converter", R.drawable.inchesmetersapp),
                new Project("Wine, Dine & Develop", "A menu app for a fictional restaurant - Learning about: Classes & Objects, Arrays, Intents and ListViews", R.drawable.winedinedevelopapp)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);





    }
}