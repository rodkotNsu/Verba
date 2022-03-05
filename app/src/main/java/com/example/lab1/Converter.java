package com.example.lab1;

import android.net.Uri;

import androidx.room.TypeConverter;

import java.net.URI;
import java.net.URISyntaxException;

public class Converter {

        @TypeConverter
        public static URI fromTimestamp(String value) {
            try {
                return value == null ? null : new URI(value.toString());
            } catch (URISyntaxException e) {
                e.printStackTrace();
                return null;
            }
        }

        @TypeConverter
        public static String dateToTimestamp(URI uri) {
            return uri == null ? null : uri.toString();
        }
}
