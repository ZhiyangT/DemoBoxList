package com.example.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<Box> alColor;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewBox);
        alColor = new ArrayList<>();

        Box item1 = new Box("brown");
        Box item2 = new Box("blue");
        Box item3 = new Box("orange");

        alColor.add(item1);
        alColor.add(item2);
        alColor.add(item3);

        caBox = new CustomAdapter(this, R.layout.row, alColor);
        lvBox.setAdapter(caBox);

    }
}
