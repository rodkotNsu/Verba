package com.example.lab1;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;

import java.net.URI;
import java.util.List;
import java.util.Locale;
@Entity
public class User {
     @PrimaryKey(autoGenerate = true)
     @ColumnInfo(name = "ID_USER")
     private int ID_USER;
     @ColumnInfo(name = "USER_NAME")
     private String name;
     @ColumnInfo(name = "URI_PICTURE_USER")
     private URI uriPictureUser;
     @ColumnInfo(name = "LOCALE")
     private  Locale localeUser;
     @ColumnInfo(name = "AGE")
     private int age;
     //private SettingLearning settingLearning;
     @ColumnInfo(name = "COUNT_LEARN_WORD")
     private int countLearnWord;
     @ColumnInfo(name = "COUNT_CREATE_WORD")
     private int countCreateWord;
     //private List<Integer> listOfIdVocabulary;

     public URI getUriPictureUser() {
          return uriPictureUser;
     }

     public void setUriPictureUser(URI uriPictureUser) {
          this.uriPictureUser = uriPictureUser;
     }

     public void setID_USER(int ID_USER) {
          this.ID_USER = ID_USER;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public void setCountLearnWord(int countLearnWord) {
          this.countLearnWord = countLearnWord;
     }

     public void setCountCreateWord(int countCreateWord) {
          this.countCreateWord = countCreateWord;
     }

     public String getName() {
          return name;
     }

     public int getAge() {
          return age;
     }

     public int getCountLearnWord() {
          return countLearnWord;
     }

     public int getCountCreateWord() {
          return countCreateWord;
     }

     public int getID_USER() {
          return ID_USER;
     }

     public User() {

     }

     @NonNull
     @Override
     public String toString() {
          return uriPictureUser==null?"hello":uriPictureUser.toString();
     }
}
