package org.danielroa.contacts;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;

public class ContactCreationHelper extends SQLiteOpenHelper {

    private static final String NAME = "contacts.db";
    private static final int VERSION = 1;

    private static final String TABLE = "contacts";

    private static final String ID = "_id";
    public static final String NOMBRE = "name";
    public static final String APELLIDO = "lastName";
    public static final String NOTEL = "phoneNumber";
    public static final String DIR = "address";


    private static final String DROP = "drop table " + TABLE + ";"; //drops a table

    private static final String CREATE = "create table "+ TABLE + "(" +
            ID +" integer primary key autoincrement, " +
            NOMBRE +" text not null, " +
            APELLIDO + " text not null," +
            NOTEL + " text not null," +
            DIR+ " text not null);";

    public ContactCreationHelper(Context context) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP);
        onCreate(db);
    }

    public long insert(ContentValues values){
        return getWritableDatabase().insert(TABLE, null, values);
    }

    public int update(String id, ContentValues values){

        return getWritableDatabase().update(
                TABLE,
                values,
                ID + " = ?",
                new String[] {id});

    }

    public int delete(String id){

        return getWritableDatabase().delete(
                TABLE,
                ID + " = ?",
                new String[] {id});
    }

    public Cursor query(String id){

        SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
        builder.setTables(TABLE);

        if (id != null) {
            builder.appendWhere(ID + " = " + id);
        }

        Cursor cursor = builder.query(getReadableDatabase(),
                null,
                null,
                null,
                null,
                null,
                null
        );

        return cursor;
    }



}
