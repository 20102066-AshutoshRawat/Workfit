package com.example.work_fit;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DBNAME = "Name.db";

    public DBHelper(Context context) {
        super(context, "Name.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
       MyDB.execSQL("create Table users(nameTEXT primary key, ageTEXT primary key, genderTEXT primary key, heightTEXT primary key, weightTEXT primary key)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1)
    {
        MyDB.execSQL("drop Table if exists users");
    }
    public Boolean insertData(String name, String age, String gender, String height, String weight) {
        SQLiteDatabase MYDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("age", age);
        contentValues.put("gender", gender);
        contentValues.put("height", height);
        contentValues.put("weight", weight);

        long results = MYDB.insert("users", null, contentValues);
        if (results == -1) {
            return false;
        } else
        {
            return true;
        }

    }
    public Boolean checkusername(String name)
    {
        SQLiteDatabase MYDB = this.getWritableDatabase();
        Cursor cursor = MYDB.rawQuery("Select * from users where username = ?", new String[] {name});
        if(cursor.getCount()>0)
        {
            return true;
        }else{
            return false;
        }
    }
    public Boolean checkusername(String name, String age){
        SQLiteDatabase MYDB = this.getWritableDatabase();
        Cursor cursor = MYDB.rawQuery("Select * from users where name = ? and age = ?",new String[] {name,age});

        if(cursor.getCount()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
