package com.example.practiceautomationappiumwithandroid;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ViewAnimator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewexam);

        listview = (ListView)findViewById(R.id.listview);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);

        data.add("가");
        data.add("나");
        data.add("다");
        data.add("라");
        data.add("마");
        data.add("바");
        data.add("사");
        data.add("아");
        data.add("자");
        data.add("차");
        data.add("카");
        data.add("타");
        data.add("파");
        data.add("하");
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");
        data.add("5");
        data.add("6");
        data.add("7");
        data.add("8");
        data.add("9");
        data.add("10");
        adapter.notifyDataSetChanged();


    }
}


