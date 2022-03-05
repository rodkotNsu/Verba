package com.example.lab1.Activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab1.AppDatabase;
import com.example.lab1.R;
import com.example.lab1.User;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_AppCompat_VerbaMain);
        setContentView(R.layout.activity_main);
        AppDatabase appDatabase= AppDatabase.getInstance(this);
        User user = new User();

        Completable.fromRunnable(new Runnable() {
            @Override
            public void run() {
                appDatabase.usersDao().insert(user);
            }
        }).subscribeOn(Schedulers.io()).subscribe();
        appDatabase.usersDao().getAll().observeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<List<User>>() {
    @Override
    public void accept(List<User> users) throws Exception {
        for (User user:users
             ) {
            System.out.println(user);
        }
    }
});
    }
}