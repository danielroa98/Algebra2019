package org.danielroa.finalproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public final static String extraMessage = "Message";
    private ListView obj;
    DBHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newDB = new DBHelper(this);
        ArrayList aL = newDB.getAllContacts();
        ArrayAdapter aD = new ArrayAdapter(this, android.R.layout.simple_list_item_1, aL);

        obj = (ListView)findViewById(R.id.listView1);
        obj.setAdapter(aD);
        obj.setOnItemClickListener(new OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3){
                int searchID = arg2 + 1;

                Bundle dataBund = new Bundle();
                dataBund.putInt("id", searchID);

                Intent intent = new Intent(getApplicationContext(), DisplayContact.class);

                intent.putExtras(dataBund);
                startActivity(intent);

            }//fin onItemClick
        });//fin setOnItemClickListener
    }//onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);

        switch(item.getItemId()){
            case R.id.item1:Bundle dataBund = new Bundle();
                dataBund.putInt("Id", 0);

                Intent intent = new Intent(getApplicationContext(), DisplayContact.class);
                intent.putExtras(dataBund);

                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public boolean onKeyDown(int keycode, KeyEvent event){

        if (keycode == KeyEvent.KEYCODE_BACK) {
            moveTaskToBack(true);
        }
        return super.onKeyDown(keycode, event);
    }
}
