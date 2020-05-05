package com.example.practiceautomationappiumwithandroid;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ArrayList<String> items;
    ArrayAdapter<String> adapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewexam);

        //ready to data
        items = new ArrayList<String>();
        items.add("ak");
        items.add("bk");
        items.add("ck");
        items.add("dk");
        items.add("ek");

        //install to adapter
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,items);


        //setting to adapter
        listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE); //setting to select only one

        }

        public void mOnClick(View v){
            EditText ed = (EditText)findViewById(R.id.newitem);
            switch (v.getId()){
                case R.id.btnAdd: //when it press the add button
                    String text = ed.getText().toString(); //get value in EditText
                    if (!text.isEmpty()) {

                        items.add(text);
                        ed.setText("");
                        adapter.notifyDataSetChanged();
                    }
                break;
                case R.id.btnDelete:
                    int pos = listView.getCheckedItemPosition();

                    if (pos!=ListView.INVALID_POSITION) {
                        items.remove(pos);

                        listView.clearChoices();
                        adapter.notifyDataSetChanged();
                    }
                break;
            }

        }

}
