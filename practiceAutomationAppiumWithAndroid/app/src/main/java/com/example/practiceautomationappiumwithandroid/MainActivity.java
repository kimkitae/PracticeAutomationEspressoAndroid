package com.example.practiceautomationappiumwithandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button1;
    private Button button2;
    private EditText edittext;
    private Button moveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("앱 실행");
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView1);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        edittext = (EditText)findViewById(R.id.edittext);
        moveBtn = (Button)findViewById(R.id.moveBtn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("변경되었습니다.");
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(edittext.getText());
            }
        });

        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView.setText("Hello World");
                return false;
            }
        });

        moveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                getApplicationContext().startActivity(intent);
            }
        });

        moveBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),"테스트",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
