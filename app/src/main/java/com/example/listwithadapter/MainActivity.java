package com.example.listwithadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.lv);
        textView=findViewById(R.id.t1);
        ArrayList<String>arrayList=new ArrayList<>();//arrayadapter using arraylist.
        arrayList.add("jhjkj");
        arrayList.add("jhbb");
        arrayList.add("klkkl");
        arrayList.add("jnkjk");
        arrayList.add("rtugu");
        arrayList.add("tihuih");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.items,R.id.t1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
