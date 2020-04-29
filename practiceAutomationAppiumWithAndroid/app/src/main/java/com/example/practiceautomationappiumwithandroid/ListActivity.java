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

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewexam);

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);

        data.add("현재초이");
        data.add("키티님");
        data.add("디케이김");
        data.add("하율리");
        data.add("취시안자이");
        data.add("진지타이");
        data.add("찐대찌");
        data.add("리할리");
        adapter.notifyDataSetChanged();

    }

}


