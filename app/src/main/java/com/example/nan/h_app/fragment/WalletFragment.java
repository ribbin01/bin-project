package com.example.nan.h_app.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nan.h_app.R;
import com.example.nan.h_app.Student;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

/**
 * Created by Nan on 18/11/2560.
 */

public class WalletFragment extends Fragment {
    private PieChart pieChart;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //  showPiechaet();
        View view = inflater.inflate(R.layout.fragment_wallet, container, false);
        return view;
    }
/*
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pieChart.findViewById(R.id.piechart_wallet);
        pieChart.setRotationEnabled(true);
        pieChart.setTransparentCircleAlpha(0);
        addDataSet();

    }


    private void addDataSet() {

        final ArrayList<Student> listStudent = Student.getSampleStudentData(2);
        ArrayList<PieEntry> entries = new ArrayList<>();
        for (Student student : listStudent) {

            entries.add(new PieEntry(student.getScore(), student.getName()));

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
        pieChart.animateY(3000);*/
    }



