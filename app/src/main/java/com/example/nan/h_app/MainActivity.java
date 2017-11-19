package com.example.nan.h_app;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    PieChart pieChart;
    private TypeTABLE typeTable;
    Button btnSetting, btnMain01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieChart = findViewById(R.id.piechart_main);
        pieChart.setRotationEnabled(true);
        pieChart.setTransparentCircleAlpha(0);
        addDataSet();


        //  testerUpdate();
        btnSetting = findViewById(R.id.btn_main_setting);
        btnSetting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SettingApp.class);
                startActivity(i);
            }
        });
        btnMain01 = findViewById(R.id.btn_main_01);
        btnMain01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityWallet.class);
                startActivity(i);
            }
        });
    }




    //private void testerUpdate() {
    //    typeTable = new TypeTABLE(this);
    //     typeTable.addNewValueToSQLite("TEST");
    // }

    private void addDataSet() {
        final ArrayList<Student> listStudent = Student.getSampleStudentData(2);
        ArrayList<PieEntry> entries = new ArrayList<>();
        for (Student student : listStudent) {
            TextView in = findViewById(R.id.tv_main_in);
            TextView out = findViewById(R.id.tv_main_out);

            entries.add(new PieEntry(student.getScore(), student.getName()));
            if (student.getName().equals("รับ")) {
                in.setText(student.getName() + ": " + student.getScore());
            } else {
                out.setText(student.getName() + ": " + student.getScore());
            }
        }
        PieDataSet pieDataSet = new PieDataSet(entries, null);
        pieDataSet.setSliceSpace(4);
        pieDataSet.setValueTextSize(20);
        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.rgb(197, 255, 148));
        colors.add(Color.rgb(255, 180, 156));
        pieDataSet.setColors(colors);

        Legend legend = pieChart.getLegend();
        legend.setForm(Legend.LegendForm.SQUARE);
        legend.setPosition(Legend.LegendPosition.LEFT_OF_CHART);
        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.invalidate();
        pieChart.animateY(3000);
    }
}



