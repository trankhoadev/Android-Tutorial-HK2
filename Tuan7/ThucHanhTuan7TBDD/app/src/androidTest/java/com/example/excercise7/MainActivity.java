package com.example.excercise7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


import com.R;
import com.example.excercise7.adapter.ContactAdapter;
import com.example.excercise7.database.DatabaseHandler;
import com.example.excercise7.model.ContactModel;


import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<ContactModel> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler db = new DatabaseHandler(this);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btnRm = (Button) findViewById(R.id.btnRm);
        Button btnCancel = (Button) findViewById(R.id.btnCancel);
        EditText txtName = (EditText) findViewById(R.id.txtName);
        this.contacts = db.getContacts();
        this.listView = (ListView) findViewById(R.id.listView);
        for(ContactModel contact: contacts) {
            String log = "Id: " + contact.getId() + " ,Name: " + contact.getName();
            Log.d("Name", log);
        }
        ContactAdapter contactAdapter = new ContactAdapter(this, R.layout.listview_layout, contacts);
        listView.setAdapter(contactAdapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.addContact(new ContactModel(txtName.getText().toString()));
                contacts = db.getContacts();
                dataChange();
            }
        });
    }

    public void dataChange() {
        ContactAdapter contactAdapter = new ContactAdapter(this, R.layout.listview_layout, contacts);
        listView.setAdapter(contactAdapter);
    }
}