package com.example.danhbamobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    private List<ContactModel> listContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView) findViewById(R.id.lvContact);
        ContactAdapter adapter = new ContactAdapter(listContacts,this);
        lvContact.setAdapter(adapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                ContactModel contactModel = listContacts.get(position);
                Toast.makeText(MainActivity.this, contactModel.getImage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData(){
        ContactModel contact = new ContactModel("DUONG QUOC CUONG","0971483357", R.drawable.ic_launcher_background);
        listContacts.add(contact);
        contact = new ContactModel("DUONG QUOC A","1234567890", R.drawable.ic_launcher_background);
        listContacts.add(contact);
        contact = new ContactModel("DUONG QUOC B","0999999999", R.drawable.ic_launcher_background);
        listContacts.add(contact);
        contact = new ContactModel("DUONG QUOC C","0988888888", R.drawable.ic_launcher_background);
        listContacts.add(contact);
        contact = new ContactModel("DUONG QUOC D","0977777777", R.drawable.ic_launcher_background);
        listContacts.add(contact);
        contact = new ContactModel("DUONG QUOC E","0966666666", R.drawable.ic_launcher_background);
        listContacts.add(contact);
        contact = new ContactModel("DUONG QUOC F","0955555555", R.drawable.ic_launcher_background);
        listContacts.add(contact);
    }
}