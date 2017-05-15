package com.example.skyma.tableandgraph;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TableView extends AppCompatActivity {

    TableLayout tableLayout;
    List<String> left;
    List<String> right;
    public static final int N_ROWS = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);

        tableLayout = (TableLayout) findViewById(R.id.table_main);
        initializeTable();

        // Method to add the rows dynamically from the server
        left = new ArrayList<>();
        right = new ArrayList<>();

        leftEye();
        rightEye();

        // Add the rows to the table

        TableRow leftRow = new TableRow(this);

        for(int j=0; j<left.size(); j++){
            TextView textView = new TextView(this);
            textView.setText(left.get(j));
            textView.setTextColor(Color.BLACK);
            leftRow.addView(textView);
            leftRow.setGravity(Gravity.CENTER);
        }

        tableLayout.addView(leftRow);

        TableRow rightRow = new TableRow(this);

        for(int j=0; j<right.size(); j++){
            TextView textView = new TextView(this);
            textView.setText(right.get(j));
            textView.setTextColor(Color.BLACK);
            rightRow.addView(textView);
            rightRow.setGravity(Gravity.CENTER);
        }

        tableLayout.addView(rightRow);
    }

    // Method to add the values into the left eye
    public void leftEye(){
        left.add("LEFT");
        left.add("-5");
        left.add("-5.25");
        left.add("-5.75");
        left.add("-6");
        left.add("-6.25");
    }

    // Method to add teh values into the right eye
    public void rightEye(){
        right.add("RIGHT");
        right.add("-5");
        right.add("-5");
        right.add("-5");
        right.add("-5.25");
        right.add("-5.25");
    }

    // Method to initialize the columns in the table
    public void initializeTable(){
        TableRow header = new TableRow(this);

        // First column
        TextView EyeType = new TextView(this);
        EyeType.setText("Eye Type");
        EyeType.setTextColor(Color.BLUE);
        header.addView(EyeType);

        // Second Column
        TextView Current = new TextView(this);
        Current.setText("Current");
        Current.setTextColor(Color.BLACK);
        header.addView(Current);

        // Third Column
        TextView After6 = new TextView(this);
        After6.setText("After 6 months");
        After6.setTextColor(Color.BLACK);
        header.addView(After6);

        // Fourth Column
        TextView After12 = new TextView(this);
        After12.setText("After 1 year");
        After12.setTextColor(Color.BLACK);
        header.addView(After12);

        // Fifth Column
        TextView After18 = new TextView(this);
        After18.setText("After 18 months");
        After18.setTextColor(Color.BLACK);
        header.addView(After18);

        // Sixth Column
        TextView After24 = new TextView(this);
        After24.setText("After 2 years");
        After24.setTextColor(Color.BLACK);
        header.addView(After24);

        tableLayout.addView(header);
    }
}
