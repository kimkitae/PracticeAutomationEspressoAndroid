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

    public static final int sub = 1001;
    private Button btn1;
    private Button btn2;
    private TextView txv1;
    private EditText edt;
    private Button reset;
    private Button mbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btn1 = (Button)findViewById(R.id.btn1);
    btn2 = (Button)findViewById(R.id.btn2);
    reset = (Button)findViewById(R.id.reset);
    mbtn = (Button)findViewById(R.id.mbtn);
    txv1 = (TextView)findViewById(R.id.title);
    edt = (EditText) findViewById(R.id.edt);


    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txv1.setText("1번 버튼의 결과");
        }
    });

    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txv1.setText(edt.getText());
        }
    });

    reset.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            txv1.setText("초기화 되었습니다.");
            return true;
        }
    });
    mbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), ListActivity.class);
            startActivityForResult(intent,sub);
        }
    });

    }
}
