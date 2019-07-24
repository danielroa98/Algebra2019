package org.danielroa.finalproject;

import android.content.Context;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;

public class DBHelper extends SQLiteOpenHelper {

    public static final String dbName = "MyDBName.db";
    public static final String contactsTableName = "Contacts";
    public static final String contactsCId = "id";
    public static final String contactsCName = "Name";
    public static final String contactsCEmail = "Email";
    public static final String contactsCStreet = "Street";
    public static final String contactsCCity = "Place";
    public static final String contactsCPhone = "Phone";
    private HashMap hp;

    public DBHelper(Context context){
        super(context, dbName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "Create table Contacts" +
                        "(id integer primary key, Name text, Phone text, Email text, Street text, Place text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS Contacts");
        onCreate(db);
    }

    public boolean insertContact(String name, String phone, String email, String street, String place){
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues cV = new ContentValues();

        cV.put("Name", name);
        cV.put("Phone", phone);
        cV.put("Name", email);
        cV.put("Name", street);
        cV.put("Name", place);

        db.update("Contacts", cV, "id = ?", new String[] {Integer.toString(id)});

        return true;
    }

    public Cursor getData(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM Contacts where id ="+id+"",null);
        return res;
    }

    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int rowNumber = (int) DatabaseUtils.queryNumEntries(db, contactsTableName);
        return rowNumber;
    }

    public boolean updateContact(Integer id, String name, String phone, String email, String street,String place){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cV = new ContentValues();

        cV.put("Name", name);
        cV.put("Phone", phone);
        cV.put("Email", email);
        cV.put("Street", street);
        cV.put("Place", place);

        db.update("Contacts", cV, "id = ?", new String[] { Integer.toString(id) });

        return true;
    }

    public Integer deleteContact(Integer id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("Contacts", "id = ?", new String[] {Integer.toString(id)});
    }

    public ArrayList<String> getAllContacts(){

        ArrayList<String> aL = new ArrayList<String>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM Contacts", null);

        res.moveToFirst();

        while(res.isAfterLast() == false){

            aL.add(res.getString(res.getColumnIndex(contactsCName)));
            res.moveToNext();
        }
        return aL;
    }

}