package com.example.nan.h_app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Nan on 18/11/2560.
 */

public class SubWalletTABLE {
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase createSQLite, writeSQLite, readSQLite, editSQLite, deleteSQLite;


    public SubWalletTABLE(Context context) {
        myOpenHelper = new MyOpenHelper(context);
        writeSQLite = myOpenHelper.getWritableDatabase();
        readSQLite = myOpenHelper.getReadableDatabase();
        editSQLite = myOpenHelper.getWritableDatabase();
        deleteSQLite = myOpenHelper.getWritableDatabase();
        createSQLite = myOpenHelper.getWritableDatabase();
    }

    public void createNewWallet(String str) {

        createSQLite.execSQL(str);

    }

}
