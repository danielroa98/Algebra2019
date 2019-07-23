package org.danielroa.finalproject;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.HashMap;

public class DBHelper extends SQLiteOpenHelper {

    public static final String dbName = "MyDBName.db";
    public static final String contactsTableName = "Contacts";
    public static final String contactsId = "id";
    public static final String contactsName = "Name";
    public static final String contactsEmail = "Email";
    public static final String contactsStreet = "Street";
    public static final String contactsCity = "Place";
    public static final String contactsPhone = "Phone";
    private HashMap hp:

    /*public DBHelper(Context context){
        super(context, dbName, null, 1);
    }*/

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "Create table Contacts" +
                        "(id integer primary key, Name text, Phone text, Email text, Street text, Place text)"
        );
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

    public Integer deleteContact(Integer id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("Contacts", "id = ?", new String[] {Integer.toString(id)});
    }

}
