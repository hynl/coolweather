package com.coolweather.coolapp.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tt6000 on 2016/3/26.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    /*
    * Province表
    */
    private static final String CREATE_PROVINCE="create table province("
            +"id integer primary key autoincrement,"
            +"province_name text,"
            +"province_code text)";
    /*
    * City表
    */
    private static final String CREATE_CITY="create table city("
            +"id integer primary key autoincrement,"
            +"city_name text,"
            +"city_code text,"
            +"province_id integer)";
    /*
    * County 表
    */
    private static final String CREATE_COUNTY="create table county("
            +"id integer primary key autoincrement,"
            +"county_name text,"
            +"county_code text,"
            +"city id_integer)";
    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);//创建province
        db.execSQL(CREATE_CITY);//创建city
        db.execSQL(CREATE_COUNTY);//创建county
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
