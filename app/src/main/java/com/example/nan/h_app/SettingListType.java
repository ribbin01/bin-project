package com.example.nan.h_app;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SettingListType extends AppCompatActivity {
    private ListView listView;

    private Cursor mCursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_list_type);
        listView = findViewById(R.id.lv_setting_listtype);
        TypeTABLE typeTable = new TypeTABLE(this);
        mCursor = typeTable.readAllData();
        ArrayList<String> str = new ArrayList<String>();
        mCursor.moveToFirst();
        while (!mCursor.isAfterLast()) {
            str.add(mCursor.getString(mCursor.getColumnIndex(MyOpenHelper.COL_TYPE)) + "\n"
                    + "Piece : " + mCursor.getString(mCursor.getColumnIndex(MyOpenHelper.COL_ID))
            );
            mCursor.moveToNext();
        }
        ArrayAdapter<String> adapterDir = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, str);
        listView.setAdapter(adapterDir);
    }
}
