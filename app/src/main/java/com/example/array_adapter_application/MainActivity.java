package com.example.array_adapter_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    String[] value = {"name" ,"suresh","chandra","father","name","chandrapal","singh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_view,R.id.txt_view,value);
        listView.setAdapter(arrayAdapter);
    }
}