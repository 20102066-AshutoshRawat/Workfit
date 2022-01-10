package data;

import static parameters.params.DB_VERSION;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import parameters.params;

public class MyDBhelper extends SQLiteOpenHelper {
    public MyDBhelper(Context context) {
        super(context, params.DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create = "CREATE TABLE," + params.TABLE_NAME +"("
                +params.KEY_ID + "INTEGER PRIMARY KEY," + params.KEY_NAME +"TEXT," + params.KEY_PASSWORD +"TEXT" + ")";
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
