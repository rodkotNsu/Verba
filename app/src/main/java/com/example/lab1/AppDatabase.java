package com.example.lab1;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.lab1.Dao.UsersDao;

import java.util.jar.Attributes;

@Database(entities = {User.class}, version = 2, exportSchema=true)
@TypeConverters({Converter.class})
public abstract class AppDatabase extends RoomDatabase {
    public static final String NAME_DATABASE = "database";

    public abstract UsersDao usersDao();

    private static AppDatabase instance;

    public static synchronized   AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, NAME_DATABASE)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
