package org.danielroa.contacts;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private EditText etLastName;
    private EditText etPhone;
    private EditText etStreet;

    private Button btnAdd;
    private Button btnUpdate;
    private Button btnDelete;

    private ListView lvContacts;

    private ContactCreationHelper helper;
    private long selectedId = -1;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDb();
        initWidgets();
        initList();
        setupListeners();
    }

    private void initDb() {
        helper = new ContactCreationHelper(this);
    }

    private void initWidgets() {
        etName = findViewById(R.id.etName);
        etLastName = findViewById(R.id.etLastName);
        etPhone = findViewById(R.id.etPhone);
        etStreet = findViewById(R.id.etStreet);

        btnAdd = findViewById(R.id.btnAdd);
        btnDelete = findViewById(R.id.btnDelete);
        btnUpdate = findViewById(R.id.btnUpdate);

        lvContacts = findViewById(R.id.lvContacts);
    }

    private void initList() {

        String[] columns = {ContactCreationHelper.NOMBRE, ContactCreationHelper.APELLIDO, ContactCreationHelper.NOTEL, ContactCreationHelper.DIR};
        int[] id = {R.id.tvName, R.id.tvLastName, R.id.tvPhone, R.id.tvAddress};

        adapter = new SimpleCursorAdapter(
                this,
                R.layout.contacts,
                null,
                columns,
                id,
                0

        );

        lvContacts.setAdapter(adapter);
        refresh();
    }

    private void refresh() {
        Cursor cursor = helper.query(null);
        adapter.swapCursor(cursor);
    }

    private void setupListeners() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (formOk()){
                    insertContact();
                }
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (formOk() && contactIsSelected()){
                    updateContact();
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (formOk()){
                    deleteContact();
                }
            }
        });

        lvContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {

                selectedId = id;
                fillForm();

            }
        });
    }

    private void deleteContact() {
        helper.delete(String.valueOf(selectedId));
        refresh();
        clearForm();
    }

    private boolean contactIsSelected() {
        if (selectedId == -1){
            Toast.makeText(this, getString(R.string.select_contact), Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void updateContact() {
        ContentValues values = new ContentValues();

        values.put(ContactCreationHelper.NOMBRE, etName.getText().toString());
        values.put(ContactCreationHelper.APELLIDO, etLastName.getText().toString());
        values.put(ContactCreationHelper.NOTEL, etPhone.getText().toString());
        values.put(ContactCreationHelper.DIR, etStreet.getText().toString());

        helper.update(String.valueOf(selectedId), values);
        refresh();
        clearForm();
    }

    private boolean formOk() {

        if (etName.getText().toString().length() == 0){
            etName.setError(getString(R.string.please_insert));
            etName.requestFocus();
            return false;
        }

        if (etLastName.getText().toString().length() == 0){
            etLastName.setError(getString(R.string.please_insert));
            etLastName.requestFocus();
            return false;
        }

        if (etPhone.getText().toString().length() == 0){
            etPhone.setError(getString(R.string.please_insert));
            etLastName.requestFocus();
            return false;
        }

        if (etStreet.getText().toString().length() == 0){
            etStreet.setError(getString(R.string.please_insert));
            etStreet.requestFocus();
            return false;
        }

        return true;
    }

    private void insertContact() {
        ContentValues values = new ContentValues();

        values.put(ContactCreationHelper.NOMBRE, etName.getText().toString());
        values.put(ContactCreationHelper.APELLIDO, etLastName.getText().toString());
        values.put(ContactCreationHelper.NOTEL, etPhone.getText().toString());
        values.put(ContactCreationHelper.DIR, etStreet.getText().toString());

        helper.insert(values);
        refresh();
        clearForm();
    }

    private void clearForm() {
        etName.getText().clear();
        etLastName.getText().clear();
        etPhone.getText().clear();
        etStreet.getText().clear();

        selectedId = -1;
    }

    private void fillForm() {
        Cursor cursor = helper.query(String.valueOf(selectedId));

        if (cursor.moveToNext()){

            String name = cursor.getString(cursor.getColumnIndex(ContactCreationHelper.NOMBRE));
            String lName = cursor.getString(cursor.getColumnIndex(ContactCreationHelper.APELLIDO));
            String phone = cursor.getString(cursor.getColumnIndex(ContactCreationHelper.NOTEL));
            String address = cursor.getString(cursor.getColumnIndex(ContactCreationHelper.DIR));

            etName.setText(name);
            etLastName.setText(lName);
            etPhone.setText(phone);
            etStreet.setText(address);
        }
    }

}

