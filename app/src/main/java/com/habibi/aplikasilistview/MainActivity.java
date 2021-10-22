package com.habibi.aplikasilistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ListView list_view;
    private String[] nama_negara = new String[]{
            "Indonesia","Malaysia","Singapore","Italia","Inggris","Belanda","Argentina","Chile","Mesir","Uganda"
    };
    private Object AdapterView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_main);

        getSupportActionBar().setTitle("ListView Sederhana");

        list_view =(ListView)findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,android.R.id.text1, nama_negara);

        list_view.setAdapter(adapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Memilih :"+nama_negara[position],Toast.LENGTH_LONG).show();
            }
        });
    }


}