package com.example.demoapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginPage extends AppCompatActivity {
    EditText mypass;
    ListView listView;
    String[] items = {"Aaryan", "Arush", "Ananya", "Raktim", "Meow", "Hello"};
    Button addbtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        listView = findViewById(R.id.lview);
        mypass = findViewById(R.id.mypass);
        addbtn = findViewById(R.id.additem);

        final List<String> list = new ArrayList<>(Arrays.asList(items));

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, list);
        // ListViewAdapter adapter = new ListViewAdapter();
        listView.setAdapter(adapter);
        addbtn.setOnClickListener((View view) -> {
            String itemVal = mypass.getText().toString();

            if(itemVal.isEmpty()) {
                Toast.makeText(LoginPage.this, "Please enter the text to be added", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(LoginPage.this, itemVal, Toast.LENGTH_SHORT).show();
                list.add(itemVal);
                adapter.notifyDataSetChanged();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = adapter.getItem(i);
                Toast.makeText(LoginPage.this, value, Toast.LENGTH_SHORT).show();
            }

        });
    }
}

class ListViewAdapter extends BaseAdapter {
    private List<String> itemList = new ArrayList<>();
    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public String getItem(int i) {
        return itemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return (long) i;
    }

    @Override
    public View getView(int i, View v, ViewGroup viewGroup) {
        return v;
    }

    public void addItem(String item) {
        itemList.add(item);
        notifyDataSetChanged();
    }
}
