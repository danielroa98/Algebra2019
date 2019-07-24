package org.danielroa.finalproject;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayContact extends AppCompatActivity {

    int from_Where_I_Am_Coming = 0;
    private DBHelper mydb;

    TextView name ;
    TextView phone;
    TextView email;
    TextView street;
    TextView place;

    int updateID = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact2);

        name = (TextView) findViewById(R.id.editName);
        phone = (TextView) findViewById(R.id.editPhone);
        email = (TextView)findViewById(R.id.editEmail);
        street = (TextView)findViewById(R.id.editStreet);
        place = (TextView)findViewById(R.id.editCity);

        mydb = new DBHelper(this);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {

            int val = extras.getInt("id");

            if (val > 0) {

                Cursor rs = mydb.getData(val);

                updateID = val;

                rs.moveToFirst();

                String nombre = rs.getString(rs.getColumnIndex(DBHelper.contactsCName));
                String tel = rs.getString(rs.getColumnIndex(DBHelper.contactsCPhone));
                String correo = rs.getString(rs.getColumnIndex(DBHelper.contactsCEmail));
                String calle = rs.getString(rs.getColumnIndex(DBHelper.contactsCStreet));
                String ciu = rs.getString(rs.getColumnIndex(DBHelper.contactsCCity));

                if (!rs.isClosed()) {
                    rs.close();
                }

                Button b = (Button)findViewById(R.id.primerBTN);
                b.setVisibility(View.INVISIBLE);

                name.setText((CharSequence)nombre);
                name.setFocusable(false);
                name.setClickable(false);

                phone.setText((CharSequence)tel);
                phone.setFocusable(false);
                phone.setClickable(false);

                email.setText((CharSequence)correo);
                email.setFocusable(false);
                email.setClickable(false);

                street.setText((CharSequence)calle);
                street.setFocusable(false);
                street.setClickable(false);

                place.setText((CharSequence)ciu);
                place.setFocusable(false);
                place.setClickable(false);

            }//fin IF

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu, menu){

        Bundle extra = getIntent().getExtras();

        if (extras != null) {
            int val = extra.getInt("id");

            if (val > 0) {
                getMenuInflater().inflate(R.menu.display_contact, menu);
            }else{
                getMenuInflater().inflate(R.menu.menu_main menu);
            }
        }

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

    }
}
