package com.webappdeveloperbd.sqlitedtabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqLiteDataBase extends SQLiteOpenHelper {
    public static final String DB_Name = "my_DataBaseName";
    public static final int DB_Version = 1;

    public SqLiteDataBase(Context context) {
        super(context, DB_Name, null,DB_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        ///sqlite Database Create command
        sqLiteDatabase.execSQL("create table my_table(id INTEGER primary key autoincrement,name Text, mobile Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        ///sqlite Database upgrade command
        sqLiteDatabase.execSQL("drop table if exists my_table");

    }


    public void insertData(String name, String mobile) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues content = new ContentValues();
        content.put("name", name);
        content.put("mobile", mobile);
        sqLiteDatabase.insert("my_table", null, content);

    }
}
