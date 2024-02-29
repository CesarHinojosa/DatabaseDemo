package edu.fvtc.databasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Databasehelper helper;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new Databasehelper(this,
                                "items.db",
                                null,
                                    helper.DATABASE_VERSION);
        //SQLiteOpenHelper is where we get this method
        db = helper.getWritableDatabase();

    }
}