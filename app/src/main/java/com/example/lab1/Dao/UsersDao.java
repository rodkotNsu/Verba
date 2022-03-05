package com.example.lab1.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lab1.User;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface UsersDao {
    @Query("SELECT * FROM user")
    Flowable<List<User>> getAll();

    @Query("SELECT * FROM user WHERE ID_USER = :id")
    Flowable<User> getById(long id);

    @Insert
    void insert(User user);

    @Update
    void update(User user);

    @Delete
    void delete(User user);
}
